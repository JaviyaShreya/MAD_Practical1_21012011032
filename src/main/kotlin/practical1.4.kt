fun main(){
    println("210120111032 || Javiya Shreya")
    print("Enter a Number:")
    val num = readLine()?.toInt()
    if (num != null)
        if (num % 2==0 )
            println("$num is Even")
    else
        println("$num is Odd")
    else
        println("Input is Invalid")

}