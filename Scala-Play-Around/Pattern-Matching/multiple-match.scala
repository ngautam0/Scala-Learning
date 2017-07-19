object MultipleMatch{
  def main(arg: Array[String]) = {
    // works on command line argument
    arg(0).toInt match {
      case 1 | 2 | 3 | 4 => println("Less than 5")
      case _ => println("Greater than or eq to 5")
    }
  }
}
