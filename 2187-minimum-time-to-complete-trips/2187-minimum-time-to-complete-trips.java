class Solution {
  public static long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        long left=time[0],right=(long) time[time.length-1]*totalTrips,mid;
        long answer=0;
        while (left<=right){
             mid=left+(right-left)/2;
             if(checkCount(time,totalTrips,mid)){
                 answer=mid;
                 right=mid-1;
             }else {
                 left=mid+1;
             }
        }
        return answer;
    }
    private static boolean checkCount(int[] time,int totalTrips,long mid){
        long total=0;
        for (int t: time){
            total+= mid/t;
        }
        return total>=totalTrips;
    }
}