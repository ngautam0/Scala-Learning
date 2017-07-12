object PascalNoLoops{
  def main(args: Array[String]){

    val numberOfRows : Int = 10 // number of rows for Pascal Triangle

    printPascalTriangle(numberOfRows, numberOfRows)
    println()

    /*
    This function essentially generates indices..

    So we already have a function which will generate Pascals number based on row, col input
    pascalElementAt - does that..

    hence we need a function which generates indices for pascalElementAt

    so printPascalTriangle generates indices

    If you remove pascalElementAt call from printPascalTriangle.. and just use print..
    you ll get output :-
    0,0
    1,0 1,1
    2,0 2,1 2,2
    and so on...

    this function starts with row = 10 (numberOfRows val stores it..) and col = numberOfRows
    so, basically we are stating at right bottom.. and then recursively we climb up to top

    so first execution 10,10 den 10,9 den 10,8 ..... 10,0
    and then 9,9 9,8 so on and so forth till 0,0

    notice all prints statement is below recursion call.. Hence prints automatically in reverse order

    */
    def printPascalTriangle(numberOfRows:Int, numberOfCols :Int ) : Unit = {
      if(numberOfRows == 0){ // if reached at top row..
        print(pascalElementAt(numberOfRows, numberOfCols) + " ") // print and return
      }
      else if(numberOfCols < 0){ // if one row is compelete... col = row = row-1
        printPascalTriangle(numberOfRows-1 ,numberOfRows-1)
        println() // new line for beautifications
      }
      else{
        printPascalTriangle(numberOfRows, numberOfCols-1) // otherwise keep row same and shift one column
        print(pascalElementAt(numberOfRows, numberOfCols) + " ") // print statement below recursion call..
        // hence it will print in reverse order
      }
    }



    // calculates Pascal number based on row col input
    def pascalElementAt(row:Int, column:Int) : Int ={
      if (row == column || column == 0) 1
      else pascalElementAt(row-1, column) + pascalElementAt(row-1,column-1)
    }
  }
}
