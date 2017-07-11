/*
Problem : Pascal triangle

If we try to solve this by recursion...
we could view it as a repetative operation of each row being function of prev row
so for 1st element.. its always 1 and even last element is always 1

for all other elements... its sum of row-1,col & row-1, col-1
performing this recursively we get pascal Triangle
*/

// I belive loop version is more efficient memory wise.. Need to check wid mukund


object PascalTriangleAnother{
  def main(args: Array[String]){

    def pascalTriangle(row: Int, col: Int) : Int = {
      if(col ==  0 || col == row) // 1st and last element 1
        1
      else
        pascalTriangle(row-1,col-1) + pascalTriangle(row-1, col) // sum of row-1,col & row-1, col-1
    }

    for (row <- 0 to 10){
      for(col <- 0 to row)
        print(pascalTriangle(row,col)+" ")
      println()
    }

  }
}
