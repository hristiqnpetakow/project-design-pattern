public class StickerFactory extends EggFactory{

    @Override
    Type getType(String eggType) {
        System.out.println("Sticker factory cannot create: " + eggType);
        return null;
    }

    @Override
    Paint getPaint(String paintEgg) {

        System.out.println("Sticker factory cannot create: " + paintEgg);
        return null;
    }

    @Override
    Sticker getSticker(String stickerEgg) {
        if(stickerEgg.equals(ConstantsSticker.HEART)) {
            return new HeartSticker();
        }
        if(stickerEgg.equals(ConstantsSticker.FLOWER)) {
            return new FlowerSticker();
        }
        if(stickerEgg.equals(ConstantsSticker.CROSS)) {
            return new CrossSticker();
        }

        System.out.println("Unknown sticker: " + stickerEgg);
            return null;
    }
}
