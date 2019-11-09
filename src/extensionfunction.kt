//Kotlin has default and name parameters, not present in java

//Extension function
//here you can attach a function to class, even if that function was not defined inside the class
//a practical case for extension functions is extending classes that we cant alter or modify, hence we extend them

fun main(args: Array<String>){
    var student = Student()
    println("Passed status: ${student.hasPassed(65)}")
    println("Scholarship status: ${student.isScholar(30)}")

    val str1 = "Hello "
    val str2 = "World"
    val str3 = "Hey "
    println(str3.add(str1,str2))

    val x = 10
    val y = 20
    val greaterVal = x.greaterValue(y)
    println(greaterVal)
}

fun Student.isScholar(marks: Int): Boolean{//extension function
    return marks > 95
}

class Student (){
    fun hasPassed(marks: Int) : Boolean{
        return marks > 40
    }
}

//another example below
fun String.add(s1: String, s2: String): String{
    return this + s1 + s2;
}

fun Int.greaterValue(other: Int): Int {
    if (this > other){
        return this
    }else{
        return other
    }
}