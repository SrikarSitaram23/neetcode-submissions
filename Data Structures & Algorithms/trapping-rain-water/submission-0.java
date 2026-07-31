class Solution {
    public int trap(int[] height) {
        int pref[] = new int[height.length];
        pref[0] = height[0];
        int suff[] = new int[height.length];
        suff[height.length -1] = height[height.length-1];
        for(int i=1; i<height.length; i++){
            pref[i] = Math.max(pref[i-1] , height[i]);
        }
        for(int i=height.length -2; i>=0; i--){
            suff[i] = Math.max(suff[i+1] , height[i]);
        }
        int res =0;
        for(int i=0; i<height.length; i++){
            int area = Math.min(suff[i], pref[i]) - height[i];
            res += area;
        }
        return res;
    }
}
