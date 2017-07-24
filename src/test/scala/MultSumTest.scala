import org.scalatest.{FlatSpec, Matchers}

class MultSumTest extends FlatSpec with Matchers {
  val multSum = new MultipleOfSum
  "The sum of numbers which are multiples of either 3 and 5 up to 1000" should "equal 233168" in {
    multSum.sumMultThreeFive(1000) shouldBe 233168
  }

  "The sum of numbers which are multiples of either 3 and 5 up to 10" should "equal 23" in {
    multSum.sumMultThreeFive(10) shouldBe 23
  }
}
