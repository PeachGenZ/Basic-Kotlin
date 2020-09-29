fun main(args: Array<String>){
    var number = 15

    when(number){ //ใช้ได้กับตัวแปรที่ fix type เท่านั้น
        17 -> println("Too low")
        18 -> {
            println("Yeah!!")
        }
        19 -> println("Too High")
        else -> println("Don't Know")
    }
}