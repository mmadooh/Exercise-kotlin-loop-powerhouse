fun main() {
    countUpwards(1, 5)

    countDownwards(5, 1)

    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println("\nSum: ${calculateSum(numbers)}")

    checkEvenOdd(10)

    println("\nFactorial: ${calculateFactorial(5)}")
}

fun countUpwards(start: Int, end: Int) {
    for (i in start..end) {
        print("$i ")
    }
}

fun countDownwards(end: Int, start: Int) {
    var i = end
    while (i >= start) {
        print("$i ")
        i--
    }
}

fun calculateSum(numbers: IntArray): Int {
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    return sum
}

fun checkEvenOdd(number: Int) {
    println("Even numbers:")
    for (i in 1..number) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
    println("\nOdd numbers:")
    for (i in 1..number) {
        if (i % 2 != 0) {
            print("$i ")
        }
    }
}

fun calculateFactorial(number: Int): Long {
    var factorial: Long = 1
    for (i in 1..number) {
        factorial *= i
    }
    return factorial
}