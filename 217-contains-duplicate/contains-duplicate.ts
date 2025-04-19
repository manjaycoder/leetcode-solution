function containsDuplicate(nums: number[]): boolean {
    let set=new Set()
    for(let i=0;i<nums.length;i++){
        set.add(nums[i])
    }
    if(set.size !== nums.length){
        return true
    }else{
        return false
    }
};