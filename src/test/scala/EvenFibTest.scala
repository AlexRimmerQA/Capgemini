import org.scalatest.{FlatSpec, Matchers}

class EvenFibTest extends FlatSpec with Matchers{
  val fibSequence = new EvenFibNums

  "The fibonacci sequence function up to four million" should "return a list of the correct fibonacci numbers" in {
    fibSequence.fibSequence(0, 1, 4000000) shouldBe
      List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657,
        46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578)
  }

  "Even fibonacci numbers less than four million" should "equal the correct value" in {
    fibSequence.evenFibsTotal(4000000) shouldBe 4613732
  }
}
