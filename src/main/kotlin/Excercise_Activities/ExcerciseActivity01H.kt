package Excercise_Activities

fun main(){

    var studentsList = ArrayList<String>()
    var borrowBook = ArrayList<String>()
    var bookLists = ArrayList<String>()
    var dateBorrowed = ArrayList<String>()

    //Book Lists
    bookLists.add("Evil Rage")
    bookLists.add("The Bride's Flower")
    bookLists.add("The Magic Tree")
    bookLists.add("The Magic Tree")
    bookLists.add("Smart Money Concept")
    bookLists.add("Bible")

    //Student Lists
    studentsList.add("Alucard")
    studentsList.add("Gusion")
    studentsList.add("Zilong")
    studentsList.add("Lancelot")
    studentsList.add("Yu Zhong")


    do {
        println("\n********* SELECTION *********")
        println("[1] Student List")
        println("[2] Add Student")
        println("[3] Book List")
        println("[4] Add a Book")
        println("[5] Borrow a book")
        println("[6] Return a book")
        println("[7] Quit")
        println("*******************************")
        println("Choose your options: ")
        var options: Int = readln().toInt()


        var select:Int = options
        do {
            //Student lists and students with borrowed book
            if(options == 1) {
                println("**** Student Lists ****")
                println(studentsList)
                println("\n- Students who borrowed books -")
                println("$borrowBook $dateBorrowed")
                break
                select++

                //Add a new student
            }else if (options == 2) {
                println("**** New Student ****")
                println("Please complete the details")

                print("Enter first name: ")
                var firstName = readln()

                println("Enter last name: ")
                var lastName = readln()

                studentsList.add("$firstName $lastName")
                break
                select++

                //List of books available
            }else if (options == 3) {
                println("**** List of Books ****")
                println(bookLists)

                break
                select++

                //Add a new book to the library
            }else if (options == 4) {
                print("Enter Book Title: ")
                var bookTitle = readln()

                bookLists.add("$bookTitle")
                println(bookLists)

                break
                select++

                //Borrow a Book
            }else if(options == 5) {
                println("**** Borrow a book ****")
                println("Enter your first name: ")
                var firstName = readln()

                println("Enter your last name: ")
                var lastName = readln()

                println("Book Title :")
                var bookTitle = readln()
                    if("$bookTitle" in bookLists) {

                    }else {
                        println("Book not available")

                        break
                    }

                println("Date Borrowed: ")
                var dateBorrow = readln()

                borrowBook.add("$firstName $lastName")
                borrowBook.add("$bookTitle")
                dateBorrowed.add("$dateBorrow")
                bookLists.remove("$bookTitle")
                println("$borrowBook, $dateBorrow")

                break
                select++

                //Return a book

            }else if (options == 6){
                println("**** Return a book ****")
                println("Enter your first name: ")
                var firstName = readln()

                println("Enter your last name: ")
                var lastName = readln()

                println("Book Title: ")
                var bookTitle = readln()

                println("Date Borrowed: ")
                var dateborrowed = readln()

                println("Date Returned: ")
                var dateReturned = readln()

                bookLists.add("$bookTitle")
                borrowBook.remove("$firstName $lastName")
                borrowBook.remove("$bookTitle")
                dateBorrowed.remove("$dateborrowed")
                println(borrowBook)

                break
                select++
            }else if (options == 7)
                println("Thank you")

                break

        }while (select <= 6)

    }while (select <= 6)
}