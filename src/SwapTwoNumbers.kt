fun main(args: Array<String>) {

    // with 3 variables

    print("Enter value for a : ")

    var a = readLine()

    print("Enter value for b : ")

    var b = readLine()

    val c = a

    a = b

    b = c

    println("Values in a is " + a)
    println("Values in b is " + b)



    // with 2 numbers
    print("Enter value for x : ")

    var x = readLine()?.toInt()

    print("Enter value for y : ")

    var y = readLine()?.toInt()

    x = x!! + y!!
    y = x - y
    x = x - y

    println("Value of x is : $x ")
    println("Value of y is : $y ")

}