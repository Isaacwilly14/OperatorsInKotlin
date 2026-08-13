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
}