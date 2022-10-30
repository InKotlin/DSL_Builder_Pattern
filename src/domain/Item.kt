package domain

open class Item {
    var x = 0
    var y = 0
    var width = 0
    var height = 0
    var children = mutableListOf<Item>()
    var parent: Item? = null
}