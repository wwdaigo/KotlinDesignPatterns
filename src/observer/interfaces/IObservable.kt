package observer.interfaces

/**
 * Created by daigomatsuoka on 23/06/17.
 */

interface IObservable {
    fun add(o: IObserver)
    fun remove(o: IObserver)

    fun notifyObservers()
}