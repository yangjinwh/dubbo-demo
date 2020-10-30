package com.bjtu.gmall;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
		ioc.start();
		// 防止程序终止，在这阻塞
		System.in.read();
	}
}
