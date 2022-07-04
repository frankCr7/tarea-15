public class Main {

    public static void main(String args[])
    {

        Alumno alumno = new Alumno("Frank", "Nieto Espinoza", 444885211, 2003,2022);
        System.out.println("*******Datos del Alumno*******");
        System.out.println("nombre del alumno : "+alumno.getNombre()+" "+alumno.getApellido());
        System.out.println("DNI: "+alumno.getDni());
        System.out.println("FECHA DE NACIMIENTO: "+alumno.getFechaNacimiento());
        System.out.println("año actual: "+alumno.getAñoActual());

        alumno.setEdad(2003);
        alumno.setCodigo(2019110470);
        
        System.out.println("nacimiento del alumno: "+alumno.getEdad());
        System.out.println("CODIGO DEL ALUMNO: "+alumno.getCodigo());
        System.out.println("edad actual del alumno: "+alumno.calcularEdad());


        System.out.println("***********************************");

        AlumnoControlador alumnoControlador = new AlumnoControlador(2);
        alumnoControlador.agregar("Jose", "Nuñes Esteban", 456213789, 2000, 2022);
        alumnoControlador.agregar("Maria", "Jimenes Bisente", 456789123, 2001, 2022);

        alumnoControlador.listar();
     
        
        

        System.out.println("***********************************");


        Docente docente = new Docente("Rodolfo", "Pastrana Espinoza", 444885211, 1990,2022);
        System.out.println("*******Datos del Docente*******");
        System.out.println("nombre del docente : "+docente.getNombre()+" "+docente.getApellido());
        System.out.println("DNI: "+docente.getDni());
        System.out.println("FECHA DE NACIMIENTO: "+docente.getFechaNacimiento());
        System.out.println("año actual: "+docente.getAñoActual());

        docente.setEdad(1990);
        
        docente.setGrado("BACHILLER");

        docente.setTitulo("INGENIERO DE SISTEMAS E INFORMATICA");

        System.out.println("nacimiento del docente: "+docente.getEdad());
        System.out.println("GRADO DEL DOCENTE: "+docente.getGrado());
        System.out.println("TITULO DEL DOCENTE: "+docente.getTitulo());
        System.out.println("edad actual del docente: "+docente.calcularEdad());

        System.out.println("***********************************");

        DocenteCrontolador docenteControlador = new DocenteCrontolador(2);
        docenteControlador.agregar("Wilder", "Nuñes Esteban", 456213789, 2000, 2022);
        docenteControlador.agregar("Carlos", "Jimenes Bisente", 456789123, 2001, 2022);

        alumnoControlador.listar();
     
        System.out.println("***********************************");

        
        


        

        

        

        




    }
    
}
