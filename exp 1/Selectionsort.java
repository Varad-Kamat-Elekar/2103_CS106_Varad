
public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {43,42,32,12,45,56};
				 int temp,i,j,low;
				 for(i = 0; i<a.length;i++)
					 System.out.print(a[i] + " ");
				 for(i=0;i<a.length-1;i++) {
					 low = i;
					 for(j=i+1;j<a.length;j++) {
						 if(a[j]<a[low])
							 low = j;
					 temp = a[low];
					 a[low] = a[i];
					 a[i] = temp;
					 }
				 }
				 System.out.println();
				 System.out.println("Sorted array ");
				 for(i = 0; i<a.length;i++)
					 System.out.print(a[i] + " ");
	
	}

}
