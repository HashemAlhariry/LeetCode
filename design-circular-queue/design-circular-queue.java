class MyCircularQueue {
    private int[] myArray;
    private int headIndex=-1;
    private int tailIndex=-1;
    public MyCircularQueue(int k) {
        myArray= new int[k];
        headIndex=-1;
        tailIndex=-1;

    }

    public boolean enQueue(int value) {
        if(isFull() == true){
           return false;
        }
        if (isEmpty() == true) {
            headIndex = 0;
        }
        tailIndex = (tailIndex + 1) % myArray.length;
        myArray[tailIndex] = value;

        return true;
    }

    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        if(headIndex==tailIndex ){
            headIndex=-1;
            tailIndex=-1;
            return true;
        }
        headIndex = (headIndex + 1) % myArray.length;
        return true;
    }
    public int Front() {
        if(headIndex==-1)
            return headIndex;
        else return myArray[headIndex];
    }

    public int Rear() {
        if(tailIndex==-1)
            return tailIndex;
        else return myArray[tailIndex];
    }

    public boolean isEmpty() {
      return headIndex==-1;
    }
    public boolean isFull() {
        return ((tailIndex+1)%myArray.length)==headIndex;
    }
}