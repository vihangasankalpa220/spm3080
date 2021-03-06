/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeManage;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shimran Kuwailid
 */
public class AddBuilding extends javax.swing.JPanel {

    /**
     * Creates new form AddBuilding
     */
    public AddBuilding() {
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

        tfCenter = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        buildingList = new javax.swing.JTable();
        tfBuildingName = new javax.swing.JTextField();
        tfLocation = new javax.swing.JTextField();
        tfDepartment = new javax.swing.JComboBox<>();
        tfNumberOfFloors = new javax.swing.JTextField();
        btnDeleteBuilding = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEditBuilding = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnApplyChanges = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnEditRooms = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addBuilding = new javax.swing.JButton();

        tfCenter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Malabe", "Metro", "Matara", "Kandy", "Jaffna" }));
        tfCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCenterActionPerformed(evt);
            }
        });

        buildingList.setModel(buildingList.getModel());
        buildingList.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(buildingList);
        buildingList.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        tfBuildingName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuildingNameActionPerformed(evt);
            }
        });

        tfDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT", "BM", "Eng", "Arch" }));

        btnDeleteBuilding.setText("Delete Building");
        btnDeleteBuilding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteBuildingMouseClicked(evt);
            }
        });

        jLabel1.setText("Building Name");

        btnEditBuilding.setText("Edit Building");
        btnEditBuilding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditBuildingMouseClicked(evt);
            }
        });

        jLabel2.setText("Center");

        btnApplyChanges.setText("Apply Changes");
        btnApplyChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyChangesActionPerformed(evt);
            }
        });

        jLabel3.setText("Location");

        btnEditRooms.setText("Edit Rooms");
        btnEditRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditRoomsActionPerformed(evt);
            }
        });

        jLabel4.setText("Department");

        jLabel6.setText("Number of Floors");

        addBuilding.setText("Add New Building");
        addBuilding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBuildingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfLocation, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfBuildingName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNumberOfFloors, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApplyChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEditRooms)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditBuilding)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteBuilding)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBuildingName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(tfDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfNumberOfFloors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addBuilding)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDeleteBuilding)
                        .addComponent(btnEditBuilding)
                        .addComponent(btnEditRooms))
                    .addComponent(btnApplyChanges))
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCenterActionPerformed

    private void tfBuildingNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuildingNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuildingNameActionPerformed

    private void btnDeleteBuildingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteBuildingMouseClicked
        // TODO add your handling code here:
        int row = buildingList.getSelectedRow();
        String buildingName = buildingList.getModel().getValueAt(row, 1).toString();

        DB MyDb = null;
        try
        {
            MyDb = DBManager.getDatabase();
        }
        catch (UnknownHostException e)
        {
            JOptionPane.showMessageDialog(null, "Error When Connecting to DB" + e);
        }
        DBCollection col = MyDb.getCollection("Buildings");
        BasicDBObject theQuery = new BasicDBObject();
        theQuery.put("buildingName", buildingName);
        WriteResult result = col.remove(theQuery);
    }//GEN-LAST:event_btnDeleteBuildingMouseClicked

    private void btnEditBuildingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditBuildingMouseClicked
        // TODO add your handling code here:
        int row = buildingList.getSelectedRow();
        String buildingName = buildingList.getModel().getValueAt(row, 1).toString();

        DB MyDb = null;
        try
        {
            MyDb = DBManager.getDatabase();
        }
        catch (UnknownHostException e)
        {
            JOptionPane.showMessageDialog(null, "Error When Connecting to DB" + e);
        }
        DBCollection col = MyDb.getCollection("Buildings");
        DBObject theQuery = new BasicDBObject("buildingName", buildingName);
        DBObject result = col.findOne(theQuery);
        tfBuildingName.setText((String)result.get("buildingName"));
        //tfBuildingName.setEditable(false);
        tfCenter.setSelectedItem((String)result.get("center"));
        tfLocation.setText((String)result.get("location"));
        tfDepartment.setSelectedItem((String)result.get("department"));
        tfNumberOfFloors.setText((String)result.get("numberOfFloors"));
    }//GEN-LAST:event_btnEditBuildingMouseClicked

    private void btnApplyChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyChangesActionPerformed
        // TODO add your handling code here:
        try
        {
            String buildingName = tfBuildingName.getText();
            String center = (String)tfCenter.getSelectedItem();
            String department = (String)tfDepartment.getSelectedItem();
            String location = (String)tfLocation.getText();
            String numberOfFloors = tfNumberOfFloors.getText();

            if (buildingName.length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Building Name is Mandatory");
            }
            else
            {
                //Check if name is there in DB
                DB MyDb = null;
                try
                {
                    MyDb = DBManager.getDatabase();
                }
                catch (UnknownHostException e)
                {
                    JOptionPane.showMessageDialog(null, "Error When Connecting to DB : " + e);
                }
                DBCollection col = MyDb.getCollection("Buildings");
                BasicDBObject theQuery = new BasicDBObject("buildingName", buildingName);
                DBObject result = col.findOne(theQuery);

                if(result == null){
                    //If not add as new building
                    Building building = new Building(buildingName, center, department, location, numberOfFloors);
                    DBObject doc = createDBObject(building);
                    col.insert(doc);
                    JOptionPane.showMessageDialog(null, "Building Added Successfully");
                    tfBuildingName.setText(null);
                    tfCenter.setSelectedItem(null);
                    tfLocation.setText(null);
                    tfDepartment.setSelectedItem(null);
                    tfNumberOfFloors.setText(null);
                }else{
                    //if yes Edit existing building
                    BasicDBObject query = new BasicDBObject();
                    query.put("buildingName", buildingName);

                    BasicDBObject newDocument = new BasicDBObject();
                    newDocument.put("center", center);
                    newDocument.put("location", location);
                    newDocument.put("numberOfFloors", numberOfFloors);
                    newDocument.put("department", department);

                    BasicDBObject updateObject = new BasicDBObject();
                    updateObject.put("$set", newDocument);

                    MyDb.getCollection("Buildings").update(query, updateObject);
                    JOptionPane.showMessageDialog(null, "Building Updated Succesfully!");
                }
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Insertion Failed  please Fill Details to add!" + e.toString());
            tfBuildingName.grabFocus();
        }
    }//GEN-LAST:event_btnApplyChangesActionPerformed

    private void btnEditRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditRoomsActionPerformed
        // TODO add your handling code here:
        int row = buildingList.getSelectedRow();
        String buildingName = buildingList.getModel().getValueAt(row, 1).toString();

        DB MyDb = null;
        try
        {
            MyDb = DBManager.getDatabase();
        }
        catch (UnknownHostException e)
        {
            JOptionPane.showMessageDialog(null, "Error When Connecting to DB" + e);
        }
        DBCollection col = MyDb.getCollection("Buildings");
        DBObject theQuery = new BasicDBObject("buildingName", buildingName);
        DBObject result = col.findOne(theQuery);
        String buildingId = result.get("_id").toString();

        //pass data from building to room
        //new AddRoom(buildingId);
        
        this.removeAll();
        Dashboard db = new Dashboard();
        db.showRoomPage(buildingId);
    }//GEN-LAST:event_btnEditRoomsActionPerformed

    private void addBuildingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBuildingActionPerformed
        try
        {
            String buildingName = tfBuildingName.getText();
            String center = (String)tfCenter.getSelectedItem();
            String department = (String)tfDepartment.getSelectedItem();
            String location = (String)tfLocation.getText();
            String numberOfFloors = tfNumberOfFloors.getText();

            if (buildingName.length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Building Name is Mandatory");
            }
            else
            {
                Building building = new Building(buildingName, center, location, department, numberOfFloors);
                DBObject doc = createDBObject(building);
                DB MyDb = null;
                try
                {
                    MyDb = DBManager.getDatabase();
                }
                catch (UnknownHostException ex)
                {
                    JOptionPane.showMessageDialog(null, "Error When Connecting to DB");
                }
                DBCollection col = MyDb.getCollection("Buildings");
                WriteResult result = col.insert(doc);
                JOptionPane.showMessageDialog(null, "Building added Successfully");
                tfBuildingName.setText(null);
                tfCenter.setSelectedItem(null);
                tfLocation.setText(null);
                tfDepartment.setSelectedItem(null);
                tfNumberOfFloors.setText(null);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Insertion Failed  please Fill Details to add!" + e.toString());
            tfBuildingName.grabFocus();
        }

    }//GEN-LAST:event_addBuildingActionPerformed

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
            buildingList.setModel(model);

            cursor.close(); 
            //MyDb.close();
        }catch(Exception e){
            System.err.println("Error in displayTable() method === "+e);
        }
    }
    
    private static DBObject createDBObject(Building building)
{
            BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
            docBuilder.append("buildingName", building.buildingName);
            docBuilder.append("center", building.center);
            docBuilder.append("location", building.location);
            docBuilder.append("department", building.department);
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
    private javax.swing.JButton addBuilding;
    private javax.swing.JButton btnApplyChanges;
    private javax.swing.JButton btnDeleteBuilding;
    private javax.swing.JButton btnEditBuilding;
    private javax.swing.JButton btnEditRooms;
    private javax.swing.JTable buildingList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfBuildingName;
    private javax.swing.JComboBox<String> tfCenter;
    private javax.swing.JComboBox<String> tfDepartment;
    private javax.swing.JTextField tfLocation;
    private javax.swing.JTextField tfNumberOfFloors;
    // End of variables declaration//GEN-END:variables
}
