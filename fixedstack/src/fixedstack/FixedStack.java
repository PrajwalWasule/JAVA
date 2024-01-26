package fixedstack;

public class FixedStack {
int arr[]=new int[5];
int top=-1;

public void Push(int value)
{
if(Full())
{
	System.out.println("Stack is full!!!!!");
}
else
	arr[top++]=value;

}
public int Pop(int value)
{
if(empty())
{
	System.out.println("Stack is Empty");
	
}
else
{
	arr[--top]=value;
	
}

public boolean Full()
{
	return top==arr.length-1;
}

public boolean empty()
{
	return top==-1;
}





}
