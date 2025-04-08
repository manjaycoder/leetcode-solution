var spiralOrder = function(matrix) {
    let res = [];
    let top = 0, bottom = matrix.length - 1;
    let left = 0, right = matrix[0].length - 1;

    while (top <= bottom && left <= right) {
        // Top row
        for (let i = left; i <= right; i++) {
            res.push(matrix[top][i]);
        }
        top++;

        // Right column
        for (let i = top; i <= bottom; i++) {
            res.push(matrix[i][right]);
        }
        right--;

        if (top <= bottom) {
            // Bottom row
            for (let i = right; i >= left; i--) {
                res.push(matrix[bottom][i]);
            }
            bottom--;
        }

        if (left <= right) {
            // Left column
            for (let i = bottom; i >= top; i--) {
                res.push(matrix[i][left]);
            }
            left++;
        }
    }
    return res;
};
