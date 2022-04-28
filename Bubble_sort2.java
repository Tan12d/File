
public class Bubble_sort2
{
	public static void b_sort(int w[],int n)
	{
		boolean isSwapped;
		
		for(int i=0;i<n;i++)//this for loop checks number of iterations
		{
			isSwapped = false;
			for(int j=0;j<n-1-i;j++)//this for loop is used for comparisons
			{
				if(w[j]>w[j+1])
				{
					int temp = w[j];
					w[j] = w[j+1];
					w[j+1] = temp;
					
					isSwapped = true;
				}
			}
			
			if(isSwapped == false)
				break;
		}
		
		for(int k=0;k<w.length;k++)
		{
			System.out.print(w[k]+" ");
		}
	}

	public static void main(String[] args) 
	{
		int a[]= {12,98,4,-34,21,9,-38};
		
		b_sort(a,a.length);

	}

}
