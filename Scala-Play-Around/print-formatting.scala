object PrintFormatting{
  def main(args: Array[String]){
    val name = "Nishant Gautam"
    val age = 27
    val weight = 69.55684

    println(s"Hello $name")
    // will print Hello Nishant Gautam

    println("Hello $name")
    // will print Hello $name

    println(f"I am ${age +1} and weigh $weight%.2f")

    // C style formatting
    printf("'%5d'\n",5)
    printf("'%-5d'\n",5)

  }
}
