class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boatCount=0;
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        while(i<=j){
            //people[i]=lighest person
            //people[j]=heaveist person
            int sum=people[i]+people[j];
            //because every person is in between 1 and limit .weight of every person in the  people doesnt exceeds the limit
            //sum exceeds the limit means weight of the heaveist person is more which we cannot combine with others so givee him  separate boat
            if(sum<=limit){ 
                i++;
            }
          //sum > limit and sum <= limit we do this both operations
            boatCount++;
             j--;
        }
        return boatCount;
    }
}
