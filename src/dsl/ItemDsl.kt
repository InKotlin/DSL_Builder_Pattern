package dsl

import builder.ImageBuilder
import builder.ItemBuilder
import builder.RectangleBuilder
import domain.Item

fun window(itemBuilder: ItemBuilder.() -> Unit): Item
{
    return ItemBuilder().apply(itemBuilder).build()
}

fun ItemBuilder.item(itemBuilder: ItemBuilder.() -> Unit) {
    val builder = ItemBuilder().apply(itemBuilder)
    addChild(builder)
}

fun ItemBuilder.rectangle(rectangleBuilder: RectangleBuilder.() -> Unit) {
    val builder = RectangleBuilder().apply(rectangleBuilder)
    addChild(builder)
}

fun ItemBuilder.image(imageBuilder: ImageBuilder.() -> Unit) {
    val builder = ImageBuilder().apply(imageBuilder)
    addChild(builder)
}