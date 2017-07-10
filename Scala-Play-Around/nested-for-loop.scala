object NestedForLoop{
  def main(arg: Array[String]){

    // traditional way
    for (i <- 1 to 3)
      for(j <- 1 to 5)
        println(i,j)

    println("*******************")
    // scala way
    for(i <- 1 to 3; j <- 1 to 5)
      println(i,j)

    /*
    scala way seems awesome to
    use to MD-Array
    */
  }
}
