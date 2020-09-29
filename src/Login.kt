fun main(args: Array<String>){
    var isCorrect = false

    do{
        println("--- Login ---")
        print("Username : ")
        var userName = readLine()
        print("Password : ")
        var password = readLine()
        if(userName == "admin" && password == "admin123"){
            isCorrect = true
        }
        else{
            println("Wrong! Please re-enter your username and password")
        }
    }while (isCorrect != true)
    println("Success")
}