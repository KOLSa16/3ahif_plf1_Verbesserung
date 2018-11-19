/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sasch
 */
public class TabellenModell extends AbstractTableModel{
    private List<Fahrt> list=new ArrayList();
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return FahrtenSpaltenName.values().length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Fahrt f=list.get(i);
        switch(FahrtenSpaltenName.values()[i1]){
            case KM:return f.getKm();
            case LITER:return f.getLiter();
            case KENNZEICHEN:return f.getKennzeichen();
            case VERBRAUCH100KM:return f.getVerbrauch();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        if(i1==FahrtenSpaltenName.valueOf("KENNZEICHEN").ordinal()){//könnte fehlerhaft sein
            Fahrt f=list.get(i);
            f.setKennzeichen((String)o);
            list.set(i,f);
        }
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        if(i1==FahrtenSpaltenName.valueOf("KENNZEICHEN").ordinal()){//könnte fehlerhaft sein
            return true;
        }
        return false;
    }
    public void add(Fahrt f){
        list.add(f);
        fireTableDataChanged();
    }
    public void remove(int i){
        list.remove(i);
        fireTableDataChanged();
    }
    public List<Fahrt> getList() {
        return list;
    }
    
    public void load(File file) throws FileNotFoundException, IOException, ClassNotFoundException,EOFException{
        list=new ArrayList();
        FileInputStream fis=new FileInputStream(file);//new File("src/resurce/fahrten.ser")
        ObjectInputStream os=new ObjectInputStream(fis);
        while(true){
            Fahrt f=(Fahrt) os.readObject();
            list.add(f);
            fireTableDataChanged();
        }
    }
    public void filter(int lower,int higher){
        List<Fahrt> l=new ArrayList();
        System.out.println(lower+"   "+higher);
        for(Fahrt f:list){
            if(f.getKm()<=higher&&f.getKm()>=lower){
                l.add(f);
                System.out.println(f.getKm());
            }
        }
        list=l;
        fireTableDataChanged();
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        TabellenModell tm=new TabellenModell();
        try {
            tm.load(new File("src/resurce/fahrten.ser"));
        } catch (EOFException e) {
            System.out.println(tm.getList());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
