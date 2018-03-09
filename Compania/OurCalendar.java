package Compania;

public class OurCalendar{

    private int dia;
    private int mes;
    private int año;


    public OurCalendar ( OurCalendar otroDia){
        dia = otroDia.dia;
        mes = otroDia.mes;
        año = otroDia.año;
    }

    @Override
    public String toString() {
        String numDia = dia + "/" + mes + "/" + año;
        return numDia;
    }
}
