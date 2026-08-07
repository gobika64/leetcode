class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n=str1.length();
         int m=str2.length();
        String s="";
        int ans=0;
        if ((str1 + str2).equals(str2 + str1)){
            int min = Math.min(n, m);
                for(int i=min;i>=1;i--){
                    if(n%i==0 && m%i==0){
                        ans=i;
                        break;
                    }
                }
            }
            for(int i=0;i<ans;i++){
                s=s+str1.charAt(i);
        }
        return s;
    }
}