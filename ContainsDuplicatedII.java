import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicatedII {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k =1 ;
        System.out.println(containsDuplicates(nums,k));
    }

    public static boolean containsDuplicates(int[] nums, int k ) {
        Map<Integer,Integer > hm = new HashMap<Integer,Integer>();
        {
            for(int i=0; i<nums.length; i++)
            {
                if (!hm.containsKey(nums[i]))
                {
                    hm.put(nums[i],i);
                }
                else
                {
                    int pastindex = hm.get(nums[i]);

                    if(Math.abs(pastindex-i)<=k)
                    {
                        return true ;
                    }
                    else
                        hm.put(nums[i],i);
                }
            }
            return false;
        }
    }
}

