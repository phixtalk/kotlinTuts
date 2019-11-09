//A class with only one instance
//in kotlin the keyword "object" is used to declare a class as Singleton
//we cannot have constructors in an object class (singleton)


fun main(){
    CustomersData.count = 34
    println(CustomersData.count)

    CustomersData.typeOfCustomer()
    CustomersData.myMethod("Hello Mr Canadian")
}

open class MySuperClass{

    open fun myMethod(str: String){
        println(str)
    }
}

object CustomersData: MySuperClass(){

    var count = -1      //behaves like a static variable

    fun typeOfCustomer(): String{   //behaves like a static method
        return "Canadian"
    }

    override fun myMethod(str: String) {    //behaves like a static method
        super.myMethod(str)
    }

}