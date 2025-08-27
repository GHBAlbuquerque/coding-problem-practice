## Daily Coding Problem
String parsing, custom protocol design

Design an algorithm to encode a list of strings to a single string.
The encoded string should be able to be decoded back to the original list of strings.
``
public String encode(List<String> strs) { ... }
public List<String> decode(String s) { ... }
``

Example 1:
```
Input: ["hello", "world"]
Encoded: "5#hello5#world"
Decoded: ["hello", "world"]
```

Example 2:
```
Input: ["", ""]
Encoded: "0#0#"
Decoded: ["", ""]
```

Example 3:
```
Input: ["#", "abc#def", ""]
Encoded: "1##7#abc#def0#"
Decoded: ["#", "abc#def", ""]
```


✅ Constraints:
•	You may assume the input list does not contain null values.
•	Strings may be empty ("").
•	Strings may contain any characters, including numbers, letters, punctuation, or special symbols (e.g., #, /, :, ;, |, etc.).
•	Your encoded string must be unambiguous and reversible.
•	Do not use a built-in serialization format (e.g., JSON, Base64, etc.).