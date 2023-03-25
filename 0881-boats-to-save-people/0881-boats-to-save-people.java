class Solution {
    public static int numRescueBoats(int[] people, int limit) {
        int res=0;
        Arrays.sort(people);
        int l=0,r=people.length-1;
        while (l<=r){
            if(l!=r && people[l]+people[r] <=limit){
                res++;
                l++;
                r--;
            }else if(l!=r && people[l]+people[r]>limit){
                res++;
                r--;
            } else if (l==r ) {
                res++;
                l++;
                r--;
            }
        }
        return res;
    }
}