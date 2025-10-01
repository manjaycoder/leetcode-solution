/**
 * @param {number[][]} image
 * @return {number[][]}
 */
var flipAndInvertImage = function(image) {
    // First: flip each row (reverse the row)
    for (let i = 0; i < image.length; i++) {
        image[i].reverse();
    }

    // Second: invert the image (0 -> 1, 1 -> 0)
    for (let i = 0; i < image.length; i++) {
        for (let j = 0; j < image[i].length; j++) {
            if (image[i][j] === 0) {
                image[i][j] = 1;
            } else {
                image[i][j] = 0;
            }
        }
    }

    return image;
};
