//In Java 8, you cannot mutate (change) values of outside variables inside Lambdas
//But in kotlin you can change the values


fun main(){
    val program = MyProgram()

    var result = 0;

    // as seen below, we modified the outside variable-result (i.e the closure) from the lambda function
    program.addTwoNumbers(2, 7) {x,y -> result = x + y}

    println(result)

}

class MyProgram {
    //this method uses a lambda function to return the action
    //this is a high level function, because it accepts a function as imput
    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) {
        action(a, b)
    }
}