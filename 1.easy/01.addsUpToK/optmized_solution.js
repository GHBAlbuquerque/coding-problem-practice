// if a + b == k, then k - a == b. 
// For each number subtracted, I check if the result exists on my array. But it can't be the number itself.
// Instead of checking the array again, I put the numbers already checked on a new set. If the result is there, it means there is a previously seen number such that number + (k - number) == k.
// pro: only one iteration. should avoid iterating more than once. You only iterate through the array once, and at each step, you instantly know if the complement exists among previously seen numbers.


function addsUpToK(numbers, k) {
    if(numbers == null || numbers.length == 0) {
        return false
    }

    const seen = new Set();

    for (const number of numbers) {
        if(seen.has(k - number)) {
            console.log(number, k - number)
            return true
        }
        seen.add(number)
    }

    return false
}

// Test Cases
console.log(addsUpToK([10, 15, 5, 7], 17));       // True, because 10 + 7 = 17
console.log(addsUpToK(undefined, 10));           // False
console.log(addsUpToK(null, 10));                // False
console.log(addsUpToK([-3, -2, -1], -5));         // True, because -3 + -2 = -5
console.log(addsUpToK([1], 10));                 // False, single element cannot form a pair
console.log(addsUpToK([1, 2, 3, 4], 8));          // False, no two numbers add up to 8
console.log(addsUpToK([0, 0], 0));                // True, because 0 + 0 = 0
console.log(addsUpToK([], 5));                   // False, empty list
console.log(addsUpToK([5, 5], 10));               // True, because 5 + 5 = 10
console.log(addsUpToK([4, 5], 9));                // True, because 4 + 5 = 9
console.log(addsUpToK([1, 2, 3, 4, 5], 9));        // True, because 4 + 5 = 9