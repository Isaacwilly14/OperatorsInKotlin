fun main() {

    var X = 5
    var Y = 3

    println("X + Y =  ${X + Y}")
    println("X * Y = ${X * Y}")
    println("X - Y  = ${X - Y}")
    println("X / Y  = ${X / Y}")
    println("X / Y  = ${X % Y}")

    println("3 + 3 * 4 = ${(3 + 3) * 4}")

    var result = X + Y

    result += 2
println("result = $result")
    result -= 2
println("result = $result")

    result *= 2
println("result = $result")

    result /= 2
println("result = $result")

    result %= 2
println("result = $result")

    X = 0

println("X++ = ${X++}")
println("++X = ${++X}")

println("X-- = ${X--}")
println("X-- = ${--X}")

//val isActive = true
//val score = 100
//val internetSpeed = 4000
//
//if (isActive && score == 100 && internetSpeed == 5000) {
//    println("You're at the next level.")
//} else {
//println("You're at the same level.")
//
//}

    val num1 = 5
    val num2 = 4

//    val text = if (num1 >0 || num2 >0){
//        println("The condition is true")
//        "This is text 1"
//    }else{
//        println("The condition is false")
//        "This is text 2"
//    }
//    println("$text")

 //This gives you the same results as above but in a simplified version

//    val text = if (num1 >0 || num2 >0){
//        "This is text 1"
//    }else{
//        "This is text 2"
//    }
//    println("$text")

if (num1 > 0 || num2 > 0) {
    println("This condition is true")
    println("This condition is true and some text")
} else {
    println("This condition is false")
    println("This condition is false and some text")
}
}
