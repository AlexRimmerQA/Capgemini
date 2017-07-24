class EvenFibNums {
  def fibSequence(prev: Int, current: Int, max: Int): List[Int] = {
    val nextNum: Int = current + prev
    if(nextNum < max) {
      List(current):::fibSequence(current, nextNum, max)
    }
    else {
      List(current)
    }
  }
  def evenFibsTotal(max: Int): Int = {
    fibSequence(0, 1, max).filter(x => x % 2 == 0).sum
  }
}
