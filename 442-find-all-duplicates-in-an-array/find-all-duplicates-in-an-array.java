class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for(int num : nums)
        {
            if(hs.contains(num))
            {
                duplicates.add(num);
            }
            else{
                hs.add(num);
            }
        }
        return duplicates;
    }
}