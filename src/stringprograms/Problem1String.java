package stringprograms;

public class Problem1String {

	public static void main(String[] args) {
		// Reverse the order of words
		String s="Testing Training Center";
		
		String[] arr=s.split(" ");
		String rev=" ";
		//System.out.println(arr.length-1);
		 for(int i=arr.length-1;i>=0;i--)
		 {
			 rev=rev+arr[i]+" ";
		 }
		 System.out.println(rev);
	}

}
