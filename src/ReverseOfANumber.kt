fun main(args: Array<String>) {

    print("Enter a number more than one digit : ")

    var no = readLine()?.toInt()

    var rev = 0

    if (no?.toString()?.length!! < 2) {
        println("Cannot reverse a one digit number")
    } else {
        while(no!! > 0) {
            val r= no%10
            rev=rev*10+r
            no=no/ 10
        }

        println("Reverse of the number is $rev")
    }
}