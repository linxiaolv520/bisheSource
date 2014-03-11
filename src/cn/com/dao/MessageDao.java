package cn.com.dao;

import java.util.List;

import cn.com.domain.Message;

public interface MessageDao {
	public int sendMessage(Message message);
	public List<Message> getMessageList(int startRow,int endRow);
}
