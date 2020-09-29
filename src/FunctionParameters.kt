var domain = "www.borntodev.com"
val pi = 3.14

fun main(args: Array<String>){
    var name: String = "Peach"
    println(sayHello(name))
    sayGoodBye(name)
}

fun sayHello(name: String) : String{
    var hello = "Hello $name"
    return hello
}

fun sayGoodBye(name: String){ //return Unit
    println("$domain Bye Bye! $name")
}