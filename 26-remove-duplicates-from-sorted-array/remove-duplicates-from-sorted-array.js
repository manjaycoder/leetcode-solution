/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
 let j=1;
 for(let i=0;i<nums.length-1;i++){
    if(nums[i] !=nums[i+1]){
        nums[j]=nums[i+1]
        j++;
    }
   
 }
  return j;
};