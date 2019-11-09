//lateinit must be used only with mutable data type [var]
//lateinit must be used with non-nullable data type eg String and not String?
//lateinit values must be initialised before you use it

fun main (){

    var country = Country()
    println(country.name) // this will throw UninitializedPropertyAccessException error because we have not initialized it yet

}


class Country{
    lateinit var name: String//here we are promising that we will initialize it before using it
}