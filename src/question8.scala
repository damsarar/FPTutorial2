object question8 {
  def main(args : Array[String]){
    var onecolor:Integer=7
    var twocolor:Integer=7*6
    var threecolor:Integer=7*6*5
    var fourcolor:Integer=7*6*5*4
    var fivecolor:Integer=7*6*5*4*3
    var sixcolor:Integer=7*6*5*4*3*2
    var sevencolor:Integer=7*6*5*4*3*2*1
    var totalways:Integer=onecolor+twocolor+threecolor+fourcolor+fivecolor+sixcolor+sevencolor

    println("Total no of ways : "+totalways)

  }
}
