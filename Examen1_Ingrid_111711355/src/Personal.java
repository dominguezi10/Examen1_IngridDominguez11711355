/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1234
 */
public class Personal extends Persona {
    private String ocupacion;
    private int horario;
    private int tiempo_trabajando;
    private double sueldo;

    public Personal() {
        super();
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getTiempo_trabajando() {
        return tiempo_trabajando;
    }

    public void setTiempo_trabajando(int tiempo_trabajando) {
        this.tiempo_trabajando = tiempo_trabajando;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Personal{" + "ocupacion=" + ocupacion + ", horario=" + horario + ", tiempo_trabajando=" + tiempo_trabajando + ", sueldo=" + sueldo + '}';
    }
    
    
    
}
