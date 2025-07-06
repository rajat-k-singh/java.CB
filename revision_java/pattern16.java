package revision_java;

public class pattern16 {

	public static void main(String[] args) {
		int n=5;
		// TODO Auto-generated method stub
        int row=2*n-1;
        int space=n-1;
        int star=n;
        
        for(int r=1;r<=row;r++) {
        	for(int s=1;s<=space;s++) {
        		System.out.print("  ");
        		
        	}
        	for(int k=1;k<=star;k++) {
        		System.out.print("* ");
        		
        	}
        	
        	System.out.println();
        	
        	if(r>=n) {
        		space++;
        		star++;
        		
        	}else {
        		star--;
            	space--;
        	}
        }
		
		
		
		
		
		
		
		
		
	}

}
