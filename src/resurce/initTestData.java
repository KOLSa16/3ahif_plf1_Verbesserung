/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resurce;

import bl.Fahrt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sasch
 */
public class initTestData {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        List<Fahrt> l=new ArrayList();
        FileOutputStream fos=new FileOutputStream(new File("src/resurce/fahrten.ser"));
        ObjectOutputStream os=new ObjectOutputStream(fos);
        Fahrt f=new Fahrt(161,5.1,"GU 125 XY");
        os.writeObject(f);
        f=new Fahrt(100,4.3,"GU 120 XY");
        os.writeObject(f);
        f=new Fahrt(75,9.2,"LB 120 XY");
        os.writeObject(f);
    }
}
