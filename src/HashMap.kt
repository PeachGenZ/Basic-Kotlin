fun main(args: Array<String>) {
    var myHashMap = HashMap<String, String>()
    myHashMap.put("handsome", "Peach")
    myHashMap.put("smart", "Ae")
    myHashMap.put("cute", "Sun")

    println(myHashMap.get("handsome"))
    println(myHashMap["cute"])

    for(key in myHashMap.keys){
        println("key: $key -> value:${myHashMap[key]}")
    }
    println(myHashMap.values)
}