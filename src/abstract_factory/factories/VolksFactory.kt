package abstract_factory.factories

import abstract_factory.AbstractFactory
import abstract_factory.cars.Car
import abstract_factory.cars.VolksGol

class VolksFactory: AbstractFactory() {

    override fun createCar(): Car {
        return VolksGol()
    }
}