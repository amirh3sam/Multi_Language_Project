function removeElement(nums: number[], val: number): number {


    //nums = [3,2,2,3] -->1 remove ==> [2,3,3]

                // [3,2,2,3][2,2]  // first array will remove the filter array will concat to it [][2,2]==>[2,2]
    nums.splice(0,nums.length,...nums.filter(e => e != val))

    return nums.length;
}

const nums = [3, 2, 2, 3]
console.log(removeElement(nums, 3), nums)


