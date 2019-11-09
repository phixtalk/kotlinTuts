//Data class and Super Class Any

//"Any" class contains functions such as
/*
*   -> equal(): Boolean
*   -> hashCode(): Int
*   -> toString(): String
* */

//when we use the data keyword in a class, kotlin provides an additional copy() method
//data classes are used when we want to compare the value stored in objects, and not their references
//by defdault the data class provide the default implementation of the toString() method
//the constructor in data classes can only contain class properties and not parameters

fun main(){
    var user1 = User("Sam", 10)
    var user2 = User("Sam", 10)

    println(user1.toString())

    if(user1 == user2){
        println("equal")
    }else{
        println("not equal")
    }

    var newUser = user1.copy(name="John", id = 32)
    println(newUser)

}

data class User(var name: String, var id: Int){

}