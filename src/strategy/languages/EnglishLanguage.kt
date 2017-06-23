package strategy.languages

import strategy.interfaces.ILanguage

/**
 * Created by daigomatsuoka on 22/06/17.
 */

class EnglishLanguage: ILanguage {

    override val name: String
        get() = "English"

    override val officialName: String
        get() = "English"

    override fun sayHi() {
        println("Hi!")
    }

    override fun sayThankYou() {
        println("Thank You!")
    }
}