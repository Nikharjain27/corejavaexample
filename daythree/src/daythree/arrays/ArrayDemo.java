package daythree.arrays;

public class ArrayDemo {
	
	//Array is collection of similar type of elements that have contiguous memory location
	//array is java is index based, first element of the array is stored at 0 index
	public static void main(String[] args) {
		
		int arr[]; //declared 'arr' variable
		arr= new int[10]; // initialize 'arr' variable with 10 spaces or memory location
		arr[0]=5;
		arr[4]=6;
		arr[3]=1;
		System.out.println(arr[5]);
		System.out.println(arr[1]);
		System.out.println(arr[4]);
		
		System.out.println("***********************");
		int arrayOfNumbers[]= {1,2,3,4,5,6};
		System.out.println(arrayOfNumbers.length);
		System.out.println(arrayOfNumbers[3]);
		

	}

}
