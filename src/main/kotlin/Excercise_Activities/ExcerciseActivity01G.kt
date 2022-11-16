package Excercise_Activities

fun main(){
    println("Input your first number: ")
    var num1 : Int = readln().toInt()

    println("Input your second number: ")
    var num2 : Int = readln().toInt()

    if (num1 <num2){
        print("Lower number is: $num1 Larger number is: $num2")
    }else if (num1 >num2){
        print("Lower number is: $num2 Larger number is: $num1")
    }else{
        println("Error Occurred: Invalid Input!")
    }

}