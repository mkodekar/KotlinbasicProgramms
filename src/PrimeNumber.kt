fun main(args: Array<String>) {
    print("Enter any number : ")
    var no = readLine()?.toInt()

    if (no == 1) {
        println("Smallest prime number is 2")
    }

    var i = 2
    while (i < no!!) {
        if (no % i == 0) {
            println("Not Prime")
            break
        }
        i++
    }
    if (no == i) {
        println("Prime")
    }
}