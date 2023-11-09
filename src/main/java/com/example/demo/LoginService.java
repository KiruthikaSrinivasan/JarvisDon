package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public ResponseEntity<LoginDTO> getlistofstudents(String name) {
		
		logger.info("This is a information");
		logger.warn("This is a warning");
		logger.error("This is a error");

		List<String> nameList = new ArrayList<>();
		nameList.add("A001");
		nameList.add("A002");
		nameList.add("A003");

		nameList.add("B004");
		nameList.add("B005");
		nameList.add("B006");

		nameList.add("C007");
		nameList.add("C008");
		nameList.add("C009");

		List<String> nameList2 = new ArrayList<>();
		for (String names : nameList) {
			if (names.contains(name)) {
				nameList2.add(names);
			}
		}
		LoginDTO loginDTO = new LoginDTO();
		if (nameList2.size() == 0) {
			loginDTO.setResponseMessage("No Names Found With Character : '"+name+"'");
		} else {
			loginDTO.setNames(nameList2);
		}
		return new ResponseEntity<LoginDTO>(loginDTO, HttpStatus.OK);
	}
}












