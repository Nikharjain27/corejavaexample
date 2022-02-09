package dayfour.assigment;

public class ReverseStr {
	
	void  stringReverse() {
		String str = "nikhar jain";
		int length = str.length();
		StringBuffer revString = new StringBuffer();
		for(int i=length-1; i>=0; i--)
		{
			revString.append(str.charAt(i));
		}
		System.out.println(revString);
	}
	
	
	public static void main(String[] args) {
		
		ReverseStr s = new ReverseStr();
		s.stringReverse();
	}

}
