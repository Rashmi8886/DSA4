import java.util.*;
public class SubsetOfArray {

	public static void main(String[] args) {
		int[] arr1= {10,15,25,30,40,50};
		int[] arr2= {10,50,40,5,15};
		HashMap<Integer,Integer> map=new HashMap<>();
		boolean flag=true;
		for(int i=0;i<arr1.length;i++)
		{
			map.put(arr1[i],1);
		}
        for(int j=0;j<arr2.length;j++)
        {
        	if(!map.containsKey(arr2[j]))
        	{
        		
        		flag=false;
        	}
        }
     
        
        	System.out.println(flag);

        	
	}

}
