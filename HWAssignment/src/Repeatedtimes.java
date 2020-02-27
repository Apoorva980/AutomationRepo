
public class Repeatedtimes {

	public void MaxRepeatingElement(int[] arrA) {
		int maxCounter = 0;
		int element = 0;
		for (int i = 0; i < arrA.length; i++) {
			int counter = 1;
			for (int j = i + 1; j < arrA.length; j++) {
				if (arrA[i] == arrA[j]) {
					counter++;
				}
			}
			if (maxCounter < counter) {
				maxCounter = counter;
				element = arrA[i];
			}
		}
		System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCounter);
	}

	public static void main(String[] args) {
		int[] arrA = { 1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1 };
		Repeatedtimes m = new Repeatedtimes();
		m.MaxRepeatingElement(arrA);
	}
}

