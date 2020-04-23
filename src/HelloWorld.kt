import kotlin.math.max

/**
 * @author Champion97
 * @date 2020/04/23
 */

fun main() {

    var a = 1;
    // template
    val b = "a is $a"

    a = 2;
    val s1 = "${b.replace("is", "was")}, but now is $a"

    println(s1)

    println(maxOf(2, 1))
}


fun maxOf(a: Int, b: Int) = if (a > b) a else b