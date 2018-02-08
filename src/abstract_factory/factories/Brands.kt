package abstract_factory.factories

import abstract_factory.AbstractFactory

enum class Brands (val factory: AbstractFactory) {
    AUDI(AudiFactory()),
    TESLA(TeslaFactory()),
    VOLKS(VolksFactory())
}