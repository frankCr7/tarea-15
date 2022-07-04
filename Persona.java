abstract class Persona 
{
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected int fechaNacimiento;
    protected int añoActual;

    

    public Persona(String nombre, String apellido, int dni, int fechaNacimiento, int añoActual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.añoActual = añoActual;
    }

    protected String getNombre() {
        return nombre;
    }

    protected String getApellido() {
        return apellido;
    }

    protected int getDni() {
        return dni;
    }
    protected int getFechaNacimiento() {
        return fechaNacimiento;
    }
    protected int getAñoActual() {
        return añoActual;
    }
    
    
    protected   int calcularEdad()
    {
        return this.añoActual - this.fechaNacimiento;
        
    }




    
}
