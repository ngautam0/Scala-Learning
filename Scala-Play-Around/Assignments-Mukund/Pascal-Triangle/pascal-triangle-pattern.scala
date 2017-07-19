object PascalPatternMatching{
  def main(args: Array[String]){

    val numberOfRows : Int = 10 // number of rows for Pascal Triangle

    printPascalTriangle(numberOfRows, numberOfRows)
    println()

    def printPascalTriangle(numberOfRows:Int, numberOfCols :Int ) : Unit = {
      (numberOfRows, numberOfCols) match{
        case (0, numberOfCols) => print(pascalElementAt(numberOfRows, numberOfCols) + " ")
        case (numberOfRows, numberOfCols) if numberOfCols < 0  => {printPascalTriangle(numberOfRows-1 ,numberOfRows-1); println()}
        case _ => {printPascalTriangle(numberOfRows, numberOfCols-1); print(pascalElementAt(numberOfRows, numberOfCols) + " ") }
      }
    }

    // calculates Pascal number based on row col input
    def pascalElementAt(row:Int, column:Int) : Int ={
      if (row == column || column == 0) 1
      else pascalElementAt(row-1, column) + pascalElementAt(row-1,column-1)
    }
  }
}
