package Excercise_Activities


fun main(){

    //student lists
    var student1 = "Alucard"
    var student2 = "Gusion"
    var student3 = "Zilong"
    var student4 = "Lancelot"
    var student5 = "Helcurt"

    //student age
    var age1: Int = 18
    var age2: Int = 19
    var age3: Int = 17
    var age4: Int = 21
    var age5: Int = 59

    //progress lists
    var progress1: Double = 15.2
    var progress2: Double = 20.0
    var progress3: Double = 13.7
    var progress4: Double = 19.2
    var progress5: Double = 25.0


    println("Welcome To our Student Directory. Type \"Proceed\" to  see lists.\n")
    var answer = readln()
    var option = true
    if(answer == "Proceed" || answer == "proceed") {
        println(
            "Student Name: ($student1) Age: ($age1)  = current activity progess is : $progress1\n" +
                    "Student Name: ($student2) Age: ($age2) = current activity progress is : $progress2\n" +
                    "Student Name: ($student3) Age: ($age3) = current activity progress is : $progress3\n" +
                    "Student Name: ($student4) Age: ($age4) = current activity progress is : $progress4\n" +
                    "Student Name: ($student5) Age: ($age5) = current activity progress is : $progress5"
        )
    }else{
        println("You entered the wrong keyword.\n")
    }

    while(option){
        println("Would you like to check again? Y/N")
        var answer2 = readln()

    if(answer2 == "Y" || answer2 == "y"){
        println("Student Name: ($student1) Age: ($age1)  = current activity progess is : $progress1\n" +
                "Student Name: ($student2) Age: ($age2) = current activity progress is : $progress2\n" +
                "Student Name: ($student3) Age: ($age3) = current activity progress is : $progress3\n" +
                "Student Name: ($student4) Age: ($age4) = current activity progress is : $progress4\n" +
                "Student Name: ($student5) Age: ($age5) = current activity progress is : $progress5")

    }else if(answer2 == "N" || answer2 == "n") {
        println("Thank you and come again.")

        option = false
       }
    }
}