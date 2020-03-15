package empleados.constantes;


public enum Mensajes {


    TITULO_MENU("Menu de Opciones"),
    OPCION1("1. calcular salario final"),
    OPCION2("2. salir"),
    HORAS_TRABAJADAS("Ingrese las horas trabajadas"),
    VALOR_HORA("Ingrese el valor de la hora de trabajo:"),
    SALARIO_BASE("el salario base es: "),
    DESCUENTO_SALUD( "\nEl descuento de salud es: "),
    DESCUENTO_PENSION("\nEl descuento de pension es: "),
    SALARIO_FINAL1("\nEl salario final 1 es: "),
    SALARIO_FINAL2("\nEl salario final 2 es: "),
    SALARIO_APAGAR("\nEl salario final a pagar: "),
    OPCION_NO_EXISTE("opcion no existe");

    private String mensaje;



    Mensajes(String mensaje){
        this.mensaje = mensaje;

    }

    public String getMensaje() {
        return mensaje;
    }


}
