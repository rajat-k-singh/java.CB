package revision_java;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=8;
    int space=n-1;
    
    
    for(int row=0;row<n;row++) {
    	for (int f=0;f<space;f++) {
    		System.out.print("  ");
    	}
    		for(int i=0;i<=row;i++) {
    			System.out.print("* ");
    		}
    	
    	System.out.println();
    	space--;
    }
	}

}
