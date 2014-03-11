package cn.com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.com.dao.DesignDao;
import cn.com.dbFactory.DBFactory;
import cn.com.domain.Design;

public class DesignDaoImpl implements DesignDao {
	DBFactory dbc = new DBFactory();

	@Override
	public List<Design> getDesignList(int type, String searchStr, int startRow,
			int pageSize) {
		// TODO Auto-generated method stub
		// String sql =
		// "insert into message set top=?,username=?,content=?,send_date=now(),phone=?,email=?,qq=?,state=1;";
		String sql = "SELECT * FROM designdb.design where 1=1 ";
		List<Object> list = new ArrayList<Object>();
		if (type != -1) {
			sql += "and designtype=?";
			list.add(type);
		}
		if (!searchStr.equals("")) {
			sql += "and name like ?";
			list.add("%" + searchStr + "%");
		}

		sql += " limit ?,?";
		System.out.println(sql + "**************************");
		list.add(startRow);
		list.add(pageSize);
		Object[] params = new Object[list.size()];
		for (int i = 0; i < list.size(); i++) {
			params[i] = list.get(i);
		}
		List<Design> listDesign = new ArrayList<Design>();
		Design designDO = null;
		ResultSet rs = dbc.execSqlWithResultset(sql, params);

		try {
			while (rs.next()) {
			    designDO = new Design();
				designDO.setDesignId(rs.getInt("design_id"));
				designDO.setDesignDate(rs.getString("designdate"));
				designDO.setIntroduction(rs.getString("introduction"));
				designDO.setName(rs.getString("name"));
				designDO.setPrice(rs.getFloat("price"));
				designDO.setState(rs.getInt("state"));
				designDO.setDesigntype(rs.getInt("designtype"));
				designDO.setUploadAddress(rs.getString("uploadaddress"));
				designDO.setUploadName(rs.getString("uploadname"));
				designDO.setUserId(rs.getInt("user_id"));
				designDO.setBigPictureName(rs.getString("bigpicturename"));
				designDO.setBigPictureSystemName(rs.getString("bigpicturesystemname"));
				designDO.setSmallPictureName(rs.getString("smallpicturename"));
				designDO.setSmallPictureSystemName(rs.getString("smallpicturesystemname"));
				designDO.setDescription(rs.getString("description"));
				listDesign.add(designDO);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listDesign;
	}

	@Override
	public int getSumList(int type, String searchStr) {
		// TODO Auto-generated method stub
		String sql = "SELECT count(*) FROM designdb.design where 1=1 ";
		List<Object> list = new ArrayList<Object>();
		if (type != -1) {
			sql += "and designtype=?";
			list.add(type);
		}
		if (!searchStr.equals("")) {
			sql += "and name like ?";
			list.add("%" + searchStr + "%");
		}

		System.out.println(sql + "**********sum***************");

		Object[] params = new Object[list.size()];
		for (int i = 0; i < list.size(); i++) {
			params[i] = list.get(i);
		}
		int sum = 0;
		ResultSet rs = dbc.execSqlWithResultset(sql, params);

		try {
			if (rs.next()) {
				sum = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sum;
	}
	
	public Design getDesignbyID(int id){
		Design designDO = null;
		String sql="select * from designdb.design where design_id=?";
		Object[] params={id};
		ResultSet rs =dbc.execSqlWithResultset(sql, params);
		try {
			while (rs.next()) {
				 designDO = new Design();
				designDO.setDesignId(rs.getInt("design_id"));
				designDO.setDesignDate(rs.getString("designdate"));
				designDO.setIntroduction(rs.getString("introduction"));
				designDO.setName(rs.getString("name"));
				designDO.setPrice(rs.getFloat("price"));
				designDO.setState(rs.getInt("state"));
				designDO.setDesigntype(rs.getInt("designtype"));
				designDO.setUploadAddress(rs.getString("uploadaddress"));
				designDO.setUploadName(rs.getString("uploadname"));
				designDO.setUserId(rs.getInt("user_id"));
				designDO.setBigPictureName(rs.getString("bigpicturename"));
				designDO.setBigPictureSystemName(rs.getString("bigpicturesystemname"));
				designDO.setDescription(rs.getString("description"));
				designDO.setSmallPictureName(rs.getString("smallpicturename"));
				designDO.setSmallPictureSystemName(rs.getString("smallpicturesystemname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return designDO;
	}

}
