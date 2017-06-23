package strategy.languages

import strategy.interfaces.ILanguage

/**
 * Created by daigomatsuoka on 22/06/17.
 */
class GermanLanguage: ILanguage {

    override val name: String
        get() = "German"

    override val officialName: String
        get() = "Deutsch"

    override fun sayHi() {
        println("Hallo!")
    }

    override fun sayThankYou() {
        println("Danke!")
    }
}