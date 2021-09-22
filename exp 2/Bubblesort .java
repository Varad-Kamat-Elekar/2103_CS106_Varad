
public class Bubblesort {
	public int[] sort(int data[]) {
		
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data.length; j++) {
				if(data[i]< data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.println("Bubble Sorted Array ");
		print(data);
		return data;
	}
		public void print(int data[]) {
			for(int i = 0; i < data.length; i++) {
				System.out.print(" | "+data[i]);
		}
			System.out.println();
}
}
