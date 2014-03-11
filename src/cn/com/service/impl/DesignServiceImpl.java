package cn.com.service.impl;

import java.util.List;

import cn.com.dao.DesignDao;
import cn.com.dbFactory.DaoFactory;
import cn.com.domain.Design;
import cn.com.service.DesignService;

public class DesignServiceImpl implements DesignService {
    DesignDao designDao = DaoFactory.createDesignDAO();
	@Override
	public List<Design> getDesignList(int type, String searchStr,int startRow,int pageSize) {
		// TODO Auto-generated method stub
		if(searchStr==null)
			searchStr="";
		startRow = (startRow-1)*pageSize+1;		
		return designDao.getDesignList(type, searchStr,startRow,pageSize);
	}
	
	@Override
	public Design getDesignbyID(int id) {
		// TODO Auto-generated method stub
		return designDao.getDesignbyID(id);
	}
	@Override
	public int getSumList(int type, String searchStr) {
		// TODO Auto-generated method stub
		if(searchStr==null)
			searchStr="";
		return designDao.getSumList(type,searchStr);
	}
	
	
	
	

}
