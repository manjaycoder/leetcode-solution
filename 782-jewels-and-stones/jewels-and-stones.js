/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    let count=0;
    let set=new Set()
    for(let i=0;i<jewels.length;i++){
        set.add(jewels.charAt(i))
    }
    for(let i=0;i<stones.length;i++){
       if(set.has(stones.charAt(i))) {
        count++;
       }else{
        continue;
       }

    }
    return count
};