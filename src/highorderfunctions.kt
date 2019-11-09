/*
* HIGH LEVEL FUNCTIONS
*   -> Can accept Lambda Functions as a parameter
*   -> Can return a Lambda Function
*   -> Can do both
*   -> They function like interfaces, defining only the signature and not the implementation
*
* LAMBDAS
*   ->Its just a function with no name
*
* */

fun main(args: Array<String>){
    val program = Program()

    program.addTwoNumbers(2,7)

    //in order for us to use the interface in the method, we need an object to implement the interface
    //and override the method in it
    //first option is to create an inner class inside the method that implement the interface
    program.addTwoNumbers(2,7, object : MyInterface{
        override fun execution(sum: Int) {
            println(sum)
        }
    })
    //second option is to create an external class to do same
    var exClas = ImpleInter()
    program.addTwoNumbers(3,5, exClas)

    //finally we use a lambda expression
    val myLambda : (Int) -> Unit = {s -> println(s)}
    program.addTwoNumbers(2,7, myLambda) //this is valid
    program.addTwoNumbers(2,7,  {s -> println(s)}) //this is also valid
    program.addTwoNumbers(2,7) { s -> println(s)} //this too is also valid

}

interface MyInterface{
    fun execution(sum: Int)
}

class ImpleInter: MyInterface{
    override fun execution(sum: Int) {
        println(sum)
    }
}

class Program{
    //this method uses a lambda function to return the action
    //this is a high level function, because it accepts a function as imput
    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) {
        val sum = a + b
        action(sum)
    }

    //this method uses an interface to return the action
    fun addTwoNumbers(a: Int, b: Int, action: MyInterface){
        val sum = a + b
        action.execution(sum)
    }

    //this method executes the body directly
    fun addTwoNumbers(a: Int, b: Int){
        val sum = a + b
        println(sum)
    }
}
