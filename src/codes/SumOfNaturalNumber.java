package codes;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int number = 1, sum=0;
		while(number<=10) {
			sum +=number;
			number++;
		}
		
		System.out.println("The sum of 10th natural number is "+sum);

	}

}
