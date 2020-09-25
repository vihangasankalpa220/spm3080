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
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;

/**
 *
 * @author Shimran Kuwailid
 */
public class AddRoom extends javax.swing.JPanel {
    
    String buildingId, buildingName, buildingCenter, buildingDepartment, buildingLocation, buildingNumberOfFloors;
    ArrayList<String> selectedRoomNumbers = new ArrayList<String>();
    JDesktopPane jp;

    /**
     * Creates new form AddRoom
     */
    public AddRoom() {
        DBIntialization();
        initComponents();
        displayTable();
    }
    
    public AddRoom(String buildingId){
        this.buildingId = buildingId;
        DBIntialization();
        initComponents();
        displayTable();
    }
    
    public AddRoom(String buildingId, JDesktopPane jp){
        this.buildingId = buildingId;
        DBIntialization();
        initComponents();
        displayTable();
        this.jp = jp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        options = new javax.swing.JDialog();
        rNote = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rDateTime = new com.github.lgooddatepicker.components.DateTimePicker();
        rEndTime = new com.github.lgooddatepicker.components.TimePicker();
        jLabel8 = new javax.swing.JLabel();
        reserve = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        rType = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfLocation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfSection = new javax.swing.JTextField();
        tfFloorNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnDeleteRoom = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnEditRoom = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnApplyChanges = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnOptions = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        addRoom = new javax.swing.JButton();
        tfType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomList = new javax.swing.JTable();
        tfRoomNumber = new javax.swing.JTextField();
        viewReservations = new javax.swing.JButton();

        rNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rNoteActionPerformed(evt);
            }
        });

        jLabel14.setText(this.buildingName);

        jLabel15.setText(this.selectedRoomNumbers.toString());

        jLabel8.setText("Type");

        reserve.setText("Reserve");
        reserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveActionPerformed(evt);
            }
        });

        jLabel10.setText("End Time");

        rType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tag", "Lecturer", "Group", "Session", "Reservation" }));
        rType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rTypeActionPerformed(evt);
            }
        });

        jLabel11.setText("Date");

        jLabel12.setText("Additional Info");

        javax.swing.GroupLayout optionsLayout = new javax.swing.GroupLayout(options.getContentPane());
        options.getContentPane().setLayout(optionsLayout);
        optionsLayout.setHorizontalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionsLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addGroup(optionsLayout.createSequentialGroup()
                        .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rNote, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(optionsLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(reserve)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        optionsLayout.setVerticalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(35, 35, 35)
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(rDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(rNote, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(reserve)
                .addGap(69, 69, 69))
        );

        jLabel5.setText(buildingName);

        jLabel1.setText("Room Number");

        btnDeleteRoom.setText("Delete Room");
        btnDeleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRoomActionPerformed(evt);
            }
        });

        jLabel2.setText("Room Type");

        btnEditRoom.setText("Edit Room");
        btnEditRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditRoomActionPerformed(evt);
            }
        });

        jLabel3.setText("Location");

        btnApplyChanges.setText("Apply Changes");
        btnApplyChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyChangesActionPerformed(evt);
            }
        });

        jLabel4.setText("Floor Number");

        btnOptions.setText("Reserve Room");
        btnOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionsActionPerformed(evt);
            }
        });

        jLabel6.setText("Section");

        addRoom.setText("Add New Room");
        addRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomActionPerformed(evt);
            }
        });

        tfType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lecture Hall", "Lab", "Hall", "Auditorium"}));
        tfType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTypeActionPerformed(evt);
            }
        });

        roomList.setModel(roomList.getModel());
        roomList.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(roomList);
        roomList.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        tfRoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRoomNumberActionPerformed(evt);
            }
        });

        viewReservations.setText("View All Reservations");
        viewReservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReservationsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jLabel5)
                .addGap(474, 478, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(135, 135, 135)
                            .addComponent(tfRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfLocation, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfFloorNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(100, 100, 100)
                        .addComponent(tfSection, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnApplyChanges, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(viewReservations)
                        .addGap(18, 18, 18)
                        .addComponent(btnOptions)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditRoom)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteRoom)))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeleteRoom)
                            .addComponent(btnEditRoom)
                            .addComponent(btnOptions)
                            .addComponent(viewReservations)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfFloorNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addRoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApplyChanges)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRoomActionPerformed
        //select multimple rows to delete at once
        int []rows = roomList.getSelectedRows();
        //convert the row ids and store them in an arraylist for easier handling
        for(int i=0; i<rows.length; i++){
            selectedRoomNumbers.add(roomList.getModel().getValueAt(rows[i], 1).toString());
        }
        // Confirm deleting process before moving on
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the selected rooms?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.NO_OPTION) {
            //clear selected rows from arraylist
            selectedRoomNumbers.clear();
        } else {
            
            DB MyDb = null;
            try
            {
                MyDb = DBManager.getDatabase();
            }
            catch (UnknownHostException e)
            {
                JOptionPane.showMessageDialog(null, "Error When Connecting to DB" + e);
            }
            DBCollection col = MyDb.getCollection("Rooms");
            BasicDBObject theQuery = new BasicDBObject();

            //delete selected buildings one by one
            for(int i=0; i<selectedRoomNumbers.size(); i++){
                theQuery.put("roomNumber", selectedRoomNumbers.get(i));
                WriteResult result = col.remove(theQuery);
            }
            selectedRoomNumbers.clear();
            //refresh table
            displayTable();
        }
    }//GEN-LAST:event_btnDeleteRoomActionPerformed

    private void btnEditRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditRoomActionPerformed
        // TODO add your handling code here:
        int row = roomList.getSelectedRow();
        String roomNumber = roomList.getModel().getValueAt(row, 0).toString();

        DB MyDb = null;
        try
        {
            MyDb = DBManager.getDatabase();
        }
        catch (UnknownHostException e)
        {
            JOptionPane.showMessageDialog(null, "Error When Connecting to DB" + e);
        }
        DBCollection col = MyDb.getCollection("Rooms");
        DBObject theQuery = new BasicDBObject("roomNumber", roomNumber);
        JOptionPane.showMessageDialog(null, "theQuery : "+ theQuery.toString());
        DBObject result = col.findOne(theQuery);
        tfRoomNumber.setText((String)result.get("roomNumber"));
        tfRoomNumber.setEditable(false);
        tfType.setSelectedItem((String)result.get("type"));
        tfLocation.setText((String)result.get("location"));
        tfFloorNumber.setText((String)result.get("floorNumber"));
        tfSection.setText((String)result.get("section"));
    }//GEN-LAST:event_btnEditRoomActionPerformed

    private void btnOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionsActionPerformed
        // TODO add your handling code here:
        int[] rows = roomList.getSelectedRows();
        //String[] selectedRoomNumbersArray = new String[rows.length];
        for(int i=0; i<rows.length; i++){
            selectedRoomNumbers.add(roomList.getModel().getValueAt(rows[i], 0).toString());
        }

        if(selectedRoomNumbers.size() != 0){
            //open jdialog
            options.pack();
            options.setLocationRelativeTo(null);
            options.setVisible(true);
            JOptionPane.showMessageDialog(null, this.selectedRoomNumbers);
            //on jdialogbox close clear the array list - optionsComponentHidden()
        }else{
            JOptionPane.showMessageDialog(null, "Please select a room");
        }

    }//GEN-LAST:event_btnOptionsActionPerformed

    private void addRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomActionPerformed
        try
        {
            String roomNumber = tfRoomNumber.getText();
            String type = (String)tfType.getSelectedItem();
            String floorNumber = tfFloorNumber.getText();
            String location = tfLocation.getText();
            String section = tfSection.getText();
            String bname = jLabel5.getText();

            //validations for adding a room form
            if (roomNumber.length() == 0 || type.length() == 0 || floorNumber.length() == 0 || location.length() == 0 || section.length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Please fill in all fields!");
            }else if(!isNumeric(floorNumber)){
                JOptionPane.showMessageDialog(null, "Please enter Floor Number in numeric form!");
            }else //insert the building into database
            {
                Room room = new Room(roomNumber, type, floorNumber, location, section, bname);
                DBObject doc = createDBObject(room);
                DB MyDb = null;
                try
                {
                    MyDb = DBManager.getDatabase();
                }
                catch (UnknownHostException ex)
                {
                    JOptionPane.showMessageDialog(null, "Error When Connecting to DB");
                }
                DBCollection col = MyDb.getCollection("Rooms");
                WriteResult result = col.insert(doc);
                JOptionPane.showMessageDialog(null, "Room added Successfully");
                //empty form fields
                tfRoomNumber.setText(null);
                tfType.setSelectedItem(null);
                tfLocation.setText(null);
                tfFloorNumber.setText(null);
                tfSection.setText(null);
                
                //refresh table
                displayTable();
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Insertion Failed! Please try again!" + e.toString());
            tfRoomNumber.grabFocus();
        }

    }//GEN-LAST:event_addRoomActionPerformed

    private void tfTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTypeActionPerformed

    private void tfRoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRoomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRoomNumberActionPerformed

    private void rNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rNoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rNoteActionPerformed

    private void reserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveActionPerformed
        // TODO add your handling code here:
        String type = (String)rType.getSelectedItem();
        String date = rDateTime.getDatePicker().toString();
        String startTime = rDateTime.getTimePicker().toString();
        String endTime = (String)rEndTime.getTime().toString();
        String note = rNote.getText();

        String collectionName = "ddd";

        switch(type){
            case "Tag" :
            collectionName = "Tags";
            break;

            case "Lecturer" :
            collectionName = "Lecturers";
            break;

            case "Group" :
            collectionName = "Groups";
            break;

            case "Session" :
            collectionName = "Sessions";
            break;

            case "Reservation" :
            collectionName = "Reservations";
            break;

            default : JOptionPane.showMessageDialog(null, "Error in switchcase");
        }

        ArrayList<String> reservationIds = new ArrayList<String>();
        for(int i=0; i<selectedRoomNumbers.size(); i++ ){

            JOptionPane.showMessageDialog(null, type+" === "+date+" === "+startTime+" === "+endTime+" === "+note+" === "+selectedRoomNumbers.get(i)+" === "+this.buildingCenter+" === "+this.buildingName+" === "+this.buildingDepartment+" === "+buildingLocation);
            Reservation reservation = new Reservation(type, date, startTime, endTime, note, selectedRoomNumbers.get(i), this.buildingCenter, this.buildingName, this.buildingDepartment, buildingLocation);
            DBObject doc = createDBObject(reservation);
            DB MyDb = null;
            try
            {
                MyDb = DBManager.getDatabase();
            }
            catch (UnknownHostException e)
            {
                JOptionPane.showMessageDialog(null, "Error When Connecting to DB" + e);
            }
            DBCollection col = MyDb.getCollection(collectionName);
            WriteResult result = col.insert(doc);

            reservationIds.add(doc.get("_id").toString());
        }
        JOptionPane.showMessageDialog(null, "Reservation Successful!\nYour reservation ID(s):\n "+reservationIds);
    }//GEN-LAST:event_reserveActionPerformed

    private void rTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rTypeActionPerformed

    //regex to check if string is numeric ===============================
    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
 
    //method ============================================================
    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false; 
        }
        return pattern.matcher(strNum).matches();
    }
    //===================================================================
    
    private void btnApplyChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyChangesActionPerformed
        // TODO add your handling code here:
        try
        {
            String roomNumber = tfRoomNumber.getText();
            String type = (String)tfType.getSelectedItem();
            String floorNumber = tfFloorNumber.getText();
            String location = tfLocation.getText();
            String section = tfSection.getText();

            if (roomNumber.length() == 0 || type.length() == 0 || floorNumber.length() == 0 || location.length() == 0 || section.length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Please fill in all fields!");
            }else if(!isNumeric(floorNumber) || !isNumeric(floorNumber)){
                JOptionPane.showMessageDialog(null, "Please enter Floor Number in numeric form!");
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
                DBCollection col = MyDb.getCollection("Rooms");
                BasicDBObject theQuery = new BasicDBObject("roomNumber", roomNumber);
                DBObject result = col.findOne(theQuery);

                if(result == null){
                    //If not add as new room
                    Room room = new Room(roomNumber, type, floorNumber, location, section, buildingName);
                    DBObject doc = createDBObject(room);
                    col.insert(doc);
                    JOptionPane.showMessageDialog(null, "Room Added Successfully");
                    tfRoomNumber.setText(null);
                    tfType.setSelectedItem(null);
                    tfFloorNumber.setText(null);
                    tfLocation.setText(null);
                    tfSection.setText(null);
                    //refresh table
                    displayTable();
                }else{
                    //if yes Edit existing room
                    BasicDBObject query = new BasicDBObject();
                    query.put("roomNumber", roomNumber);

                    BasicDBObject newDocument = new BasicDBObject();
                    newDocument.put("type", type);
                    newDocument.put("floorNumber", floorNumber);
                    newDocument.put("location", location);
                    newDocument.put("section", section);

                    BasicDBObject updateObject = new BasicDBObject();
                    updateObject.put("$set", newDocument);

                    MyDb.getCollection("Rooms").update(query, updateObject);
                    JOptionPane.showMessageDialog(null, "Room Updated Succesfully!");
                    tfRoomNumber.setText(null);
                    tfType.setSelectedItem(null);
                    tfFloorNumber.setText(null);
                    tfLocation.setText(null);
                    tfSection.setText(null);
                    //refresh table
                    displayTable();
                }
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Insertion Failed!" + e.toString());
            tfRoomNumber.grabFocus();
        }
    }//GEN-LAST:event_btnApplyChangesActionPerformed

    private void viewReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReservationsActionPerformed
        // TODO add your handling code here:
        jp.removeAll();
        try{
            ViewReservations reservationsPage = new ViewReservations();
            jp.add(reservationsPage).setVisible(true);
            reservationsPage.setSize(jp.getWidth(), jp.getHeight());
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Couldn't open reservations page!" + e);
        }
    }//GEN-LAST:event_viewReservationsActionPerformed

    //INITIALIZE variables
    public void DBIntialization(){
        DB MyDb = null;
        try{
            MyDb = DBManager.getDatabase();
        }catch(UnknownHostException e){
            JOptionPane.showMessageDialog(null, "Error When Connecting to DB in ADDROOM.java " + e);
        }
        //GET COLLECTIONS relevant to DB operations
        DBCollection buildingCollection = MyDb.getCollection("Buildings");
        DBCollection roomCollection = MyDb.getCollection("Rooms");
        
        BasicDBObject theQuery = new BasicDBObject("_id", new ObjectId(buildingId));
        DBObject result = buildingCollection.findOne(theQuery);
        
        this.buildingName = result.get("buildingName").toString();
        this.buildingCenter = result.get("center").toString();
        this.buildingDepartment = result.get("department").toString();
        this.buildingNumberOfFloors = result.get("numberOfFloors").toString();
        this.buildingLocation = result.get("location").toString();
    }
    
    //DISPLAY TABLE OF BUILDINGS
    private void displayTable(){
        DB MyDb = null;
        DBCursor cursor = null;
        try {
            MyDb = DBManager.getDatabase();
            BasicDBObject whereQuery = new BasicDBObject();
            whereQuery.put("bname", buildingName);
            DBCollection coll = MyDb.getCollection("Rooms");
            cursor = coll.find(whereQuery);

            String[] columnNames = {"Room Number", "Room Type", "Section"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            while(cursor.hasNext()) {
                DBObject obj = cursor.next();
                String roomNumber = (String)obj.get("roomNumber");
                String type = (String)obj.get("type");
                String section = (String)obj.get("section");
                model.addRow(new Object[] { roomNumber, type, section });
            }
            roomList.setModel(model);

            cursor.close(); 
            //MyDb.close();
        }catch(Exception e){
            System.err.println("Error in displayTable() method === "+e);
        }
    }
    
    private static DBObject createDBObject(Reservation reservation)
{
            BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
            docBuilder.append("type", reservation.type);
            docBuilder.append("date", reservation.date);
            docBuilder.append("startTime", reservation.startTime);
            docBuilder.append("endTime", reservation.endTime);
            docBuilder.append("note", reservation.note);
            docBuilder.append("buildingCenter", reservation.buildingCenter);
            docBuilder.append("buildingDepartment", reservation.buildingDepartment);
            docBuilder.append("buildingLocation", reservation.buildingLocation);
            docBuilder.append("buildingName", reservation.buildingName);
            docBuilder.append("roomNumber", reservation.roomNumber);
            return docBuilder.get();
}
    
    private static DBObject createDBObject(Room room)
{
            BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
            docBuilder.append("roomNumber", room.roomNumber);
            docBuilder.append("type", room.type);
            docBuilder.append("floorNumber", room.floorNumber);
            docBuilder.append("location", room.location);
            docBuilder.append("section", room.section);
            docBuilder.append("bname", room.bname);
            return docBuilder.get();
}
    
    private static DBObject createRemoveDBObject(Room room)
{
            BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
            docBuilder.append("roomNumber", room.roomNumber);
            return docBuilder.get();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoom;
    private javax.swing.JButton btnApplyChanges;
    private javax.swing.JButton btnDeleteRoom;
    private javax.swing.JButton btnEditRoom;
    private javax.swing.JButton btnOptions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog options;
    private com.github.lgooddatepicker.components.DateTimePicker rDateTime;
    private com.github.lgooddatepicker.components.TimePicker rEndTime;
    private javax.swing.JTextField rNote;
    private javax.swing.JComboBox<String> rType;
    private javax.swing.JButton reserve;
    private javax.swing.JTable roomList;
    private javax.swing.JTextField tfFloorNumber;
    private javax.swing.JTextField tfLocation;
    private javax.swing.JTextField tfRoomNumber;
    private javax.swing.JTextField tfSection;
    private javax.swing.JComboBox<String> tfType;
    private javax.swing.JButton viewReservations;
    // End of variables declaration//GEN-END:variables
}
