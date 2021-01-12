/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.model;

import javax.swing.JComboBox;

/**
 *
 * @author Steven
 */
public class MyCombobox {
     public Object Text;
    public Object Value;

    public MyCombobox(Object text, Object value) {
        this.Text = text;
       this.Value = value;
    }

    @Override
    public String toString() {
        return Text.toString();
    }
    
    public void setSelectedCombobox(String cbbselected, JComboBox cbb) {
        for (int i = 0; i < cbb.getItemCount(); i++) {
            Object obj = cbb.getItemAt(i);
            if (obj != null) {
                MyCombobox m = (MyCombobox) obj;
                if (cbbselected.trim().equals(Text)) {
                    cbb.setSelectedItem(m);
                }
            }
        }
    }
}
