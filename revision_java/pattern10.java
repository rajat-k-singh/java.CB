package revision_java;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=8;
    int space=0;
    int sitara=n;
    int bawala=n-1;
    for(int row=0;row<n;row++) {
    	for(int s=1; s<=space;s++) {
    		System.out.print("  ");
    	}
    	for(int a=1;a<=sitara;a++) {
    		System.out.print("* ");
    	}
    	for(int b=1;b<=bawala;b++) {
    		System.out.print("* ");
    	}
    	System.out.println();
    	space++;
    	bawala--;
    	sitara--;
    }
    
	}

}
