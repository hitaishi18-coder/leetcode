class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int num: nums){
            if(hs.contains(num))
            {
                return num; // duplicate found 
            }

            hs.add(num);
        }

        return -1 ;
    }
}