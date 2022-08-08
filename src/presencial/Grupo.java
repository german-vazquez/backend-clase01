package presencial;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Persona> personas;

    public Grupo(){
        personas= new ArrayList<>();
    }

    public void agregarPersona(Persona persona){
        //verificamos si cumple los requisitos para ingresar al grupo
        if (persona.esMayor()&& persona.siElNombreEsMayorA5Letras()){
            personas.add(persona);
        }
        else {
            System.out.println("no se puede agregar a " + persona.getNombre());
        }
    }
    public int cantidadPersonas(){
        return personas.size();
    }
}
