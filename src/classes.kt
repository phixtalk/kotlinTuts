//In Kotlin, every class you define has a super class of Any
//classes in kotlin are similar to java, however the constructor is a bit different
//as seen below, the primary constructor parameters are defined in the parenthensis
//after the class name, the body of the constructor can be defined in the init block
//By default, Classes in kotlin are public and final, so you cannot inherit by default
//to inherit a class, method or property, use the "open" keyword

//VISIBILITY MODIFIERS
//public, protected, internal, private

fun main(){
    //var customer = Customers("chrisoft")

    var dog = Dog()
    dog.bark()
    dog.breed
    dog.eat()


}

class Customers(var name: String) {//the var keyword converts the parameter name to a class property/field
    //init block is called immediately executed after the creation of the instance of the customer class
    //think of it as the body of the primary constructor
    var id = -1;
    init {
        println("Customer has got a name as $name")
    }

    //the secondary constructor must reference the primary constructor
    //you cannot declare class properties inside a secondary constructor, only parameters
    //the body of the secondary constructor is called, after the init block
    constructor(n: String, id: Int) : this(n) {
        this.id = id
    }
}

open class Animal{
    open var color = "White"

    open fun eat(){
        println("Animal is Eating")
    }
}

class Dog: Animal(){
    var breed = ""
    override var color = "Black"

    fun bark(){
        println("Dog bark")
    }

    override fun eat(){
        super<Animal>.eat()//explicitly indicate the super class you are calling, incase of multiple super classes
        println("Dog is eating")
    }

}

class Cat: Animal(){
    var age = -1

    fun meow(){
        println("Cat meow")
    }

    override fun eat(){
        println("Cat is eating")
    }
}