package week1.assignments;

import java.util.Iterator;

public class PrimeNumber {
public static void main(String[] args) {
	int number = 7;
	int count = 0;
	for(int i=1; i<=number; i++) {
		if(number%i==0) {
			count ++;
		}
	}
	if(count==2) {
		System.out.println(number +"is a Prime Number");
	}
	else {
		System.out.println(number+ "is a non Prime Number");
	}
}
}
