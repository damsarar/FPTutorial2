//Calculate perimeter and area of a triangle ABC

import scala.math.sqrt
import scala.math.pow

object question11 {
  def main(args : Array[String]){
    var a=40
    var b=36
    var c=36

    var perim=a+b+c

    var len:Double=sqrt(pow(b,2)-pow(a/2,2))
    var half:Double=1.0/2
    var area:Double=half*len*a

    println("Perimeter : "+perim)
    println("Area : "+area)

  }


}
