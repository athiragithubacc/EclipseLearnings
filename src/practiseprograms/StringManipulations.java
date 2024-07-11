package practiseprograms;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str=" This is a simple string program ";
		String first="Java";
		String Replacedstr;
		String trimmedStr = str.trim();
		System.out.println(trimmedStr);
		String[] strarray=trimmedStr.split(" ");
		
		for(String element:strarray)
			
		{
			System.out.println(element);
		}
		
		if(str.contains("simple"))
		{
			 Replacedstr=str.replace("simple", first);
			 System.out.println(Replacedstr);
		}
		
		
	}

}
