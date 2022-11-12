package Excercise_Activities

fun main() {

    println("Good Day! Would you like to add monetary? Please enter your desired amount: ")
    var amount: Double = readln().toDouble()
    var condition: Boolean = true

    //try catch for Activity 01-D
    while (condition) {
        print("Do you want to add more? Yes/No: ")
        var answer = readln()

        if (answer == "Yes" || answer == "yes") {
            print("Enter an amount: ")
            var input = readln().toDouble()
            amount += input
        } else if (answer == "No" || answer == "no") {
            println("\nTotal amount is $amount")

            condition = false
        }
    }
    println("\nDivide the total by how many? ")
    var division = readln().toDouble()

    if (amount > 0 && division > 0) {
        var quotient = amount / division
        println("\nThe result is $quotient")
        println("\nTransaction completed")
    } else {
        println("\nInvalid Input")
        println("\nPlease Try Again")
    }
}
