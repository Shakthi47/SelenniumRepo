package week1.assignments;

public class FibonacciSeries {
public static void main(String[] args) {
	int firstNum = 0;
	int secNum = 1;
	int sum = 0;
	int range = 10;
	System.out.println("First Number:"+firstNum+"\n"+"Second Number:"+secNum);
	for(int i=0; i<range; i++) {
		sum = firstNum+secNum;
		System.out.println("Fibonacci Series"+sum);
		firstNum=secNum;
		secNum=sum;
	}
}
}
