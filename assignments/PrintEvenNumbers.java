package week1.assignments;

public class PrintEvenNumbers {
public static void main(String[] args) {
	int maxRange = 10;
	for (int Even = 0; Even<=maxRange; Even++) {
		if (Even%2==0) {
			System.out.println("The Even number:" + Even);
		}
	}
}
}
