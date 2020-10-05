/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Usuario
 */
public class ModelComboCargo extends DefaultComboBoxModel {

    public ModelComboCargo(){
        for(Cargo cargo: Cargo.values())
            this.addElement(cargo);
    }
    
    public Cargo obtenerCargo(){
        return (Cargo)this.getSelectedItem();
    }
    
    public void seleccionarCargo(Cargo cargo){
        this.setSelectedItem(cargo);
    }
    
}
