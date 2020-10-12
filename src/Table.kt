fun Table(N: Int) {
    for (i in 1..10) {
        println("$N * $i = ${N * i}")
    }
}

fun main() {
    println("Enter the Number To Print Table")
    val N = readLine().toString().toInt()
    Table(N)
}