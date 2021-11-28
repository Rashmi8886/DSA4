import java.util.*;

public class QueueUsingStack {
	Stack<Integer> stk1=new Stack<>();
	Stack<Integer> stk2=new Stack<>();
	public void enQue(int data)
	{
		while(!stk1.isEmpty())
		{
			stk2.push(stk1.pop());
		}
		stk1.push(data);
		while(!stk2.isEmpty())
		{
			stk1.push(stk2.pop());
		}
	}
	public int deque()
	{
		if(stk1.isEmpty())
		{
			System.out.println("Queue is Empty");
			System.exit(0);
		}
	     int data=stk1.peek();
	     return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack list=new QueueUsingStack();
		list.enQue(50);
		list.enQue(20);
		list.enQue(30);
		   System.out.println(list.deque());
		
		
      
	}

}