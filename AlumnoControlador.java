public class AlumnoControlador 
{
    private Alumno alumno[];

    private int contador;

    

    public AlumnoControlador(int size)
    {
        this.alumno = new Alumno[size];

        this.contador = 0;

        
    
    }

    public void agregar(String nombre, String apellido, int dni, int fechaNacimiento, int añoActual)
    {
        this.alumno[this.contador] = new Alumno(nombre, apellido, dni, fechaNacimiento, añoActual);

        this.contador++;

    }

    public Alumno buscar(String nombre)
    {
        int i;
        for(i=0; i<this.contador; i++)
        {
            if(this.alumno[i].getNombre().equals(nombre))
            {
                break;
            }
        }

        if(i == this.contador)
        {
            return null;
        }else{
            return this.alumno[i];
        }

    }

    public void listar()
    {
        for(int i=0; i<this.contador; i++)
        {
            
            this.alumno[i].listarAlumno();
        }
    }
    
}
