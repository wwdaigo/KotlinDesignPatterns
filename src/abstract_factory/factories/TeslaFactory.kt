package abstract_factory.factories

import abstract_factory.AbstractFactory
import abstract_factory.cars.Car
import abstract_factory.cars.TeslaModelX

class TeslaFactory: AbstractFactory() {

    override fun createCar(): Car {
        return TeslaModelX()
    }
}