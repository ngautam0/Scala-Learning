object Recursion{
  def main(args: Array[String]){

    // two functions which count recursively..
    // one will count backwards and anothere forward

    def countBackward(number : Int = 20) : Unit = {
      if(number > 0){
        println(number)
        countBackward(number - 1)
      }
    }

    // Note that.. only difference is in println placement
    // placing it before recursive call. and placing it after the call makes the difference

    def countForward(number : Int = 20) : Unit = {
      if(number > 0){
        countForward(number - 1)
        println(number)
      }
    }

    println("Count backwards")
    countBackward()
    println("Count Forward")
    countForward()
  }
}
