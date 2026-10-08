package opraters;

public class Pre {
	public static void main(String[] args) {
		int a = 2000;
		int c =2004;
		a++;
		System.out.println(a-7);//1994
		a++;//2001
		--a;//2000
		a--;//1999
		++a;//2000
		System.out.println(c-8);//1996
		c--;//2004
		c++;//2003
		c=2;
		--c;//1
		++c;//2
		System.out.println(a + c);//2002
		a--;//2000
		a=6;
		--a;//5
		c++;//2
		++c;//4
		a--;//4
		c=9;
		--a;//3
		c++;//9
		System.out.println(a);//3
		System.out.println(c);//10
	}
}


