/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generatesentences;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import model.*;

/**
 *
 * @author admin
 */
//String value0String, String value1String, String value2String
public class BTL {
    ReadFile rfVNINDEX = new ReadFile();
    ReadFile rfUPCOMINDEX = new ReadFile();
    ReadFile rfHNXINDEX = new ReadFile();
    ReadFile topInc = new ReadFile();
    ReadFile topDec = new ReadFile();
    ReadFile topKLGD = new ReadFile();
    
    public BTL() throws IOException // Khi khong chon file ma su dung luon duong dan da dinh san
    {
        topInc.readShortFileExcel("E:\\[JAVA]NetBeans\\BTL\\test\\top10.xlsx",0);
        topDec.readShortFileExcel("E:\\[JAVA]NetBeans\\BTL\\test\\top10.xlsx",1);
        topKLGD.readShortFileExcel("E:\\[JAVA]NetBeans\\BTL\\test\\top10.xlsx",2);

        rfVNINDEX.readFileExcel("E:\\[JAVA]NetBeans\\BTL\\test\\stock.xlsx",0);
        rfUPCOMINDEX.readFileExcel("E:\\[JAVA]NetBeans\\BTL\\test\\stock.xlsx",1);
        rfHNXINDEX.readFileExcel("E:\\[JAVA]NetBeans\\BTL\\test\\stock.xlsx",2);
    }
    
    public BTL(String valueString1, String valueString2, String valueString3) throws IOException // Khi ca 3 file deu duoc lay ve
    {
        topInc.readShortFileExcel(valueString2,0);
        topDec.readShortFileExcel(valueString2,1);
        topKLGD.readShortFileExcel(valueString2,2);
        
        rfVNINDEX.readFileExcel(valueString1,0);
        rfUPCOMINDEX.readFileExcel(valueString1,1);
        rfHNXINDEX.readFileExcel(valueString1,2);
    }    
    
    public void writeFileTxt() throws IOException {    
        // File dau ra 
        PrintWriter printWriter = new PrintWriter("ketqua.txt","utf8");
        //PrintWriter printWriter = new PrintWriter( new OutputStreamWriter( "ketqua.txt", StandardCharsets.UTF_8 ) );
        // Nhom 5-0
        for(int i=0; i<rfVNINDEX.totalRow; i++)
        {
            Nhom5_0 nhom5_0 = new Nhom5_0(rfVNINDEX.list[i],rfUPCOMINDEX.list[i],rfHNXINDEX.list[i]);
            nhom5_0.printResult(printWriter);
        }
        
        // Nhom 5-1
        for(int i=0; i<rfUPCOMINDEX.totalRow; i++)
        {
            Nhom5_1 nhom5_1 = new Nhom5_1(rfVNINDEX.list[i], rfUPCOMINDEX.list[i], rfHNXINDEX.list[i]);
            nhom5_1.printResult(printWriter);
        }
        
        // Nhom 5-2
        for(int i=0; i<rfUPCOMINDEX.totalRow; i++)
        {
            Nhom5_2 nhom5_2 = new Nhom5_2(rfVNINDEX.list[i], rfUPCOMINDEX.list[i], rfHNXINDEX.list[i]);
            nhom5_2.printResult(printWriter);
        }
        
        // Nhom 5-3
        for(int i=0; i<rfHNXINDEX.totalRow; i++)
        {
            Nhom5_3 nhom5_3 = new Nhom5_3(rfVNINDEX.list[i], rfUPCOMINDEX.list[i], rfHNXINDEX.list[i]);
            nhom5_3.printResult(printWriter);
        }
        
        // Nhom 5-4
        for(int i=0; i<rfHNXINDEX.totalRow; i++)
        {
            Nhom5_4 nhom5_4 = new Nhom5_4(rfVNINDEX.list[i], rfUPCOMINDEX.list[i], rfHNXINDEX.list[i]);
            nhom5_4.printResult(printWriter);
        }
        
        // Nhom 5-5
        for(int i=0; i<rfHNXINDEX.totalRow; i++)
        {
            Nhom5_5 nhom5_5 = new Nhom5_5(rfVNINDEX.list[i], rfUPCOMINDEX.list[i], rfHNXINDEX.list[i]);
            nhom5_5.printResult(printWriter);
        }
        
        // Nhom 5-6
        Nhom5_6 nhom5_6 = new Nhom5_6(rfVNINDEX.list, rfUPCOMINDEX.list, rfHNXINDEX.list, rfVNINDEX.totalRow);
        nhom5_6.printResult(printWriter);
        
        // Nhom 5-7
        Nhom5_7 nhom5_7 = new Nhom5_7(rfVNINDEX.list, rfUPCOMINDEX.list, rfHNXINDEX.list, rfVNINDEX.totalRow);
        nhom5_7.printResult(printWriter);
        
        // Nhom5-8
        for(int i=0; i<rfHNXINDEX.totalRow; i++)
        {
            Nhom5_8 nhom5_8 = new Nhom5_8(rfVNINDEX.list[i], rfUPCOMINDEX.list[i], rfHNXINDEX.list[i]);
            nhom5_8.printResult(printWriter);
        }
              
        // Nhom7-1
        Nhom7_1 nhom7_1 = new Nhom7_1(topInc.list[0], topDec.list[0], topKLGD.list[0]);
        nhom7_1.printResult(printWriter);
        
        // Nhom 5-28
        for(int i=0; i<rfHNXINDEX.totalRow; i++)
        {
            Nhom5_28 nhom5_28 = new Nhom5_28(rfVNINDEX.list[i], rfUPCOMINDEX.list[i], rfHNXINDEX.list[i]);
            nhom5_28.printResult(printWriter);
        }
        
        for(int i=0; i<rfHNXINDEX.totalRow; i++)
        {
            Nhom5_29 nhom5_29 = new Nhom5_29(rfVNINDEX.list[i], rfUPCOMINDEX.list[i], rfHNXINDEX.list[i]);
            nhom5_29.printResult(printWriter);
        }
        
        // Nhom 6-0
        Nhom6_0 nhom6_0 = new Nhom6_0(rfVNINDEX, rfUPCOMINDEX, rfHNXINDEX);
        nhom6_0.printResult(printWriter);
        printWriter.println();
        
        // Nhom 6-1
        Nhom6_1 nhom6_1 = new Nhom6_1(rfVNINDEX, rfUPCOMINDEX, rfHNXINDEX);
        nhom6_1.printResult(printWriter);
        printWriter.println();
        
        // Dong file sau khi ket thuc in tat ca cac nhom
        printWriter.close();
        
    }

}