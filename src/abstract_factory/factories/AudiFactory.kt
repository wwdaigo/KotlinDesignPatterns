package abstract_factory.factories

import abstract_factory.AbstractFactory
import abstract_factory.cars.AudiTT
import abstract_factory.cars.Car

class AudiFactory: AbstractFactory() {

    override fun createCar(): Car {
        return AudiTT()
    }
}