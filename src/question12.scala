//Calculate the area of regular pentagon

import scala.math.sqrt

object question12 {
  def main(args : Array[String]){
    var u=17

    var area:Double=(sqrt(5*(5+2*sqrt(5)))*u*u)/4.0

    println("Area : "+area)

  }


}
