package revision_java;

public class pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int space=n-1;
		int star=1;
		int row=n;
		int num=1;
		for(int r=1;r<=row;r++) {
			for(int s=1;s<=space;s++) {
				System.out.print("\t");
			}
			for(int k=1;k<=star;k++) {
				System.out.print(num+"\t");//(/t=tab separated matlab 4 space deta hai 
				num++;
			}
			System.out.println();
			
			star+=2;
			space--;
			
		}

	}

}
