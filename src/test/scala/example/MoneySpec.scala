package example

import org.scalatest.{Matchers, WordSpec}

class MoneySpec extends WordSpec with Matchers {

  "5ドルにNをかけた場合" should {
    "5 * Nドルになる" in {
      val five = Dollar(5)
      five.times(2) shouldEqual Dollar(10)
      five.times(3) shouldEqual Dollar(15)
    }
  }

  "amountの等しい異なるオブジェクトは" should {
    "等しい" in {
      Dollar(5) shouldEqual Dollar(5)
      Dollar(5) should not be Dollar(6)
    }
  }

  "5フランにNをかけた場合" should {
    "5 * Nフランになる" in {
      val five = Franc(5)
      five.times(2) shouldEqual Franc(10)
      five.times(3) shouldEqual Franc(15)
    }
  }


}
