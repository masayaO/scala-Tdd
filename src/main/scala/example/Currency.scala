package example

sealed trait Currency

object Currency {

  case object USD extends Currency

  case object CHF extends Currency

  def apply(currencyUnit: Currency)(amount: Int): Money =
    currencyUnit match {
      case Currency.USD => Dollar(amount)
      case Currency.CHF => Franc(amount)
    }
}


