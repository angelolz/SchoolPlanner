package objs

import enums.Major

open class Student(name: String, birthday: String, id: Int, major: Major): Person(name, birthday){
    private val id: Int         //can't change id, so leave as val
    private var major: Major    //can change major, make a var

    init {
        this.id = id
        this.major = major
    }

    fun changeMajor(major: Major) {
        this.major = major
    }

    override fun toString(): String {
        var s = "${super.toString()}\n"

        //similar syntax to Java 13's enhanced switch case
        val majorStr = when(major) {
            Major.COMPUTER_SCIENCE -> "Computer Science"
            Major.BUSINESS         -> "Business"
            Major.GRAPHIC_DESIGN   -> "Graphic Design"
        }

        s += "Student ID: $id | Major: $majorStr"
        return s
    }
}