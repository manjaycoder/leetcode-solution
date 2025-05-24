/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let i=0;
    while(i<nums.length){
        let CorrectIdx=nums[i]
        if(nums[i] !== nums[CorrectIdx] && nums[i]<nums.length ){
            let temp=nums[i]
            nums[i]=nums[CorrectIdx]
            nums[CorrectIdx]=temp
        }else{
            i++
        }
    }
    for(let j=0;j<nums.length;j++){
            if(j !== nums[j]){
                return j
            }
    }
    return nums.length
};