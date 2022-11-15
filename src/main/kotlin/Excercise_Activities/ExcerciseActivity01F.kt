package Excercise_Activities

fun main(){

    println("Welcome to Palindrome Checker, please enter a word: ")
    var firstWord = readln().lowercase()


    var secondWord = firstWord.reversed()

    if((firstWord) == (secondWord)){

        println("This word is a Palindrome")
    }else{
        println("This word is not a Palindrome")
    }
}