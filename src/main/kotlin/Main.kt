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

val myNumber = 4.5
if (myNumber >= 5) {
    println("The number is greater or equal to 5.")
} else if (myNumber >= 4) {
println("The number is greater than 4")
}else {
    println("The condition is false.")

}

}
