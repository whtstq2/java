package com.ktds.cepark.dao.support;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface QueryHandler {

	public String preparedQuery();
	public String mappingParameters(PreparedStatement stmt) throws SQLException;
	public Object getData(ResultSet rs);
	
	
}
