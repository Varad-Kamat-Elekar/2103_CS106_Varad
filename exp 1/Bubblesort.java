
public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {43,23,3,23,45,12};
		for(int i = 0; i < num.length; i++) {
			System.out.print(" | "+num[i]);
	}
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
				if(num[i]< num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("\nSorted array ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(" | "+num[i]);

	}

	}
}