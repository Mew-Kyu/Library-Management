/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author TranLam
 */
public class myModel extends AbstractTableModel {
    private String[] columns;
    private Object[][] rows;

    public myModel() {
    }

    public myModel(String[] columnName, Object[][] data) {
        this.columns = columnName;
        this.rows = data;
    }
    
    @Override
    public int getRowCount() {
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex][columnIndex];
    }
    
    public String getColumnName(int col){
        return this.columns[col];
    }
}

