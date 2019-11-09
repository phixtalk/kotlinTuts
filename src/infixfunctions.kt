//Infix functions can be a Member function or Extension function
//They have a SINGLE parameter
//They have prefix of "infix"
//All Infix functions are extension functions, But
    //not all extension functions are Infix
//benefit of infix function is as seen in the syntax below, cleaner syntax seperated by spaces

fun main (){

    val x = 10
    val y = 23
    val greaterVal = x getGreaterValue y //x.getGreaterValue(y)
    println(greaterVal)

}

infix fun Int.getGreaterValue(other: Int): Int {
    if (this > other){
        return this
    }else{
        return other
    }
}