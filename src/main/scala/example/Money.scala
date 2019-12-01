package example

abstract class Money {

  val moneyAmount: Int

}

object Money {
  def dollar(amount: Int) = Dollar(amount)

  def franc(amount: Int) = Franc(amount)
}

case class Dollar(private val dollarAmount: Int) extends Money {

  override val moneyAmount: Int = dollarAmount

  def times(multiplier: Int): Money = {
    Dollar(moneyAmount * multiplier)
  }
}

case class Franc(private val francAmount: Int) extends Money {

  override val moneyAmount: Int = francAmount

  def times(multiplier: Int): Money = {
    Franc(moneyAmount * multiplier)
  }
}
