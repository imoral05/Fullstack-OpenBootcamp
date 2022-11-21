public class Main {
    public static void main(String[] args) {
        int numeroIf = -4;
        tipoNumero(numeroIf);

        int numeroWhile = 0;
        while(numeroWhile < 3)
        {
            System.out.println("El numeroWhile tiene el valor "+ numeroWhile);
            ++numeroWhile;
        }

        numeroWhile = 0;
        do
        {
            System.out.println("El numeroWhile tiene el valor "+ numeroWhile);
            ++numeroWhile;

        }while(numeroWhile == 0);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++)
        {
            System.out.println("El numeroFor tiene el valor "+ numeroFor);
        }


        String estacion = "invierno";
        switch (estacion)
        {
            case "primavera":
                System.out.println("La estación es " + estacion);
                break;
            case "verano":
                System.out.println("La estación es " + estacion);
                break;
            case "otoño":
                System.out.println("La estación es " + estacion);
                break;
            case "invierno":
                System.out.println("La estación es " + estacion);
                break;
            default:
                System.out.println(estacion + " no es una estación del año");
        }
    }

    private static void tipoNumero(int numeroIf) {
        if(numeroIf == 0)
        {
            System.out.println("El número es igual a 0");
        }
        else if(numeroIf > 0)
        {
            System.out.println("El número es positivo");
        }
        else if(numeroIf < 0)
        {
            System.out.println("El número es negativo");
        }
    }
}