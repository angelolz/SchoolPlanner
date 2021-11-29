package objs

import enums.*

class StudentEmployee(name: String, birthday: String, id: Int, major: Major, job: String, dept: Department): Student(name, birthday, id, major) {
    private val job: String
    private val dept: Department

    init {
        this.job = job
        this.dept = dept
    }

    override fun toString(): String {
        var s = "${super.toString()}\n"

        val deptStr = when(dept) {
            Department.HELP_DESK -> "Help Desk"
            Department.STUDENT_UNION -> "Student Union"
            Department.MAINTENANCE -> "Maintenance"
        }

        s += "Job Title: $job | Department: $deptStr"
        return s
    }
}