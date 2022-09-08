class Solution {
    public int minimumSum(int num) {
        
        int temp=num;
        int arr [] = new int[4];
        for (int i = 0; i <4 ; i++) {
            int number=temp%10;
            temp/=10;
            arr[i]=number;
        }
        Arrays.sort(arr);
        String one=arr[0]+""+arr[3];
        String two=arr[1]+""+arr[2];

        int x =  Integer.parseInt(one);
        int y = Integer.parseInt(two);
        return x+y;
    }
}