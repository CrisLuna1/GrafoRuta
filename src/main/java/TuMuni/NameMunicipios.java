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
                centinela = "Agua Blanca";
                break;
            case 'B':
                centinela = "Asunsion Mita";
                break;
            case 'C':
                centinela = "Atescatempa";
                break;
            case 'D':
                centinela = "Comapa";
                break;
            case 'E':
                centinela = "Conguaco";
                break;
            case 'F':
                centinela = "El Adelanto";
                break;
            case 'G':
                centinela = "El Progreso";
                break;
            case 'H':
                centinela = "Jalpatagua ";
                break;
            case 'I':
                centinela = "Jerez ";
                break;
            case 'J':
                centinela = "Jutiapa ";
                break;
            case 'K':
                centinela = "Moyuta";
                break;
            case 'L':
                centinela = "Pasaco";
                break;
            case 'M':
                centinela = "Quesada";
                break;
            case 'N':
                centinela = "San Jose Acatempa";
                break;
            case 'O':
                centinela = "Santa Catarina Mita";
                break;
            case 'P':
                centinela = "Yupiltepeque";
                break;
            case 'Q':
                centinela = "Zapotitlan";
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
