package strategy.interfaces

/**
 * Created by daigomatsuoka on 22/06/17.
 */
interface ILanguage {
    val name: String
    val officialName: String

    fun sayHi()
    fun sayThankYou()
}