/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
    const count={}
    for(let num of nums){
        count[num]=(count[num] || 0)+1;

    }
    let arr=Object.entries(count).map(([freq,num])=>[num ,parseInt(freq)])
    arr.sort((a,b)=>b[0]-a[0])
    return arr.slice(0,k).map(pair=>pair[1])
    
};