public abstract class EggFactory {
    abstract Type getType(String eggType);
    abstract Paint getPaint(String paintEgg);
    abstract Sticker getSticker(String stickerEgg);
}
