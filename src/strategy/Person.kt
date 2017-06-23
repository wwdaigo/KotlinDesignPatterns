package strategy

import strategy.interfaces.ILanguage
import strategy.interfaces.IOccupation

/**
 * Created by daigomatsuoka on 22/06/17.
 */

class Person (
        val name: String,
        val language: ILanguage,
        val occupation: IOccupation) {

    fun introduce() {
        language.sayHi()
        println("My name is ${name}.")
        println("My native language is ${language.name}, as we officialy call ${language.officialName}")
        println("I work as ${occupation.name.toLowerCase()}.")
        occupation.work()
        language.sayThankYou()
    }
}