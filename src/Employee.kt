class Employee private constructor(builder: Builder) {
    var firstName: String ?
    var lastName: String ?
    var id: String ?
    var managerId: String ?
    var isManager: Boolean
    init {
        this.firstName = builder.firstName
        this.lastName = builder.lastName
        this.id = builder.id
        this. isManager = builder.isManager
        this.managerId = builder.managerId
    }
    class Builder {
        var firstName: String? = null
        var lastName: String? = null
        var id: String? = null
        var isManager = false
        var managerId: String? = null
        fun build(): Employee {
            return Employee(this)
        }

        fun setFirstName(firstName: String?): Builder {
            this.firstName = firstName
            return this
        }

        fun setLastName(lastName: String?): Builder {
            this.lastName = lastName
            return this
        }

        fun setId(id: String?): Builder {
            this.id = id
            return this
        }

        fun setIsManager(manager: Boolean): Builder {
            isManager = manager
            return this
        }

        fun setManagerId(managerId: String?): Builder {
            this.managerId = managerId
            return this
        }
    }


}
fun main() {
    var employee = Employee.Builder()
        .setFirstName("Somiah")
        .setLastName("Aldouis")
        .setManagerId("972")
        .setIsManager(false)
    println( " your name is :"+employee.firstName+" "+employee.lastName+
            "\n"+"Are you manager : "+employee.isManager)

}