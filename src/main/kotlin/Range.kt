fun main() {
    val number = 5
    var result = number in 1..5//upper bound included(5)
    println(result)//true
    var result1 = number in 1 until 5;//upper bound not included
    println(result1)//false

}