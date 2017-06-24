package observer

import observer.interfaces.IObserver
import observer.observers.ObserverA
import observer.observers.ObserverB
import observer.subject.Subject
import java.util.*

/**
 * Created by daigomatsuoka on 24/06/17.
 */

fun main(args: Array<String>) {

    val subject = Subject()

    val a = ObserverA()
    val b = ObserverB()

    subject.add(a)
    subject.add(b)

    subject.notifyObservers()

    subject.remove(a)

    subject.notifyObservers()
}