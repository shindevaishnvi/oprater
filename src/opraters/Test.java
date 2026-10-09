package opraters;

public class Test {
	public static void main(String[] args) {
		int a = 10;
		a += 5;
		a -= 3;
		a *= 2;
		a /= 4;
		System.out.println(a);
		
		
		
		int a1 = 5;
     	int  b = 10;
		int c = 15;
		System.out.println((a1 < b) && (b < c));
		 // Question 3
        System.out.println((10 > 5) || (5 < 3));
        System.out.println(!(10 < 5));

        // Question 4
        int x4 = 10, y4 = 20;
        System.out.println(x4++ + ++y4);

        // Question 5
        int a5 = 5, b5 = 2;
        System.out.println(a5 % b5);

        // Question 6
        int p6 = 7, q6 = 3;
        System.out.println(p6 * q6 + p6 / q6);

        // Question 7
        int n7 = 5;
        System.out.println(++n7 + n7++);

        // Question 8
        int x8 = 5, y8 = 10;
        System.out.println(x8 > y8 ? x8 : y8);

        // Question 9
        int a9 = 10, b9 = 5, c9;
        c9 = a9++ + --b9 + a9 * b9;
        System.out.println(c9);

        // Question 10
        int a10 = 4, b10 = 2;
        System.out.println(a10 << b10);

        // Question 11
        int a11 = 8, b11 = 2;
        System.out.println(a11 >> b11);

        // Question 12
        int a12 = 10;
        System.out.println(~a12);

        // Question 13
        int a13 = 5, b13 = 7;
        System.out.println(a13 & b13);

        // Question 14
        int a14 = 5, b14 = 7;
        System.out.println(a14 | b14);

        // Question 15
        int a15 = 5, b15 = 7;
        System.out.println(a15 ^ b15);

        // Question 16
        int a16 = 10;
        System.out.println(a16++ + ++a16 + a16--);

        // Question 17
        int a17 = 1;
        a17 = a17++ + ++a17;
        System.out.println(a17);

        // Question 18
        int a18 = 5, b18 = 10;
        boolean result18 = (a18 < b18) ? true : false;
        System.out.println(result18);

        // Question 19
        int a19 = 5, b19 = 10;
        System.out.println(a19 == b19);

        // Question 20
        int a20 = 3, b20 = 2;
        System.out.println(a20 * b20 + a20 / b20);

        // Question 21
        int a21 = 5;
        a21 = a21++ + ++a21;
        System.out.println(a21);

        // Question 22
        int a22 = 10, b22 = 5;
        System.out.println(a22 > b22 && a22 != b22);

        // Question 23
        int x23 = 2, y23 = 3;
        x23 = y23 + 1;
        System.out.println(x23);

        // Question 24
        int a24 = 5;
        a24 += a24 -= a24 *= a24;
        System.out.println(a24);

        // Question 25
        int a25 = 4, b25 = 3;
        System.out.println(a25 > b25 ? a25++ : ++b25);

        // Question 26
        int a26 = 5;
        System.out.println(a26++ + ++a26 + ++a26);

        // Question 27
        int a27 = 2, b27 = 3;
        System.out.println(a27 + b27 * a27 / b27);

        // Question 28
        int a28 = 10, b28 = 20;
        System.out.println(a28 < b28 && b28 > a28);

        // Question 29
        int a29 = 6, b29 = 2;
        System.out.println((a29 / b29) * (a29 % b29));

        // Question 30
        int a30 = 5, b30 = 10, c30 = 15;
        System.out.println((a30 < b30 && b30 > c30) || (b30 < c30));
	}
}
