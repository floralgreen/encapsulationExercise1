public class Auto {

    private String marca;
    private String modello;
    private String targa;
    private int cilindrata;
    private int velocita;

    public Auto(String marca, String modello, String targa, int cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    public void accelera(int kmH){
        this.velocita += kmH;
    }

    public void decelera(int kmH) {
        this.velocita -= kmH;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    @Override
    public String toString() {
        String print = "Auto {" +
                "marca = " + marca +
                ", modello = " + modello +
                ", targa='" + targa +
                ", cilindrata = " + cilindrata +
                ", velocita = " + velocita +
                '}';
        return print;
    }
}
