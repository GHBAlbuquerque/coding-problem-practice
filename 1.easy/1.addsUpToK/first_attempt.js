function addsUpToK(numbers, k) {
    if(numbers == null || numbers.length == 0) {
        return false
    }

    for (const [index, number] of numbers.entries()) {
        for (const [index2, numberToAdd] of numbers.entries()) {
            if(index == index2){
                continue
            }

            if(number + numberToAdd == k) {
                return true
            }
        }
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