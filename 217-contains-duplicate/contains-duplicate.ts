function containsDuplicate(nums: number[]): boolean {
    nums.sort()
    let num1=[]
    for(let i=0;i<nums.length;i++){
       if(nums[i]==nums[i-1]){
        return true
       }else{
        continue
       }
    }
    return false

};