fun main(){
    print("Enter the month Number")
    val MonthNumber= readLine()?.toInt()
    val Monthname=when(MonthNumber){
        1 ->"January"
        2 ->"Febuary"
    }
}