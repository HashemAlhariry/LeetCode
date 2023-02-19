class MedianFinder {

    private PriorityQueue <Integer> lo;
    private PriorityQueue <Integer> hi;
    public MedianFinder() {
        
        this.lo = new PriorityQueue<>(Comparator.reverseOrder());
        this.hi = new PriorityQueue<>();
        
    }
    
    public void addNum(int num) {
        this.lo.offer(num);
        this.hi.offer(lo.poll());
        if(hi.size()>lo.size()+1){
            lo.offer(hi.poll());
        }
    }
    
    public double findMedian() {
        int hiMin=this.hi.peek();
        if(lo.size()==0)
            return hiMin;
        
        int lowMax=this.lo.peek();
        
        if(lo.size()==hi.size()){
            return (lowMax+hiMin)/2.0;
        }else{
            return hiMin;
        }
        
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */