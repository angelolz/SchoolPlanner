package objs

data class Slot(var f1: Int, var f2: Int, var fMeridien: String, var t1: Int, var t2: Int, var tMeridien: String) {
    override fun toString(): String {
        return "%s:%s $fMeridien - %s:%s $tMeridien".format(
            f1.toString().padStart(2, '0'),
            f2.toString().padStart(2, '0'),
            t1.toString().padStart(2, '0'),
            t2.toString().padStart(2, '0')
        )
    }
}

//open means can be inherited
open class Person(name: String, birthday: String)
{
    private var name: String            // var means it can be replaced
    private val birthday: String        // val means it is a run-time constant
    private val schedule: LinkedHashMap<String, Slot>

    //no longer need to say public objs.Person(String name, String birthday)
    init {
        this.name = name
        this.birthday = birthday
        this.schedule = LinkedHashMap()   //don't need to say new HashSet<objs.Slot>()
    }

    fun addSchedule(name: String, slot: Slot) {
        schedule[name] = slot
    }

    fun changeSchedule(name:String, slot: Slot) {
        if(schedule.containsKey(name)) {
            schedule.replace(name, slot)
        }
    }

    fun removeSchedule(name: String) {
        schedule.remove(name)
    }

    fun getSchedule(): String {
        var s = "-----SCHEDULE-----\n"

        if(schedule.isNotEmpty()) {
            for (i in schedule) {
                s += "${i.key}\t\t${i.value}\n"
            }
        } else {
          s += "There is nothing scheduled today.\n"
        }

        return s
    }

    //don't need to say @Override
    override fun toString(): String {
        return "Name: $name | Birthday: $birthday"
    }
}