/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap15.pkg4;

/**
 *
 * @author wuser
 */
public enum OpcionMenu {
    SALDO_CERO(1),
    SALDO_CREDITO(2),
    SALDO_DEBITO(3),
    FIN(4);
    private final int  valor;
    
    private OpcionMenu(int valor){
        this.valor = valor;
    }
}
