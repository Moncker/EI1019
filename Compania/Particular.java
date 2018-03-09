package Compania;

public class Particular extends Cliente {

    private String apellidos;

    public Particular (){
        super();
    }

    public Particular ( Particular otroParticular){
        super();
        apellidos = otroParticular.apellidos;
    }


}
