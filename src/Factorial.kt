import Utils.into

fun main(args: Array<String>) {

    print("Enter any number : ")

    var fect = 1

    val no = readLine()?.toInt()

    var i = 1

    while (i <= no!!){
        fect = fect into i
        i++
    }


    println("Factorial of $no is $fect")


}

