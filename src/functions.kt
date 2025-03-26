fun main() {

    //Standard Library Functions/ Pre-defined functions

    var output = Math.sqrt(144.0)
    println("The square root of 144 is $output")

    var number = Math.round(45.89)
    println(number)

    school()
    add()
    student("John", "Male", 35)
    student("Ann", "Female", 21)

    employee("Mike", 35000, true)
    employee("Nicholas", 70000, false)
}

//User-defined functions

fun school(){
    println("eMobilis")

}

fun add(){
    var x = 3
    var y = 5

    println(x + y)
}

//Parameters/Variables and Arguments/Values

fun student(name:String, gender:String, age:Int){
    println("$name is a $gender. $name is $age years old")

}


fun employee(name: String, salary:Int, disability:Boolean){
    println("$name earns $salary. Disabled? : $disability")
}