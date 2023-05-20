import java.util.ArrayList;
import java.util.List;

public class EggBasket implements Observable{

    private List<Type> types = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public int getEggsCounter() {
        return types.size();
    }

    @Override
    public void addEgg(Type type) {
        types.add(type);
        if (getEggsCounter() > 5) {
            notifyObservers();
            System.out.println("Яйцата са готови");
        }
    }
}
