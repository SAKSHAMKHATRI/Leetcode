<h2><a href="https://leetcode.com/problems/swap-nodes-in-pairs">24. Swap Nodes in Pairs</a></h2><h3>Medium</h3><hr><p>Given a&nbsp;linked list, swap every two adjacent nodes and return its head. You must solve the problem without&nbsp;modifying the values in the list&#39;s nodes (i.e., only nodes themselves may be changed.)</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">head = [1,2,3,4]</span></p>

<p><strong>Output:</strong> <span class="example-io">[2,1,4,3]</span></p>

<p><strong>Explanation:</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/swap_ex1.jpg" style="width: 422px; height: 222px;" /></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">head = []</span></p>

<p><strong>Output:</strong> <span class="example-io">[]</span></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">head = [1]</span></p>

<p><strong>Output:</strong> <span class="example-io">[1]</span></p>
</div>

<p><strong class="example">Example 4:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">head = [1,2,3]</span></p>

<p><strong>Output:</strong> <span class="example-io">[2,1,3]</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the&nbsp;list&nbsp;is in the range <code>[0, 100]</code>.</li>
	<li><code>0 &lt;= Node.val &lt;= 100</code></li>
</ul>

/**
 * LeetCode 24 - Swap Nodes in Pairs
 *
 * Example:
 * 1 -> 2 -> 3 -> 4
 * becomes
 * 2 -> 1 -> 4 -> 3
 *
 * Approach:
 * 1. Agar 0 ya 1 node hai, toh swap nahi karna.
 * 2. Current pair ke 2nd node ko `second` mein store karo.
 * 3. Remaining list (second.next) ko recursively swap karo.
 * 4. Current pair ko reverse karo:
 *      second.next = head
 * 5. `second` ko new head bana kar return karo.
 *
 * IMPORTANT:
 * `head.next = swapPairs(second.next)`
 *
 * Iska matlab directly `head.next = second.next` nahi hai.
 * Pehle `swapPairs(3)` recursively execute hoga.
 *
 * Example:
 * 1 -> 2 -> 3 -> 4
 *
 * head = 1
 * second = 2
 *
 * second.next = 3
 * swapPairs(3)
 *
 * 3 -> 4
 * becomes
 * 4 -> 3
 *
 * Recursive call `4` return karega.
 *
 * Therefore:
 * head.next = 4
 *
 * Temporary:
 * 1 -> 4 -> 3
 *
 * Then:
 * second.next = head
 *
 * 2 -> 1 -> 4 -> 3
 *
 * Finally return second (2).
 *
 * Recursion:
 *
 * swapPairs(1)
 *      |
 *      ↓
 * swapPairs(3)
 *      |
 *      ↓
 * swapPairs(null)
 *      |
 *      ↓
 * return
