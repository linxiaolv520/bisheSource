package cn.com.service;

import java.util.List;

import cn.com.domain.Design;

public interface DesignService {

	public List<Design> getDesignList(int type, String searchStr,int startRow,int pageSize);
	public int getSumList(int type, String searchStr);
	public Design getDesignbyID(int id);

}
