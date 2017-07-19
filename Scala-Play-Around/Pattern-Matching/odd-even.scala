object OddEven{
  def main(arg: Array[String]) = {
    // works on command line argument
    arg(0).toInt match {
      case num if num % 2 == 0 => println("Even")
      case _ => println("Odd")
    }
  }
}
