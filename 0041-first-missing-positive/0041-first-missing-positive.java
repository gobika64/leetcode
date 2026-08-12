class Solution {
    public int firstMissingPositive(int[] nums) {
       /* long max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        boolean yes=false;
        for(int i=1;i<=nums.length+1;i++){
            yes=false;
            int j=0;
            for(j=0;j<nums.length;j++){
                if(i==nums[j]){
                    yes=true;
                }
            }
            if(!yes){
                return i;
            }
        }
        return 0;*/
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int i=1;i<=nums.length+1;i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return 0;
    }
}
