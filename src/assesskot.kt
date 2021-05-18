fun main() {
    allLists(books("Crime","Trevor",289))
    println(allLists(books("Crime","Trevor",289)))

}
data class books(val title:String,val Author:String,val pages:Int)
fun allLists(book: books){
    var alllist= mutableListOf<books>()
    when(listOf(book)){


    }
    println(alllist)



}
class Truck( registration:Int, totalWeight:Int,capacity:Int)
fun load(weight: Int){
    println(totalWeight+weight loaded)
}
fun unload(weight: Int){
    println(totalWeight-weight unloaded)
}
fun weightCheck(){
    println("The truck is overloaded by ${totalWeight}")
    println("The truck is underloaded by ${totalWeight}")
}
class Trailer(registration:Int, totalweight:Int,capacity:Int,wheel:Int)
fun load(weight: Int){
    println(totalWeight+weight loaded)
}
fun unload(weight: Int){
    println(totalWeight-weight unloaded)
}
fun weightcheck(){
    println("The weight distribution is ${totalWeight}")
    println("The parent functionality is ${totalWeight}")
}
fun sguares() {
    var x = 0
    while (x <= 3000) {

    }
    do {
        (x <= 3000)

    }
}




}


