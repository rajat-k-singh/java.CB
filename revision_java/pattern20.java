package revision_java;

public class pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=7;
    int row=n;
    int space=n/2;
    int star=1;
    int jagah=-1;
    for(int i=1;i<=row;i++) {
    	for(int k=1;k<=space;k++) {
    		System.out.print("  ");
    	}
    	for(int p=1;p<=star;p++) {
    		System.out.print("* ");
    	}
    	for(int j=1;j<=jagah;j++) {
    		System.out.print("  ");
    	}
    	if(i==1||i==row) {
    		for(int d=2;d<=star;d++) {
        		System.out.print("* ");
    		}
    	}else {
    	
    	for(int d=1;d<=star;d++) {
    		System.out.print("* ");
    	}
    	}
    	System.out.println();
    	
    	if(i>n/2) {
    		space++;
    		jagah-=2;
    		
    	}else {
    		space--;
        	jagah+=2;
    		
    	}
    }
	}

}
