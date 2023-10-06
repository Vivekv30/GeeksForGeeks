

class MyStack
{
    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
  //time complexity - O(1)
  //space complexity - O(1)
    void push(int a)
	{
	    // Your code here
	    if(top>=arr.length){
	        System.exit(-1);
	    }
	        arr[++top]=a;
	} 
	
    //Function to remove an item from top of the stack.
  //time complexity - O(1)
  //space complexity - O(1)
	int pop()
	{
        // Your code here
        if(top==-1){
            return -1;
        }
            return arr[top--];
	}
}
