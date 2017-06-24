package observer.observers

import observer.interfaces.IObserver

/**
 * Created by daigomatsuoka on 24/06/17.
 */

class ObserverB: IObserver {

    override fun update() {
        println("I am B!")
    }
}