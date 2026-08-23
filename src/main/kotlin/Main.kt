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
//
//var text: String? = "Name"
//    text = null
//    text = null
//    if (text != null) {
//        println(text.length)
//    } else {
//        println("The variable is null")
//    }
//    The above is equivalent to the below but in a shoter way.
//
//    println(text?.length)
//
//var text: String? = null
//
//text = "This variable is not null"
//val text2 :String = text?: "The variable is null."
//    println(text2)
//    println(text2)
//
//    The long way of doing This
//text = "This variable is not null."
//var text2 =""
//
//if (text !=null){
//    text2 = text
//}else {
//    text2 = "This variable is null."
//}
//    println(text2)
//
//=========Functions============================================================================================
//
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
//
//    val max =    getMax(5, 9)
//    println(max)
//}
//
//fun getMax(a: Int, b: Int): Int {
//    val max = if(a>b) a else b
//return max
//
// FUNCTION OVERLOADING
//
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
//
// Default Parameter
//    sendMessage("Hello", "Isaac")
//}
//fun sendMessage(name: String = "Hello", message: String = "User") {
//    println("$name, $message")
//}
//
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
//
//vararg key word allows up to pass more parameters
//
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
//
//    sum(1, 4, 6, 7, 8, 9, 5, 7, 6)
//}
//fun sum(vararg numbers: Int) {
//    numbers.forEach { println(it) }
//}
//
// ============  FOR LOOPS ====================================
//
//    for (i in 1..10){
//        println("i = $i")
//    }  /This prints all the numbers in the list
//
//for (i in 1 until 10){
//    println(i)
//} /This doesn't include the upper bound.
//
//    for (i in 10 downTo 1){
//        println(i) // This counts backwards
//    }
//
//    for (i in 1 until 10 step 2) {
//        println(i) //This skips a number and goes to the second after the previous step.
//    }
//
//for (i in 1..10){
//    println(i)
//}
//
// ===============WHILE LOOP===========================
//    var number = 0
//
//    while (number < 10){
//        println(number)
//        number++
//
//    }
//
//    var number = 10
//
//    do {
//        println(number)
//    } while (number <10)
//
//================CONTINUE AND BREAK KEYWORDS IN LOOPS================================
//    var number = 0
//
//    while (number < 10) {
//        number++
//        if (number >2 && number <8) {
//            continue
//    }
//    println(number)
//
// ========RANGE IN LOOPS===============================================================
//    var number = 0
//
//    while (number < 10) {
//        number++
//
//        if (number in 3..7){
//            continue
//        }
//        println(number)
//    }
//
//var number = 0
//
//while (number < 10) {
//    number++
//
//    if (number == 7) {
//        break
//    }
//    println(number)
//    }
//    for (i in 0..10){
//        if (i in 3..8){
//            continue
//        }
//        println(i)
//    }
//===INNER LOOP========
//var number = 0
//
//while (number < 5) {
//    number++
//    println(number)
//
//    var i = 0
//
//    while (i < 5) {
//        i++
//        println("***$i")
//    }
//}
//
// ================================CHALLENGE===================== FINDING EVEN NUMBER
//
//    var number = 1
//    val lastNumber = 20
//   var evenNumberCounter = 0
//
//    while (number <= lastNumber) {
//        number++
//
//    if (!isEvenNumber(number)) {
//        continue
//    }
//    evenNumberCounter++
//        print(number)
//    }
//
//    println(" Now we're looping using the FOR loop")
//    evenNumberCounter = 0
//    for (i in 1..20) {
//        if (i % 2 == 0) {
//            continue
//        }
//        evenNumberCounter++
//        print(i)
//    }
//    println(" Total number of even numbers found = $evenNumberCounter")
//    println("Total number of even numbers found - using for loop - are $evenNumberCounter")
//}
//fun isEvenNumber(number: Int): Boolean {
//    if ((number % 2) == 0) {
//        return true
//    }else {
//        return false  //Is possible Complete the challenge without using a function.
//}
//
//==========================ARRAYS===================================================================
//
//    val names = arrayOf("John", "Peter", "Isaac","Megan")
//    val mixedElements = arrayOf<Any>(4, 5, 6, 7, 4, "Name 1", "a")
//
//    names[0] = "Isaac"
//    println("The First element on a list is ${names[0]}")
//    println("The size of array is ${names.size}")
//
////    for (name in names) {
////        println(name)
////    }
//    for (i in mixedElements) {
//        if (i is Int) {
//            println(i)
//        }
//    }
//
//======================CHALLENGE TWO======================================================
//    val max = findMax(arrayOf(4,6,7,4,3,6))
//    val min = findMin(arrayOf(4,7,9,20,7,100))
//    println("Max value is $max")
//    println("Min value is $min")
//
//}
//fun findMax(numbers: Array<Int>): Int {
//    var max = numbers[0]
//
//    for (number in numbers) {
//        if (number > max) {
//            max = number
//        }
//    }
//    return max
//}
//
//fun findMin(numbers: Array<Int>): Int {
//    var min = numbers[0]
//
//    for (number in numbers) {
//        if (number < min) {
//            min = number
//        }
//    }
//    return min
//
//Combining Numbers
//
//    val max = findMinAndMax(arrayOf(20,40,50,60,100), true)
//    val min = findMinAndMax(arrayOf(20,40,50,60,100), false)
//    println("The max value is = $max")
//    println("The min value is = $min")
//}
//
//fun findMinAndMax(numbers: Array<Int>,searchMax: Boolean): Int {
//    var max :Int = numbers[0]
//    var min :Int = max
//    if (searchMax) {
//        for (number in numbers) {
//            if (number > max) {
//                max = number
//            }
//        }
//        return max
//    }else {
//    for (number in numbers){
//        if (number < min) {
//        min = number
//        }
//    }
//        return min
//    }
//
//=======================OBJECT ORIENTED PROGRAMMING==================================================================
//    var car1 = Car()
//    car1.name = "Tesla"
//    car1.model = "S Plaid"
//    car1.color = "Red"
//    car1.doors = 4
//
//    println("Name = ${car1.name}")
//    println("Model = ${car1.model}")
//    println("Color = ${car1.color}")
//    println("Doors = ${car1.doors}")
//
//    car1.move()
//    car1.stop()
//
//    val car2 = Car()
//    car2.name = "Ford"
//    car2.model = "Mustang"
//    car2.color = "Blue"
//    car2.doors = 2
//
//    println("This is the output for the car2\n")
//    println("\n")
//    println("Name = ${car2.name}")
//    println("Model = ${car2.model}")
//    println("Color = ${car2.color}")
//    println("Doors = ${car2.doors}")
//
//    car2.move()
//    car2.stop()
//}
//
//class Car {
//    var name = ""
//    var model = ""
//    var color = ""
//    var doors = 0
//
//    fun move(){
//        println("The car $name is moving")
//    }
//    fun stop(){
//        println("The car $name is stopped")
//    }
//
//===========================================CONSTRUCTOR==============================================================
//    var car1 = Car("Tesla", "S Plaid", "Red", 4)
//
//    println("Name = ${car1.name}")
//    println("Model = ${car1.model}")
//    println("Color = ${car1.color}")
//    println("Doors = ${car1.doors}")
//
//    car1.move()
//    car1.stop()
//
//    val car2 = Car("Tesla", "Mustang", "Blue", 2)
//
//    println("This is the output for the car2\n")
//    println("\n")
//    println("Name = ${car2.name}")
//    println("Model = ${car2.model}")
//    println("Color = ${car2.color}")
//    println("Doors = ${car2.doors}")
//
//    car2.move()
//    car2.stop()
//}
//
//class Car(var name: String, var model: String, var color: String, var doors: Int) {
//
//    fun move(){
//        println("The car $name is moving")
//    }
//    fun stop(){
//        println("The car $name is stopped")
//    }
//=========================INITIALIZER BLOCKS==========================================================================
//
//    var car1 = Car("  Tesla  ", "S Plaid", "Red", 4)
//
//    println("Name = ${car1.name}")
//    println("Model = ${car1.model}")
//    println("Color = ${car1.color}")
//    println("Doors = ${car1.doors}")
//
//    car1.move()
//    car1.stop()
//
//    val car2 = Car("Tesla", "Mustang", "Blue", 2)
//
//    println("This is the output for the car2\n")
//    println("\n")
//    println("Name = ${car2.name}")
//    println("Model = ${car2.model}")
//    println("Color = ${car2.color}")
//    println("Doors = ${car2.doors}")
//
//    car2.move()
//    car2.stop()
//}
//
//class Car(name: String, var model: String, var color: String, var doors: Int) {
//        var name = name.trim()
//    fun move(){
//        println("The car $name is moving")
//    }
//    fun stop(){
//        println("The car $name is stopped")
//    }
//
//
//} =====================This has been transfer to different Class file================================================
//
//===========================Another Class Still in initializer Blocks (PRIMARY CONSTRUCTORS===========================
//    val user = User("Isaac", "Tumusiime", 31)
//    val friend = User("Ivan","Sonko", 43)
//
//    println("Name: ${friend.name}")
//
//}
//
//class User(name: String, var lastName: String, var age: Int){
//    // name changed to parameter
//    var name: String
//
//    init {
//        if (name.lowercase().startsWith("i")) {
//            this.name = name
//        } else {
//            this.name = "User"
//            println("The name doesn't start with 'i' or 'I'")
//        }
//    }
//
//=========================SECONDARY CONSTRUCTORS (Multiple Constructors==============================================
//
//    val user = User("Isaac")
//    val friend = User("John", "Lwanga")
//
//    println("Name = ${user.name}")
//    println("Last Name = ${user.LastName}")
//    println("Age = ${user.age}")
//
//    println("\n")
//
//    println("Name = ${friend.name}")
//    println("Last Name = ${friend.LastName}")
//    println("Age = ${friend.age}")
//}
//class User(var name: String, var LastName: String, var age: Int) {
//
//    constructor(name: String): this(name, "LastName", 0){
//        //Note you can add something in the calibres if you want.
//        println("2nd")
//    }
//
//    constructor(name: String, LastName: String): this(name, LastName, 0){
//        println("3rd")
//    }
//
//======================DEFAULT VALUES FOR THE PROPERTIES=============================================================
//    val user = User("Isaac")
//    val friend = User(firstName="John", lastName = "Lwanga") //You can Explicitly provide the default values directly
//    val user2 = User(age = 19, firstName = "Jane", lastName = "Babirye") // The order of passing values doesn't matter
//
//    println("Name = ${user.firstName}")
//    println("Last Name = ${user.lastName}")
//    println("Age = ${user.age}")
//
//    println("\n")
//
//    println("Name = ${friend.firstName}")
//    println("Last Name = ${friend.lastName}")
//    println("Age = ${friend.age}")
//}
//
//class User(var firstName: String, var lastName: String = "LastName", var age: Int = 0) {
//
//=====GETTERS AND SETTERS==They're used in Encapsulation==================================They're Implicitly Declared
//        val user = User("Isaac")
//    val friend = User(firstName="John", lastName = "Lwanga") //You can Explicitly provide the default values directly
//    val user2 = User(age = 19, firstName = "Jane", lastName = "Babirye") // The order of passing values doesn't matter
//    user.firstName = "Vlad"
//
//    println("Name = ${user.firstName}")
//    println("Last Name = ${user.lastName}")
//    println("Age = ${user.age}")
//
//    println("\n")
//
//    println("Name = ${friend.firstName}")
//    println("Last Name = ${friend.lastName}")
//    println("Age = ${friend.age}")
//}
//
//class User(firstName: String, var lastName: String = "LastName", var age: Int = 0) {
//    var firstName: String = firstName
//    get() {
//        return "firstName $field"
//    }
//    set(value) {
//        println("$value was assigned to firstName property)")
//        field = value // field is used to avoid recursive call.
//    }
//    fun setFirstName(newValue: String) {
//        this.firstName = newValue  // ====Equivalent of getter=====================
//    }
//    fun getFirstName(): String {
//        return this.firstName  // Similar to having 2 functions but because of conciseness, no need.
//    }
//
//========================lateinit KEYWORD=============================================================================
//
//    val user = User("Isaac", "Tumusiime", 31)
//
//    user.favoriteMovie = "Interstellar"
//
//    println(user.favoriteMovie)
//
// //In case you choose not to define it. Brings and error.Allows you to see an error
//}
//
//class User(var firstName: String, var lastName: String, var age: Int) {
//    lateinit var favoriteMovie: String
//
//
//=====COMPANION OBJECT Allows you not to create an object every time you need, it creates an easy way=============
//
//    val calculator = Calculator()
//    val result = calculator.sum(5, 10)
//    println(result)
//}
//
//class Calculator() {
//    fun sum(a: Int, b: Int): Int {
//        return a + b
//    }
//}  Before companion Object
//
//=================After Companion Object======================================================================
//
//   val result = Calculator.sum(5, 10)
//    println(result)
//
//}
//
//class Calculator() {
//    companion object {
//        fun sum(a: Int, b: Int): Int {
//            return a + b
//    }
//
//    }

//=============== A single

    val instance :Database? = Database.getInstance()
    println(instance)
}
class Database private constructor() {

    companion object {
        private var instance: Database? = null

        fun getInstance(): Database? {
            if (instance == null) {
                instance = Database()
            }

            return instance
        }
    }
}


