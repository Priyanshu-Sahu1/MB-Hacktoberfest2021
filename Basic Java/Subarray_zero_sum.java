import java.util.HashSet;
import java.util.Set;
 
class ZeroSumSubarray
{
    
     static boolean findsum(int arr[],int n)
    {
     // Returns true if arr[]
    // has a subarray with zero sum
        Set<Integer> hs=new HashSet<Integer>();
        int sum=0;
        //Your code here
       for(int i=0;i<n;i++)
       {
           sum+=arr[i];
           
           if(arr[i]==0 || sum==0||hs.contains(sum))
           {
               return true;
           }
       
           
       hs.add(sum);
           
       }
       return false;
       }
    }
 
    public static void main(String arg[])
    {
        int arr[] = { -3, 2, 3, 1, 6 };
        if (subArrayExists(arr))
            System.out.println(
                "Found a subarray with 0 sum");
        else
            System.out.println("No Such Sub Array Exists!");
    }
}
