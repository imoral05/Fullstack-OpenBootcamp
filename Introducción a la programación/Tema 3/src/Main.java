public class Main {
    public static void main(String[] args) {
        //Llamada a función suma
        System.out.println(suma(30, 3, 51));

        //Creación instancia a objeto coche
        Coche miCoche =  new Coche();
        //Se le añaden 2 puertas
        miCoche.AnadirPuertas(2);
        System.out.println("Mi coche tiene " + miCoche.numeroPuertas + " puertas");
    }

    public static int suma(int a, int b, int c)
    {
        return a+b+c;
    }
}