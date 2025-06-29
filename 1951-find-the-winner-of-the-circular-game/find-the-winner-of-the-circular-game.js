/**
 * @param {number} n
 * @param {number} k
 * @return {number}
 */
 var solve =function (k,arr,i){
  if(arr.length ==1) return arr[0];
  i=(i+k)%arr.length
  arr.splice(i,1);
  return solve(k,arr,i) 
 }
var findTheWinner = function(n, k) {
    let winner = 0;
  for (let i = 2; i <= n; i++) {
    winner = (winner + k) % i;
  }
  return winner + 1; 
};