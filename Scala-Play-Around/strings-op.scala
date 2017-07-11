object StringOp{
  def main(args: Array[String]){

    val randomString = "Just like that"

    // printing by index
    println(randomString(10))

    // length
    println(randomString.length)

    // concat
    println(randomString.concat(", and like this"))
    println(randomString)

    // compare
    println(randomString.equals(randomString))
    println("blah blah".equals(randomString))

    // match
    println(randomString.indexOf("like"))

    // convert to an array
    val randomStringArray = randomString.toArray

    for (each <- randomStringArray)
      println(each)
  }
}
