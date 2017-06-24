package observer.observers

import observer.interfaces.IObserver

/**
 * Created by daigomatsuoka on 23/06/17.
 */


class ObserverA: IObserver {

    override fun update() {
        println("I am A!")
    }

}