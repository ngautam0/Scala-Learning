object StringIteration{
  def main(arg: Array[String]){
    val someLetters = "NIIT is an awesome company :P"
    var index = 0

    // method 1 - via index
    for(index <- 0 until someLetters.length){
      // until runs it someLetters.length - 1
      // if we would have used to, it would run till
      // someLetters.length.. and we get index out of range error
      println(someLetters(index))
    }

    // method 2 - vis list iteration
    for (each <- someLetters){
      println(each)
    }
  }
}
