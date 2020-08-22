fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return (date in first..last)
}

fun main(){
    val myDt = MyDate(1987 , 9 , 4)
    val firstDt = MyDate(1980 , 1 , 1)
    val secondDt = MyDate(2000 , 1 , 1)

    println("Is my date is in range? "+checkInRange(myDt , firstDt , secondDt))
}

/*
Output

Is my date is in range? true

 */