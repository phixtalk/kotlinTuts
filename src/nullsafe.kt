/*
* Safe Call Operator ( ?. )
*   ==> Returns the operation if value is not null else returns NULL
*   ==> Use it if you don't mind getting a NULL value
*
* Elvis Operator ( ?: )
*   ==> When we have a nullable reference value eg 'name', we can say "if 'name' is not null use it"
*       otherwise use some non-null value
*
* Non-null Assertion ( !! )
*   ==> Use it when you are sure the value is NOT NULL
*       Throws NullPointerException if the value is found to be NULL
*
* Safe Call with ( ?.let )
*   ==> It executes the block only if value is NOT NULL
* */

fun main(){
    val name: String? = "chrisoft"

    //Safe call operator
    println(name?.length)

    //Safecall with let block
    name?.let {
        println(name.length)
    }

    //Safe call with elvis operator
    var length = name?.length ?: -1 // this is similar to the tenary operator in java
    //this is the same as the code below
    var lenght = if (name!=null) name.length else -1

}
