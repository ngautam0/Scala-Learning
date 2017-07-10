object Filtering{
  def main(args: Array[String]){

    var evenList = for { i <- 1 to 200
      if (i % 2) == 0
    } yield i

    // I dont quite understand this now..
    // Why use curly braces after for..
    // Confusing for me as of now
    
    println(evenList)

  }
}
