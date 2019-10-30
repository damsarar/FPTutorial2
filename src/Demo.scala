object Dem{
    def main(args:Array[String]){
        //maps in scala
        val colors = Map("red"->"#FF0000", "azure"->"#F0FFFF", "peru"->"#CD853F")
        val nums: Mao[int, Int] = Map()
        println("keys in colors: "+ colors.keys)
        println("values in colors: "+colors.values)
        println("check if colors is empty : "+ colors.isEmpty)

    //concat arrays

        var arr1 = Array(1,2,3,4,5)
        var arr2 = Array(8,9,10,11)

        var arr3 = concat(arr1, arr2)
        //printa all the array elements
        for(x<- arr3)
        {
            println(x)
        }

        //array with range

        var myList1 = range(10, 20, 2)
        for ( x <- myList1 ) {
         print( " " + x )
        }

        //closures

        object Demo {
        def main(args: Array[String]) {
            println( "multiplier(1) value = " +  multiplier(1) )
            println( "multiplier(2) value = " +  multiplier(2) )
        }
        var factor = 3
        val multiplier = (i:Int) => i * factor  
        }
    }

}