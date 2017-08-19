fun main(args: Array<String>) {

    print("Please enter a number : ")

    val number: Int? = readLine()?.toInt()!!

    if (number!! % 2 != 0) println("$number is even") else println("$number is odd")
}