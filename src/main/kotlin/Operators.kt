fun main() {
    var num1 = 13
    var num2 = 2
    //Arithmetic operators
    println("Add :${num1+num2}")
    println("Subtract :${num1-num2}")
    println("Multiplication :${num1*num2}")
    println("Division :${num1.toFloat()/num2}")
    println("Modulus :${num1%num2}")
    //Relational operators
    println("Greater Than :${num1>num2}")//13>2 true
    println("Smaller Than :${num1<num2}")//13<2 false
    println("Greater than equal to :${num1>=num2}")//13>=2 true
    println("Smaller than equal to :${num1<=num2}")//13<=2 false
    println("Equal to :${num1==num2}")//13==2 false
    println("Not equal to :${num1!=num2}")//13!=2 true
    //Pre increment and post increment
    var i = 10
    println(i++ + ++i)//10+12=22
    //Logical operators
    //&& AND
    var j = 10
    var k = 11
    println(j==10 && k==11)//true both condition true
    println(j==11 && k==11)//false both condition should be true
    // || OR
    println(j==11 || k==11)//true any one condition should be true
    // ! NOT
    println(j!=10)// false change the value from true to false

    // short-circuiting
    var result = j==11 || k++==12
    println(j)//10
    println(k)//11 first condition is true. That's why compiler don,t increment the k value

}