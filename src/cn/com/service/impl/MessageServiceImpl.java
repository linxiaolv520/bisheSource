package cn.com.service.impl;

import java.util.List;

import cn.com.dao.MessageDao;
import cn.com.dbFactory.DaoFactory;
import cn.com.domain.Message;
import cn.com.service.MessageService;

public class MessageServiceImpl implements MessageService {
	private MessageDao messageDao = DaoFactory.createMessageDAO();

	@Override
	public boolean sendMessage(Message message) {
		// TODO Auto-generated method stub

		return messageDao.sendMessage(message) == 0;
	}

	@Override
	public List<Message> getMessageList(int startRow, int endRow) {
		// TODO Auto-generated method stub
		return messageDao.getMessageList(startRow, endRow);
	}
	

}
