//fun main(args: Array<String>) {

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

//=============== A single Return

    //    val instance :Database? = Database.getInstance()
//    println(instance)
//}
//class Database private constructor() {
//
//    companion object {
//        private var instance: Database? = null
//
//        fun getInstance(): Database? {
//            if (instance == null) {
//                instance = Database()
//            }
//
//            return instance
//        }
//    }
//}
// Now Using the Object Keyword (The shorter way.
//println(Database)
//
//}
//    object Database {
//        init{
//            println("Creating Database")
//    }

//====================================LAZY INITIALIZATION==========================================================
//    val user1 = User("Isaac", "Tumusiime", 32)
//    val user2 by lazy {
//        User("User1","lastName", 0 )
//    }
//
//    println(user2.firstName)
//}
//
//class User(var firstName: String, var lastName: String, var age: Int) {
//    init{
//        println("User: $firstName was created")
//    }
//    }

//============ENUM CLASSES

//    println(Direction.WEST)
//    println(Direction.EAST)
//    println(Direction.NORTH)
//    println(Direction.SOUTH)
//}
//enum class Direction {
//    NORTH,
//    SOUTH, //All should be in uppercase
//    EAST,
//    WEST

//USING CONSTRUCTOR==============================================================================

//=====================LOOPING THROUGH OUR ENUMS==================================================
//    for (direction in Direction.values()) {
//    println("$direction")
//    }

//==============ACCESSING THE ARGUMENTS PASSED IN THE EMUNS
//    println(Direction.NORTH.direction)
//    println(Direction.NORTH.distance)
//    println(Direction.NORTH.name)
//
//    Direction.WEST.printData()

// USING "WHEN" IN ENUMS

    //val direction = Direction.EAST
    //When value is from the Database or user input it is advisable to use the Direction.value like below

//    val direction = Direction.valueOf("east".uppercase())
//
//    when (direction) {
//        Direction.EAST -> println("The direction is East")
//        Direction.WEST -> println("The direction is West")
//        Direction.NORTH -> println("The direction is North")
//        Direction.SOUTH -> println("The direction is South")
//    }
//}
//
//enum class Direction(var direction: String, var distance: Int) {
//    NORTH("north", 10),
//    SOUTH("south", 20), //All should be in uppercase
//    EAST("east", 15),
//    WEST("west", 40); //Need to provide a semicolon to last element when using a function
//
//    fun printData() {
//        println("Direction = $distance and Distance = $direction")
//    }

//==================================== INNER CLASSES ===============================================================
//    val listView = ListView(arrayOf("Name 1", "Name 2", "Name 3", "Name 4"))
//
//    listView.ListViewItem().displayItem(2)
//}
//
//class ListView(val items: Array<String>) {
//
//    inner class ListViewItem() {
//
//        fun displayItem(position: Int) {
//            println(items[position])
//        }
//    }

//===================================CHALLENGE======================================================================

//package com.example.main
//
//fun main() {
//    val isaacAccount = Account("Isaac")
//    isaacAccount.deposit(1000)
//    isaacAccount.withdraw(500)
//    isaacAccount.deposit(-20)
//    isaacAccount.withdraw(-100)
//
//    val balance = isaacAccount.calculateBalance()
//    println("Balance is $balance")
//}
//
//class Account(val accountName: String) {
//    var balance = 0
//    var transactions = mutableListOf<Int>()
//
//    fun deposit(amount: Int) {
//        if (amount > 0) {
//            transactions.add(amount)
//            balance += amount
//            println("$amount Deposited. Balance is now ${this.balance}")
//        } else {
//            println("Cannot deposit negative sums")
//        }
//    }
//    fun withdraw(withdrawal: Int) {
//        if (-withdrawal < 0) {
//            transactions.add(-withdrawal)
//            this.balance += -withdrawal
//            println("$withdrawal. Withdrawn. Balance is now ${this.balance}")
//        } else {
//            println("Cannot withdraw negative sums")
//        }
//    }
//
//    fun calculateBalance(): Int{
//        this.balance = 0
//        for (transaction in transactions){
//            this.balance += transaction
//        }
//        return this.balance
//    }
//====================================INHERITANCE================================================================

