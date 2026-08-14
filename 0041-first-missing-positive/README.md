<h2><a href="https://leetcode.com/problems/first-missing-positive">41. First Missing Positive</a></h2><h3>Hard</h3><hr><p>Given an unsorted integer array <code>nums</code>. Return the <em>smallest positive integer</em> that is <em>not present</em> in <code>nums</code>.</p>

<p>You must implement an algorithm that runs in <code>O(n)</code> time and uses <code>O(1)</code> auxiliary space.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,0]
<strong>Output:</strong> 3
<strong>Explanation:</strong> The numbers in the range [1,2] are all in the array.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,4,-1,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong> 1 is in the array but 2 is missing.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [7,8,9,11,12]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The smallest positive integer 1 is missing.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
</ul>
First Missing Positive — Cyclic Sort

Goal: Array mein smallest missing positive number find karna.

Logic:

Array size = n
Sirf numbers 1 to n useful hain.
Har number x ko uski correct position x - 1 par place karo.
Ignore:
x <= 0
x > n
x already correct position par hai
duplicate value hai

Correct position:

1 → index 0
2 → index 1
3 → index 2
...
n → index n-1

After sorting:

arr[i] != i + 1 → answer = i + 1
Agar sab positions correct hain → answer = n + 1

Important: return n nahi, return n + 1.
