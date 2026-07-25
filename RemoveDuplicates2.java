/*we dont have to check the first two elements right!*/
// i = pointers which shows the current element
//k = pointer which shows the duplicate element means appeared more than 2 times

/* the main logic is :
if(arr[k-2]==arr[i]){
dont update k;
}
if(arr[k-2]!=arr[i]){
 update k with the current value;
 arr[k]=arr[i];
}*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=2;
        int k=2;
        while(i<nums.length){
            if(nums[k-2]!=nums[i]){
                nums[k++]=nums[i];
            }
            i++;
        }
        return k;
       
        
    }
}
