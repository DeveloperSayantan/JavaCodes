package codes;

public class MaximumNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 50;
		int d = 40;
		
		if(a>b) {
			if(a>c) {
				if(a>d) {
					System.out.println("A is Maximum.");
				}
				else {
					System.out.println("D is Maximum");
				}
			}
			
		}
		else if(b>c){
				if(b>d) {
					System.out.println("B is Maximum.");
				}
				else {
					System.out.println("D is Maximum.");
				}
			}
		else {
			if(c>d) {
				System.out.println("C is Maximum.");
			}
			else {
				System.out.println("D is Maximum.");
			}
		}
	}

}


