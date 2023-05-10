package com.foxmo.leetcode.test;

//String 类型的变量和常量做“+”运算
/*对于编译期可以确定值的字符串，也就是常量字符串 ，jvm 会将其存入字符串常量池。并且，
字符串常量拼接得到的字符串常量在编译阶段就已经被存放字符串常量池，这个得益于编译器的优化。*/
public class Test1 {
    public static void main(String[] args) {

        String str1 = "str";
        String str2 = "ing";
        String str3 = "str" + "ing";//常量池中的对象
        String str4 = str1 + str2;//在堆上创建的新的对象
        String str5 = "string";//常量池中的对象
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str5.hashCode());
        System.out.println(str3 == str4);//false
        System.out.println(str3 == str5);//true
        System.out.println(str4 == str5);//false


    }
}
