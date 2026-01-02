package Day3;

public class PassByValueDemo {

	static void changeValue(int num1) {
		num1 = 1000;
	}
	
	static void changeArray(int arr1[]) {
		
		arr1[0] = 99;
	}
	
	
	public static void main(String[] args) {
		
		int num = 100;
		PassByValueDemo.changeValue(num);
		System.out.println("The changed value is " + num);
		
		int arr[] = {10,20,30};
		PassByValueDemo.changeArray(arr);
		System.out.println("The changed value of Array is " + arr[0]);
	}

}
