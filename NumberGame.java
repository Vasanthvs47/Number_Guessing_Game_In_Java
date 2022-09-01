import java.util.Scanner;
import java.util.Random;
public class NumberGame {
	
	static int check(int a,int b) {
		Integer rem1=a,rem2=b,sum1,sum2;
		String s = "";
		for(int i=0;i<4;i++) {
			sum1 = rem1%10;
			sum2 = rem2%10;
			if(sum1==sum2) {
				s = sum1.toString() + s;
			}
			else {
				s = "X" + s;
			}
			rem1 /= 10;
			rem2 /= 10;
		}
		System.out.println(s);
		if(a==b) {
			return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		boolean t = true;
		boolean y = true;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int count =0;
		while(t) {
			Random guess = new Random();
			int num = guess.nextInt(1000,10000);
			System.out.println("-------NUMBER GUESSING GAME-------");
			while(y) {
				System.out.print("Enter a 4-digit number: ");
				int input = sc.nextInt();
				int result = check(num,input);
				count++;
				if(result==0) {
					y = false;
					System.out.println(count + " attempt");
				}
			}
			System.out.print("Do you want to play again(y/n)?  ");
			String in = sc1.nextLine();
			if(in.compareTo("n")==0) {
				t = false;
			}
			else {
				y = true;
			}
		}
		sc.close();
	}

}
