package Excercise_Activities

fun main(){

    //categories
    var category1 = "Food"
    var category2 = "Beverages"
    var category3 = "Non Food"
    var category4 = "Medicines"

    //stock availability for food
    var stock1: Int = 57
    var stock2: Int = 82
    var stock3: Int = 46
    var stock4: Int = 72

    //stock availability for beverages
    var stock5: String = "Out of Stock"
    var stock6: Int = 7
    var stock7: Int = 10
    var stock8: String = "Pending for purchase order"

    //stock availability non-food
    var stock9: Int = 104
    var stock10: Int = 92
    var stock11: String = "Pending for barcode scan"
    var stock12: String = "Out of stock"

    //stock availability for medicines
    var stock13: Int = 12
    var stock14: String = "On FDA Test and Inspection"
    var stock15: String = "On the way for Shipping Delivery"
    var stock16: Int = 45

    //food categories
    var food1 = "Doña Maria Premium Rice"
    var food2 = "Ichiraku Ramen Noodles"
    var food3 = "Rebisco Peanut Biscuit"
    var food4 = "Argentina Corned Beef"

    //beverages categories
    var beverages1 = "Soya Milk"
    var beverages2 = "Coke Soda"
    var beverages3 = "Organic Mango Juice"
    var beverages4 = "San Miguel Beer"

    //non food categories
    var nonfood1 = "Wings Solved Detergent"
    var nonfood2 = "Joy Dishwashing Liquid"
    var nonfood3 = "Baygon Katol Mosquito Killer"
    var nonfood4 = "Rexona Deodorant"

    //medicines categories
    var medicines1 = "Biogesic"
    var medicines2 = "Viagra"
    var medicines3 = "Tuseran Forte"
    var medicines4 = "Ibuprofen Medicol"


    println("Hi, This is Inventory Stock Lists. To help you, please type the category of your choice to select what's best for you\n")
    println("Type \"F\" for Food. Type \"B\" for Beverages. Type \"NF\" for Non Food. And lastly type \"M\" for Medicines.")
    var choice = readln()
    var condition = true

    if(choice == "F"  || choice == "f"){

        println("Category: ($category1)\n")
        println("$food1, Stocks Available is: \"$stock1\"\n$food2, Stocks Available is: \"$stock2\"\n$food3, Stocks Available is: \"$stock3\"\n$food4 Stocks Available is \"$stock4\"")

    }else if (choice == "B" || choice == "b"){
        println("Category: ($category2)\n")
        println("$beverages1, Stocks Available is: \"$stock5\"\n$beverages2, Stocks Available is: \"$stock6\"\n$beverages3, Stocks Available is: \"$stock7\"\n$beverages4 Stocks Available is \"$stock8\"")

    }else if (choice == "NF" || choice == "nf"){
        println("Category: ($category3)\n")
        println("$nonfood1, Stocks Available is: \"$stock9\"\n$nonfood2, Stocks Available is: \"$stock10\"\n$nonfood3, Stocks Available is: \"$stock11\"\n$nonfood4 Stocks Available is \"$stock12\"")

    }else if (choice == "M" || choice == "m"){
        println("Category: ($category4)\n")
        println("$medicines1, Stocks Available is: \"$stock13\"\n$medicines2, Stocks Available is: \"$stock14\"\n$medicines3, Stocks Available is: \"$stock15\"\n$medicines4 Stocks Available is \"$stock16\"")
    }else{
        println("Invalid Keyword Input!")
    }

    while(condition){
        println("\nShould you wish to check again Type \"F\" for Food. Type \"B\" for Beverages. Type \"NF\" for Non Food. And lastly type \"M\" for Medicines.")
        println("Type \"No\" to exit.")
        var answer = readln()

        if(answer == "F"  || answer == "f"){

            println("Category: ($category1)\n")
            println("$food1, Stocks Available is: \"$stock1\"\n$food2, Stocks Available is: \"$stock2\"\n$food3, Stocks Available is: \"$stock3\"\n$food4 Stocks Available is \"$stock4\"")

        }else if (answer == "B" || answer == "b"){
            println("Category: ($category2)\n")
            println("$beverages1, Stocks Available is: \"$stock5\"\n$beverages2, Stocks Available is: \"$stock6\"\n$beverages3, Stocks Available is: \"$stock7\"\n$beverages4 Stocks Available is \"$stock8\"")

        }else if (answer == "NF" || answer == "nf"){
            println("Category: ($category3)\n")
            println("$nonfood1, Stocks Available is: \"$stock9\"\n$nonfood2, Stocks Available is: \"$stock10\"\n$nonfood3, Stocks Available is: \"$stock11\"\n$nonfood4 Stocks Available is \"$stock12\"")

        }else if (answer == "M" || answer == "m"){
            println("Category: ($category4)\n")
            println("$medicines1, Stocks Available is: \"$stock13\"\n$medicines2, Stocks Available is: \"$stock14\"\n$medicines3, Stocks Available is: \"$stock15\"\n$medicines4 Stocks Available is \"$stock16\"")
        }else if (answer == "No" || answer == "no"){
            println("Thank you and come again.")
            condition = false
        }else{
            println("Invalid Keyword.")
        }
    }



}
