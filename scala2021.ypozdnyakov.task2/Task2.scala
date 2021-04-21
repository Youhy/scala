import scala.annotation.tailrec

object Task2 {
  def main(args: Array[String]): Unit = {
    val line = "())("

    println(parenthesesBalance(line.toList))
  }

  def parenthesesBalance(chars: List[Char]): Boolean = {
    @tailrec
    def checkParentheses(cs: List[Char], level: Int): Boolean = cs match {
      case Nil                   => level == 0
      case ')' :: _ if level < 1 => false
      case ')' :: xs             => checkParentheses(xs, level - 1)
      case '(' :: xs             => checkParentheses(xs, level + 1)
      case _ :: xs               => checkParentheses(xs, level)
    }
    checkParentheses(chars, 0)
  }
}
