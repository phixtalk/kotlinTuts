//basically means that you can convert object values directly to a their string values
//below, the student object methods is expressed directly inside a string using the
//interpolation converter ${object.value}

fun main(args: Array<String>){
    var student = Student()
    println("Passed status: ${student.hasPassed(65)}")
    println("Scholarship status: ${student.isScholar(30)}")
}