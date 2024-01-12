
function removeDuplicates(nums: number[]): number {


    // @ts-ignore
    nums.splice(0,nums.length,...(new Set(nums)))




return nums.length
}