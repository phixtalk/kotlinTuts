/**
*Filter methods filters out the desired elements from a collection
 * Returns a list containing only elements matching the given [predicate]
* */
/**
 * Returns a list containing the results of applying the given [transform] function
 * to each element in the original collection
 * */

fun main(args: Array<String>){

    val myNumber = listOf<Int>(2,3,4,5,23,60)

    //filter method
    val mySmallNumber = myNumber.filter { it < 10 } // { num -> num < 10 } is also accurate
    for (num in mySmallNumber){
        println(num)
    }

    //map method
    val mySquareNums = myNumber.map { it * it } //  OR {num -> num * num}
    for (num in mySquareNums){
        println(num)
    }

    //concatenate both filter and map
    val mySmallSquareNums = myNumber.filter { it < 10 }.map { it * it }
    for (num in mySmallSquareNums){
        println(num)
    }

    //Using objects as example

    var people = listOf<Person>(Person("Chigozie", 23), Person("Chidi", 43), Person("Amobe", 12))
    var filterList = people.filter { it.name.startsWith("C") }
                                        . map { it.name }
    for (names in filterList){
        println(names)
    }

}

class Person(var name: String, var age: Int ){

}