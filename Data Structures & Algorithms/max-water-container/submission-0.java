class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int maxArea=0;

        while(l<r){
            int currWidth = r-l;

            int currHeight = Math.min(heights[l], heights[r]);
            int currArea = currWidth * currHeight;
             
             maxArea = Math.max(maxArea , currArea);

             if(heights[l] < heights[r]){
                l++;
             }
             else{
                r--;
             }
        }
        return maxArea;
    }
}
