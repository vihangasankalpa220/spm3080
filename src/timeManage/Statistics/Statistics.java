/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeManage.Statistics;

import timeManage.Building.*;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import timeManage.DBManager;

/**
 *
 * @author Vihanga
 */
public class Statistics extends javax.swing.JFrame {

    /**
     * Creates new form AddBook
     */
    public Statistics() {
        initComponents();
        displayTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tfStudentStatistics = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfSubjectStatistics = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfLectureStatistics = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfStudentStatistics.setModel(tfStudentStatistics.getModel());
        tfStudentStatistics.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tfStudentStatistics);
        tfStudentStatistics.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (tfStudentStatistics.getColumnModel().getColumnCount() > 0) {
            tfStudentStatistics.getColumnModel().getColumn(0).setResizable(false);
            tfStudentStatistics.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            tfStudentStatistics.getColumnModel().getColumn(1).setResizable(false);
            tfStudentStatistics.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            tfStudentStatistics.getColumnModel().getColumn(2).setResizable(false);
            tfStudentStatistics.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            tfStudentStatistics.getColumnModel().getColumn(3).setResizable(false);
            tfStudentStatistics.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        tfSubjectStatistics.setModel(tfStudentStatistics.getModel());
        jScrollPane2.setViewportView(tfSubjectStatistics);
        tfSubjectStatistics.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (tfSubjectStatistics.getColumnModel().getColumnCount() > 0) {
            tfSubjectStatistics.getColumnModel().getColumn(0).setResizable(false);
            tfSubjectStatistics.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            tfSubjectStatistics.getColumnModel().getColumn(1).setResizable(false);
            tfSubjectStatistics.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            tfSubjectStatistics.getColumnModel().getColumn(2).setResizable(false);
            tfSubjectStatistics.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            tfSubjectStatistics.getColumnModel().getColumn(3).setResizable(false);
            tfSubjectStatistics.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        tfLectureStatistics.setModel(tfStudentStatistics.getModel());
        jScrollPane3.setViewportView(tfLectureStatistics);
        tfLectureStatistics.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (tfLectureStatistics.getColumnModel().getColumnCount() > 0) {
            tfLectureStatistics.getColumnModel().getColumn(0).setResizable(false);
            tfLectureStatistics.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            tfLectureStatistics.getColumnModel().getColumn(1).setResizable(false);
            tfLectureStatistics.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            tfLectureStatistics.getColumnModel().getColumn(2).setResizable(false);
            tfLectureStatistics.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            tfLectureStatistics.getColumnModel().getColumn(3).setResizable(false);
            tfLectureStatistics.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(199, 199, 199))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(222, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(199, 199, 199)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(295, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //DISPLAY TABLE OF BUILDINGS
    private void displayTable(){
        DB MyDb = null;
        DBCursor cursor = null;
        try {
            MyDb = DBManager.getDatabase();
            DBCollection coll = MyDb.getCollection("Buildings");
            cursor = coll.find();

            String[] columnNames = {"Center", "Building Name", "Department"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            while(cursor.hasNext()) {
                DBObject obj = cursor.next();
                String center = (String)obj.get("center");
                String buildingName = (String)obj.get("buildingName");
                String department = (String)obj.get("department");
                //ObjectId id = (ObjectId)obj.get("_id");
                model.addRow(new Object[] { center, buildingName, department });
            }
            tfStudentStatistics.setModel(model);

            cursor.close(); 
            //MyDb.close();
        }catch(Exception e){
            System.err.println("Error in displayTable() method === "+e);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistics().setVisible(true);
            }
        });
        
        
    }
    
    private static DBObject createDBObject(Building building)
{
            BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
            docBuilder.append("buildingName", building.buildingName);
            docBuilder.append("center", building.center);
            docBuilder.append("department", building.department);
            docBuilder.append("location", building.location);
            docBuilder.append("numberOfFloors", building.numberOfFloors);
            return docBuilder.get();
}
    
    
    
    private static DBObject createRemoveDBObject(Building building)
{
            BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
            docBuilder.append("buildingName", building.buildingName);
            return docBuilder.get();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tfLectureStatistics;
    private javax.swing.JTable tfStudentStatistics;
    private javax.swing.JTable tfSubjectStatistics;
    // End of variables declaration//GEN-END:variables
}
