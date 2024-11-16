package Assignment1;

public class Checkingpalindrome {
	public static void main(String[] args){
		String st="nitin";
		int n=st.length();
		String st1="";
		for(int i=n-1;i>=0;i--) {
			st1=st1+st.charAt(i);
		}
		System.out.println(st1);
	

	if(st.equals(st1)){
		System.out.println("its palindrome");
	}
	else {
		System.out.println("its not palindrome");
	}

}
}