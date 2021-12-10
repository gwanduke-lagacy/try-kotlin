class Person(val firstName: String = "Peter",var lastName: String = "Parker") {
    var nickName: String? = null
        set(value) {
            field = value
        }
        get() {
            println("the returned value is $field")
            return field
        }
}