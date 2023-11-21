import java.util.Scanner;

public class Triagolnik {

	public static void main(String[] args) {
		double a,b,c;
		
		Scanner tastatura=new Scanner(System.in);
		System.out.print("Vnesi gi stranite na triagolnikot");
		a=tastatura.nextDouble();
		b=tastatura.nextDouble();
		c=tastatura.nextDouble();
		
		if(a+b>c && a+c>b && b+c>a) {
			System.out.print("So dadenite strani se formira triagolnik" );
		}else {
			System.out.print("So dadenite strani ne se formira triagolnik");
			System.exit(0);
		}
		if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a) {
			System.out.print("Triagolnikot e pravoagolen.");
		}
		else if(a*a+b*b<c*c || b*b+c*c<a*a || a*a+c*c<b*b) {
			System.out.print("Triagolnikot e tapoagolen.");
		}
		else {
			System.out.print("Triagolnikot e ostroagolen.");
		}

	}

}
