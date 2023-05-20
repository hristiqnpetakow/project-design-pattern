public class FactoryProducer {
    public static EggFactory getFactory(String factoryName) {

        if(factoryName.equals(FactoryConstants.TYPE_FACTORY)) {
            return new TypeFactory();
        }
        if(factoryName.equals(FactoryConstants.PAINT_FACTORY)) {
            return new PaintFactory();
        }
        if(factoryName.equals(FactoryConstants.STICKER_FACTORY)) {
            return new StickerFactory();
        }
        System.out.println("Unknown factory: " + factoryName);
        return null;
    }
}
