package com.hmj.experiment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	private int id; // 学号
	private String name; // 姓名
	private int age; // 年龄
	private String gender; // 性别

	/**
	 * 学生类Scanner构造方法，采用交互式赋值 scanner scanner InputMismatchException 输入过程中发生的异常
	 */
	public Student(Scanner scanner) throws InputMismatchException {
		System.out.println("请输入学号：");
		this.id = scanner.nextInt();
		System.out.println("请输入姓名：");
		this.name = scanner.next();
		System.out.println("请输入年龄：");
		this.age = scanner.nextInt();
		System.out.println("请输入性别：");
		this.gender = scanner.next();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String toString() {
		String base = "学生信息：\n 学号：%s，姓名：%s，性别：%s，年龄：%s";
		return String.format(base, id,name,gender,age);
	}
}
