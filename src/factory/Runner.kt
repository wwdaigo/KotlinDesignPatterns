package factory

fun main(args: Array<String>) {
    var decodedImage: DecodedImage? = null
    var reader: ImageReader? = null
    val image = "aaaa.jpg"

    with(image) {
        val format = substring(indexOf(".") + 1, length)
        if (format.equals("gif")) {
            reader = GifReader(this)
        }

        if (format.equals("jpg")) {
            reader = JpegReader(this)
        }

        decodedImage = reader?.decodedImage
        println(decodedImage)
    }
}