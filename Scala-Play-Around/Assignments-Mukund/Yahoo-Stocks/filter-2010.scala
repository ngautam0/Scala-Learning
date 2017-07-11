import scala.io.Source
import java.text.SimpleDateFormat
import java.io._

// first implementation
// object FilterYear{
//   def main(args: Array[String]){
//     val filename = "yahoo_stocks.csv"
//     val filteredFileName = "2010-recs.csv"
//
//     val formatForInput = new java.text.SimpleDateFormat("yyyy-MM-dd")
//     val formatForYearFilter = new java.text.SimpleDateFormat("yyyy")
//
//     val filterningStartDate = formatForYearFilter.parse("2010")
//     val filterningEndDate = formatForYearFilter.parse("2011")
//
//     val writer = new PrintWriter(new File(filteredFileName))
//     val source = Source.fromFile(filename)
//     val header = source.getLines.take(1).toList.mkString(",")
//
//     writer.write(header + '\n')
//
//     for(line <- source.getLines().drop(1)){
//       var currentRecord = line.split(',').toList
//       var dateOfCurrentRecord = formatForInput.parse(currentRecord(0))
//       if(dateOfCurrentRecord.after(filterningStartDate) && dateOfCurrentRecord.before(filterningEndDate)){
//         writer.write(line + '\n')
//       }
//     }
//     writer.close()
//   }
// }

// Second implementation
object FilterYear{
  def main(args: Array[String]){
    val filename = "yahoo_stocks.csv"
    val filteredFileName = "2010-recs.csv"
    val filterYear = "2010"

    val writer = new PrintWriter(new File(filteredFileName))
    val source = Source.fromFile(filename)
    val header = source.getLines.take(1).toList.mkString(",")

    writer.write(header + '\n')

    for(line <- source.getLines.drop(1)){
      var currentRecord = line.split(',').toList
      if(currentRecord(0).indexOf(filterYear) >= 0){
        writer.write(line + '\n')
      }
    }
    writer.close()
  }
}