//fun main(args: Array<String>) {
//   val car = Car("BMW", "RED", 1, 4)
//   val plane = Plane("Boeing", "WHITE and BLUE", 4, 4)
//
//    car.move()
//    car.stop()
//
//    plane.move()
//    plane.stop()
//
//}
//
//open class Vehicle(val name: String, val color: String){
//   open fun move() { //OVERRIDING THE METHOD MARK WITH OPEN
//        println("$name is moving")
//    }
//
//    open fun stop() {
//        println("$name is stopped")
//    }
//}
//
//class Car(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {
//
//
//}
//
//class Plane(name: String, color: String, val engines: Int, val doors: Int):Vehicle(name, color) {
//
//    override fun move() {
//        flying()
//        super.move()
//    }
//
//    fun flying() {
//        println("The plane is flying")
//    }
//
//}

//=================================SEALED CLASSES===========================================================

//fun main(){
//    val success = Result.Success("SUCCESS!")
//    val error = Result.Error("FAILED!")
//    val progress = Result.Progress("PROGRESS!")
//
//    getData(progress)
//
//}
//fun getData(result: Result) {
//    when(result) {
//        is Result.Error -> result.showMessage()
//        is Result.Success -> result.showMessage()
//        is Result.Progress -> result.showMessage()
//
//    }
//
//}
//
//sealed class Result (val message: String){
//    fun showMessage(){
//        println("Result: $message")
//    }
//    class Success(message: String) : Result(message) //INHERITING
//    class Error(message: String) : Result(message)
//    class Progress(message: String) : Result(message)
//}

//========================================ABSTRACT CLASSES================================================

//fun main(args: Array<String>) {
//
//
//}
//
//abstract class Vehicle {
//
//    abstract fun move()
//
//    abstract fun stop()
//}
//
//class Car(var name: String, var color: String, val engines: Int, val doors: Int): Vehicle() {
//
//    override fun move() {
//
//    }
//    override fun stop() {
//        //They're similar to interfaces. To research more about Interfaces.
//    }  //Abstract classes are used in cases when you want to return the data from the database with API
//}       //but don't want to provide the code the API does the hard work and others, to research more.

//==================DATA CLASSES=======================================================================

//fun main(args: Array<String>) {
////    val name1 = "Isaac"
////    val name2 = "Isaac"  //Structural Equality   //Referential Equality
////
////    println(name1 == name2)
//
//    val user1 = User("Isaac", "Tumusiime", 31)
//    val user2 = User("Isaac", "Tumusiime", 31)
//
//    println(user1 == user2)
////    println(user1.equals(user2)) //Similar to the above.
//}
//
//class User(var firstName: String, var lastName: String, var age: Int ) {
//// data : You can just use data keyword and eliminate other code
//    override fun equals(other: Any?): Boolean {
//        if (this === other) {
//            return true
//        }
//        if (other is User) {
//
//            return this.firstName == other.firstName
//                    && this.lastName == other.lastName
//                    && this.age == other.age
//        }
//
//        return false
//    }
//
//    override fun hashCode(): Int {
//        return 0  //You can implement this for code performance if you want. If you override equal.
//    }
//}

//==================================INTERFACES===================================================================

//fun main (args: Array<String>) {
//
//
//}
//
//interface Engine{
//    fun startEngine()
//}
//
//class Car(val name: String, val color: String): Engine{
//    override fun startEngine() {
//        println("The Car is starting the Engine")
//    }
//}
//
//class Truck(val name: String, val color: String): Engine{
//    override fun startEngine() {
//        println("The Truck is starting the Engine")
//    }
//}
//
//class Plane(val name: String, val color: String): Engine{
//    override fun startEngine() {
//        println("The Plane is starting the Engine")
//    }
//}
//
//class Tesla(val name: String, val color: String): Engine{
//    override fun startEngine() {
//        println("Tesla is starting the Engine")
//    }
//}

//==========OBJECT EXPRESSION============ANONYMOUS CLASS/OBJECTS================

//fun main(args: Array<String>) {
//
//   val loginButton = Button("Login", 1232,object : OnClickListener {
//       override fun onClick() {
//          // Login the user
//       }
//   })
//    val signUpButton = Button("Sign Up", 1232,object : OnClickListener {
//        override fun onClick() {
//            // Sign up the user
//        }
//
//    })
//}
//class Button(val text: String, val id: Int, onClickListener: OnClickListener)
//
//class ClickListener() : OnClickListener {
//    override fun onClick() {
//
//    }
//}
//interface OnClickListener {
//    fun onClick()
//}

