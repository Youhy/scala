object Task2 {
  def main(args: Array[String]): Unit = {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

    println(encode(list))
  }

  def encode(xs: List[Symbol]): List[(Int, Symbol)] = xs match {
    case Nil => Nil
    case x :: xss =>
      val (g, rest) = xs.span(_ == x)
      (g.size, g.head) +: encode(rest)
  }

}
