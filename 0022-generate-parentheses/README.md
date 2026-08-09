<h2><a href="https://leetcode.com/problems/generate-parentheses/">22. Generate Parentheses</a></h2><h3>Medium</h3><hr><p>Given <code>n</code> pairs of parentheses, write a function to <em>generate all combinations of well-formed parentheses</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> n = 3
<strong>Output:</strong> ["((()))","(()())","(())()","()(())","()()()"]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> n = 1
<strong>Output:</strong> ["()"]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 8</code></li>
</ul>
## Approach

This solution uses **Recursion and Backtracking** to generate all valid combinations of `n` pairs of parentheses.

- `left` keeps track of the number of opening brackets `(` used.
- `right` keeps track of the number of closing brackets `)` used.
- We can add `(` as long as `left < n`.
- We can add `)` only when `right < left`, so that the parentheses always remain valid.
- When `right == n`, a complete valid combination is added to the answer list.

## Base Case

When `right == n`, all `n` closing brackets have been placed, so the current string is a valid combination.

## Time Complexity

O(4^n / √n)

## Space Complexity

O(n) for the recursion stack, excluding the space required to store the result.
