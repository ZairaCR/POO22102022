/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacuentahambiente;

/**
 *
 * @author zaira
 */
public class PruebaEjemplo {
    
      public static void main(String args[]){
         
        CuentaHabiente[] cuentas = new CuentaHabiente[5];   
        cuentas[0]=new CuentaHabiente("oofd18070","Zaira Cruz", 75000);
        cuentas[1]=new CuentaHabiente("uids20563","Luis Garcia", 43000);
        cuentas[2]=new CuentaHabiente("imcr56936","Ingrid Cruz", 50000);
        cuentas[3]=new CuentaHabiente("csrm20077","Cecilia Ramirez", 49999);
        cuentas[4]=new CuentaHabiente("glgj01075","Gabriela Luna", 50001);
        
        for (int i = 0; i < cuentas.length; i++) {
            
            cuentas[i].retirarDinero(10000);
            System.out.println(cuentas[i]);
            if(cuentas[i].getBalance()<=50000){
                System.out.println("La cuenta de " +cuentas[i].nombre);
                System.out.println(" es REGULAR");
            }else{
                System.out.println("La cuenta de " +cuentas[i].nombre);
                System.out.println(" es PREMIUM");               
            }
        }
}
}
