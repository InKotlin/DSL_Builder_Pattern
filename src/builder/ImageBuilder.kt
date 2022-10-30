package builder

import domain.Image
import domain.Rectangle

class ImageBuilder : ItemBuilder() {

    init {
        item = Image()
    }

    private var image: Image
        get() {
            return item as Image
        }
        set(value) {
            item = value
        }

    var source: String
        get() {
            return image.source
        }
        set(value) {
            image.source = value
        }
}