import kotlin.random.Random as KRandom
import java.util.Random as JRandom

fun useDifferentRandomClasses(): String {
    return "Kotlin random: " +
             KRandom.nextInt(10) +
            " Java random:" +
             JRandom().nextInt(10) +
            "."
}

fun main(){
    println(useDifferentRandomClasses())
}

/*
Output

Kotlin random: 3 Java random:5.

 */