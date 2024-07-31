/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    
    if(n<2){
    return n;
}
let prev=0,curr=1,next;
for (let index = 2; index <= n; index++) {
    next=prev+curr;
    prev=curr;
    curr=next;
    
}
return next;
    
};