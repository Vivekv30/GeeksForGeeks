//time complexity - O(N)
//space complexity - O(1)

class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
            while(d>=n){
                d-=n;
            }
        if(d!=0){    
            reverse(arr,0,d-1);
            reverse(arr,d,n-1);
            reverse(arr,0,n-1);
        }      
    }
    
    static void reverse(int arr[],int first,int last){
        
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }   
}
