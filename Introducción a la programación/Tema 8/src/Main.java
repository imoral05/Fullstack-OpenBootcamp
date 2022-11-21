public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(20);
        persona.setNombre("Julia");
        persona.setTelefono("678412985");
        System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años y su número de teléfono es "+persona.getTelefono());

    }
}