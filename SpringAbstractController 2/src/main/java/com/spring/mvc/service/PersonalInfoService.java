package com.spring.mvc.service;

import java.util.ArrayList;
import java.util.List;

import com.spring.mvc.bo.PersonalInfo;
import com.spring.mvc.dao.PersonalInfoDao;

public class PersonalInfoService {

	private PersonalInfoDao personalInfoDao;

	public PersonalInfoService(PersonalInfoDao personalInfoDao) {
		this.personalInfoDao = personalInfoDao;
	}
	
	public List<PersonalInfo> getPersonalInfo() {
		List<PersonalInfo> personalInfos = null;
		personalInfos = new ArrayList<>();
		
		personalInfos = personalInfoDao.fetchPersonalInfo();
		
		return personalInfos;
	}

}