//===========================DELEGATION========================================================================
//fun main(args: Array<String>) {
//
//
//}
//
//class App : A by FirstDelegate(), B by SecondDelegate() {
//    override fun print() {
//
//    }
//
//    override fun print2() {
//
//    }
//}
//
//interface A {
//    fun print()
//}
//
//interface B {
//    fun print2()
//}
//
//open class FirstDelegate : A {
//    override fun print() {
//
//    }
//}
//
//open class SecondDelegate : B {
//    override fun print2() {
//
//    }
//}

//=================================DELEGATION WITH PROPERTIES=======================================================

//fun main() {
//
//    val user = User()
//
//    with(user) {
//        firstName = "Isaac"
//        lastName = "Tumusiime"
//    }
//
//    with(user) {
//        println(firstName)
//        println(lastName)
//    }
//}
//
//class User {
//    var firstName: String by FormatDelegate()
//    var lastName: String by FormatDelegate()
//}
//
//class FormatDelegate : ReadWriteProperty<Any?, String> {
//
//    private var formattedString: String = ""
//
//    override fun getValue(
//        thisRef: Any?,
//        property: KProperty<*>
//    ): String {
//        return formattedString
//    }
//
//    override fun setValue(
//        thisRef: Any?,
//        property: KProperty<*>,
//        value: String
//    ) {
//        formattedString = value.lowercase()
//    }
//}

//=====================COLLECTIONS==========================================================

//=====Group Of Objects Store together in the same variable.

//fun main(args: Array<String>) {
//
//    val names = listOf<String>("Name 1", "Name 2", "Name 3") //Imutable list.
//
//    println(names[0])
//
//}

//fun main(args: Array<String>) {
//
//    val names = mutableListOf<String>("Name 1", "Name 2", "Name 3","Name 1") //Mutable list.
//
//    names.add("Name 4")
//    names.removeAt(1)
//    names.remove("Name 3")
//
//    names.forEach {println(it)}
//}

//fun main(args: Array<String>) {
//
//    val names = setOf<String>("Name 1", "Name 2", "Name 3","Name 1") //Set. Immutable
//
//
//    names.forEach {println(it)}
//}

//fun main(args: Array<String>) {
//    val user1 = User("Name1")
//    val user2 = User("Name2")
//    val user3 = User("Name3")
//    val user4 = User("Name4")
//    val user5 = User("Name5")
//    val user6 = User("Isaac")
//    val user7 = User("Isaac")
//
//    val names = mutableSetOf(user1, user2, user3, user4, user5, user6, user7) //Set. Mutable
//
//
//    names.forEach {println(it.name)}
//}
//data class User (val name: String) { // data removes duplicates
//
//}

//=============================MAPS======================== To store Key value Pairs.

//fun main (args: Array<String>) {
//    val users = mapOf<Int, String>(1 to "Isaac", 2 to "John", 3 to "Doe") //Immutable
//
//    println(users[2])
//
//}

//fun main (args: Array<String>) {
//    val users = mutableMapOf<Int, String>(1 to "Isaac", 2 to "John", 3 to "Doe") //Keys you
//    users[5] = "Vladimir"
//    users.remove(2)
//    users.forEach { t, u -> //You can have duplicates, you can add or remove elements
//        println("$t and $u")
//
//    }
//}

//============Flatten Function
//fun main() {
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.associateWith{it.length})
//    println(numbers.associateBy { it.first().uppercase()})
//    println(numbers.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))
//
//    //Flatten
//    val numbersSets = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
//    println(numbersSets[2][2])
//}
//===========================================================================================================
//fun main() {
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.associateWith{it.length})
//    println(numbers.associateBy { it.first().uppercase()})
//    println(numbers.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))
//
//    //Flatten
//    val numbersSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
////  for (numbers in numbersSets) {
////      for (number in numbers){
////          println(number)
////      }
////      println("\n")
////  }
//    //Combining it to a single array
//    val numbersFlatten = numbersSets.flatten()
//   // println(numbersFlatten[8])
//    //Looping through 1 Dimension Array
//    for (number in numbersFlatten){
//        println(number)
//    }
//}

