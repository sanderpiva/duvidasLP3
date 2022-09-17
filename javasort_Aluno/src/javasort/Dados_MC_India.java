/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasort;

public class Dados_MC_India{
    
    private String menuCategory;
    private String menuItens;
    private String perServeSize;
    private int energyKcal;
    private int proteinG;
    private int totalFatG;
    private double satFat;
    private double transFatG;
    private double cholesterolsMG;

    public String getMenuCategory() {
        return menuCategory;
    }

    public void setMenuCategory(String menuCategory) {
        this.menuCategory = menuCategory;
    }

    public String getMenuItens() {
        return menuItens;
    }

    public void setMenuItens(String menuItens) {
        this.menuItens = menuItens;
    }

    public String getPerServeSize() {
        return perServeSize;
    }

    public void setPerServeSize(String perServeSize) {
        this.perServeSize = perServeSize;
    }

    public int getEnergyKcal() {
        return energyKcal;
    }

    public void setEnergyKcal(int energyKcal) {
        this.energyKcal = energyKcal;
    }

    public int getProteinG() {
        return proteinG;
    }

    public void setProteinG(int proteinG) {
        this.proteinG = proteinG;
    }

    public int getTotalFatG() {
        return totalFatG;
    }

    public void setTotalFatG(int totalFatG) {
        this.totalFatG = totalFatG;
    }

    public double getSatFat() {
        return satFat;
    }

    public void setSatFat(double satFat) {
        this.satFat = satFat;
    }

    public double getTransFatG() {
        return transFatG;
    }

    public void setTransFatG(double transFatG) {
        this.transFatG = transFatG;
    }

    public double getCholesterolsMG() {
        return cholesterolsMG;
    }

    public void setCholesterolsMG(double cholesterolsMG) {
        this.cholesterolsMG = cholesterolsMG;
    }
    /*
    @Override    
    public int compareTo(Dados_MC_India outroDado){
      return this.getMenuCategory().
              compareTo(outroDado.getMenuCategory());
    }*/
    
    @Override
    public String toString() {
        return "Dados_MC_India{" + "menuCategory=" + menuCategory + ", menuItens=" + menuItens + ", perServeSize=" + perServeSize + ", energyKcal=" + energyKcal + ", proteinG=" + proteinG + ", totalFatG=" + totalFatG + ", satFat=" + satFat + ", transFatG=" + transFatG + ", cholesterolsMG=" + cholesterolsMG + '}';
    }
    
    
}
