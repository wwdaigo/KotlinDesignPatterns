package abstract_factory

import abstract_factory.factories.Brands

fun main(args: Array<String>) {

    println(AbstractFactory
            .getFactory(Brands.TESLA)
            .createCar()
            .model)

    println(AbstractFactory
            .getFactory(Brands.AUDI)
            .createCar()
            .model)

    println(AbstractFactory
            .getFactory(Brands.VOLKS)
            .createCar()
            .model)
}