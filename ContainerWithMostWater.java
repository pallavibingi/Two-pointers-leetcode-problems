class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left< right){
          /*  int width=right-left;
            int length=Math.min(height[left],height[right]);
            int area=width*length;  
            max= Math.max(max,area);*/

            if(height[left] < height[right] ){
               max=Math.max(max,(right-left)*height[left]);
               left++;
            }
           else{
              max=Math.max(max,(right-left)*height[right]);
              right--;
           }
        }
        return max;
        
    }
}
