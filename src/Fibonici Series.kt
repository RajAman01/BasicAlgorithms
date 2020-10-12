fun fib(N: Int): MutableList<Int> {

    val list = mutableListOf(0)
    var a: Int = 1
    var b: Int = 0
    var c: Int = 0
    for (i in 0..N) {
        if (i == 0) {
            list.add(0)
        }
        c = a + b
        list.add(c)
        b = a
        a = c


    }
    return list
}

fun main() {
    println("Enter the Number to Print The fibonacci series")
    val N = readLine().toString().toInt()
    println("fibonacci series is ${fib(N)}")
}
