package revision_java;

public class pattern27 {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub

		int n=5;
		int space=n-1;
		int star=1;
		int row=n;
		
		for(int r=1;r<=row;r++) {
			for(int s=1;s<=space;s++) {
				System.out.print("   ");
			}
			int num=1;
			
			for(int k=1;k<=star;k++){
				
				
				System.out.print(num+"  ");
				if(k>=(star/2+1)) {	
					num--;
				}else {
					num++;
				
			}
				
				
			}
				System.out.println();
				space--;
				star+=2;	
			}
		}
		
		
		
	}

