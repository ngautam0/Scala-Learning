object BracketBalancePatternMatching{
  def main(args : Array[String]){
    val expression = "(((())))((()))(())".toList

    println(isBalanced(expression) == 0)

    def isBalanced(expression : List[Char], openCount : Int = 0): Int = {

      if(!expression.isEmpty ){
        expression.head match {
          // case \null => openCount
          case '(' => isBalanced(expression.tail, openCount + 1)
          case ')' => isBalanced(expression.tail, openCount - 1)
          case _ => -1
        }
      }
      else
        openCount

    }
  }
}
