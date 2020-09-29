import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args: Array<String>) {
    println("Hello what do you want?")
    println("1.Write file")
    println("2.Read file")
    println("3.Delete data")
    var choice = readLine()
    when(choice){
        "1" -> writeFile()
        "2" -> readFile()
        "3" -> clearData()
    }
}

fun writeFile(){

    try {
        var writer = FileWriter("hello.txt",true)
        print("Write your massages:")
        var input = readLine()
        writer.write("$input")
        writer.close()
    }catch (e: Exception){
        println("Error: $e")
    }finally {
        println("Write complete!")
    }
}

fun readFile(){
    var massage: List<String>? = null
    try{
        var reader = FileReader("hello.txt")
        massage = reader.readLines()
    }catch (e: Exception){
        println("Error: $e")
    }finally {
        if(massage != null){
            for (line in massage)
                println(line)
        }
        println("")
        println("Read complete!")
    }
}

fun clearData(){
    try {
        var writer = FileWriter("hello.txt")
        writer.write("")
        writer.close()
    }catch (e: Exception){
        println("Error: $e")
    }finally {
        println("Delete data complete!")
    }
}