package opraters;

public class Increment {
	public static void main(String[] args) {
		int a = 6467;
		int c = 5354;
		a++;
		System.out.println(a+4);//6472
		a++;//6468
		--a;//6468
		a--;//6468
		++a;//6468
		System.out.println(c++);//5354
		c--;//5354
		c++;//5355
		--c;//5354
		++c;//5355
		System.out.println(a + c);//11823
		a--;//6468
		a=6;
		--a;//5
		c++;//5356
		++c;//5357
		a--;//5
		--a;//3
		c++;//5357
		System.out.println(a);//3
		System.out.println(c);//5358

	}

}

