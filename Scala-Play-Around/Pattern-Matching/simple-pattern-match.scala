object SimplePatternMatch{
  def main(arg: Array[String]) = {
    // works on command line argument
    arg(0).toInt match {
      case 0 => println("Zero")
      case 1 => println("One")
      case _ => println("Neither Zero Nor 1")
    }
  }
}
