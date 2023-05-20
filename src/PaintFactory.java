public class PaintFactory extends EggFactory{

    @Override
    Type getType(String eggType) {

        System.out.println("Paint factory cannot create: " + eggType);
        return null;
    }

    @Override
    Paint getPaint(String paintEgg) {
        if(paintEgg.equals(ConstantsPaint.BLUE)) {
            return new BlueEgg();
        }
        if(paintEgg.equals(ConstantsPaint.RED)) {
            return new RedEgg();
        }
        if(paintEgg.equals(ConstantsPaint.GREEN)) {
            return new GreenEgg();
        }
        System.out.println("Unknown paint: " + paintEgg);
            return null;
    }

    @Override
    Sticker getSticker(String stickerEgg) {

        System.out.println("Paint factory cannot create: " + stickerEgg);
            return null;
    }
}
