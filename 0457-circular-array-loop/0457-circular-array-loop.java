class Solution {
	public static boolean circularArrayLoop(int[] nums) {

		boolean currentDirection = false;
		int slowPtr = 0;
		int fastPtr = 0;
		for (int i = 0; i<nums.length; i++) {
			if(Math.abs(nums[i]) == nums.length)
			    continue;
			if (nums[i] >= 0) {
				currentDirection = true;
			}
			else
			    currentDirection = false;
			slowPtr = i;
			fastPtr = i;


			while (slowPtr != fastPtr || slowPtr != -1 || fastPtr != -1) {
		
				slowPtr = nextStep(nums, slowPtr, currentDirection);
				if(slowPtr == -1)
				    break;
				
				fastPtr = nextStep(nums, fastPtr, currentDirection);
				if (fastPtr != -1) 
					fastPtr = nextStep(nums, fastPtr, currentDirection);
		
			
				if (fastPtr == -1 || slowPtr == fastPtr) {
					break;
				}
			}
			if (slowPtr == fastPtr && slowPtr != -1) 
			    return true;
		}
		return false;
	}

	public static int nextStep(int[] nums, int currentIndex, boolean currentDirection) {

		boolean nextDirection = false;
		int findStep;

		if (nums[currentIndex] >= 0) 
			nextDirection = true;
		else
		    nextDirection = false;


		if (nextDirection != currentDirection || Math.abs(nums[currentIndex] % nums.length) == 0) 
			return -1;
		
		findStep = currentIndex + nums[currentIndex];
		findStep = findStep % nums.length;
        
		if(findStep < 0)
            findStep = findStep + nums.length;
        
		return findStep;
	}
    
}