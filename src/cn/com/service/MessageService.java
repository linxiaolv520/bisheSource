package cn.com.service;

import java.util.List;

import cn.com.domain.Message;

public interface MessageService {
	public boolean sendMessage(Message message);
	public List<Message> getMessageList(int startRow,int endRow);
}
