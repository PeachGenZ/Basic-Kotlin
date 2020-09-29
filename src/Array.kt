fun main(args: Array<String>) {
    var myArray = Array<String>(4){"a"}
//    println(myArray[0])

    myArray[0] = "H"
    myArray[1] = "e"
    myArray[2] = "l"
    myArray[3] = "o"

    for(item in myArray){
        print(item)
    }
    println("")
    for(item in 0..myArray.size-1){
        print(myArray[item])
    }
}