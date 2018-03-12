package Compania;

public class Llamada implements Fechable{

    String numTelefono;
    OurClock horaInicio;
    double duracion;
    OurCalendar dia;

    public Llamada (){
    }

    public Llamada ( Llamada otraLlamada){
        numTelefono = otraLlamada.numTelefono;
        horaInicio = otraLlamada.horaInicio;
        duracion = otraLlamada.duracion;
        dia = otraLlamada.dia;
    }



    public OurCalendar getFecha() {
        return dia;
    }
}
