class max {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
        /*
        int product=1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]*nums[j]*nums[k]>product || -1*nums[i]*nums[j]*nums[k]>product){
                        product=nums[i]*nums[j]*nums[k];
                    }
                }
            }
        }
        if(n==3 && (nums[0]==0 || nums[1]==0 || nums[2]==0)){
            return 0;
        }
        return product;
        */
    }
}
