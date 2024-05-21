import java.util.Random;
import java.util.Scanner;

public class Guessing {
	public String getNumber(int i, int num) {
		int select = generatMax(num);
		String s = "";
		System.out.println(select);
		while (select != i) {
			if (i > select) {
				System.out.println("the number greater than the choosen number");
				i = repeat();
			} else if (i < select) {
				System.out.println("the number less than the choosen number");
				i = repeat();
			} else {
				return "you hit the right number";
			}
		}
		if (i == select) {
			s = "you hit the right number";
		}
		System.out.println(s);
		return s;
	}

	public static int repeat() {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the number again ");
		int n = s.nextInt();
		return n;
	}

	public static int generatMax(int num) {
		Random r = new Random();
		int max = 0;
		int min = 0;
		int select = 0;
		if (num == 1) {
			max = 50;
			min = 1;
			return select = Math.round(r.nextInt(max));
		} else if (num == 2) {
			max = 100;
			min = 1;
			return select = Math.round(r.nextInt(max));
		} else if (num == 3) {
			max = 500;
			min = 1;
			return select = Math.round(r.nextInt(max));
		}
		return 0;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("please enter the number for the level \n1 :for easy" + "\n2 :for medium \n3: for hard ");
		System.out.println("please enter the number ");
		int num = s.nextInt();
		System.out.println("please guss the number to start playing ");
		int n = s.nextInt();
		Guessing g = new Guessing();

		g.getNumber(n, num);
	}
}
