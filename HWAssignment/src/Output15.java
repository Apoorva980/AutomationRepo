
public class Output15 {

	public static void main(String[] args) {
		int a[][] = new int[10][5];
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 5; j++) {
				a[i][j] = i * j;
			}
		}

		
		System.out.println(a[0][0]);
		System.out.println(a[1][2]);
		System.out.println(a[3][4]);
	}

}
