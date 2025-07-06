package revision_java;
import java.util.Scanner;
public class arthemetic_operation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	    char operator = sc.next().charAt(0);
		
		if(operator == '+' ) {
			int c = a+b;
		
		
		System.out.println(c);
		// TODO Auto-generated method stub
		}else if(operator=='-') {
			int c = a-b;
			System.out.println(c);
		}else {
			System.out.println("currently studying more");
		}
		
	}

}
