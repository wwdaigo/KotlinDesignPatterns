package observer.subject

import observer.interfaces.IObservable
import observer.interfaces.IObserver

/**
 * Created by daigomatsuoka on 23/06/17.
 */

class Subject : IObservable {

    val observers = ArrayList<IObserver>()

    override fun add(o: IObserver) {
        println("${o::class.simpleName} has joined")
        observers.add(o)
    }

    override fun remove(o: IObserver) {
        println("${o::class.simpleName} has been kicked")
        observers.remove(o)
    }

    override fun notifyObservers() {
        for (o in observers) {
            o.update()
        }
    }
}