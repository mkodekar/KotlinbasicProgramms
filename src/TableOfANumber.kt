import Utils.into

fun main(args: Array<String>) {
    print("Enter a number : ")

    val no = readLine()?.toInt()

    var i = 1

    while (i <= 10) {
        val c = no!! into i
        println("$no x $i = $c" )
        i++
    }
}
