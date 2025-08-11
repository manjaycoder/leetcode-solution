/**
 * @param {number} x
 * @return {number}
 */
var sumOfTheDigitsOfHarshadNumber = function(x) {
    let s=0;
    let xx=x;
    while(xx>0){
        s+=xx%10
        xx=(xx-xx%10)/10
    }return (x%s==0)?s:-1
};