//==================STRING REPRESENTATION==========================================================
//fun main(args: Array<String>) {
//    val numbersStrings = listOf("one","two","three","four","five","six")
//    println(numbersStrings)
//    println(numbersStrings.joinToString())
//
//    val listString = StringBuffer("The list of numbers: ")
//    println(numbersStrings.joinTo(listString))
//
//    println(numbersStrings.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))
//
//    val numbers = (1 .. 100).toList()
//    println(numbers.joinToString(limit = 15, truncated = "<...>"))
//
//    println(numbersStrings.joinToString{ "Element: ${it.uppercase()}"})
//}

//================================FILTERING=====================================================================
//fun main(){
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    val longerThan3 = numbers.filter{it.length > 3}
//    println(longerThan3)
//
//    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 101" to 101)
//    val filteredMap = numbersMap.filter { it.key.endsWith( "1") && it.value > 100}
//    println(filteredMap)
//
//    val filteredIdx = numbers.filterIndexed {index, value -> (index !=0) && (value.length < 5) }
//    val filteredNot = numbers.filterNot { it.length <=3 }
//    println(filteredIdx)
//    println(filteredNot)
//
//    val mixedList = listOf(1, 2, 3, 'A', 'B', 'C', "Hello World", "Isaac", false)
//    mixedList.filterIsInstance<Char>().forEach {
//        println(it)
//    }
//
//    //================================= Partition
//    println("\n")
//
//    val (match, rest) = numbers.partition { it.length > 3 }
//    println(match)
//    println(rest)
//
//    //====================TESTING PREDICATES
//    println(numbers.any {it.endsWith("e")})
//    println(numbers.none { it.endsWith("w")})
//    println(numbers.all {it.length > 1})
//}


//==================================== + AND - OPERATORS =============================================================
//fun main(args: Array<String>) {
//    val numbers = mutableListOf("one", "two", "three", "four", "five")
//    val plusList = numbers + "six"
//    val minusList = numbers  - mutableListOf("three","four")
//    println(plusList)
//    println(minusList)

//==================================GROUPING==================================================================
//fun main(args: Array<String>) {
//    val numbers = listOf("one", "two", "three", "four", "five")
//    println(numbers.groupBy { it.first().uppercase() })
//    println(numbers.groupBy (keySelector = { it.first()}, valueTransform = { it.uppercase() }))
//}

//===============RETRIEVING COLLECTION PADS================================================================

//fun main (args: Array<String>) {
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.slice(0..3 ))
//    println(numbers.slice(0..4 step 2))
//    println(numbers.slice(setOf(3, 5, 0)))
//}

//=========================TAKE AND WRAP===================================================================

//fun main (args: Array<String>) {
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.slice(0..3 ))
//    println(numbers.slice(0..4 step 2))
//    println(numbers.slice(setOf(3, 5, 0)))
//
//    println("\n")
//
//    println(numbers.take(3))
//    println(numbers.takeLast(3))
//    println(numbers.drop(1))
//    println(numbers.dropLast(5))
//}

//======================USING PREDICATES TO DETERMINE WHAT TO TAKE OR TO DROP=============================
//fun main (args: Array<String>) {
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.slice(0..3 ))
//    println(numbers.slice(0..4 step 2))
//    println(numbers.slice(setOf(3, 5, 0)))
//
//    println("\n")
//
//    println(numbers.take(3))
//    println(numbers.takeLast(3))
//    println(numbers.drop(1))
//    println(numbers.dropLast(5))
//
//    println("\n")
//
//    println(numbers.takeWhile { !it.startsWith("f") })
//    println(numbers.takeLastWhile { it !="three" })
//    println(numbers.dropWhile { it.length == 3 }) //six shouldn't be among, but he doesn't know why. ??????
//    println(numbers.dropLastWhile { it.contains(    "i") })
//}

