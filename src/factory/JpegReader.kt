package factory

class JpegReader(val image: String): ImageReader {
    override val decodedImage: DecodedImage
        get() = DecodedImage(image)
}