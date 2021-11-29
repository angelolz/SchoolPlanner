package examples

import enums.*
import objs.*

fun main() {
    val p = Person("Angel Legaspi", "09/15/2000")

    println("%s\n".format(p))
    println(p.getSchedule())

    val s = Student("Audrey Afable", "06/23/2001", 110423122, Major.GRAPHIC_DESIGN)
    val s1 = Slot(10,30,"AM",11,45,"AM")
    val s2 = Slot(2, 0, "PM", 3, 15, "PM")
    val s3 = Slot(4, 30, "PM", 5, 45, "PM")
    val s4 = Slot(4, 30, "PM", 5, 45, "PM")

    s.addSchedule("Art Foundations II ART108", s1)
    s.addSchedule("Foundation Drawing ART109", s2)
    s.addSchedule("Drawing I ART212", s3)
    s.addSchedule("Study @ Library", s4)
    println("%s\n".format(s))
    println(s.getSchedule())

    val se = StudentEmployee("Joshua Corrales", "09/15/1998", 110423122, Major.COMPUTER_SCIENCE, "Phone Analyst", Department.HELP_DESK)

    val s5 = Slot(10,30,"AM",12,0,"PM")
    val s6 = Slot(2, 30, "PM", 3, 45, "PM")
    val s7 = Slot(4, 30, "PM", 5, 45, "PM")
    se.addSchedule("Work Shift", s5)
    se.addSchedule("Discrete Mathematics MATH189", s6)
    se.addSchedule("Data Structures CS321", s7)

    println("%s\n".format(se))
    println(se.getSchedule())

    val e = Employee("Jayce Nunez", "07/12/1999", "Union Manager", Department.STUDENT_UNION)

    val s8 = Slot(7,30,"AM",1,0,"PM")
    val s9 = Slot(2, 0, "PM", 3, 0, "PM")
    e.addSchedule("Work Shift", s8)
    e.addSchedule("Meeting", s9)

    println("%s\n".format(e))
    println(e.getSchedule())
}