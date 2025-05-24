/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    let i=0;
    while(i<nums.length){
        let correctIdx=nums[i]-1
        if(nums[i]<=nums.length && nums[i]>=1 && nums[i] !== nums[correctIdx]){
            [nums[i],nums[correctIdx]]=[nums[correctIdx],nums[i]]
        }else{
            i++
        }
    }
    const result=[]
    for(let j=0;j<nums.length;j++){
        if(j+1 !== nums[j]){
            result.push(j+1)
        }
       
    }
    return result
    
    
        
   
    
    
    
};