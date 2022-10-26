/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nhyth
 */
public  class ModeloTabela extends AbstractTableModel{
    
    private ArrayList linhas = null;
    private String[]colunas = null;
    
    public ModeloTabela(ArrayList lin,String [] col){
     setLinhas(lin);
     setColunas(col);
      
    }
    public ArrayList getLinhas(){
       return linhas; 
        
    }
    public void setLinhas(ArrayList dados){
        linhas = dados;
    }
    public String[] getColunas(){
        return colunas;
    }
    
    public void setColunas (String [] nomes){
        colunas = nomes;
    }
    public int getColumnCount(){
       return colunas.length;
    }
    public int getRowCount(){
        return linhas.size();
    }
    public String getColumnname(int numCol){
       return colunas[numCol]; 
    }
    public Object getValueAt(int numLin , int numCol){
        Object[] linha = ( Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
    
    
    
    
    
    
    
    
}
