
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1234
 */
public class Zapatos extends Objeto{
    private int talla;
    private String material;
    private String suela;
    private int confort;

    public Zapatos() {
        super();
    }

    public Zapatos(int talla, String material, String suela, int confort, Color color, String descripcion, String marca, int tamano, int calidad, double precio, Persona dueño) {
        super(color, descripcion, marca, tamano, calidad, precio, dueño);
        this.talla = talla;
        this.material = material;
        this.suela = suela;
        setConfort(confort);
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    public int getConfort() {
        return confort;
    }

    public void setConfort(int confort) {
        if(confort >= 1 && confort<=10){
            this.confort = confort;
        }
    }

    @Override
    public String toString() {
        return "Zapatos{" + "talla=" + talla + ", material=" + material + ", suela=" + suela + ", confort=" + confort + '}';
    }
    
    
    
}
