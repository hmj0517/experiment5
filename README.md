# experiment5
## 一、实验目的
1. 掌握字符串String及其方法的使用
2. 熟悉字符输入输出流、以及使用字符输入输出流进行文件读取、写入的方法
3. 掌握异常处理的方式和结构
## 二、实验要求
1. 从文本文件B.txt中读取《长恨歌》文本(编码格式使用GBK)
2. 每7个汉字加入一个标点符号，奇数时为“，”偶数时为“。”
3. 允许提供参数，统计诗词中某个汉字出现的次数
4. 对程序进行异常处理
## 三、实验过程
1. 创建一个文件工具类FileUtils.java    
   1.1. 实现读取文件的方法readStringByFile(String):String，其中参数为文件路径，返回值为读取的结果     
   1.2. 实现写入文件的方法writeStringToFile(String,String):void，其中参数1为写入的内容，参数2为写入文件的路径，无返回值 
2. 创建学生实体类Student.java,其中描述学号、姓名、性别、年龄等属性，并使用Scanner为参数的构造方法，进行交互式赋值
3. 创建字符串处理工具类StringUtils.java   
        3.1. 创建STEP常量，形容循环处理的步长，值为7   
        3.2. 实现诗词整理方法poetryArrange(String):String，其中参数为待整理的诗词，返回值为整理完毕后的结果           
            3.2.1. 对参数进行非空校验，如果为空则抛出一个非法参数异常   
            3.2.2. 对参数进行完整性校验(参数字符串的长度必须为7的倍数)，否则抛出一个非法参数异常   
            3.2.3. 定义一个StringBuilder,用于拼接处理结果          
            3.2.4. 定义两个int类型变量，p1和p2，其中，p1初始值为0，p2初始值为7(STEP)   
            3.2.5. 开始一个while循环，循环条件为p1的值小于字符串的长度   
            3.2.6. 循环内:取字符串下标为p1到p2区间的部分，拼接到处理结果中   
            3.2.7. 循环内:判断p2的如果为奇数，则在结果后面追加“，”否则追加“。\n”    
            3.2.8. 循环内:将p2赋值给p1，然后p2自增7，等待下一次循环判断     
            3.2.9. 循环结束:循环结束后，将拼接好的字符串返回  
        3.3. 实现统计字符出现次数方法charCount(String,char):int，其中参数1为被统计的字符串，参数2为被统计的字符，返回值为字符在字符串中出现的次数     
            3.3.1. 非空校验     
            3.3.2. 创建count变量，int类型，用来保存次数     
            3.3.3. 将字符串转换为字符数组，使用char[]接收     
            3.3.4. 循环遍历char数组，遍历过程中，如果当前字符等于参数2中的字符，则count+1      
            3.3.5. 返回count统计结果
 4. 创建Main类，并实现main方法     
        4.1. 实例化学生对象，并new一个Scanner对象传入到学生对象的构造函数中     
        4.2. 调用FileUtils中读取文件的方法，将文件路径传入，获取读取结果   
        4.3. 将读取结果，传入StringUtils的整理诗词方法，对诗词进行整理，并使用变量保存   
        4.4. 定义char变量，用于统计该变量值在诗词中出现的次数，将统计结果使用int变量接收    
        4.5. 将学生信息、诗词处理结果、字符出现次数拼接起来，使用String变量保存   
        4.6. 调用FileUtils的文件写入方法，写入到磁盘中    
## 四、核心代码
```
        /**
         * 诗词整理方法
         *
         * poetry 未加标点符号的诗词
         * 整理结果
         */
        public static String poetryArrange(String poetry) {
            if (poetry == null || poetry.length() == 0) {
                //抛出一个非法参数异常(继承自RuntimeException 为非受检异常)
                throw new IllegalArgumentException("诗词为空");
            }
            if (poetry.length() % STEP != 0) {
                throw new IllegalArgumentException("诗词不完整");
            }
            //创建一个StringBuilder,用于接收结果
            StringBuilder resultBuilder = new StringBuilder();
    
            //双指针算法，指针2比指针1快七步，然后同时向前移动
            int p1 = 0;
            int p2 = STEP;
            //当P1指向位置，超过字符串的长度时，循环停止
            while (p1 < poetry.length()) {
                //截取p1,p2之间的字符串，然后添加到结果中
                resultBuilder.append(poetry, p1, p2);
                //判断标点
                if (p2 % 2 == 0) {
                    resultBuilder.append("。\n"); 
                } else {
                    resultBuilder.append("，");
                }
                p1 = p2;
                p2 += STEP;
            }
            return resultBuilder.toString();
        }
```
```
    /**
     * 统计字符在字符串中出现的次数
     *
     * source 源字符串
     * c      需要统计的字符
     * 次数
     */
    public static int charCount(String source, char c) {
        if (source == null || source.length() == 0) {
            //抛出一个非法参数异常(继承自RuntimeException 为非受检异常)
            throw new IllegalArgumentException("诗词为空");
        }
        //统计的结果
        int count = 0;
        //将源字符串转换为字符数组
        char[] chars = source.toCharArray();
        for (char aChar : chars) {
            if (aChar == c) {
                count++;
            }
        }
        return count;
    }

```
## 五、系统运行截图
![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/8hd7Z3weOJqQBN0mt9iczRJLwYXs4BdiatS4Zh4jibopjKDnTHSWMnHbfdib5kxMRQun/0)
![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/8hd7Z3weOJqQBN0mt9iczRJLwYXs4BdiatS4Zh4jibopjL0gibt4MSHBAOtEdo186xOm/0)
## 六、编程感想
1. 通过本次实验，我学会了String及其方法的使用，并了解了StringBuilder的基本使用 
2. 掌握了字符输入输出流的使用方法，基本可以完成文件的读和写操作 
3. 掌握了异常的处理方式和结构