//===============================CHUNKED===========================================================
//fun main (args: Array<String>) {
//    val numbersStrings = listOf("one", "two", "three", "four", "five", "six")
//    println(numbersStrings.slice(0..3 ))
//    println(numbersStrings.slice(0..4 step 2))
//    println(numbersStrings.slice(setOf(3, 5, 0)))
//
//    println("\n")
//
//    println(numbersStrings.take(3))
//    println(numbersStrings.takeLast(3))
//    println(numbersStrings.drop(1))
//    println(numbersStrings.dropLast(5))
//
//    println("\n")
//
//    println(numbersStrings.takeWhile { !it.startsWith("f") })
//    println(numbersStrings.takeLastWhile { it !="three" })
//    println(numbersStrings.dropWhile { it.length == 3 }) //six shoudn't be among bu he doesn't know why. ??????
//    println(numbersStrings.dropLastWhile { it.contains(    "i") })
//
//    val numbers = (0 .. 13).toList()
//    println(numbers.chunked(3))
//    println(numbers.chunked(3){it.sum()})
//}
//======================WINDOWED
//fun main (args: Array<String>) {
//    val numbersStrings = listOf("one", "two", "three", "four", "five", "six")
//    println(numbersStrings.slice(0..3 ))
//    println(numbersStrings.slice(0..4 step 2))
//    println(numbersStrings.slice(setOf(3, 5, 0)))
//
//    println("\n")
//
//    println(numbersStrings.take(3))
//    println(numbersStrings.takeLast(3))
//    println(numbersStrings.drop(1))
//    println(numbersStrings.dropLast(5))
//
//    println("\n")
//
//    println(numbersStrings.takeWhile { !it.startsWith("f") })
//    println(numbersStrings.takeLastWhile { it !="three" })
//    println(numbersStrings.dropWhile { it.length == 3 }) //six shoudn't be among bu he doesn't know why. ??????
//    println(numbersStrings.dropLastWhile { it.contains(    "i") })
//
//    val numbers = (0 .. 13).toList()
//    println(numbers.chunked(3))
//    println(numbers.chunked(3){it.sum()})
//
//    println("\n")
//    val numbersStrings2 = numbersStrings
//    println(numbersStrings2.windowed(3)) //Similar to chunked but more flexible
//}

//=======================RETRIEVING SINGLE ELEMENT FROM THE THE COLLECTIONS==========================================
//fun main (args: Array<String>) {
//    val numbers = listOf("one", "two", "three", "four", "five")
//    println(numbers.elementAt(3))
//    println(numbers.first())
//    println(numbers.last())
//
//    println("\n")
//    println(numbers.first { it.length > 3})
//    println(numbers.last { it.startsWith("f" ) })
//    println(numbers.random())
//    println(numbers.isEmpty())
//}

//========================AGGREGATE FUNCTION====================================================================

//fun main (args: Array<String>) {
//    val numbers = listOf(6, 10, 14, 4, 100)
//    println("The sum is ${numbers.sum()}")
//    println("The count is ${numbers.count()}")
//    println("The average is ${numbers.average()}")
//    println("The max value is ${numbers.max()}")
//    println("The min value is ${numbers.min()}")
//}
//==================================================================================================================
//fun main (args: Array<String>) {
//    val numbers = listOf(6, 10, 14, 4, 100)
//    println("The sum is: ${numbers.sum()}")
//    println("The count is: ${numbers.count()}")
//    println("The average is: ${numbers.average()}")
//    println("The max value is: ${numbers.maxOrNull()}")
//    println("The min value is: ${numbers.minOrNull()}")
//    println("The sum is: ${numbers.sumOf { it * 2 }}")
//}

//=========================ORDERING===================================================================================
//fun main(args: Array<String>) {
//    val numbers = mutableListOf<Int>(2, 5, 1, 40, 20, 100, 60)
//    numbers.sorted().forEach {println(it)}
//
//    val laptops = mutableListOf(
//        laptop("Dell",2021, 4, 600),
//        laptop("Acer", 2020, 8, 800),
//        laptop("Apple", 2022, 16, 1000)
//    )
//    laptops.sorted().forEach {println(it)}
//}
//
//data class laptop(val brand: String, val year: Int, val ram: Int, val price: Int) : Comparable<laptop> {
//    override fun compareTo(other: laptop): Int {
//        return if (this.price > other.price) {
//            println("In if statement: Swapping ${this.brand} with ${other.brand}")
//            1
//            return 1
//        } else if (this.price < other.price) {
//            println("In if statement: Swapping ${this.brand} with ${other.brand}")
//            -1
//        } else {
//            0
//        }
//    }
//}

