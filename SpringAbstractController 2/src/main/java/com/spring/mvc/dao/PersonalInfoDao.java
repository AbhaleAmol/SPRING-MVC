package com.spring.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.mvc.bo.PersonalInfo;

public class PersonalInfoDao {

	private final String SQL_FETCH_USERS = "select IDENTIFICATION_NUMBER, FIRST_NAME, LAST_NAME, EMAIL_ID, MOBILE_NUMBER, ORGANIZATION from user where (status = 'A')";

	private JdbcTemplate jdbcTemplate;

	public PersonalInfoDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<PersonalInfo> fetchPersonalInfo() {

		List<PersonalInfo> personalInfos = null;
		personalInfos = new ArrayList<>();

		personalInfos = jdbcTemplate.query(SQL_FETCH_USERS, new UserRowMapper());
		
		return personalInfos;
	}

	private class UserRowMapper implements RowMapper<PersonalInfo> {

		@Override
		public PersonalInfo mapRow(ResultSet resultSet, int rowIndex) throws SQLException {
			
			PersonalInfo personalInfo = null;
			personalInfo = new PersonalInfo();
			
			personalInfo.setIdentificationNumber(resultSet.getInt(1));
			personalInfo.setFrstName(resultSet.getString(2));
			personalInfo.setLastName(resultSet.getString(3));
			personalInfo.setEmailID(resultSet.getString(4));
			personalInfo.setMobileNumber(resultSet.getString(5));
			personalInfo.setOrganization(resultSet.getString(6));
			
			return personalInfo;
		}

	}

}
