public class CocheMejorado {
    private String marca;
    private String modelo;
    private int anyoFabricación;
    private double combustibleActual;
    private double consumo;
    private double kilometraje;

    public CocheMejorado(String marca, String modelo, int anyoFabricación, double combustibleActual, double consumo, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricación = anyoFabricación;
        this.combustibleActual = combustibleActual;
        this.consumo = consumo;
        this.kilometraje = kilometraje;
    }

    public CocheMejorado(String marca, String modelo, int anyoFabricación) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricación = anyoFabricación;
        this.combustibleActual = 0.0;
        this.consumo = 0.0;
        this.kilometraje = 0.0;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyoFabricación() {
        return anyoFabricación;
    }

    public void setAnyoFabricación(int anyoFabricación) {
        this.anyoFabricación = anyoFabricación;
    }

    public double getCombustibleActual() {
        return combustibleActual;
    }

    public void setCombustibleActual(double combustibleActual) {
        this.combustibleActual = combustibleActual;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }


    public void conducir(double km){
        this.kilometraje += km;
        this.combustibleActual -= km * this.consumo;
    }
    public void repostar(double l){
        this.combustibleActual += l;
    }
    public double getAutonomia(){
        return this.combustibleActual/this.consumo;
    }

    @Override
    public String toString(){
        return this.marca + " " + this.modelo;
    }

}
