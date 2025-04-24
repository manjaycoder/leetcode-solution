/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
   if(s.length !==t.length){
    return false
   }
   const counter=new Array(26).fill(0)
   for(let char of s){
       counter[char.charCodeAt(0)-'a'.charCodeAt(0)]+=1
   }
   for(let char of t){
    if(counter[char.charCodeAt(0)-'a'.charCodeAt(0)]===0){
        return false
    }
    counter[char.charCodeAt(0)-'a'.charCodeAt(0)]-=1
   }
   return true
};