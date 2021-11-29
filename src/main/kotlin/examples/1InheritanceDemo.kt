package examples

import enums.*
import objs.*

fun main() {
    val p = Person("Angel Legaspi", "09/15/2000")
    val s = Student("Audrey Afable", "06/23/2001", 110423122, Major.COMPUTER_SCIENCE)
    val se = StudentEmployee("Joshua Corrales", "09/15/2000", 132566099, Major.COMPUTER_SCIENCE, "Phone Analyst", Department.HELP_DESK)
    val e = Employee("Jayce Nunez", "07/12/1999", "Union Manager", Department.STUDENT_UNION)

    println("%s\n".format(p))
    println("%s\n".format(s))
    println("%s\n".format(se))
    println("%s\n".format(e))
}