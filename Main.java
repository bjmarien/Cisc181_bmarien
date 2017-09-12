import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 double TD;
		 double INT;
		 double YD;
		 double ATTP;
		 double COMP;		 
		 double rating;
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Enter TD: ");
		 TD = scanner.nextDouble();
		 System.out.print("Enter INT: ");
		 INT = scanner.nextDouble();
		 System.out.print("Enter YD: ");
		 YD = scanner.nextDouble();
		 System.out.print("Enter ATTP: ");
		 ATTP = scanner.nextDouble();
		 System.out.print("Enter COMP: ");
		 COMP = scanner.nextDouble();
		 System.out.println("\n");
		 
		 double a = (COMP/ATTP - 0.3) * 5;
		 double b = (YD/ATTP - 3) * .25;
		 double c = (TD/ATTP) * 20;
		 double d = 2.375 - (INT/ATTP * 25);
		 
		 System.out.println("Passer Rating :" + ((a+b+c+d)/6) * 100);
	 }
}
