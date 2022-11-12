package Excercise_Activities

fun main(){

        println("Enter the first word: ")
        var firstWord = readln().lowercase()

        println("Enter the second word: ")
        var secondWord = readln().lowercase()

        var firstAndSecondWord = ""

        for (firstUnique in firstWord.indices) {
            for (secondUnique in secondWord) {
                if (firstWord[firstUnique] == secondUnique) {
                    firstAndSecondWord += firstWord[firstUnique]
                }
            }
        }
        for (secondUnique in firstAndSecondWord) {
            var remove = secondUnique + ""
            firstWord = firstWord.replace(remove, "")
            secondWord = secondWord.replace(remove, "")
        }
        println("The unique character of first word is $firstWord")
        println("The unique character of second word is $secondWord")
}