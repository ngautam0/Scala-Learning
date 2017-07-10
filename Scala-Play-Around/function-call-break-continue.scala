object FunctionCall{
  def main(args: Array[String]){
    var i = 0

    def printPrimes(){
      val primeList = List(1,2,3,5,7,11)

      for( i <- primeList){
        /*
           there is no break in scala
           so implement it using return
        */
        if(i == 11)
          return

        /*
           Even there is no break
           we could use if to simulate it
        */
        if(i != 1)
          println(i)
      }
    }

    // make a Function call to printPrimes
    // this works
    printPrimes

    // this also works
    printPrimes()

    // i assume we use later one, when we have to pass args
  }
}
