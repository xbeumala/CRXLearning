package com.rialvalue.crx.learning.simpleBundle.services.impl;

import com.rialvalue.crx.learning.simpleBundle.services.SampleService;

public class SampleServiceImpl implements SampleService{
	private static int INVOCATION_COUNT = 0;
	
	public String sayHello() {
		return "Hello world: " + ++INVOCATION_COUNT;
	}
}
