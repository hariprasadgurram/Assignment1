package Assignment1;

public class Subarray {
public static void main(String[] args) {
	int[] x= {5,2,3,9,1,5};
	int y=10;
	for(int i=0;i<=x.length-1;i++) {
		for(int j=i+1;j<=x.length-1;j++) {
			if(y==x[i]+x[j]) {
				System.out.println(x[i]+ ","+ x[j]);
			}
		}
	}

}
}
