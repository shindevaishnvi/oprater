package opraters;

public class Logical {
	// logical opreter

	// AND                                 //OR                             //NOT
	// true && true=true                  //true || true=true               true=false
	// true && false=false               //true || false=true               false=true
	// false && true=false              //false || true=true
	// false && false=false            //false || false=false

	public static void main(String[] args) {
		boolean check = 34 >= 17;

		System.out.println(!(true) || 3 > 9.4 || check && (74 >= 67));

		System.out.println(true || 77 == 58 || check || (!(67 > 12)) && 47 > 78);

		System.out.println(check && (74 > 586));

		System.out.println((false) && 3 > 9.4 || (74 >= 67));

		System.out.println(check && (35 > 46) || (!(3475 >= 4564)));

		System.out.println(!(false) && 3 > 9.4 && (74 >= 67));

		System.out.println(!(false) || 675 > 9 && check && (53 > 46) || (!("vaishanvi" == "VAISHNAVI")));

		System.out.println(check && (375 > 6757) || 4875 <= 7439 && 3 == 3);

		System.out.println(!(true) || 464 > 476 && (454 >= 4654) || (!("vaishnavi" == "VAISHNAVI")));

		System.out.println(3347 > 9.4343 || check && (74 >= 67) || 49 == 38 && (!(false)) && (!(3626 >= 4738))
				|| 234 == 436 || 467 >= 474);

	}

}
