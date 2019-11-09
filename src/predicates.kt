/*
* Predicate is a lambda condition that returns true or false
*   ->all: Do all elements satisfy the predicate / condition
*   ->any: Do any element in list satisfy the predicate?
*   ->count: Total elements that satisfy the predicate
*   ->find: returns the FIRST element that satisfy the predicate
* */

fun main(){
    val myNumbers = listOf<Int>(2,3,4,5,6,23,90)

    val myPredicate: (Int) -> Boolean = { num -> num > 10 }

    val check1 = myNumbers.all (myPredicate)  // Are all elements in the list greater than 10
    println(check1) //false

    val check2 = myNumbers.any( myPredicate ) //  Does any of these elements satisfy the Predicate
    println(check2) //true

    val check3 = myNumbers.count(myPredicate) // Total elements that satisfy the predicate
    println(check3) //2

    val check4 = myNumbers.find (myPredicate) //  returns the FIRST element that satisfy the predicate
    println(check4) // prints 23
}