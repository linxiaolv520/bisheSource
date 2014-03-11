package cn.com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.com.dao.MessageDao;
import cn.com.dbFactory.DBFactory;
import cn.com.domain.Message;

public class MessageDaoImpl implements MessageDao {
	DBFactory dbc = new DBFactory();

	@Override
	public int sendMessage(Message message) {
		// TODO Auto-generated method stub
		String sql = "insert into message set top=?,username=?,content=?,senddate=now(),phone=?,email=?,qq=?,state=1;";
		Object[] params = { message.getTop(), message.getUserName(),
				message.getContent(), message.getPhone(), message.getEmail(),
				message.getQq() };
		dbc.execSqlWithoutResultset(sql, params);
		return 0;
	}
	
	public List<Message> getMessageList(int startRow,int endRow){
		List<Message> messageList = new ArrayList<Message>();
		String sql = "SELECT * FROM message m order by senddate desc  limit ?,? ";		
		Object[] params = {startRow,endRow};
		Message messageDO = null;
		ResultSet rs = dbc.execSqlWithResultset(sql, params);
		try {
			while (rs.next()) {
		       messageDO = new Message();
		       messageDO.setContent(rs.getString("content"));
		       messageDO.setEmail(rs.getString("email"));
		       messageDO.setQq(rs.getString("QQ"));
		       messageDO.setPhone(rs.getString("phone"));
		       messageDO.setUserName(rs.getString("username"));
		       messageDO.setMessageId(rs.getInt("message_id"));
		       messageDO.setTop(rs.getString("top"));
		       messageDO.setSendDate(rs.getString("senddate"));
		       messageList.add(messageDO);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return messageList;
	}

}
