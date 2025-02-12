package com.example_test.svdb3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example_test.svdb3.data.Data;

@Service
public class HomeService {

	public String getHello() {
		return "Hello";
	}

	public void addToList(String name) {
		Data.listeInfos.add(name);		
	}
	
	public List<String> getList(){
		return Data.listeInfos;
	}
	
}
