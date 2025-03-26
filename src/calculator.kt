import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)

    println("Enter first number :")
    var first = read.nextInt()

    println("Enter operator (+,-,*,/) :")
    var operator = readln()

    println("Enter second number :")
    var second = read.nextInt()

    var result = when(operator){
        "+" -> first + second
        "-" -> first - second
        "*" -> first * second
        "/" -> first / second

    else -> "Invalid Operator"
    }

    println("$first $operator $second = $result")


}