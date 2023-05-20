public class Main {
    public static void main(String[] args) {

        EasterBunny easterBunny = EasterBunny.getInstance();
        easterBunny.connect("7777");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        EggFactory typeFactory1 = FactoryProducer.getFactory(FactoryConstants.TYPE_FACTORY);
        Type type1 = typeFactory1.getType(TypeConstants.CHICKEN_EGG);
        type1.type();

        EggFactory paintFactory1 = FactoryProducer.getFactory(FactoryConstants.PAINT_FACTORY);
        Paint paint1 = paintFactory1.getPaint(ConstantsPaint.BLUE);
        paint1.paint();

        EggBasket eggBasket1 = new EggBasket();
        eggBasket1.getEggsCounter();


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        EggFactory typeFactory2 = FactoryProducer.getFactory(FactoryConstants.TYPE_FACTORY);
        Type type2 = typeFactory2.getType(TypeConstants.QUAIL_EGG);
        type2.type();

        EggFactory paintFactory2 = FactoryProducer.getFactory(FactoryConstants.PAINT_FACTORY);
        Paint paint2 = paintFactory2.getPaint(ConstantsPaint.RED);
        paint2.paint();

        EggBasket eggBasket2 = new EggBasket();

        eggBasket2.getEggsCounter();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        EggFactory typeFactory3 = FactoryProducer.getFactory(FactoryConstants.TYPE_FACTORY);
        Type type3 = typeFactory3.getType(TypeConstants.DINOSAUR_EGG);
        type3.type();

        EggFactory stickerFactory1 = FactoryProducer.getFactory(FactoryConstants.STICKER_FACTORY);
        Sticker sticker1 = stickerFactory1.getSticker(ConstantsSticker.CROSS);
        sticker1.cover();

        EggBasket eggBasket3 = new EggBasket();
        eggBasket3.getEggsCounter();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        EggFactory typeFactory4 = FactoryProducer.getFactory(FactoryConstants.TYPE_FACTORY);
        Type type4 = typeFactory4.getType(TypeConstants.CHICKEN_EGG);
        type4.type();

        EggFactory stickerFactory2 = FactoryProducer.getFactory(FactoryConstants.STICKER_FACTORY);
        Sticker sticker2 = stickerFactory2.getSticker(ConstantsSticker.HEART);
        sticker2.cover();

        EggBasket eggBasket4 = new EggBasket();
        eggBasket4.getEggsCounter();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        EggFactory typeFactory5 = FactoryProducer.getFactory(FactoryConstants.TYPE_FACTORY);
        Type type5 = typeFactory5.getType(TypeConstants.QUAIL_EGG);
        type5.type();

        EggFactory paintFactory3 = FactoryProducer.getFactory(FactoryConstants.PAINT_FACTORY);
        Paint paint3 = paintFactory3.getPaint(ConstantsPaint.GREEN);
        paint3.paint();

        EggBasket eggBasket5 = new EggBasket();
        eggBasket5.getEggsCounter();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        EggFactory typeFactory6 = FactoryProducer.getFactory(FactoryConstants.TYPE_FACTORY);
        Type type6 = typeFactory6.getType(TypeConstants.DINOSAUR_EGG);
        type6.type();

        EggFactory stickerFactory3 = FactoryProducer.getFactory(FactoryConstants.STICKER_FACTORY);
        Sticker sticker3 = stickerFactory3.getSticker(ConstantsSticker.FLOWER);
        sticker3.cover();

        EggBasket eggBasket6 = new EggBasket();
        eggBasket6.getEggsCounter();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        EggFactory typeFactory7 = FactoryProducer.getFactory(FactoryConstants.TYPE_FACTORY);
        Type type7 = typeFactory7.getType(TypeConstants.CHICKEN_EGG);
        type7.type();

        EggFactory stickerFactory4 = FactoryProducer.getFactory(FactoryConstants.STICKER_FACTORY);
        Sticker sticker4 = stickerFactory4.getSticker(ConstantsSticker.HEART);
        sticker4.cover();

        EggBasket eggBasket7 = new EggBasket();
        eggBasket7.getEggsCounter();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }
}
