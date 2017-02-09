package com.ktds.cepark.dao.support;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


//queryhandler는  binddata class와 types class의 인터페이스
public interface QueryHandler {

	public String preparedQuery();
	public String mappingParameters(PreparedStatement stmt) throws SQLException;
	public Object getData(ResultSet rs);
	
	
}
