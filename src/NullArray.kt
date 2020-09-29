fun main(args: Array<String>){
    val listWithNull: List<String?> = listOf("First", "Second", null)
    val listWithNotNull: List<String> = listWithNull.filterNotNull()
    for (item in listWithNotNull){
//        item?.let{println(item?.length)}
        println(item.length)
    }
}