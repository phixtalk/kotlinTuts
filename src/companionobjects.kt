//'Companion objects' are same as 'objects' but are declared within a class

fun main(){
    MyClass.count
    MyClass.typeOfCustomer()
}

class MyClass{
    companion object{
        var count = -2
        fun typeOfCustomer(): String{
            return "Canadian"
        }
    }
}
