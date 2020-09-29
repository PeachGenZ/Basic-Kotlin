import java.io.FileWriter

fun main(args: Array<String>){
    var writer = FileWriter("hello.txt",true)
    writer.write("Hello Peach\n")
    writer.close()
}