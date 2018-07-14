/*
1. Set up a map of prices for a number of gizmos that you covet. Then produce a second map with
the same keys and the prices at a 10 percent discount.
*/
val gizmo_price100 = Map("phone" -> 700, "car" -> 20000, "headphones" -> 400)
val (gizmo, price100) = gizmo_price100.unzip
val price90 = price100.map{a => (a.toDouble * .9).toInt}
gizmo.zip(price90).toMap

/*
Write a program that reads words from a file. Use a mutable map to count how often each word
appears. To read the words, simply use a java.util.Scanner:
*/

val in = new java.util.Scanner(new java.io.File("chapter3._working_with_arrays.scala"))
var wordCount = Map[String, Int]()

while (in.hasNext()) {
  val nextWord = in.next();
  if (wordCount.getOrElse(nextWord, 0) == 0)
    wordCount += (nextWord -> 1)
  else wordCount += nextWord ->  (wordCount(nextWord) + 1)
  }

val (keys, vals) = wordCount.unzip


/*
7. Print a table of all Java properties reported by the getProperties method of the
java.lang.System class, like this: ...
*/
val javaProperties = java.lang.System.getProperties
val javaKeys = javaProperties.keySet.toArray.map(_.toString)
val javaValues = javaProperties.values.toArray.map(_.toString)
var maxlen = 0
javaKeys.foreach{a => if (a.length > maxlen) maxlen = a.length}
for ((k,v) <- javaKeys.zip(javaValues)) println(k + " " * (maxlen - k.length) + " | " + v)

/*
8. Write a function minmax(values: Array[Int]) that returns a pair containing the
smallest and the largest values in the array.
*/
array(1, 5, 2 ,7  ,3 )
def minmax(values: Array[Int]): (Int, Int) = {
  (values.min, values.max)
/*

9. Write a function lteqgt(values: Array[Int], v: Int) that returns a triple
containing the counts of values less than v, equal to v, and greater than v.
/*
def lteqgt(values: Array[Int], v:Int): (Int, Int, Int) = {
  (values.count(_ < v), values.count(_ == v), values.count(_ > v))
}

val arr = Array(1, 5, 2, 7, 3)

lteqgt(arr, 4)

/*
10. What happens when you zip together two strings, such as "Hello".zip("World")? Come
up with a plausible use case.
*/

"Hello".zip("hello")
  .filter(t => t._1 != t._2)
