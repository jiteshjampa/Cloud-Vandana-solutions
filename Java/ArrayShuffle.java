import java.util.*;
public class ArrayShuffle
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		Random r=new Random();
		for(int i=0;i<arr.length;i++)
		{
		    int j=r.nextInt(arr.length);
		    int t=arr[j];
		    arr[j]=arr[i];
		    arr[i]=t;
		}
		for(int n:arr)
		{
		    System.out.print(n+" ");
		}
	}
}
