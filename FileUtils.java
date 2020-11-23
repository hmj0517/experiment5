package com.hmj.experiment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

//文件工具类
public class FileUtils {
	/**
	 * 从文件中读取字符串
	 *
	 * filePath 文件路径 读取结果 IOException 读取过程中发生的异常
	 */
	public static String readStringByFile(String filePath) throws IOException {
		// 文件读取结果
		StringBuilder readResult = new StringBuilder();
		// 声明一个缓冲字符输入流
		BufferedReader br = null;
		try {
			// 将输入流实例化
			br = new BufferedReader(new FileReader(filePath));
			String line;
			// 读取一行不为空的情况下，顺便给line赋值，执行循环体
			while ((line = br.readLine()) != null) {
				readResult.append(line);
			}
		} finally {
			if (br != null) {
				br.close(); //关闭
			}
		}
		return readResult.toString();
	}

	/**
	 * 输出字符串到文件
	 *
	 * str 文本 path 文件地址
	 */
	public static void writeStringToFile(String str, String path) throws IOException {
		BufferedWriter bw = null;
		try {
			// 创建缓冲字符输出流
			bw = new BufferedWriter(new FileWriter(path));
			// 输出数据
			bw.write(str);
			// 刷新流
			bw.flush();
		} finally {
			if (bw != null) {
				bw.close();
			}
		}
	}

}
