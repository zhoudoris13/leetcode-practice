class moveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == 0){
                zeroCount ++;
                
            }
            else{
                nums[index] = nums[i];
                index ++;
            }
            
        }
        for(int i = nums.length-zeroCount; i < nums.length; i ++){
            nums[i] = 0;
        }
    }
}
