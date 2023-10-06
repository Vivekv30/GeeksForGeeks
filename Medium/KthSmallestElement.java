//Time Complexity - O(nlogn)
//space complexity - O(1)
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       quickSort(arr,l,r);
        return arr[k-1];
        
    } 
    public static void quickSort(int[] a,int l,int h){
         
         if(l<h){
            int m=partition(a,l,h);
            quickSort(a,l,m);
            quickSort(a,m+1,h);
        }
    }
    public static int partition(int[] a,int l,int h){
        int pivot=a[l];
        int i=l-1;
        int j=h+1;
        while(true){
            do{
                i++;
            }while(a[i]<pivot);
            do{
                j--;
            }while(a[j]>pivot);
            
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            if(i>=j){
                return j;
            }
        }
    }
    
}
