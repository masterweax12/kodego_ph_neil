package Excercise_Activities

fun main(){

    //School Library Books
    var bookNumber5 : Int = 7884
    var bookNumber4 : Int = 4223
    var bookNumber3 : Int = 2863
    var bookNumber2 : Int = 8312
    var bookNumber1 : Int = 9212

    //Book Stocks
    var bookStocks5 : Int = 23
    var bookStocks4 : Int = 21
    var bookStocks3 : String = "Out of stock"
    var bookStocks2 : Int = 12
    var bookStocks1 : String = "Pending reserved"

    //Book Name
    var bookName5 : String = "\"Evil Rage\""
    var bookName4 : String = "\"The Bride's Flower\""
    var bookName3 : String = "\"The Magic Tree\""
    var bookName2 : String = "\"Smart Money Concept\""
    var bookName1 : String = "\"Bible\""

    //Book Characteristics
    var bookChar1: String = "\"Financial Market\""
    var bookChar2: String = "\"Horror\""
    var bookChar3: String = "\"Romance\""
    var bookChar4: String = "\"Fantasy\""
    var bookChar5: String = "\"Religious\""

// School Library Intro
    println("Hi, Welcome to our School Library. Type \"Proceed\" to check the lists\n")
    var proceed = readln()
    var condition: Boolean = true

    if(proceed == "Proceed" || proceed == "proceed"){
        //Books Output display
        println("Book number $bookNumber5 with the book name $bookName5 under the category of $bookChar2 genre, has currently $bookStocks5 available.\n" +
                "Book number $bookNumber4 with the book name $bookName4 under the category of $bookChar3 genre, has currently $bookStocks4 avaialble.\n" +
                "Book number $bookNumber3 with the book name $bookName3 under the category of $bookChar4 genre, is currently $bookStocks3.\n" +
                "Book Number $bookNumber2 with the book name $bookName2 under the category of $bookChar1 genre is on a $bookStocks1 status.\n" +
                "Book Number $bookNumber1 with the book name $bookName1 under the category of $bookChar5 genre has currently $bookStocks2 available.\n"
        )

    }else{
        println("You have entered the wrong keyword.\n")
    }

    //While loop condition
    while(condition){
        println("Would you like to check the lists again? Y/N\n")
        var answer = readln()

        if(answer == "Y" || answer == "y"){
            println("Book number $bookNumber5 with the book name $bookName5 under the category of $bookChar2 genre, has currently $bookStocks5 available.\n" +
                    "Book number $bookNumber4 with the book name $bookName4 under the category of $bookChar3 genre, has currently $bookStocks4 avaialble.\n" +
                    "Book number $bookNumber3 with the book name $bookName3 under the category of $bookChar4 genre, is currently $bookStocks3.\n" +
                    "Book Number $bookNumber2 with the book name $bookName2 under the category of $bookChar1 genre is on a $bookStocks1 status.\n" +
                    "Book Number $bookNumber1 with the book name $bookName1 under the category of $bookChar5 genre has currently $bookStocks2 available.\n"
            )

        //Terminates the program
        }else if (answer == "N" || answer == "n"){
            println("Thank you and come again.")

            condition = false
        }
    }
}