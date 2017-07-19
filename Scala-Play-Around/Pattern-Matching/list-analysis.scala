object ListAnalysis{
  def main(arg: Array[String]) = {

    def listAnalysis(list : List[Any]) = list match {
      case Nil => println("Empty List")
      case 'a' :: tail => println("list starts by a")
      case (head : Int) :: _ if head > 10 => println("starting by an int greater than 10")
      case (head : Int) :: _ => println("starting by int...")
      case _ => println("I dont recognize this pattern of list")
    }

    listAnalysis("absce".toList)
    listAnalysis(List(2,3,4))
    listAnalysis(List(85,4,6))
    listAnalysis("a".toList)

  }
}
