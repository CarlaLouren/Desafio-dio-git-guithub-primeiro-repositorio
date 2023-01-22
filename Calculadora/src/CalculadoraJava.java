import java.util.Scanner;

public class CalculadoraJava {

	public static void main(String[] args) {
	
		int n1,n2;
		
		
Scanner input = new Scanner(System.in);

System.out.println("Qual o primeiro numero");
n1 = input.nextInt();
System.out.println("Qual o segundo numero");
n2 = input.nextInt();

System.out.println("soma:"+(n1+n2));
System.out.println("Divisão:"+(n1/n2));
System.out.println("Multiplicação:"+(n1*n2));
System.out.println("Subitração:"+(n1-n2));

	}

}
