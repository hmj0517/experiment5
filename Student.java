package com.hmj.experiment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	private int id; // ѧ��
	private String name; // ����
	private int age; // ����
	private String gender; // �Ա�

	/**
	 * ѧ����Scanner���췽�������ý���ʽ��ֵ scanner scanner InputMismatchException ��������з������쳣
	 */
	public Student(Scanner scanner) throws InputMismatchException {
		System.out.println("������ѧ�ţ�");
		this.id = scanner.nextInt();
		System.out.println("������������");
		this.name = scanner.next();
		System.out.println("���������䣺");
		this.age = scanner.nextInt();
		System.out.println("�������Ա�");
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
		String base = "ѧ����Ϣ��\n ѧ�ţ�%s��������%s���Ա�%s�����䣺%s";
		return String.format(base, id,name,gender,age);
	}
}
