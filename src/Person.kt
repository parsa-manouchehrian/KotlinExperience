class Person(name: String) : People() {

    var firstname: String

    var height : Int = 0
        set(value) {
            field = value + 2
        }
        get() {
            return field + 2
        }


    init {
        firstname = ""
        println("init $name")
    }

    //tryout classic constructor
    //which is a secondary ctr
    constructor(age: Int, name: String) : this(name) {
        println("Age -> $age")
    }

    override fun SayBye() {
        super.SayBye()
        super.Eat()
        println("In Children")
    }

}