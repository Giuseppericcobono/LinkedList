import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruitsList = new LinkedList<>();

        fruitsList.add(new Fruit("Mela"));
        fruitsList.add(new Fruit("Banana"));
        fruitsList.add(new Fruit("Arancia"));

        System.out.println("Lista originale:");
        printFruitsList(fruitsList);

        // Aggiunzione elemento alla prima posizione
        fruitsList.addFirst(new Fruit("Pera"));

        // Aggiunzione elemento all'ultima posizione
        fruitsList.addLast(new Fruit("Uva"));

        System.out.println("\nLista aggiornata:");
        printFruitsList(fruitsList);
    }

    public static void printFruitsList(LinkedList<Fruit> fruitsList) {
        for (Fruit fruit : fruitsList) {
            System.out.println(fruit.getName());
        }
    }
}