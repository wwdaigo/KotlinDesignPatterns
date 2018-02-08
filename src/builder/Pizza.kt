package builder

import builder.parts.cheese.Cheese
import builder.parts.dough.Dough
import builder.parts.topping.Topping

class Pizza {
    var dough: Dough? = null
    var cheese: Cheese? = null
    var toppings: MutableList<Topping> = ArrayList()

    val description: String
        get() = "Pizza with ${dough?.type}, ${cheese?.name} and with toppings $toppings"

    class Builder {
        private val pizza: Pizza = Pizza()

        fun setDough(dough: Dough): Builder {
            pizza.dough = dough
            return this
        }

        fun setCheese(cheese: Cheese): Builder {
            pizza.cheese = cheese
            return this
        }

        fun addTopping(topping: Topping): Builder {
            pizza.toppings.add(topping)
            return this
        }

        fun build(): Pizza {
            return pizza
        }
    }
}
