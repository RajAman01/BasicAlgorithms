fun fact(N: Int): Long {
    return if (N == 1 || N == 0) {
        N.toLong()
    } else {
        N * fact(N - 1)
    }
}

fun main() {
    println("Give Input to print Factorial")
    val N = readLine().toString().toInt()
    println("Factorial Of The Number Is ${fact(N)}")
}