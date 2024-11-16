package Assignment1;

public class Findingnthsmallestandlargest {
public static void main(String[] args) {
	int[] a= {4,2,8,3,1,9};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
int nlargest=3;
int nsmallest=2;
System.out.println(a[a.length-nlargest]);
System.out.println(a[nsmallest-1]);
	}
}

