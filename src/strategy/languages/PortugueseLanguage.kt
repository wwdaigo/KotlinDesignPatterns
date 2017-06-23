package strategy.languages

import strategy.interfaces.ILanguage

/**
 * Created by daigomatsuoka on 22/06/17.
 */

class PortugueseLanguage: ILanguage {

    override val name: String
        get() = "Portuguese"

    override val officialName: String
        get() = "Português"

    override fun sayHi() {
        println("Oi!")
    }

    override fun sayThankYou() {
        println("Obrigado!")
    }
}