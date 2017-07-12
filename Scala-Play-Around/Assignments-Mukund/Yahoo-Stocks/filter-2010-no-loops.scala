import scala.io.Source


object FilterYearNoLoops{
  def main(args : Array[String]){

    val filename = "yahoo_stocks.csv"
    val source = Source.fromFile(filename)
    val yearToBeFiltered = "2010"

    val header = source.getLines.take(1).toList.mkString(",")

    val eachRecordAsString = source.getLines.drop(1).toList


    val eachRecordAsList = eachRecordAsString.map(each => each.split(',').toList)
    val filteredDataForYear = eachRecordAsList.filter(each => each(0).indexOf(yearToBeFiltered) >= 0)

    // needs to be written down in file.. As of now printing on screen
    println(header)
    filteredDataForYear.map(each => println(each.mkString(",")))
  }
}
