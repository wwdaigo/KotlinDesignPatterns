package abstract_factory

import abstract_factory.cars.Car
import abstract_factory.factories.Brands

abstract class AbstractFactory {

    companion object {
        fun getFactory(brand: Brands): AbstractFactory {
            return brand.factory
        }
    }

    abstract fun createCar(): Car
}