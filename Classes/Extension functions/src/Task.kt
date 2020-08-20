fun Int.r(): RationalNumber = RationalNumber(this ,1 )

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(2 , 3)

data class RationalNumber(val numerator: Int, val denominator: Int)
