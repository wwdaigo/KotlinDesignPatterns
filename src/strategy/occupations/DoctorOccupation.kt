package strategy.occupations

import strategy.interfaces.IOccupation

/**
 * Created by daigomatsuoka on 22/06/17.
 */

class DoctorOccupation: IOccupation {

    override val name: String
        get() = "Doctor"

    override fun work() {
        println("I save lives!")
    }
}