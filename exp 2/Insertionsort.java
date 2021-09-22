
public class Insertionsort {

	public int[] sort(int data2[]) {
		
		for(int k=1; k<data2.length; k++)   
	    {  
	        int temp = data2[k];  
	        int j= k-1;  
	        while(j>=0 && temp <= data2[j])  
	        {  
	        	data2[j+1] = data2[j];   
	            j = j-1;  
	        }  
	        data2[j+1] = temp;  
	    }  
		System.out.println("Insertion Sorted Array ");
		print(data2);
		return data2;
	}
		public void print(int data2[]) {
			for(int i = 0; i < data2.length; i++) {
				System.out.print(" | "+data2[i]);
		}
			System.out.println();
}
		
}
