data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
override fun compareTo(second: MyDate)
    =when {
    year != second.year -> year - second.year
    month != second.month -> month - second.month
    else -> dayOfMonth - second.dayOfMonth


}
    }

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
fun main(){
    val d2 = MyDate(1990 , 9 , 4)
    val d1 = MyDate(2020 , 8 , 20)
    test(d1,d2)
}

/*
Output

false
 */