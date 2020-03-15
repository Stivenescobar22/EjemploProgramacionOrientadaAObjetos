package empleados;

public class Salario {

    private double horasTrabajadas;
    private double valorHora;

    public double getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    public double calcularSalarioBase(){

        return (this.getHorasTrabajadas() * this.getValorHora());
    }

}
