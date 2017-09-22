package com.zdp.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"application.xml"});
        context.start();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
    }
}
