class MultipleOfSum {
  def sumMultThreeFive(max: Int): Int = {
    List.range(1, max).filter(x => x % 3 == 0 || x % 5 == 0).sum
  }
}
