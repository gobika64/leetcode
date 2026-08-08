class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length,total=0,index=0,max=0;
       List<Boolean> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
             total=candies[i]+extraCandies;
            for(int j=0;j<n;j++){
                if(j!=i){
                     max=Math.max(max,candies[j]);
                }
            }
            if(total>=max){
                 arr.add(true);
            }
            else{
                 arr.add(false);
            }
        }
        return arr;
    }
}