/**
 * @param {number[][]} matrix
 * @return {number[][]}
 */
var transpose = function(matrix) {
    let arr=Array.from({length:matrix[0].length},()=>Array(matrix.length));
    for(let i=0;i<=arr.length-1;i++){
        for(let j=0;j<=arr[0].length-1;j++){
            arr[i][j]=matrix[j][i]
        }
    }
    return arr

};