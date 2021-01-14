public class Cubo{

    private String material, color;
    private boolean asa;
    private int capacidadMax, capacidadActual;

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAsa() {
        return this.asa;
    }

    public void setAsa(boolean asa) {
        this.asa = asa;
    }

    public int getCapacidadMax() {
        return this.capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCapacidadActual() {
        return this.capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }


    public Cubo() {
        this.material="Metal";
        this.asa=true;
        this.color="Gris";
        this.capacidadMax=10;
        this.capacidadActual=2;
    }

    public Cubo(String material, String color, boolean asa, int capacidadMax, int capacidadActual) {
        this.material = material;
        this.color = color;
        this.asa = asa;
        this.capacidadMax = capacidadMax;
        this.capacidadActual = capacidadActual;
    }

    public void llenar(){
        if(capacidadActual<capacidadMax){
            capacidadActual++;
        } else{
            System.out.println("El cubo ya esta lleno");
        }
    }

    public void vaciar(){
        if(capacidadActual>0){
            capacidadActual--;
        } else{
            System.out.println("El cubo ya esta vacio");
        }
    }
}