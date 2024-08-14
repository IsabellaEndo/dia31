package dia3107;

import java.util.Scanner;

public class primeirotry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner leia = new Scanner(System.in);
		a = 10;
		System.out.println("digite um numero");
		b = leia.nextInt();
		try {
		//c = a/ b;
		//System.out.println("O valor de C é " + c);
		}catch (ArithmeticException erro) {
			System.out.println("nao existe divisao por zero");
		}
		

	}

}
