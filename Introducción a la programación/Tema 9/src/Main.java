public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(63,"Roberto", "674258931", 2003.45);
        System.out.println("El cliente " + cliente.getNombre()+" con "+cliente.getEdad() + " años tiene el teléfono "+ cliente.getTelefono()+ " y tiene un crédito de "+cliente.getCredito()+" €");

        Trabajador trabajador = new Trabajador(30,"Lucia", "674258931", 1503.45);
        System.out.println("El trabajador " + trabajador.getNombre()+" con "+trabajador.getEdad() + " años tiene el teléfono "+ trabajador.getTelefono()+ " y tiene un crédito de "+trabajador.getSalario()+" €");
    }
}