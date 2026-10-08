package opraters;

public class Day2 {
	public static void main(String[] args) {
		// increment decriment
		// pre and post
		int a = 6;
		int c = 5;
		a++;  //7
		System.out.println(a++);  //7 update 8
		a++;  //8
		--a;  //7
		a--;  //7
		++a;  //8
		System.out.println(c++); //5 update 6
		c--;  //6
		c++; //6
		--c; //5
		++c; //6
		System.out.println(a + c); //14
		a--;//8
		--a;//6
		c++;//6
		++c;//8
		a--;//6
		--a;//4
		c++;//8
		System.out.println(a);//4
		System.out.println(c);//9

	}

}
