## Problem Description

A video player plays a game in which the character competes in a hurdle race. Hurdles are of varying heights, and the characters have a maximum height they can jump. There is a magic potion they can take that will increase their maximum jump height by 1 unit for each dose. How many doses of the potion must the character take to be able to jump all of the hurdles? If the character can already clear all of the hurdles, return 0.

### Example

The character can jump `k` units high initially and must take `doses` of potion to be able to jump all of the hurdles.

Function Signature: **hurdleRace(k: int, height: List[int]) -> int**

**Input Format**
- An integer `k` representing the maximum height the character can jump naturally
- A list of integers `height` representing the heights of each hurdle

**Output Format**
- Return an integer representing the minimum number of doses required, always >= 0.

**Constraints**
- 1 <= n,k <= 100
- 1 <= height[i] <= 100

### Example

#### Example 1

**Input**

    k = 4
    height = [1, 6, 3, 5, 2]

**Output**

    2

**Explanation**

    Dan's character can jump a maximum of 4 units, but the tallest hurdle has a height of 6:

    To be able to jump all the hurdles, Dan must drink 2 doses.

#### Example 2

**Input**

    k = 7
    height = [2, 5, 4, 5, 2]

**Output**

    0

**Explanation**

    Dan's character can jump a maximum of 7 units, which is enough to cross all the hurdles:

    Because he can already jump all the hurdles, Dan needs to drink 0 doses.
