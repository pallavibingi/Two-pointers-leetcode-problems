class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans=nums[0]+nums[1]+nums[2];
        int n=nums.length;
        Arrays.sort(nums);
        //i -> fixed pointer
        for(int i=0;i<n;i++){
            //to avoid the duplicates we going to check the previous element
            //if it is same then continue just skip
            if(i>0 && nums[i]==nums[i-1]){
                    continue;
            }
            //j-> points to the lowest element(moves towards right)

            int j=i+1;
            int k=n-1;
            
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                //to check the difference (to check the closest always remember "target-something")
                //target-sum means gives the answer which is closest to the target (current closest)
                //target-ans gives previous closest
                if(Math.abs(target-sum)<Math.abs(target-ans)){
                    ans=sum;
                }
                if(sum<target){
                    j++;
                }
                else if(sum>target){
                    k--;
                }
                else{
                   return sum;

                }
            }
        }
        return ans;
        
    }
}
