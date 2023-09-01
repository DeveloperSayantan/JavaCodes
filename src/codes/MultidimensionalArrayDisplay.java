package codes;

public class MultidimensionalArrayDisplay {

	public static void main(String[] args) {
		int [][] arr = {{2,5,6,8},{78,89,85,56},{89,5,6,2}};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
