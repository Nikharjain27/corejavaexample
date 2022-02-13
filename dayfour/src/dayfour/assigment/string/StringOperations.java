package dayfour.assigment.string;

public class StringOperations {

	public static void main(String[] args) {
		String str ="Core";
		String s="Core";
		System.out.println(s.hashCode());
		System.out.println(str.hashCode());
		s="hi";
		System.out.println(s.hashCode());
		String s1 =s.replace('i','a');
		System.out.println(s);
		System.out.println(s1);
	}

}
