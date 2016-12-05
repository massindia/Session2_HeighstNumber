import java.util.Scanner;


public class heighst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter 1st Number");
		int a = scan.nextInt();
		System.out.println("Enter 2nd Number");
		int b = scan.nextInt();
		System.out.println("Enter 3rd Number");
		int c = scan.nextInt();

		if(a>b && a>c)//comparing a with b and c
			System.out.println("1st Number is largest"+ a );
		else if (b>a && b>c)//comparing b with a and c
			System.out.println("2nd Number is largest"+ b);
		else
			System.out.println("3rd Number is largest"+ c);
	}

}
