/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author l222552
 */
public class Consulta {
    private String dat_con;
    private String historico;

    public Consulta(String dat_con, String historico) {
        this.dat_con = dat_con;
        this.historico = historico;
    }

    public String getDat_con() {
        return dat_con;
    }

    public void setDat_con(String dat_con) {
        this.dat_con = dat_con;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
    
}
