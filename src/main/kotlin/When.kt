fun main() {

    val number = 13
    val result = when(number){
        11->"Eleven"
        12->"Twelve"
        in 13..19->"Teen"
        else -> "Not found"
    }
    println(result)
}