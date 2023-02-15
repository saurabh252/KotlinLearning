fun main() {
    //Upper bound included
    for(i in 1..10){
        println(i)
    }
    //Upper bound not included
    for(i in 1 until 10){
        println(i)
    }
    //Decrement loop
    for(i in 10 downTo 1){
        println(i)
    }
    //String templating
    val number = 2
    for (i in 1..10){
        println("$number x $i = ${number * i}")
    }
}