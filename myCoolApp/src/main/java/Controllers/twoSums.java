package Controllers;

import java.util.ArrayList;

class Solution{
    public int[] twoSum(int[] nums, int target){
        ArrayList<Integer> list=new ArrayList<>();
        int[]indexes=new int[2];
        for (int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for (int i=0;i<list.size();i++){
            for (int j=0;j<list.size();j++){
                if (list.get(i)+list.get(j)==target && i!=j){
                    indexes[0]=i;
                    indexes[1]=j;
                    return indexes;
                }
            }
        }
        return null;
    }
}
public class twoSums {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[]array=new int[2];
        array[0]=3;
        array[1]=3;
        for (int i=0;i<array.length;i++){
            System.out.println(solution.twoSum(array,6)[i]);
        }
    }



}
