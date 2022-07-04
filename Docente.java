public class Docente extends Persona
{
    private int edad;

    private String grado;
    
    private String titulo;
    

    public Docente(String nombre, String apellido, int dni, int fechaNacimiento, int añoActual)
    {
        super(nombre, apellido, dni, fechaNacimiento, añoActual);

    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}

    public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


    @Override
    public int calcularEdad()
    {
       return this.añoActual - this.edad;
        
    }

    public void listarDocente()
    {
        System.out.println("NOMBRE: "+ this.getNombre());
        System.out.println("APELLIDO: "+ this.getApellido());
        System.out.println("DNI: "+ this.getDni());
        System.out.println("FECHA DE NACIMIENTO: "+ this.getFechaNacimiento());
        System.out.println("AÑO ACTUAL: "+ this.getAñoActual());
        
    }
}
