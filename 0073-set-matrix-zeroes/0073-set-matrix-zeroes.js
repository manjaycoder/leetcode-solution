/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function(matrix) {
    const n = matrix.length;
    const m = matrix[0].length;
    
    // Use a variable to track if the first column needs to be zeroed
    let col0 = 1;
    
    // First pass: Use the first row and column as markers
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < m; j++) {
            if (matrix[i][j] === 0) {
                // Mark the row
                matrix[i][0] = 0;
                // Mark the column, handle the first column separately
                if (j !== 0) {
                    matrix[0][j] = 0;
                } else {
                    col0 = 0;
                }
            }
        }
    }
    
    // Second pass: Use markers to set the inner matrix to zero
    for (let i = 1; i < n; i++) {
        for (let j = 1; j < m; j++) {
            if (matrix[i][0] === 0 || matrix[0][j] === 0) {
                matrix[i][j] = 0;
            }
        }
    }

    // Final pass: Zero out the first row and/or column if needed
    if (matrix[0][0] === 0) {
        for (let j = 0; j < m; j++) {
            matrix[0][j] = 0;
        }
    }
    if (col0 === 0) {
        for (let i = 0; i < n; i++) {
            matrix[i][0] = 0;
        }
    }
};