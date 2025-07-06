package revision_java;

public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n = 5;
    int space=2*n-3;
    int star=1;
    for(int row=1;row<=n;row++) {
    	
    	for(int s=1;s<=row;s++) {
    		System.out.print("* ");
    	}
    	for(int k=1;k<=space;k++) {
    		System.out.print("  ");
    	}
    	int k = 1;
    	if(row==n) {
    		k=2;
    	}
    		
    	while(k<=star) {
    		System.out.print("* ");
    		k++;
    	}
    	
    	space-=2;
    	System.out.println();
    	star++;
    }
	}
}


