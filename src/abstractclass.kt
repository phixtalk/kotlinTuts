fun main(){

}

abstract class Persons{

    abstract var name: String
    abstract fun eat() //abstract properties are open by default
    open fun getHeight(){}//an open function is ready to be overridden
    fun goToSchool(){}//a normal function is public and final by default


}

class Nigerian() : Persons(){
    override var name: String = "some_dummy_text"

    override fun eat() {
    }

}