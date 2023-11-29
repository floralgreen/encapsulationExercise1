/**
 *
 * Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
 * Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
 * Nel main dichiarare un oggetto di tipo Auto.
 * In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi
 *
 *
 */

public class Main {

    public static void main(String[] args) {

        Auto autoN1 = new Auto("Audi", "Quattro", "AS548GG", 2400);

        autoN1.accelera(80);
        System.out.println(autoN1);

        autoN1.decelera(30);
        System.out.println(autoN1);

    }

}
