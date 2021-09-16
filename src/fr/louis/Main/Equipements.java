package fr.louis.Main;

public class Equipements {

    private int idEquip;
    private String libelleEquip;

    public Equipements(int ID_Equip, String Desc_Equip){
        this.idEquip = ID_Equip;
        this.libelleEquip = Desc_Equip;
    }

    @Override
    public String toString(){
        return "\n   - " + this.libelleEquip;
    }

    public String getLibelleEquip() {
        return this.libelleEquip;
    }
    public void setLibelleEquip(String libelleEquip) {
        this.libelleEquip = libelleEquip;
    }
    public int getIdEquip() {
        return this.idEquip;
    }
    public void setIdEquip(int idEquip) {
        this.idEquip = idEquip;
    }
}
