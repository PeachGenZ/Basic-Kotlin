import java.io.FileReader
import java.lang.Exception

fun main(args: Array<String>) {
    var message: List<String>? = null
    try {
        var reader = FileReader("hello.txt")
        message = reader.readLines()
    } catch (e: Exception){
        println("Error: $e")
    }
    if(message != null){
        for (line in message){
            println(line)
        }
    }
    println("Read Complete!")
}