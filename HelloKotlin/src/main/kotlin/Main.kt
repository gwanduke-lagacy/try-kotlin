// 상수
val name: String = "gwanduke"
val nickname: String? = null

// 변수
var yourname = "gwan"
var age: Number = 32

fun getGreeting(): String {
    return "Hello Kotlin"
}

// NOTE: single expression function
fun getGreetingSimple(): String = "Hello Kotlin"

// NOTE: vararg는 ...rest 와 비슷한 문법
fun sayHello(greeting: String, vararg itemToGreet:String) {
    // val msg = "Hello " + itemToGreet
    val msg = "$greeting $itemToGreet"
    println(msg)
}

fun main() {



    // NOTE: 명시적으로 null 선언 되지 않으면 할당 불가
    // yourname = null

    val text = when (age) {
        1 -> "1살~"
        else -> "2살 이상~"
    }
    println(text)

    // NOTE: 일반적인 3항 연산과는 문법이 다르다.
    // val result = age == 1 ? "굿" : "노굿"
    val result = if (age == 1) "굿" else "노굿"

    println(name)
    println(result)
    println(getGreeting())

    // NOTE: * 는 spread 연산자
    sayHello("Hey", itemToGreet = *arrayOf(yourname))
    sayHello("Hello", yourname)

    println("========== For ==========")

    // 배열과 리스트는 다름
    val interstingThings = arrayOf("Kotlin", "Programming")

    // 리스트는 기본적으로 immutable 하므로 필요한 경우 mutable한 버전을 사용해야함
    val interestingMutable = mutableListOf<String>("A", "B")
    interestingMutable.add("C")

    println(interstingThings.size)
    println(interstingThings[0])
    println(interstingThings.get(0))

    for (interstingThing in interstingThings) {
        println(interstingThing)
    }

    interstingThings.forEach { ina -> println(ina) }
    interstingThings.forEach { println(it) }


    sayHello("Hi", "Kotlin", "Programming")


    val person = Person("Nate", "Ebel");
    person.lastName
    person.firstName
    person.nickName
}