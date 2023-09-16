//a={1,2,3} --  a={3,1,2} 
class Compute {
    
    public void rotate(int a[], int n)
    {   
            for(int i=0;i<n;i++){
             int temp=a[i];
             a[i]=a[n-1];
             a[n-1]=temp;
            }
    }
}
