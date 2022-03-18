/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composicion;

/**
 *
 * @author zaira
 */
public class Editorial {
    private String NomEditorial;
    private int AñoPublic;

    public Editorial() {
    }

    public Editorial(String NomEditorial, int AñoPublic) {
        this.NomEditorial = NomEditorial;
        this.AñoPublic = AñoPublic;
    }

    public String getNomEditorial() {
        return NomEditorial;
    }

    public void setNomEditorial(String NomEditorial) {
        this.NomEditorial = NomEditorial;
    }

    public int getAñoPublic() {
        return AñoPublic;
    }

    public void setAñoPublic(int AñoPublic) {
        this.AñoPublic = AñoPublic;
    }

    @Override
    public String toString() {
        return "Editorial{" + "NomEditorial=" + NomEditorial + ", A\u00f1oPublic=" + AñoPublic + '}';
    }

    
}
