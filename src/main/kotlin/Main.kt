fun main(args: Array<String>) {

//    var X = 5
//    var Y = 3
//
//    println("X + Y =  ${X + Y}")
//    println("X * Y = ${X * Y}")
//    println("X - Y  = ${X - Y}")
//    println("X / Y  = ${X / Y}")
//    println("X / Y  = ${X % Y}")
//
//    println("3 + 3 * 4 = ${(3 + 3) * 4}")
//
//    var result = X + Y
//
//    result += 2
//println("result = $result")
//    result -= 2
//println("result = $result")
//
//    result *= 2
//println("result = $result")
//
//    result /= 2
//println("result = $result")
//
//    result %= 2
//println("result = $result")
//
//    X = 0
//
//println("X++ = ${X++}")
//println("++X = ${++X}")
//
//println("X-- = ${X--}")
//println("X-- = ${--X}")
//
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
//
//    val num1 = 5
//    val num2 = 4
//
//    val text = if (num1 >0 || num2 >0){
//        println("The condition is true")
//        "This is text 1"
//    }else{
//        println("The condition is false")
//        "This is text 2"
//    }
//    println("$text")
//
// //This gives you the same results as above but in a simplified version
//
//    val text = if (num1 >0 || num2 >0){
//        "This is text 1"
//    }else{
//        "This is text 2"
//    }
//    println("$text")
//
//if (num1 > 0 || num2 > 0) {
//    println("This condition is true")
//    println("This condition is true and some text")
//} else {
//    println("This condition is false")
//    println("This condition is false and some text")
//}

//var text: String? = "Name"
//    text = null
//    text = null
//    if (text != null) {
//        println(text.length)
//    } else {
//        println("The variable is null")
//    }
    //The above is equivalent to the below but in a shoter way.

//    println(text?.length)

//var text: String? = null

//text = "This variable is not null"
//val text2 :String = text?: "The variable is null."
//    println(text2)
//    println(text2)

    //The long way of doing This
//text = "This variable is not null."
//var text2 =""
//
//if (text !=null){
//    text2 = text
//}else {
//    text2 = "This variable is null."
//}
//    println(text2)

//=========Functions============================================================================================

//    sayHello("Isaac", 30)
//
//    val hasInternetConnection = true
//
//    if (hasInternetConnection) {
//        getData("Some data")
//    }else {
//        showMessage()
//}
//}
//fun sayHello(name: String, age: Int){
//    println("Hello, $name! Your age is $age")
//}
//fun getData(data: String){
//    println("Your data is: $data")
//}
//fun showMessage(){
//    println("There's no internet connection!")

//    val max =    getMax(5, 9)
//    println(max)
//}
//
//fun getMax(a: Int, b: Int): Int {
//    val max = if(a>b) a else b
//return max

// FUNCTION OVERLOADING

//    val max = getMax(5, 7, 10)
//    println(max)
//}
//fun getMax(a: Int, b: Int) = if (a > b) a else b
//
//fun getMax(a: Double, b: Double) = if (a > b) a else b
//
//fun getMax(a: Int, b: Int, c: Int): Int {
//    if (a > b && a >= c) {
//        return a
//    }else if (b >= a && b >= c) {
//        return b
//    }else{
//        return c
//    }

// Default Parameter
//    sendMessage("Hello", "Isaac")
//}
//fun sendMessage(name: String = "Hello", message: String = "User") {
//    println("$name, $message")
//}

// Explicit Arguments
//
//    sendMessage(
//        message = "and",
//        //name = "Isaac"
//    )
//
//}
//
//fun sendMessage(message: String = "Hello!", name: String = sendText()) {
//    println("Welcome: $message, $name")
//}
//
//fun sendText(): String {
//    return "greetings, Mr. Tumusiime"
//}

//vararg key word allows up to pass more parameters

//    println(sum(5,6,7,10,5,6,4,5,6,4,4,6,5))
//}
//
//fun sum(vararg numbers: Int):Int {
//    var result = 0
//    for(number in numbers) {
//        result += number
//    }
//    return result
//}

//    sum(1, 4, 6, 7, 8, 9, 5, 7, 6)
//}
//fun sum(vararg numbers: Int) {
//    numbers.forEach { println(it) }
//}

// ============  FOR LOOPS ====================================

//    for (i in 1..10){
//        println("i = $i")
//    }  /This prints all the numbers in the list

//for (i in 1 until 10){
//    println(i)
//} /This doesn't include the upper bound.

//    for (i in 10 downTo 1){
//        println(i) // This counts backwards
//    }

//    for (i in 1 until 10 step 2) {
//        println(i) //This skips a number and goes to the second after the previous step.
//    }

//for (i in 1..10){
//    println(i)
//}

// ===============WHILE LOOP===========================
//    var number = 0
//
//    while (number < 10){
//        println(number)
//        number++
//
//    }

    var number = 10

    do {
        println(number)
    } while (number <10)

}