package revision_java;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=5;
    int row=2*n-1;
    int star =1;
    int count=0;
    for(int r = 1;r<=row;r++) {
    	for(int s=1;s<=star;s++) {
    		System.out.print("* ");
    		
    	}
    	count++;
    	if(count>=n) {
    		star--;
    	}else {
    	star++;
    	}
    	System.out.println();
    	
    }
    
    
	}

}
