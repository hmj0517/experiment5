package com.hmj.experiment;

/**
 * �ַ�����������
 */
public class StringUtils {
	/**
     * ѭ������Ĳ���
     */
	public static final int STEP = 7;
	 /**
     * ʫ��������
     * poetry δ�ӱ����ŵ�ʫ��
     * ������
     */
	public static String poetryArrange(String poetry) {
		if (poetry==null || poetry.length()==0) {
			//�׳�һ���Ƿ������쳣(�̳���RuntimeException Ϊ���ܼ��쳣)
			throw new IllegalArgumentException("ʫ��Ϊ��");
		}
		if (poetry.length() % STEP !=0) {
			throw new IllegalArgumentException("ʫ�ʲ�����");
		}
		//����һ��StringBuilder,���ڽ��ս��
		StringBuilder resultBuilder = new StringBuilder();
		//˫ָ���㷨��ָ��2��ָ��1���߲���Ȼ��ͬʱ��ǰ�ƶ�
		int p1 = 0;
		int p2 = STEP;
		//��P1ָ��λ�ã������ַ����ĳ���ʱ��ѭ��ֹͣ
		while(p1<poetry.length()) {
			 //��ȡp1,p2֮����ַ�����Ȼ����ӵ������
			resultBuilder.append(poetry,p1,p2);
			//�жϱ��
			if (p2%2==0) {
				resultBuilder.append("��\n" );
			}else {
				resultBuilder.append("��");
			}
			p1 = p2;
			p2 +=STEP;
		}
		return resultBuilder.toString();		
	}
	/**
     * ͳ���ַ����ַ����г��ֵĴ���
     *
     *  source Դ�ַ���
     *  c      ��Ҫͳ�Ƶ��ַ�
     *  ����
     */
	public  static int charCount(String source,char c) {
		if (source == null || source.length() == 0) {
			//�׳�һ���Ƿ������쳣(�̳���RuntimeException Ϊ���ܼ��쳣)
			throw new IllegalArgumentException("ʫ��Ϊ��");
		}
			//ͳ�ƵĽ��
			int count = 0;
			//��Դ�ַ���ת��Ϊ�ַ�����
			char[]chars = source.toCharArray();
			for(char aChar : chars) {
				if(aChar == c) {
					count++;
				}
				
			}
			return count;
			
		}

}
