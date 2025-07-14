import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> seen = new HashSet();

        for(int num : nums) {
            if(seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        Boolean result = ContainsDuplicate.containsDuplicate(nums);

        System.out.println(result);
    }
}