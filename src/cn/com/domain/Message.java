package cn.com.domain;


public class Message {
	int messageId;
	String top;
	String userName;
	String content;
	//Date sendDate;
	String sendDate;
	String phone;
	String email;
	String qq;
	int state;

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getTop() {
		return top;
	}

	public void setTop(String top) {
		this.top = top;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	
	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	public static boolean isEmpty(String param) {
		if (param != null && !param.trim().equals(""))
			return true;

		return false;

	}
}
