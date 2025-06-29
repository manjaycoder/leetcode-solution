/**
 * @param {number} n
 * @param {number} k
 * @return {number}
 */
var solve=function(i,arr,k){
if(arr.length===1) return arr[0]
i=(i+k)%arr.length
arr.splice(i,1)
return solve(i,arr,k)

}
var findTheWinner = function(n, k) {
    let arr=new Array(n);
    for(let i=0;i<n;i++){
        arr[i]=i+1
    }
k--;
return solve(0,arr,k)



}