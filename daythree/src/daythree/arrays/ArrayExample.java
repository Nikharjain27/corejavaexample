package daythree.arrays;

public class ArrayExample {
	
	int intNumbers[];
	ArrayExample(int i){
		intNumbers = new int[i];
	}
	
	void populateArray() {
		for(int i=0; i<intNumbers.length;i++) {
			intNumbers[i]=i;
		}
	}
	
	void displayContents() {
		for(int i=0; i<intNumbers.length;i++) {
			System.out.println("Number"+i+" : "+intNumbers[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(args[0]+"***"+args[1]);
		int intArg=Integer.parseInt(args[0]);
		ArrayExample arrayExample = new ArrayExample(intArg); 
		System.out.println("*************************");
		arrayExample.displayContents();
		
		arrayExample.populateArray();
		System.out.println("*************************");
		arrayExample.displayContents();
		
	}

}
