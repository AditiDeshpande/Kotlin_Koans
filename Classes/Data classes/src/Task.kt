data class Person(val name: String , val age: Int){

}

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun comparePeople(): Boolean {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)
    return p1 == p2  // should be true
}

fun main(){
    println(getPeople().toString())
    println("p1 and p2 are same? Ans: " + comparePeople())
}

/*
Output
[Person(name=Alice, age=29), Person(name=Bob, age=31)]
p1 and p2 are same? Ans: true
 */