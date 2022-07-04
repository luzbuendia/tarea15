package tarea15;
public class Main 
{
    public static void main(String args[])
    {
    DocenteControlador  docenteControlador = new DocenteControlador(3);
     docenteControlador.crear("alejandra","Perez", 56985666, 1999, 2022, "doctorado", " programador");
     docenteControlador.crear("alejandro","Ramirez", 65546672, 1997, 2022, "doctorado", "diseñador web");
     docenteControlador.crear("alexander","Ramiro", 65546679, 1990, 2022, "doctorado", "trtrt");
     
     System.out.println("------------- Lista de Docente -------------");
     docenteControlador.listar2();

      System.out.println("------------- Buscar Docente -------------");

        int dni = 65546679;

        Docente encontrado;

        encontrado = docenteControlador.buscar(dni);

        if(encontrado != null)
        {
            System.out.println("docente encontrado: "+encontrado.getNombre());
        }
        else {

            System.out.println("No se encontro: "+dni);
        }

     AlumnoControlador  alumnoControlador = new AlumnoControlador(2);
     alumnoControlador.crear1("Jose", "Rojas", 656275783, 1998,2022, 2356768 );
     alumnoControlador.crear1("Jordan", "Romero", 678279783, 1996,2022, 24556768 );
     
     System.out.println("------------- Lista de Alumno-------------");
     alumnoControlador.listar2();

     System.out.println("------------- Buscar Alumno-------------");

        int dni1 = 656275783;

        Alumno eureka;

        eureka = alumnoControlador.buscar(dni1);

        if(eureka != null)
        {
            System.out.println("Alumno encontrado: "+eureka.getNombre());
        }
        else {

            System.out.println("No se encontro: "+dni1);
        }
    }
}
