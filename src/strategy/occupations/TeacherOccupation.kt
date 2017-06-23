package strategy.occupations

import strategy.interfaces.IOccupation

/**
 * Created by daigomatsuoka on 22/06/17.
 */

class TeacherOccupation: IOccupation {

    override val name: String
        get() = "Teacher"

    override fun work() {
        println("I make the world less dumb!")
    }
}