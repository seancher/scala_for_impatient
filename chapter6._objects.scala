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
