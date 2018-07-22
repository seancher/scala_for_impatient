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
