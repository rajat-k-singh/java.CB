package revision_java;

public class pattern26 {

	public static void main(String[] args) {
		int n=5;
		// TODO Auto-generated method stub

		int row=n;
		int space=n-1;
		int star=1;
		
		for(int r=1;r<=row;r++) {
			for(int s=1;s<=space;s++) {
				System.err.print("  ");
			}
			for(int k=1;k<=star;k++) {
				
				System.out.print(k+" ");
				
			}
			System.out.println();
			space--;
			star+=2;
		}
		
	}

}
