public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre ="Pretty Manzo";
        cliente.edad= 31;
        cliente.telefono = 42190432;
        cliente.credito = 120000;
        System.out.println("nombre:" + " " + cliente.nombre);
        System.out.println("edad:" + " "+ cliente.edad);
        System.out.println("telefono:" + " " + cliente.telefono);
        System.out.println("credito:" + " " + cliente.credito);
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Marcelo";
        trabajador.edad=54;
        trabajador.telefono= 42380345;
        trabajador.salario=100780;
        System.out.println("nombre:"+ " " + trabajador.nombre);
        System.out.println("edad:"+ " " + trabajador.edad);
        System.out.println("telefono:"+ " " + trabajador.telefono);
        System.out.println("salario:"+ " " + trabajador.salario);

    }
}
class Persona{
    String nombre;
    int edad;
    int telefono;
}
class Cliente extends Persona{
    int credito;
}
class Trabajador extends Persona{
    int salario;
}