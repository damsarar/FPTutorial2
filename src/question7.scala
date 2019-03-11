//Volume

import scala.math.sqrt
import scala.math.pow
import scala.math.Pi

object question7 {
  def main(args : Array[String]){

    var r=8
    var R=6
    var x=(2*10)-r-R
    var h:Double=sqrt(pow(r+R,2)-pow(x,2))
    var H:Double=h+r+R
    var v1:Double=Pi*pow(10,2)*H
    var v2:Double=(4/3.0)*Pi*pow(r,3)
    var v3:Double=4/3.0*Pi*pow(R,3)
    var v:Double=v1-v2-v3

    println("Volume is : "+v)

  }

}
