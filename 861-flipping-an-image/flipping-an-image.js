/**
 * @param {number[][]} image
 * @return {number[][]}
 */
var flipAndInvertImage = function(image) {
    return image.map(e=>e.reverse().map(i=>i==0?1:0))
};