import scala.io.StdIn.readLine // for single import
// import scala.io.StdIn.{readLine, readInt} // for multi import
// import scala.io.StdIn._ // for all import

// all 3 work


/*
if we run this without any import.. it works fine..
but will throw in a warning..

warning :

/data/Scala-Learning/Scala-Play-Around/guess-the-secret.scala:9:
warning: method readLine in trait DeprecatedPredef is deprecated:
Use the method in `scala.io.StdIn`
      guessedNumber = readLine.toInt
                      ^
My guess :

that there is some by default readLine which is deprecated..
hence we should use readLine from scala.io.StdIn
*/


object GuessTheSecret{
  def main(args: Array[String]){
    val secretNumber = 15

    var guessedNumber = 0

    do{
      println("Guess a number ")
      guessedNumber = readLine.toInt
    } while(guessedNumber != secretNumber)

    // another way of print.. C style
    printf("You Guessed the secret number = %d \n", secretNumber)
  }
}
