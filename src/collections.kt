//Arrays are mutable collections of items but have fixed sized

fun main(){
    //an array of integers with a size of 5 elements and intial value of 0 passed into the lambda operator
    var myArray = Array<Int>(5) { 0 }   //Mutable but fixed size

    var list = listOf<String>("chrisoft","ifeanyi","ofoefule")//    Immutable, Fixed size, READ ONLY

    var mList = mutableListOf<String>("chrisoft","ifeanyi","ofoefule")//    Mutable, No Fixed size, READ & WRITE
    //var mList1 = arrayListOf<String>("chrisoft","ifeanyi","ofoefule")//    Mutable, No Fixed size, READ & WRITE
    //var mList2 = ArrayList<String>()//    Mutable, No Fixed size, READ & WRITE
    mList.add("Yogi Bear")

    for(element in list){
        println(element)
    }


    var myMap = mapOf<Int, String>(2 to "bode", 4 to "femi")    //Immutable, Fixed
    for (key in myMap.keys){//myMap.keys will return all keys present in map
        println(myMap[key]) //  or use this myMap.get(key)
    }

    var myHMap = HashMap<Int, String>() //  Mutable, READ and WRITE both, No Fixed Size
    myHMap.put(4, "Bode")
    myHMap.put(5, "Gbenga")
    myHMap.put(3, "George")

    //SET contains unique elements
    //HASHSET also contains unique elements but sequence is not guaranteed in output

    var mySet = setOf<Int>(2,4,6,7,8,9,2)   //Immutable and READ only
    var mySet2 = mutableSetOf<Int>(2,4,6,7,8,9,2)   //Mutable Set. READ and WRITE
    var mySet3 = HashSet<Int>()   //Mutable Set. READ and WRITE

}

