package example

import org.scalatest.{Matchers, WordSpec}

class MoneySpec extends WordSpec with Matchers{

  "5ドルに2をかけた場合" should {
    "10ドルになる" in {
      val five = Dollar(5)
      val expected = five.times(2)
      expected shouldEqual Dollar(10)
    }
  }
}
