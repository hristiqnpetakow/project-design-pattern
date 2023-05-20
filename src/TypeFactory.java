public class TypeFactory extends EggFactory{
    @Override
    Type getType(String eggType) {
        if(eggType.equals(TypeConstants.CHICKEN_EGG)) {
            return new ChickenEgg();
        }
        if(eggType.equals(TypeConstants.QUAIL_EGG)) {
            return new QuailEgg();
        }
        if(eggType.equals(TypeConstants.DINOSAUR_EGG)) {
            return new DinosaurEgg();
        }

        System.out.println("Unknown sticker: " + eggType);
            return null;
    }

    @Override
    Paint getPaint(String paintEgg) {
        System.out.println("Type factory cannot create: " + paintEgg);
            return null;
    }

    @Override
    Sticker getSticker(String stickerEgg) {
        System.out.println("Type factory cannot create: " + stickerEgg);
            return null;
    }
}
