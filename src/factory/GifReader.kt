package factory

class GifReader(val image: String): ImageReader {
    override val decodedImage: DecodedImage
        get() = DecodedImage(image)
}