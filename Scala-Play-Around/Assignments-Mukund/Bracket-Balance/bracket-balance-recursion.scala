// Dealing only with () not with {} or []
// Assuming will always get ( or ) in expression
// implemented using only recursion

object BracketBalanceRecur{
  def main(args: Array[String]){

    var expression = "(())((((((()))))))(())".toList

    println(isBalanced(expression) == 0)

    def isBalanced(expression : List[Char], openCount : Int = 0) : Int = {
      if(expression.isEmpty)
        openCount
      else if(expression.head == '(')
        isBalanced(expression.tail, openCount + 1)
      else
        isBalanced(expression.tail, openCount - 1)
    }
  }
}
