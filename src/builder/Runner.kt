package builder

import builder.parts.cheese.MozzarelaCheese
import builder.parts.dough.WholeWheatDough
import builder.parts.topping.OnionTopping
import builder.parts.topping.PepperoniTopping

fun main(args: Array<String>) {
    val pizza = Pizza.Builder()
            .setCheese(MozzarelaCheese())
            .setDough(WholeWheatDough())
            .addTopping(PepperoniTopping())
            .addTopping(OnionTopping())
            .build()

    println(pizza.description)
}