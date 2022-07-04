public class DocenteCrontolador 
{
    private Docente docente[];

    private int contador;

    public DocenteCrontolador(int size)
    {
        this.docente = new Docente[size];

        this.contador = 0;
    }

    public void agregar(String nombre, String apellido, int dni, int fechaNacimiento, int añoActual)
    {
        this.docente[this.contador] = new Docente(nombre, apellido, dni, fechaNacimiento, añoActual);

        this.contador++;

    }

    public Docente buscar(String nombre)
    {
        int i;
        for(i=0; i<this.contador; i++)
        {
            if(this.docente[i].getNombre().equals(nombre))
            {
                break;
            }
        }

        if(i == this.contador)
        {
            return null;
        }else{
            return this.docente[i];
        }

    }

    public void listar()
    {
        for(int i=0; i<this.contador; i++)
        {
            //System.out.println(this.alumno[i].getNombre());
            this.docente[i].listarDocente();
        }
    }
    
}
