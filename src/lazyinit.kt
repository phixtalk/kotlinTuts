//Sometimes we declare and initialize a variable and end up not using it
//this leads to memory waste.
//using the lazy keyword we can initialize a variable only when it is called and used
//hence saving memory
//it is initialized only once. Next time when you use it, you get the value from cache memory
//it is thread safe
    //it is initialised in the thread where it used for the first time
    //other threads use the same value stored in the cache memory


val pi by lazy {//here pi will only be allocated memory and assigned the value of 3.14 when it is called
    3.14f
}

fun main(){
    val area = pi * 4 * 4
}