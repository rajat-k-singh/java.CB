package revision_java;

public class pattern19 {

	public static void main(String[] args) {
		int n=7;
		// TODO Auto-generated method stub

		
		
		int row=n;
		int star=n/2+1;
		int space= -1;
		int stara= n/2+1;		
		for(int r=1;r<=row;r++) {
			for(int s=1;s<=star;s++) {
				System.out.print("* ");
			}
			for(int q=1;q<=space;q++) {
				System.out.print("  ");
			}
			if(r==1||r==n) {
				for(int l=2;l<=stara;l++) {
					System.out.print("* ");
				}
			}else {
			
			for(int l=1;l<=stara;l++) {
				
				System.out.print("* ");
			}
			}
			System.out.println();
			
			if(r>=n/2+1) {
				star++;
				space-=2;
				stara++;
				
			}else {
				star--;
				space+=2;
				stara--;
				
			}
		}
	}

}
