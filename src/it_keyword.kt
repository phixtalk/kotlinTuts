//whenever we have only one parameter as input to a lambda function
//we can simplify the expression function and replace with *it* as seen below
fun main(){

    var prog = Programs()
//    prog.reverseAndDisplay("hello", {s -> s.reversed()})// this is valid
    prog.reverseAndDisplay("hello", {it.reversed()})// this is also valid,

}

class Programs{

    fun reverseAndDisplay(str: String, myFunc: (String) -> String){
        var returnedString = myFunc(str)
        println(returnedString)
    }
}