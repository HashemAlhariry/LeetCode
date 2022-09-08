class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers= new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int currentNumber = i;
            boolean checker=true;
            while(currentNumber>0){
                int value = currentNumber%10;
                currentNumber/=10;
                if(value==0){
                    checker=false;
                    continue;
                }
                if(value!=0 && i%value!=0){
                    checker=false;
                }
            }
            if(checker && i!=0)
                numbers.add(i);
        }
        return numbers;
    }
}