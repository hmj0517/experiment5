package com.hmj.experiment;

import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

/**
 * Description:主类 包含主方法
 */
public class Main {

	public static void main(String[] args) throws IOException {
		// 实例化学生对象
		Student student = new Student(new Scanner(System.in));
		// 读取磁盘中的文件，到程序中
		String source = FileUtils.readStringByFile("d:\\B.txt");
		System.err.println(source);
		// 处理诗词，加标点符号
		String handleResult = StringUtils.poetryArrange(source);
		// 统计一个字符在其中出现的次数
		char c = '人';
		int count = StringUtils.charCount(source, c);
		// 拼接学生信息
		String resultBuilder = student.toString() + "\n" +
		// 拼接诗词处理结果
				"诗词处理结果：\n" + handleResult + "\n" +
				// 拼接统计结果 
				"‘" + c + "'共出现了" + count + "次";
		FileUtils.writeStringToFile(resultBuilder, "D:\\a.txt");
		System.out.println("处理完成");
	}
}
