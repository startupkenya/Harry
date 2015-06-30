
public class Tuesday {
public static void main(String[] args) {
	
	printSomething("Hello world");
	computeSum(4,7);
	
	
}

public static void printSomething(String text){
	System.out.println(text);
}

public static void computeSum(int num1, int num2){
	int sum = num1 + num2;
	
	System.out.println("the sum is: " +sum);
}
}
