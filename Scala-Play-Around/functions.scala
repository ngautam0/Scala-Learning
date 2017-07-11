object Functions{
  def main(args : Array[String]){

    // functions that return a value
    def getSum(num1 : Int = 1, num2 : Int = 1) : Int = {
      num1 + num2
    }

    // function that does not return : procedure
    def sayHi() : Unit = {
      println("Hi, How are you ?")
    }

    // accept a variable number of args
    def getSumAnyNumberOfArgs(numbers : Int*) : Int = {
      var sum : Int = 0

      for (num <- numbers)
        sum += num

      sum
    }

    // recursion
    def factorial(num: BigInt): BigInt = {
      if (num <= 1)
        num
      else
        num*factorial(num-1)
    }



    println(getSum(5,6))
    println(getSum())
    println(getSum(num2 = 10, num1= -9))
    sayHi
    println(getSumAnyNumberOfArgs(1,2,3,4,5,6,7,8,9,10))
    println(factorial(5))
  }
}
