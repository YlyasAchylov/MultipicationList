import java.util.Scanner;

public class MultipicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n, c;
	      System.out.println("Enter an integer to print it's multiplication table");
	     Scanner scan = new Scanner(System.in);
	      n = scan.nextInt();
	      System.out.println("Multiplication table of "+n+" is :-");
	 
	      for ( c = 1 ; c <= 10 ; c++ )
	         System.out.println(n+"*"+c+" = "+(n*c));
	}

}
