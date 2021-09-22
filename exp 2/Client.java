
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {9, 8, 5, 7, 1, 3};
		Bubblesort bSort = new Bubblesort();
		bSort.sort(data);
		Insertionsort iSort = new Insertionsort();
		int data2[] = {34, 23, 12, 33, 45, 44, 28, 78, 34, 67};
		iSort.sort(data2);
		Selectionsort sSort = new Selectionsort();
		int data3[] = {88 , 45 , 13 , 5 , 43 , 11 , 56 , 54};
		sSort.sort(data3);
	}

}
