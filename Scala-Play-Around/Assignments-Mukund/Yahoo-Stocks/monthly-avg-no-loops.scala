import scala.io.Source

object MonthlyAverageNoLoop{
  def main(args: Array[String]){

    val filename = "yahoo_stocks0.csv"
    val source = Source.fromFile(filename)

    val header = source.getLines.take(1).mkString(",")

    val eachRecordAsString = source.getLines.drop(1).toList

    val eachRecordAsList = eachRecordAsString.map(each => each.split(',').toList)

    val filteredReqColumns = eachRecordAsList.map(each => List(each.head, each.last))

    val monthAndAvgData = filteredReqColumns.map(each =>
                          List(each(0).split('-').toList.head + each(0).split('-').toList.tail.head, each(1))
                        )

    val groupedByData = monthAndAvgData.groupBy(each => each.head)

    val result = groupedByData.map({
      case(key, value) => val sum = value.foldLeft(0.0f)((sum,row) => sum + row(1).toFloat)
      List(key, sum/value.length)
    })

    // just for understanding
    // groupedByData.map({case(key, value) => println(value)})

    println(result)


  }
}
