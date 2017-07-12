// check for just () ... {} and [] are not considered

object BracketBalance{
  def main(args: Array[String]){
    val expression ="((((((()))))))((()))"
    var countCurrentOpen = 0

    expression.sliding(1).toList.map( bracket =>
      if( bracket == "(")
        countCurrentOpen += 1
      else
        countCurrentOpen -= 1
    )

    if(countCurrentOpen != 0)
      println("Not Balanced")
    else
      println("Balanced")
  }
}
