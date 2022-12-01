package com.apurbagiri.springboot.model;

import javax.faces.view.ViewScoped;

import org.springframework.stereotype.Component;

@Component
@ViewScoped
public class TestBean {

	public String getHelloMsg() {
		return "Hello World";
	}

}
