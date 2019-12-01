package example

import org.scalatest.{Matchers, WordSpec}

class MoneySpec extends WordSpec with Matchers {

  val USD: Currency = Currency.USD
  val CHF: Currency = Currency.CHF

  "5ドルにNをかけた場合" should {
    "5 * Nドルになる" in {
      val five = Currency(USD)(5)
      five.times(2) shouldEqual Currency(USD)(10)
      five.times(3) shouldEqual Currency(USD)(15)
    }
  }

  "amountの等しい異なるオブジェクトは" should {
    "等しい" in {
      Currency(USD)(5) shouldEqual Currency(USD)(5)
      Currency(USD)(5) should not be Currency(USD)(6)
      Currency(USD)(5) should not be Currency(CHF)(5)
    }
  }

  "通貨単位は" should {
    "同じ通貨単位と等しい" in {
      USD shouldEqual Currency(USD)(1).currencyUnit
      CHF shouldEqual Currency(CHF)(1).currencyUnit
    }
  }



}
