/*
1. Write an object Conversions with methods inchesToCentimeters,
gallonsToLiters, and milesToKilometers.
*/

object Conversions {
  def inchesToCentimeters (inch: Double): Double = {
    inch * 2.54
  }
  def gallonsToLiters (gal: Double): Double = {
    gal * 3.785
  }
  def milesToKilometers (mile: Double) = {
    mile * 1609.344
  }
}

/*
2. The preceding problem wasn’t very object-oriented. Provide a general superclass
UnitConversion and define objects InchesToCentimeters, GallonsToLiters,
and MilesToKilometers that extend it.
*/

class UnitConversion (factor: Double) {
  def convert (unit: Double) = unit * factor }

object InchesToCentimeters extends UnitConversion(2,54)

/*
3. Define an Origin object that extends java.awt.Point. Why is this not actually a good idea? (Have a close look at the methods of the Point class.)
*/
import java.awt.Point
object Origin extends Point

/*
4. Define a Point class with a companion object so that you can construct Point instances as Point(3, 4), without using new.
*/

import java.awt.Point

object Point extends Point {
  def apply(x: Int, y: Int): Point = {
    new Point(x, y)
  }
}

/*
5. Write a Scala application, using the App trait, that prints its command-line arguments in reverse order, separated by spaces. For example, scala Reverse Hello World should print World Hello.
*/
// put the object in a separate file and execute as follows
// scala -nc main.scala
object MyApp extends App {
  for (a <- args.reverse) println(a)
}
