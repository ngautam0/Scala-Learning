object PlusMinus {
  def main(arg : Array[String]){

    val number = 12
    val list = (1 to number).toList
    val combinationCount = scala.math.pow(2, number).toInt - 1
    val desiredSum = 0

    val combinationList : List[List[Int]] = (0 to combinationCount).map(each => each.toBinaryString.reverse.padTo(number, 0).mkString.reverse.toList.map(_.toString.toInt)).toList
    val combinationListAlligned : List[List[Int]] = combinationList.map(x=> x.map(y => if (y == 0) -1 else y))
    val allCombination : List[List[Int]] = combinationListAlligned.map(row => row.zip(list).map{case(a,b) => a*b})
    val countOfDesiredSum : Int = allCombination.map(_.sum).count(_ == desiredSum)

    println(countOfDesiredSum)
  }
}
