package com.hmj.experiment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

//�ļ�������
public class FileUtils {
	/**
	 * ���ļ��ж�ȡ�ַ���
	 *
	 * filePath �ļ�·�� ��ȡ��� IOException ��ȡ�����з������쳣
	 */
	public static String readStringByFile(String filePath) throws IOException {
		// �ļ���ȡ���
		StringBuilder readResult = new StringBuilder();
		// ����һ�������ַ�������
		BufferedReader br = null;
		try {
			// ��������ʵ����
			br = new BufferedReader(new FileReader(filePath));
			String line;
			// ��ȡһ�в�Ϊ�յ�����£�˳���line��ֵ��ִ��ѭ����
			while ((line = br.readLine()) != null) {
				readResult.append(line);
			}
		} finally {
			if (br != null) {
				br.close(); //�ر�
			}
		}
		return readResult.toString();
	}

	/**
	 * ����ַ������ļ�
	 *
	 * str �ı� path �ļ���ַ
	 */
	public static void writeStringToFile(String str, String path) throws IOException {
		BufferedWriter bw = null;
		try {
			// ���������ַ������
			bw = new BufferedWriter(new FileWriter(path));
			// �������
			bw.write(str);
			// ˢ����
			bw.flush();
		} finally {
			if (bw != null) {
				bw.close();
			}
		}
	}

}
