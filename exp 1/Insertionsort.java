
public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {43,23,3,23,45,12};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(" | "+arr[i]);
		}
	    for(int k=1; k<arr.length; k++)   
	    {  
	        int temp = arr[k];  
	        int j= k-1;  
	        while(j>=0 && temp <= arr[j])  
	        {  
	            arr[j+1] = arr[j];   
	            j = j-1;  
	        }  
	        arr[j+1] = temp;  
	    }  
	    System.out.println("\nSorted Array ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(" | "+arr[i]);
		}
	}

}
