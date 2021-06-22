var shuffle = function(nums, n) {
    let nums_A = nums.splice(0,n);
    let newNums=new Array();
        let j=0;
        for(let i=0; i < n; i++){
            
                newNums[j++]=nums_A[i];
                newNums[j++]=nums[i];
            
        }
    return newNums;
};