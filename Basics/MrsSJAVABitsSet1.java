//time complexity - O(log₂ n)
//space complexity - O(1)
//The task is to count the set-bits and non set-bits of an integer N.
class GfG{
    public void count(long n){
        // your code here.
        int scount=0,nscount=0;
        if(n<=0){
           System.out.println(scount+" "+nscount); 
        }else{
            while(n!=0){
                if(n%2==1)
                scount++;
                else
                nscount++;
                n/=2;
            }
            System.out.println(scount+" "+nscount);
        }
    }
}
