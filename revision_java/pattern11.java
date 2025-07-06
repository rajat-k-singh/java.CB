package revision_java;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=5;
	int space=n-1;
	int star=1;
	for(int row=1;row<=n;row++) {
		for(int s=1;s<=space;s++) {
			System.out.print("  ");
		}
		for(int k=1;k<=star;k++) {
			if(k%2==0) {
				System.out.print("  ");
			}else {
				System.out.print("* ");
			}
		}
		
		System.out.println();
		space--;
		star+=2;
		
	}

	}

}
