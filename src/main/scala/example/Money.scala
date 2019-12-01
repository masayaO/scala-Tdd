package example

abstract class Money {

  val moneyAmount: Int

  val currencyUnit: Currency

  def times(multiplier: Int): Money = {
    Currency(currencyUnit)(moneyAmount * multiplier)
  }

 }

case class Dollar(private val dollarAmount: Int) extends Money {

  val currencyUnit: Currency = Currency.USD

  override val moneyAmount: Int = dollarAmount
}

case class Franc(private val francAmount: Int) extends Money {

  val currencyUnit: Currency = Currency.CHF

  override val moneyAmount: Int = francAmount
}
