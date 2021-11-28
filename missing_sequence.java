import java.util.*;
public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,15,25,30,40,50};
		int low=40;
		int high=50;
		HashMap<Integer,Integer> map=new HashMap<>();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<arr1.length;i++)
		{
			map.put(arr1[i],1);
			
		}
		for(int i=40;i<=50;i++)
		{
			if(!map.containsKey(i))
				list.add(i);
		}
          System.out.print(list);
	}

}
