object FactorialUsingPattern{
  def main(arg : Array[String]){
    
    def factorial(number : Int) : Int = number match {
      case 0 => 1
      case n => n * factorial(n-1)
    }
    
    println(factorial(6))
  }
}