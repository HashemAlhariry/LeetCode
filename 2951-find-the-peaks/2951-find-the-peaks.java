class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<mountain.length-1;i++)
        {
            if(mountain[i]>mountain[i-1] && mountain[i+1]<mountain[i])
            {
                res.add(i);
            }
        }
        return res;
    }
}