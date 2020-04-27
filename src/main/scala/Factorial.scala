object Factorial {
  def factorial(n: Int): Long =
    if (n == 0) 1
    else n * factorial(n - 1)
  def main(args: Array[String]) {
    for {i <- List.range(0, 17)}
      yield { println(i + "! = " + factorial(i)) }
  }
}