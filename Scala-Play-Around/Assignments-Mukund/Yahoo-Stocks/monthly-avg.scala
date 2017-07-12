import scala.io.Source

object MonthltAverage{
  def main(args: Array[String]){
    val filename = "yahoo_stocks.csv"

    val source = Source.fromFile(filename)
    var summationMonthMap:Map[String, Double] = Map()
    var countMonthMap:Map[String, Integer] = Map()


    for(line <- source.getLines.drop(1)){

      var currentRecord = line.split(',').toList

      var fullDate = currentRecord(0).split('-').toList
      var yearMonth = fullDate(0).toString + fullDate(1).toString
      var adjClose = currentRecord(6).toDouble

      if(summationMonthMap contains yearMonth){
        var newValueForMonth = summationMonthMap(yearMonth) + adjClose
        summationMonthMap = summationMonthMap + (yearMonth -> newValueForMonth)

        var newCount = countMonthMap(yearMonth) + 1
        countMonthMap =  countMonthMap + (yearMonth -> newCount)
      }
      else{
        summationMonthMap =  summationMonthMap + (yearMonth -> adjClose)
        countMonthMap = countMonthMap + (yearMonth -> 1)
      }
    }

    summationMonthMap.keys.map(key => println(key +" => "+ summationMonthMap(key) / countMonthMap(key)))
  }
}
