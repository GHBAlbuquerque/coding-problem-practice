## Daily Coding Problem

**Difficulty**: Easy  
**Tags**: Recursion, Math

---

### Problem Statement

Given a non-negative integer `n`, return the factorial of `n`, denoted as `n!`.

The factorial of a non-negative integer `n` is defined as:

- `0! = 1`
- `n! = n × (n-1) × (n-2) × ... × 1` for `n > 0`

You may use either an **iterative** or **recursive** approach. If the result can be large, consider using appropriate data types to avoid overflow.

---

### Example 1

**Input**:  
`n = 5`  
**Output**:  
`120`

**Explanation**:  
`5! = 5 × 4 × 3 × 2 × 1 = 120`

---

### Example 2

**Input**:  
`n = 0`  
**Output**:  
`1`

---

### Constraints

- `0 <= n <= 20`
- For values of `n > 20`, standard integer types may not be sufficient (use `BigInteger`, `BigInt`, etc., depending on language)

---

### Follow-up

- Can you solve it using recursion?
- Can you write a solution that avoids recursion stack overflow for large `n`?