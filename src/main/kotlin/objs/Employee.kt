package objs

import enums.Department

class Employee(name: String, birthday: String, job: String, dept: Department): Person(name, birthday){
    private var job: String
    private var dept: Department

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