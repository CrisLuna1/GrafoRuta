/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TuMuni;

/**
 *
 * @author Chomin
 */
public class NameMunicipios {
    
    public String nameMuni (char tumuni){
        String centinela = "";
        switch (tumuni) {
            case 'A':
                centinela = "Agua_Blanca";
                break;
            case 'B':
                centinela = "Asunsion_Mita";
                break;
            case 'C':
                centinela = "Atescatempa";
                break;
            default:
                throw new AssertionError();
                
        }
        
        
        return centinela;
    } 
    
    public String nameMuniInver (String tumuni){
        String centinela = "";
        switch (tumuni) {
            case "a":
                centinela = "hola";
                break;
            default:
                throw new AssertionError();
        }
        
        return centinela;
    }
    
}
