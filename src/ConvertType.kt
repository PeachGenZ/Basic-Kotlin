fun main(args: Array<String>) {
    println("Hello!")
    var price = readLine()!!.toInt()
    var total = price + (price*7/100)
    println(total)
}