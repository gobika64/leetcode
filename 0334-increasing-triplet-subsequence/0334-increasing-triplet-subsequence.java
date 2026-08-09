class Solution {
    public boolean increasingTriplet(int[] nums) {
       /* boolean yes=false;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    for(int k=j+1;k<nums.length;k++){
                        if(nums[j]<nums[k]){
                            return true;
                        }
                    }
                   
                }
            }

        }
        return yes;*/
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] <= first) {
                first = nums[i];
            }
            else if (nums[i] <= second) {
                second = nums[i];
            }
            else {
                return true;
            }
        }

        return false;
    }
}