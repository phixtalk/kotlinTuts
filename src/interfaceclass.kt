fun main(){

    var myButton = MyButton()
    myButton.onClick()

}
//interfaces can contain both normal and abstract methods
//but they can only contain abstract property
//Interface are not class


interface MyInterfaceListener{
    var name: String

    fun onTouch()

    fun onClick() {//Normal methods are public and open by default, not final
        println("Interface button clicked")
    }
}

class MyButton: MyInterfaceListener{

    override var name: String = ""
    override fun onTouch() {
    }

}