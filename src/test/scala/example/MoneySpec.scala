package example

import org.scalatest.{Matchers, WordSpec}

class MoneySpec extends WordSpec with Matchers {

  "5ドルにNをかけた場合" should {
    "5 * Nドルになる" in {
      val five = Money.dollar(5)
      five.times(2) shouldEqual Money.dollar(10)
      five.times(3) shouldEqual Money.dollar(15)
    }
  }

  "amountの等しい異なるオブジェクトは" should {
    "等しい" in {
      Money.dollar(5) shouldEqual Money.dollar(5)
      Money.dollar(5) should not be Money.dollar(6)
      Money.dollar(5) should not be Money.franc(5)
    }
  }

  "5フランにNをかけた場合" should {
    "5 * Nフランになる" in {
      val five = Money.franc(5)
      five.times(2) shouldEqual Money.franc(10)
      five.times(3) shouldEqual Money.franc(15)
    }
  }


}
