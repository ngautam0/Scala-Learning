import scala.io.Source

object FileRead{
  def main(args: Array[String]){
    val filename = "yahoo_stocks.csv"

    for(line <- Source.fromFile(filename).getLines){
      println(line)
    }
  }
}
