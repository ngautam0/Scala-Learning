/*
Problem : Pascal triangle

I view this problem as below..
The triangle starts with 1..
so the first row is simple "1"
and there are invisible zeros before and after 1

0 1 0
now for second row add  0th & 1st, and 1st & 2nd element

so we get
1 1 - this becomes second row

now againg prepend and append zeros
0 1 1 0

for third row again add 0th & 1st, 1st & 2nd, and 2nd & 3rd element
and continue like this
*/
import scala.collection.mutable.ArrayBuffer

object PascalTriangle{
  def main(args: Array[String]){

    var pascalRow = List(1) // will be used to store and print current row

    for(i <- 1 to 10){ // print 10 pascal rows

      println(pascalRow) // print each row
      pascalRow =  pascalRow :+ 0 // prepend 0 to current pascal row
      pascalRow =  0 +: pascalRow // append 0 to current pascal row

      pascalRow = pascalRow.sliding(2).toList.map(_.sum) // update current row
    }
  }
}
