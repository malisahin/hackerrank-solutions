# HackerLand Enterprise Viral Advertising Strategy

HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new product, they advertise it to exactly `n` people on social media.

On the first day, half of those people (i.e., `n/2`) like the advertisement and each shares it with `3` of their friends. At the beginning of the second day, `3*n/2` people receive the advertisement. Each day, `floor((recipients / 2))` of the recipients like the advertisement and will share it with `3` friends on the following day. Assuming nobody receives the advertisement twice, determine how many people have liked the ad by the end of a given day, beginning with launch day as day `1`.

Example:

Day | Shared | Liked | Cumulative
----|--------|-------|-----------
  1 |   5    |   2   |     2
  2 |   6    |   3   |     5
  3 |   9    |   4   |     9
  4 |  12    |   6   |    15
  5 |  18    |   9   |    24

The progression is shown above. The cumulative number of likes on the day is `24`.

Function Description:
Complete the `viralAdvertising` function. The function has the following parameter(s):
• `n`: the day number to report

Returns:
• `int`: the cumulative likes at that day

Input Format:
A single integer, `n`, the day number.

Constraints:
• `1 <= n <= 50`

Sample Input:
3

Sample Output:
9

Explanation:
This example is depicted in the following diagram:

`n=5` people liked the advertisement on the first day, `3*n/2=7` people liked the advertisement on the second day and `floor(3*n/4)=4` people liked the advertisement on the third day, so the answer is `9`.
