object ListIteration{
  def main(args: Array[String]){

    val sampleList = List(1,2,3,4,5,'a','v')
    // a and v gets converted into asci
    
    for (eachItem <- sampleList){
      println("List Item " + eachItem)
    }
  }
}
