object question17 {
  def main(args : Array[String]){
    var seatsperrow:Int=19
    var first10rowsrevenue:Int=30*10*seatsperrow
    var totalrevenue:Int=12255
    var otherrevenue:Int=12555-first10rowsrevenue
    var noofrows=10+(otherrevenue/19)

    println("No of rows : "+noofrows)

  }
}
