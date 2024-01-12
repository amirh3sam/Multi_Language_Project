var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
function removeDuplicates(nums) {
    // @ts-ignore
    nums.splice.apply(nums, __spreadArray([0, nums.length], (new Set(nums)), false));
    return nums.length;
}
//# sourceMappingURL=RemovedDuplicate.js.map