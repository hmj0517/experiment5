package com.hmj.experiment;

/**
 * 字符串处理工具类
 */
public class StringUtils {
	/**
     * 循环处理的步长
     */
	public static final int STEP = 7;
	 /**
     * 诗词整理方法
     * poetry 未加标点符号的诗词
     * 整理结果
     */
	public static String poetryArrange(String poetry) {
		if (poetry==null || poetry.length()==0) {
			//抛出一个非法参数异常(继承自RuntimeException 为非受检异常)
			throw new IllegalArgumentException("诗词为空");
		}
		if (poetry.length() % STEP !=0) {
			throw new IllegalArgumentException("诗词不完整");
		}
		//创建一个StringBuilder,用于接收结果
		StringBuilder resultBuilder = new StringBuilder();
		//双指针算法，指针2比指针1快七步，然后同时向前移动
		int p1 = 0;
		int p2 = STEP;
		//当P1指向位置，超过字符串的长度时，循环停止
		while(p1<poetry.length()) {
			 //截取p1,p2之间的字符串，然后添加到结果中
			resultBuilder.append(poetry,p1,p2);
			//判断标点
			if (p2%2==0) {
				resultBuilder.append("。\n" );
			}else {
				resultBuilder.append("，");
			}
			p1 = p2;
			p2 +=STEP;
		}
		return resultBuilder.toString();		
	}
	/**
     * 统计字符在字符串中出现的次数
     *
     *  source 源字符串
     *  c      需要统计的字符
     *  次数
     */
	public  static int charCount(String source,char c) {
		if (source == null || source.length() == 0) {
			//抛出一个非法参数异常(继承自RuntimeException 为非受检异常)
			throw new IllegalArgumentException("诗词为空");
		}
			//统计的结果
			int count = 0;
			//将源字符串转换为字符数组
			char[]chars = source.toCharArray();
			for(char aChar : chars) {
				if(aChar == c) {
					count++;
				}
				
			}
			return count;
			
		}

}
