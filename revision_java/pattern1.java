package revision_java;
import java.util.*;

public class pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		int row=0;
		while (row<=n) {
			int a = 0;
			while(a<=n) {
				System.out.print("*");
				a++;
			}
			System.out.println();
			row++;
		}
		

	}

}
