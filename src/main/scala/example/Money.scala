package example

abstract class Money {

}

case class Dollar(private val amount: Int) extends Money {

  def times(multiplier: Int): Dollar = {
    Dollar(amount * multiplier)
  }
}

case class Franc(private val amount: Int) extends Money {

  def times(multiplier: Int): Franc = {
    Franc(amount * multiplier)
  }
}
