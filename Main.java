package com.hmj.experiment;

import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

/**
 * Description:���� ����������
 */
public class Main {

	public static void main(String[] args) throws IOException {
		// ʵ����ѧ������
		Student student = new Student(new Scanner(System.in));
		// ��ȡ�����е��ļ�����������
		String source = FileUtils.readStringByFile("d:\\B.txt");
		System.err.println(source);
		// ����ʫ�ʣ��ӱ�����
		String handleResult = StringUtils.poetryArrange(source);
		// ͳ��һ���ַ������г��ֵĴ���
		char c = '��';
		int count = StringUtils.charCount(source, c);
		// ƴ��ѧ����Ϣ
		String resultBuilder = student.toString() + "\n" +
		// ƴ��ʫ�ʴ�����
				"ʫ�ʴ�������\n" + handleResult + "\n" +
				// ƴ��ͳ�ƽ�� 
				"��" + c + "'��������" + count + "��";
		FileUtils.writeStringToFile(resultBuilder, "D:\\a.txt");
		System.out.println("�������");
	}
}
