import org.scalatest.{FlatSpec, Matchers}

class MultSumTest extends FlatSpec with Matchers {
  val multSum = new MultipleOfSum
  Console.println(multSum.sumMultThreeFive(1000))
}
