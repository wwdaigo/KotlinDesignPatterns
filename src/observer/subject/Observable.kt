package observer.subject

import observer.interfaces.IObservable
import observer.interfaces.IObserver

/**
 * Created by daigomatsuoka on 23/06/17.
 */

class Observable: IObservable {

    val observers = ArrayList<IObserver>()

    override fun add(o: IObserver) {
        observers.add(o)
    }

    override fun remove(o: IObserver) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        for (o in observers) {
            o.update()
        }
    }
}