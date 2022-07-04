public class Alumno extends Persona
{
    private int edad;
    
    private int codigo;
    

    public Alumno(String nombre, String apellido, int dni, int fechaNacimiento, int añoActual)
    {
        super(nombre, apellido, dni, fechaNacimiento, añoActual);

    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

    


    @Override
    public int calcularEdad()
    {
       return this.añoActual - this.edad;
        
    }

    public void listarAlumno()
    {
        System.out.println("NOMBRE: "+ this.getNombre());
        System.out.println("APELLIDO: "+ this.getApellido());
        System.out.println("DNI: "+ this.getDni());
        System.out.println("FECHA DE NACIMIENTO: "+ this.getFechaNacimiento());
        System.out.println("AÑO ACTUAL: "+ this.getAñoActual());
        
    }
    
}
