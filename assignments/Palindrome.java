package week1.assignments;

public class Palindrome {
public static void main(String[] args) {
	int input = 78987;
	int output = 0;
	System.out.println(input);
	for(int i=input;i>0;i=i/10) {
		int remainder = i%10;
		output = output*10+remainder;
	}
	if(input==output) {
		System.out.println("It is a Palindrome");
	}
	else {
		System.out.println("It is not a Palindrome");
	}
}
}
