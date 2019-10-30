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
    }

}