//===============Using Comparator to access other instances
//fun main(args: Array<String>) {
//    val numbers = mutableListOf<Int>(2, 5, 1, 40, 20, 100, 60)
//
//    numbers.sorted().forEach { println(it) }
//
//    val laptops = mutableListOf(
//        laptop("Dell", 2021, 4, 600),
//        laptop("Acer", 2020, 8, 800),
//        laptop("Apple", 2022, 16, 1000)
//    )
//
//    println("\n")
//
//    laptops.sorted().forEach { println(it) }
//
//    println("\n")
//
//    laptops.sortedWith(ComparatorRam()).forEach { println(it) }
//}
//
//data class laptop(
//    val brand: String,
//    val year: Int,
//    val ram: Int,
//    val price: Int
//) : Comparable<laptop> {
//
//    override fun compareTo(other: laptop): Int {
//        return if (this.price > other.price) {
//            println("In if statement: Swapping $brand with ${other.brand}")
//            1
//        } else if (this.price < other.price) {
//            println("In if statement: Swapping $brand with ${other.brand}")
//            -1
//        } else {
//            0
//        }
//    }
//}
//
//class ComparatorRam : Comparator<laptop> {
//
//    override fun compare(laptop1: laptop, laptop2: laptop): Int {
//
//        return if (laptop1.ram > laptop2.ram) {
//            -1
//        } else if (laptop1.ram < laptop2.ram) {
//            1
//        } else {
//            0
//        }
//    }
//}
//// you can use many Comparators

//fun main(args: Array<String>) {
//    val numbers = mutableListOf<Int>(2, 5, 1, 40, 20, 100, 60)
//    numbers.sorted().forEach { println(it) }
//
//    val laptops = mutableListOf(
//        laptop("Dell", 2021, 4, 600),
//        laptop("Acer", 2020, 16, 80),
//        laptop("Apple", 2022, 8, 1000)
//
//    )
//    laptops.sortedBy {it.price}.forEach {println(it)}
//    //laptops.sortedWith(compareBy { it.price}).forEach { println(it) }
//    println("\n")
//   // laptops.sortedWith(compareBy { it.ram}).forEach { println(it) } Shorter way down
//    laptops.sortedBy { it.ram}.forEach {println(it)}
//    println("\n")
//    laptops.sortedWith(compareBy<laptop> {it.year}.thenBy {it.price}).forEach{println(it)}
//    //can add more thenBy
//}
//
//data class laptop(val brand: String, val year: Int, val ram: Int, val price: Int)//More Sorting criteria
//                                           //the last option is the best   // and concise

//========================BINARY SEARCH========================================================
// First Linear Search ========
//fun main (args: Array<String>) {
//    println(searchElement(27, mutableListOf(1,2,3,4,5,6,7,8,9,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)))
//
//}
//
//private fun searchElement(searchElement: Int, numbers: MutableList<Int>): Int {
//    var i = 0
//    for (number in numbers) {
//        i++
//        println("Searched number: $i")
//        if (number == searchElement) {
//            return number
//        }
//    }
//    return -1
//}

//=============================Binary Search
//fun main (args: Array<String>) {
//    println(searchElement(27, mutableListOf(1,2,3,4,5,6,7,8,9,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)))
//
//}
//
//private fun searchElement(searchedElement: Int, numbers: MutableList<Int>)
//= numbers[numbers.binarySearch(27)] //: Int { Even shorter
//    var low = 0
//    var high = numbers.size -1
//
//    var i = 0
//    while (low <= high) {
//        i++
//        println("Searched number: $i")
//        val mid = (low + high) / 2
//        val cmp = numbers[mid].compareTo(searchedElement)
//
//        if (cmp<0) {
//            low = mid + 1
//        } else if (cmp > 0) {
//            low = mid - 1
//        } else {
//            return numbers [mid]
//        }
//    }
//    return -1

 //   return numbers[numbers.binarySearch(27)] //Shorter way of writing the above


//}

//=======================================GENERICS======================================================

fun main(args: Array<String>) {

    val footballPlayer = FootballPlayer("Football player 1")
    val footballPlayer2 = FootballPlayer("Football player 2")

    val baseballPlayer = BaseballPlayer("Baseball Player 1")
    val baseballPlayer2 = BaseballPlayer("Baseball Player 2")

    val footballTeam = Team<FootballPlayer>("Football team", mutableListOf(footballPlayer))
    footballTeam.addPlayers(footballPlayer2)

}

class Team<T>(val name: String, val players: MutableList<T>) {

    fun addPlayers(player: T) {
        if (players.contains(player)) {
            println("Player: ${(player as Player).name} is already in the team ${this.name}")
        } else {
            players.add(player)
            println("Player: ${(player as Player).name} was added to the team ${this.name}")
        }
    }
}
open class Player(val name: String)

class FootballPlayer(name: String) : Player(name)
class BaseballPlayer(name: String) : Player(name)