/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let res=nums[0]
    let sum=0;
    for(let a of nums){
        if(sum <0){
            sum=0;
        }
        sum+=a;
        res=Math.max(res,sum);
    }
    return res;
   
};