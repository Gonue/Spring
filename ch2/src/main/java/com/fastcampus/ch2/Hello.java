package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	int iv = 10;
	static int cv = 20;
	
	@RequestMapping("/hello")
	public void main() {//�ν��Ͻ� �޼���
		System.out.println("Hello");
		System.out.println(cv);
	//	System.out.println(iv);
	}
	
	public static void main2() {// static �޼���
		System.out.println(cv);
	//	System.out.println(iv);
	}
}