package strategy

import strategy.languages.EnglishLanguage
import strategy.languages.GermanLanguage
import strategy.languages.PortugueseLanguage
import strategy.occupations.DoctorOccupation
import strategy.occupations.SoftwareDeveloperOccupation
import strategy.occupations.TeacherOccupation

/**
 * Created by daigomatsuoka on 22/06/17.
 */

fun main(args: Array<String>) {

    val marceloPerson = Person("Marcelo", PortugueseLanguage(), SoftwareDeveloperOccupation())
    marceloPerson.introduce()

    val kellyPerson = Person("Kelly", EnglishLanguage(), TeacherOccupation())
    kellyPerson.introduce()

    val fridaPerson = Person("Frida", GermanLanguage(), DoctorOccupation())
    fridaPerson.introduce()
}