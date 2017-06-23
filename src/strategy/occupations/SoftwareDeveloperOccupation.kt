package strategy.occupations

import strategy.interfaces.IOccupation

/**
 * Created by daigomatsuoka on 22/06/17.
 */

class SoftwareDeveloperOccupation: IOccupation {

    override val name: String
        get() = "Software developer"

    override fun work() {
        println("I do code, hardly!")
    }
}