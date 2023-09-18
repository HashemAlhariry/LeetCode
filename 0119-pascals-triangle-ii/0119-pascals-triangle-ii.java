class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> first= new ArrayList<>(); first.add(1);
        List<Integer> second= new ArrayList<>();second.add(1);second.add(1);

        list.add(first);
        list.add(second);

        for (int i = 2 ; i <= rowIndex; i++) {
            List<Integer> tempList = new ArrayList<>();
            for (int j = 0; j <=i ; j++) {
                if(j==0 || j==i)
                    tempList.add(1);
                else {
                    tempList.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(tempList);
        }

        return list.get(rowIndex);
    }

}