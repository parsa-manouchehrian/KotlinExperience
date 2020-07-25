
fun Person.WhoAreYou(ID: Int) {
    println("Name: ${this.firstname + " " + this.Lastname} Height: ${this.height} #ID: $ID")
}

var Person.Lastname : String
    get() {
        return "${this.firstname}ian"
    }
set(value) {
}

    fun main(args: Array<String>) {
        println("tse");

        var person = Person(2, "Parsa")

        person
            .SayBye()

        person.height = 2
        person.firstname = "Parsa"

        println("${person.height}")

        person.Lastname = ""
        person.WhoAreYou(0)

        var d = D()

        d.foo()
    }
