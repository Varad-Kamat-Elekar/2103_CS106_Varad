
public class Selectionsort {

	public class SelectionSort {

		public int[] sort(int data3[]) {

			int min, temp=0;
			for(int i = 0; i<data3.length; i++) {
				min = i;
				for(int j = i+1; j<data3.length; j++) {
					if (data3[j] < data3[min]){
						min = j;
					}
					temp = data3[i];
					data3[i] = data3[min];
					data3[min] = temp;
				}
			}
	 
			System.out.println("Selection Sorted Array ");
			print(data3);
			return data3;
		}
			public void print(int data3[]) {
				for(int i = 0; i < data3.length; i++) {
					System.out.print(" | "+data3[i]);
			}
				System.out.println();
	}
}
}