package com.yuanzijian2;




/*
������������: 

���������ã� ��߹��ܴ���ĸ����ԡ�

�������������ļӷ����ܡ�

Ŀǰ���ڵ����⣺���µĴ��붼������һ���ӷ����ܣ���
����ӷ����� �Ĵ���Ŀǰ��û���κεĸ����Եġ�

��������� ���һ�����ܵĴ���Ҫ��������������ô��ʱ����԰�
����Ĺ��ܴ����װ��������java�аѹ��ܴ����װ���������Ժ�������ʽ���ֵġ�


�����Ķ����ʽ��
	
	���η�  ����ֵ����  ������(��ʽ����..){
		��Ҫ����װ�Ĺ��ܴ��룻
		return ���;
	}
	

����������
	public static int add(){
		int a =2;
		int b =3;
		return a+b;
	}
	
	���η�: public static

	����ֵ���ͣ� int �� ����ֵ���;���ָ����������Ϻ󣬷��صĽ�����������͡�
	ע�⣺ ĳЩ������û�н�����ظ������ߵ�,��ô��ʱ�򷵻�ֵ������void��

	
	�������� add   �����������ã������Ҫ���øú�������Ҫʹ�õĺ������� ������ֻҪ���ϱ�ʶ�����������򼴿ɡ� 
			 �������������淶�� �׵���ȫ��Сд���������ʵ�����ĸ��д������Сд��
	
	��ʽ������ ���һ�����������е�ʱ�򣬴�����������Ҫ������ȷ�� �ģ���ô��ʱ���Ӧ�ö�����ʽ������

	return �� ��һ��������ظ������ߡ�



�������ص㣺
	1. ���������֮������Ҫ�����òŻ�ִ�еġ� main��������jvm���õģ�����Ҫ�����ֶ����á�



*/
class Demo1 
{
	public static void main(String[] args){
		//int sum = add(2,3); //������add���� �ĺ�����
		//System.out.println("�����"+ sum);
		
		add(2,3);
	}
	

	
/*
	//���ӷ����ܵĺ���
	public static int add(int a,int b){ // int a,int b ��ʽ����: ��ʽ������ֵ�ǽ���������ȷ���ġ�
		return a+b;
	}

���� ����һ���������ӷ����ܣ�����Ҫ���ؽ���������ߣ�ֱ�����������ɡ�
*/

	public static  void add(int a ,int b){
		int sum = a+b;
		System.out.println("�����"+ sum);
	}

}