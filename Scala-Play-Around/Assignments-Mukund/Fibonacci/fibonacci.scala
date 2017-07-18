object Fibonacci{
  def main(args: Array[String]){

    // just for sake of printing
    (0 to 10) map (n => println(fibonacci(n)))

    def fibonacci(number : Int) : Int = { 
      def fibTail(num : Int, a : Int, b : Int ) : Int = num match{
        case 0 => a
        case _ => fibTail(num-1, b, a+b)
      }
      fibTail(number, 0 , 1)
    }
  }
}
