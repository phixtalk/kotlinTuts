//this provides us with an elegant way of initializing class properties and methods
//however using the with keyword, you can not call object methods, you can only set object properties
//but using apply keyword, you can set object properties as well as call object methods
fun main(){
    var newClass = NewClass()

    with(newClass){
        name = "Chrisoft"
        age = 20
    }

    newClass.apply {
        name = "Chrisoft"
        age = 20
    }.startRun()

}


class NewClass{

    var name: String = ""
    var age: Int = -1

    fun startRun(){
        println("Now I am running")
    }

}