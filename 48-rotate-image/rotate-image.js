/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
    for(let i=0;i<matrix.length;i++){
        for(let j=i;j<matrix[i].length;j++){
             let temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
        }
    }
    for(let i = 0; i < matrix.length; i++){
    let j = 0, k = matrix[i].length - 1;
    while(j < k){
        let temp = matrix[i][j];
        matrix[i][j] = matrix[i][k];
        matrix[i][k] = temp;
        j++;
        k--;
    }
}
    return matrix
};