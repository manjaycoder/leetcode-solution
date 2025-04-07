/**
 * @param {number[][]} matrix
 * @return {number[][]}
 */
var transpose = function(matrix) {
    let arr=Array.from({length:matrix[0].length},()=>Array(matrix.length))
    for(let i=0;i<arr.length;i++){
        for(let j=0;j<arr[i].length;j++){
            arr[i][j]=matrix[j][i]
        }
    }
    return arr
};