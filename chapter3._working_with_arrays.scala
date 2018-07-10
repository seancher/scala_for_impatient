/*
Excercises
1. Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n
(exclusive). 
*/

val n = 5
val arr = (for (i <- 0 until n)
	yield scala.util.Random.nextInt(n))
	.toArray[Int]

/*
2. Write a loop that swaps adjacent elements of an array of integers. For example, Array(1,
2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
*/

val arr = Array(1, 2, 3, 4, 5)
for (i <- 1 until arr.length by 2) {
val tmp = arr(i + 1) 
arr(i + 1) = arr(i)
arr(i) = tmp
}

/*
3. Repeat the preceding assignment, but produce a new array with the swapped values. Use
for/yield.
*/

val arr = Array(1, 2, 3, 4, 5)
for (i <- arr.indices) yield (if (i % 2 == 0) arr(i + 1) else arr(i - 1))
