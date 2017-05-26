package com.yuanzijian2;




/*
函数（方法）: 

函数的作用： 提高功能代码的复用性。

需求：做两个数的加法功能。

目前存在的问题：以下的代码都是在做一个加法功能，而
这里加法功能 的代码目前是没有任何的复用性的。

解决方案： 如果一个功能的代码要被复用起来，那么这时候可以把
这里的功能代码封装起来，在java中把功能代码封装起来的是以函数的形式体现的。


函数的定义格式：
	
	修饰符  返回值类型  函数名(形式参数..){
		需要被封装的功能代码；
		return 结果;
	}
	

分析函数：
	public static int add(){
		int a =2;
		int b =3;
		return a+b;
	}
	
	修饰符: public static

	返回值类型： int 。 返回值类型就是指函数运行完毕后，返回的结果的数据类型。
	注意： 某些函数是没有结果返回给调用者的,那么这时候返回值类型是void。

	
	函数名： add   函数名的作用：如果需要调用该函数就需要使用的函数名。 函数名只要符合标识符的命名规则即可。 
			 函数名的命名规范： 首单词全部小写，其他单词的首字母大写，其他小写。
	
	形式参数： 如果一个函数在运行的时候，存在着数据是要调用者确定 的，那么这时候就应该定义形式参数。

	return ： 把一个结果返回给调用者。



函数的特点：
	1. 函数定义好之后，是需要被调用才会执行的。 main函数是有jvm调用的，不需要我们手动调用。



*/
class Demo1 
{
	public static void main(String[] args){
		//int sum = add(2,3); //调用了add名字 的函数。
		//System.out.println("结果："+ sum);
		
		add(2,3);
	}
	

	
/*
	//做加法功能的函数
	public static int add(int a,int b){ // int a,int b 形式参数: 形式参数的值是交给调用者确定的。
		return a+b;
	}

需求： 定义一个函数做加法功能，不需要返回结果给调用者，直接输出结果即可。
*/

	public static  void add(int a ,int b){
		int sum = a+b;
		System.out.println("结果："+ sum);
	}

}
