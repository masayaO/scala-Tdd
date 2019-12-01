package example

abstract class Money {

  val moneyAmount: Int

}

case class Dollar(private val dollarAmount: Int) extends Money {

  override val moneyAmount: Int = dollarAmount

  def times(multiplier: Int): Dollar = {
    Dollar(moneyAmount * multiplier)
  }
}

case class Franc(private val francAmount: Int) extends Money {

  override val moneyAmount: Int = francAmount

  def times(multiplier: Int): Franc = {
    Franc(moneyAmount * multiplier)
  }
}
