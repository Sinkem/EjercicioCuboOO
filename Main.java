public class Main {
    public static void main(String[] args) {
        Cubo cubo1 = new Cubo();

        cubo1.getMaterial();
        cubo1.isAsa();
        cubo1.getColor();
        cubo1.getCapacidadMax();
        cubo1.getCapacidadActual();

        cubo1.pintarAsa();
        cubo1.pintarVacioCubo();
        cubo1.pintarLlenoCubo();
    }
}
