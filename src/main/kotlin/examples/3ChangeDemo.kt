package examples

import enums.Department
import enums.Major
import objs.Slot
import objs.StudentEmployee

fun main() {
    val se = StudentEmployee("Hasan Milner", "03/12/1999", 102392473, Major.GRAPHIC_DESIGN, "Front Desk Clerk", Department.STUDENT_UNION)
    val s1 = Slot(9,30,"AM",12,0,"PM")
    val s2 = Slot(10,30,"AM",11,45,"AM")
    val s3 = Slot(2, 0, "PM", 3, 15, "PM")

    se.addSchedule("Work Shift", s1)
    se.addSchedule("Art Foundations II ART108", s2)
    se.addSchedule("Foundation Drawing ART109", s3)

    println("%s\n".format(se))
    println(se.getSchedule())

    se.changeMajor(Major.COMPUTER_SCIENCE)
    println("Changing Major: Graphic Design ---> Computer Science\n")

    val s4 = Slot(1,30,"AM",6,0,"PM")
    val s5 = Slot(9, 30, "PM", 10, 45, "PM")
    val s6 = Slot(4, 30, "PM", 5, 45, "PM")
    se.changeSchedule("Work Shift", s4)
    se.removeSchedule("Art Foundations II ART108")
    se.removeSchedule("Foundation Drawing ART109")
    se.addSchedule("Computer Science I CS101", s5)
    se.addSchedule("Calculus I MATH170", s6)

    println("%s\n".format(se))
    println(se.getSchedule())
}