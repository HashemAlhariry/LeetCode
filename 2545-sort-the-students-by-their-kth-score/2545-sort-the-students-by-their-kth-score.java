class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {

        //Automatic sorting keys in ascending order
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int[][] result = new int[score.length][score[0].length];

        for(int i =0 ; i<score.length ; i++){
            //adding key = student grade , value = index of student
            map.put(score[i][k] , i);
        }

        int index=score.length-1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //adding the array from the end to get the students sorted
            result[index] = score[entry.getValue()];
            index--;
        }

        return result;
    }
}