/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generatesentences;

import java.io.PrintWriter;

import model.ReadFile;

/**
 *
 * @author admin
 */
public abstract class GeneralGroup3 implements GeneralGroup{
    protected ReadFile rfVNINDEX;
    protected ReadFile rfUPCOMINDEX;
    protected ReadFile rfHNXINDEX;
    
    public GeneralGroup3(ReadFile rfVNINDEX, ReadFile rfUPCOMINDEX, ReadFile rfHNXINDEX) {
        this.rfVNINDEX = rfVNINDEX;
        this.rfUPCOMINDEX = rfUPCOMINDEX;
        this.rfHNXINDEX = rfHNXINDEX;
    }
    
//    public abstract void printResult(PrintWriter printWriter);
}
