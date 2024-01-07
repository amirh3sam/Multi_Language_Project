var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
function removeElement(nums, val) {
    //nums = [3,2,2,3] -->1 remove ==> [2,3,3]
    // [3,2,2,3][2,2]  // first array will remove the filter array will concat to it [][2,2]==>[2,2]
    nums.splice.apply(nums, __spreadArray([0, nums.length], nums.filter(function (e) { return e != val; }), false));
    return nums.length;
}
var nums = [3, 2, 2, 3];
console.log(removeElement(nums, 3), nums);
