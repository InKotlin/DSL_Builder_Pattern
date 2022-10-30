package builder

import domain.Item

open class ItemBuilder {
    protected var item = Item()

    var x: Int
        get() {
            return item.x
        }
        set(value) {
            item.x = value
        }

    var y: Int
        get() {
            return item.y
        }
        set(value) {
            item.y = value
        }

    var width: Int
        get() {
            return item.width
        }
        set(value) {
            item.width = value
        }

    var height: Int
        get() {
            return item.height
        }
        set(value) {
            item.height = value
        }


    fun addChild(itemBuilder : ItemBuilder) : ItemBuilder {
        var newItem = itemBuilder.build()
        newItem.parent = item
        item.children.add(itemBuilder.build())
        return this
    }


    fun build() : Item {
        return item
    }
}