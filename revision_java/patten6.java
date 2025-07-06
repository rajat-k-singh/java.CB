package revision_java;

public class patten6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n = 5;
    int space=0;
    int sitara=n;
    
    for(int row=0;row<n;row++) {
    	for(int s=1;s<=space;s++) {
    		System.out.print("  ");
    	}
    	for(int star=0;star<sitara;star++) {
    		System.out.print("* ");
    	}
    	System.out.println();
    	space+=2;
    	sitara--;
    }
	}

}
