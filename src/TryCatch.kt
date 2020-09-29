import java.io.FileWriter

fun main(args: Array<String>){
    try {
        var writer = FileWriter("hello.txt",true)
        writer.write("Hello Peach\n")
        writer.close()
    }catch (e: Exception){
        println("Error: $e")
    }finally {
        println("Write File Complete!!")
    }
}