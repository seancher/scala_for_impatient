/*
1. Improve the Counter class in Section 5.1, “Simple Classes and Parameterless Methods,” on
page 55 so that it doesn’t turn negative at Int.MaxValue.
*/

class Counter {
  private var value = 0 // You must initialize the field
  def increment() { if (value < Int.MaxValue) value += 1 } // Methods are public by default
  def current() = value
}

/*
2. Write a class BankAccount with methods deposit and withdraw, and a read-only property balance.
*/

class BankAccount (private var pBalance: Int = 0) {
  def balance = pBalance
  def deposit (up: Int) { pBalance += up }
  def withdraw (down: Int) { pBalance -= down }
}

/*
3. Write a class Time with read-only properties hours and minutes and a method
before(other: Time): Boolean that checks whether this time comes b fore the other.
A Time object should be constructed as new Time(hrs, min), where hrs is in military time format (between 0 and 23).
*/

class Time (private val hrs: Int, private val mins: Int) {
  if (hrs < 0 || hrs > 23) {
    throw new IllegalArgumentException("Hours should be in military format (between 0 and 23)")
  }
  if (mins < 0 || mins > 59) {
    throw new IllegalArgumentException("Minutes should be in military format (between 0 and 59)")
  }
  def hours = hrs
  def minutes = mins
  def before (other: Time): Boolean = { 
    (this.hours * 100 + this.minutes) < (other.hours * 100 + other.minutes) 
  }
}

/*
4. Reimplement the Time class from the preceding exercise so that the internal representation is
the number of minutes since midnight (between 0 and 24 × 60 – 1). Do not change the public
interface. That is, client code should be unaffected by your change.
*/

class Time private() {
  
  private var mins: Int = 0

  def this (mins: Int, hrs: Int) {
    this()
    if (hrs < 0 || hrs > 23) {
      throw new IllegalArgumentException("Hours should be in military format (between 0 and 23)")
    }
    if (mins < 0 || mins > 59) {
      throw new IllegalArgumentException("Minutes should be in military format (between 0 and 59)")
    }
    this.mins = mins + hrs * 60
  }

  def hours = mins / 60

  def minutes = mins % 60
  
  def before (other: Time): Boolean = {
    this.mins < other.mins
  }

}

/*
MY TESTS
*/
import scala.collection.mutable.ArrayBuffer
class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }
  var members = new ArrayBuffer[Member]
  def join(name: String) = {
    val member = new Member(name)
    members += member
    member
  }
}

val chatter = new Network
val fred = chatter.join("Fred")
val wilma = chatter.join("Wilma")
val sergey = chatter.join("Sergey")
fred.contacts += wilma
fred.contacts += sergey

This way you'll see Fred's contacts. Although the contact were added to only fred object. Fred object is an instance of chatter inner class.
chatter.members(0).contacts

