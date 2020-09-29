fun main(args: Array<String>) {
    var myArrayList = ArrayList<String>()
    myArrayList.add("Peach")
    myArrayList.add("Ae")
    myArrayList.add("Sun")

    println(myArrayList)
    myArrayList.remove("Ae")
    println(myArrayList.get(0))
    println(myArrayList[1])

    if(myArrayList.contains("Peach")){
        println("Smart")
    }
}