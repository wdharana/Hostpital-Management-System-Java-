/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostpitalmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Nadeeshan Weerawarna
 */
public class Receptionist extends javax.swing.JFrame {

    /**
     * Creates new form MainFraim
     *
     */
    LoginDetails logd = new LoginDetails();
    DBOperations dbops = new DBOperations();
    Attendence atd = new Attendence();
    ArrayList<Patients> palist;
    ArrayList<Payment> paylist;
    ArrayList<Employee> emplist;
    static String userName;

    public Receptionist() {
        initComponents();
        currentTime();
        currentDate();
        logUser();
        loadPatient();
    }

    void currentTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                lblTime.setText(s.format(d));
                txtAtendintime.setText(s.format(d));
                txtAtendintime1.setText(s.format(d));
//To change body of generated methods, choose Tools | Templates.
            }
        }).start();
    }   // get time

    void currentDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-YYY");
        lblDate.setText(s.format(d));
        txtatendDate.setText(s.format(d));
        txtatendDate1.setText(s.format(d));

    }   //gett date

    void loginDetails(LoginDetails logd) {
        this.logd = logd;
        userName = logd.getUserName();

    }

   /* void setUsername() {
        lblusername.setText(userName);
    }*/

    void logUser() {
        lblusername.setText(userName);
    }

    void loadPatient() {   
        palist = dbops.getPatients();
        PatientDetails paDetails = new PatientDetails(palist);
        tblpatientsDetails.setModel(paDetails);
    }   // load patients to table
 
    void loadEmpDoctors() {  
        emplist = dbops.getEmpDoctor();
        EmployeeDetails empDetails = new EmployeeDetails(emplist);
        tblView.setModel(empDetails);
    }   // load Doctors to table

    void loadEmpNurses() {  
        emplist = dbops.getEmpNurse();
        EmployeeDetails empDetails = new EmployeeDetails(emplist);
        tblView.setModel(empDetails);
    }   // load Nurses to table

    void loadEmpMaintenance() {
        emplist = dbops.getEmpMaintenance();
        EmployeeDetails empDetails = new EmployeeDetails(emplist);
        tblView.setModel(empDetails);
    }   // load Maintenance to table

    void loadEmpReceptionist() {
        emplist = dbops.getEmpReceptionist();
        EmployeeDetails empDetails = new EmployeeDetails(emplist);
        tblView.setModel(empDetails);
    }   // load Receptionist to table

    void loadPayments(String patientNIC) {
        paylist = dbops.getPayment(patientNIC);
        if (paylist != null) {
            PaymentDetails payDetails = new PaymentDetails(paylist);
            tblpayment.setModel(payDetails);
        } else {
            JOptionPane.showMessageDialog(this, "This patient didn't do any payment !!!");
            txtpaynic.setText("");
        }

    }   // load payments to table

    void clear() {
        txtfirstName.setText("");
        txtlastName.setText("");
        txtAge.setText("");
        txtdateOfbirth.setText("");
        txtAddress.setText("");
        txtRecommendation.setText("");
        txtcontactNumber.setText("");
        txtdoctorFirstname.setText("");
        txtdoctorLastname.setText("");
        txtnicNumber.setText("");
        txtSickness.setText("");

    }   // clear textfields

    void clearField() {
        txtName1.setText("");
        txtName2.setText("");
        txtAge1.setText("");
        txtGender1.setText("");
        txtDob1.setText("");
        txtAddress1.setText("");
        txtNIC1.setText("");
        txtcontact1.setText("");
        txtBlood1.setText("");
        txtRecommend1.setText("");
        txtSickness1.setText("");
        txtward1.setText("");
        txtdoc1.setText("");
        txtadmtDate1.setText("");
        txtAdmitTime1.setText("");
        txtDischargedate1.setText("");
        txtdischargetime1.setText("");
    }   // clear textfields

    void clearFields() {
        txtpayNic.setText("");
        txtamount.setText("");
    }   // clear textfields

    void clearFieldss() {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        txt7.setText("");
        txt8.setText("");
        txt9.setText("");
        txt10.setText("");
        txt11.setText("");
        txt12.setText("");
        txt13.setText("");
        txt14.setText("");
        txt15.setText("");
        txt16.setText("");
        txt17.setText("");
        txt18.setText("");

    }  // clear textfields

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtfirstName = new javax.swing.JTextField();
        txtlastName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtdateOfbirth = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtnicNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ddGender = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtRecommendation = new javax.swing.JTextField();
        txtSickness = new javax.swing.JTextField();
        txtdoctorFirstname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtdoctorLastname = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        ddWard = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        ddbloodGroup = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtcontactNumber = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtContact1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        txtName2 = new javax.swing.JTextField();
        txtAge1 = new javax.swing.JTextField();
        txtGender1 = new javax.swing.JTextField();
        txtDob1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAddress1 = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        txtNIC1 = new javax.swing.JTextField();
        txtcontact1 = new javax.swing.JTextField();
        txtBlood1 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtSickness1 = new javax.swing.JTextArea();
        txtward1 = new javax.swing.JTextField();
        txtdoc1 = new javax.swing.JTextField();
        txtadmtDate1 = new javax.swing.JTextField();
        txtAdmitTime1 = new javax.swing.JTextField();
        txtDischargedate1 = new javax.swing.JTextField();
        txtdischargetime1 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        txtRecommend1 = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        txtdob1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpatientsDetails = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        txtsearchid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        txtnic = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jSeparator27 = new javax.swing.JSeparator();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel19 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jSeparator35 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jSeparator36 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jSeparator37 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        jSeparator38 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        jSeparator39 = new javax.swing.JSeparator();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txt7 = new javax.swing.JTextArea();
        jLabel47 = new javax.swing.JLabel();
        txt8 = new javax.swing.JTextField();
        jSeparator40 = new javax.swing.JSeparator();
        jLabel48 = new javax.swing.JLabel();
        txt9 = new javax.swing.JTextField();
        jSeparator41 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        txt10 = new javax.swing.JTextField();
        jSeparator42 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();
        txt11 = new javax.swing.JTextField();
        jSeparator43 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        txt12 = new javax.swing.JTextField();
        jSeparator44 = new javax.swing.JSeparator();
        jLabel52 = new javax.swing.JLabel();
        txt13 = new javax.swing.JTextField();
        jSeparator45 = new javax.swing.JSeparator();
        jLabel53 = new javax.swing.JLabel();
        txt14 = new javax.swing.JTextField();
        jSeparator46 = new javax.swing.JSeparator();
        jLabel54 = new javax.swing.JLabel();
        txt15 = new javax.swing.JTextField();
        jSeparator47 = new javax.swing.JSeparator();
        jLabel55 = new javax.swing.JLabel();
        txt16 = new javax.swing.JTextField();
        jSeparator48 = new javax.swing.JSeparator();
        jLabel56 = new javax.swing.JLabel();
        txt17 = new javax.swing.JTextField();
        jSeparator49 = new javax.swing.JSeparator();
        jLabel57 = new javax.swing.JLabel();
        txt18 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jSeparator32 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        jButton10 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        txtpayNic = new javax.swing.JTextField();
        jSeparator33 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        txtpaynic = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jSeparator29 = new javax.swing.JSeparator();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblpayment = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        txtatendNIC = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        txtatendDate = new javax.swing.JTextField();
        jSeparator34 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        txtAtendintime = new javax.swing.JTextField();
        jSeparator50 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jSeparator51 = new javax.swing.JSeparator();
        jSeparator52 = new javax.swing.JSeparator();
        jSeparator53 = new javax.swing.JSeparator();
        txtAtendintime1 = new javax.swing.JTextField();
        txtatendDate1 = new javax.swing.JTextField();
        txtatendNIC1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HospitalMangemantSystem");
        setMinimumSize(new java.awt.Dimension(850, 555));
        setPreferredSize(new java.awt.Dimension(850, 555));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBackground(new java.awt.Color(102, 102, 102));
        jTabbedPane2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("First name");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Last name");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Age");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Date of birth");

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Address");

        txtfirstName.setBackground(new java.awt.Color(102, 102, 102));
        txtfirstName.setForeground(new java.awt.Color(0, 0, 0));
        txtfirstName.setBorder(null);

        txtlastName.setBackground(new java.awt.Color(102, 102, 102));
        txtlastName.setForeground(new java.awt.Color(0, 0, 0));
        txtlastName.setBorder(null);

        txtAge.setBackground(new java.awt.Color(102, 102, 102));
        txtAge.setForeground(new java.awt.Color(0, 0, 0));
        txtAge.setBorder(null);

        txtdateOfbirth.setBackground(new java.awt.Color(102, 102, 102));
        txtdateOfbirth.setForeground(new java.awt.Color(0, 0, 0));
        txtdateOfbirth.setBorder(null);

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        txtAddress.setBackground(new java.awt.Color(102, 102, 102));
        txtAddress.setColumns(20);
        txtAddress.setForeground(new java.awt.Color(0, 0, 0));
        txtAddress.setRows(5);
        txtAddress.setBorder(null);
        jScrollPane1.setViewportView(txtAddress);

        txtnicNumber.setBackground(new java.awt.Color(102, 102, 102));
        txtnicNumber.setForeground(new java.awt.Color(0, 0, 0));
        txtnicNumber.setBorder(null);

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NIC number");

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Gender");

        ddGender.setBackground(new java.awt.Color(102, 102, 102));
        ddGender.setForeground(new java.awt.Color(0, 0, 0));
        ddGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));

        jLabel13.setBackground(new java.awt.Color(102, 102, 102));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Sickness");

        jLabel14.setBackground(new java.awt.Color(102, 102, 102));
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Recommendation");

        jLabel15.setBackground(new java.awt.Color(102, 102, 102));
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Ward");

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Doctor first name");

        txtRecommendation.setBackground(new java.awt.Color(102, 102, 102));
        txtRecommendation.setForeground(new java.awt.Color(0, 0, 0));
        txtRecommendation.setBorder(null);

        txtSickness.setBackground(new java.awt.Color(102, 102, 102));
        txtSickness.setForeground(new java.awt.Color(0, 0, 0));
        txtSickness.setBorder(null);
        txtSickness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSicknessActionPerformed(evt);
            }
        });

        txtdoctorFirstname.setBackground(new java.awt.Color(102, 102, 102));
        txtdoctorFirstname.setForeground(new java.awt.Color(0, 0, 0));
        txtdoctorFirstname.setBorder(null);

        jLabel11.setBackground(new java.awt.Color(102, 102, 102));
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Doctor last name");

        txtdoctorLastname.setBackground(new java.awt.Color(102, 102, 102));
        txtdoctorLastname.setForeground(new java.awt.Color(0, 0, 0));
        txtdoctorLastname.setBorder(null);

        btnSubmit.setBackground(new java.awt.Color(102, 102, 102));
        btnSubmit.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 0, 0));
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(null);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        ddWard.setBackground(new java.awt.Color(102, 102, 102));
        ddWard.setForeground(new java.awt.Color(0, 0, 0));
        ddWard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maternity", "Pediatrics", "Oncology", "Gynecologis" }));
        ddWard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddWardActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Blood group");

        ddbloodGroup.setBackground(new java.awt.Color(102, 102, 102));
        ddbloodGroup.setForeground(new java.awt.Color(0, 0, 0));
        ddbloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Contact number");

        txtcontactNumber.setBackground(new java.awt.Color(102, 102, 102));
        txtcontactNumber.setForeground(new java.awt.Color(0, 0, 0));
        txtcontactNumber.setBorder(null);

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ddbloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcontactNumber))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator9)
                                    .addComponent(ddWard, 0, 238, Short.MAX_VALUE)
                                    .addComponent(txtdoctorFirstname)
                                    .addComponent(jSeparator8)
                                    .addComponent(txtdoctorLastname)
                                    .addComponent(txtRecommendation)
                                    .addComponent(txtSickness)
                                    .addComponent(jSeparator10)
                                    .addComponent(jSeparator7)))))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddbloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRecommendation, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSickness, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ddWard, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdoctorFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdoctorLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ddGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator5)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator1)
                            .addComponent(txtnicNumber)
                            .addComponent(txtlastName)
                            .addComponent(txtAge)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(txtfirstName)
                            .addComponent(txtdateOfbirth)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtlastName, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ddGender, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(txtdateOfbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnicNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Add new patient", jPanel10);

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

        txtContact1.setBackground(new java.awt.Color(102, 102, 102));
        txtContact1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("First name");
        txtContact1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 119, 24));

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Last name");
        txtContact1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 67, 119, 24));

        jLabel17.setBackground(new java.awt.Color(102, 102, 102));
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Age");
        txtContact1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 107, 119, 30));

        jLabel18.setBackground(new java.awt.Color(102, 102, 102));
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Gender");
        txtContact1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 153, 90, 30));

        jLabel19.setBackground(new java.awt.Color(102, 102, 102));
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Date of birth");
        txtContact1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 206, 90, 24));

        jLabel20.setBackground(new java.awt.Color(102, 102, 102));
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Address");
        txtContact1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 247, 90, 24));

        jLabel21.setBackground(new java.awt.Color(102, 102, 102));
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Patient NIC number");
        txtContact1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 327, -1, 24));

        jLabel22.setBackground(new java.awt.Color(102, 102, 102));
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Contact number");
        txtContact1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 367, 90, 30));

        jLabel23.setBackground(new java.awt.Color(102, 102, 102));
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Blood group");
        txtContact1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 413, 90, 24));

        jLabel24.setBackground(new java.awt.Color(102, 102, 102));
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("recommendation");
        txtContact1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 457, 119, 24));

        jLabel25.setBackground(new java.awt.Color(102, 102, 102));
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Sickness");
        txtContact1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 504, 119, 24));

        jLabel26.setBackground(new java.awt.Color(102, 102, 102));
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Ward Id");
        txtContact1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 588, 90, 24));

        jLabel27.setBackground(new java.awt.Color(102, 102, 102));
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Docrot first name");
        txtContact1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 632, 90, 30));

        jLabel28.setBackground(new java.awt.Color(102, 102, 102));
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Admit date");
        txtContact1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 683, 90, 27));

        jLabel29.setBackground(new java.awt.Color(102, 102, 102));
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Admit time");
        txtContact1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 735, 90, 25));

        jLabel30.setBackground(new java.awt.Color(102, 102, 102));
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Discharge date");
        txtContact1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 779, 90, 24));

        txtName1.setEditable(false);
        txtName1.setBackground(new java.awt.Color(102, 102, 102));
        txtName1.setForeground(new java.awt.Color(0, 0, 0));
        txtName1.setBorder(null);
        txtName1.setEnabled(false);
        txtContact1.add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 12, 200, 33));

        txtName2.setEditable(false);
        txtName2.setBackground(new java.awt.Color(102, 102, 102));
        txtName2.setForeground(new java.awt.Color(0, 0, 0));
        txtName2.setBorder(null);
        txtName2.setEnabled(false);
        txtName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName2ActionPerformed(evt);
            }
        });
        txtContact1.add(txtName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 67, 200, 24));

        txtAge1.setEditable(false);
        txtAge1.setBackground(new java.awt.Color(102, 102, 102));
        txtAge1.setForeground(new java.awt.Color(0, 0, 0));
        txtAge1.setBorder(null);
        txtAge1.setEnabled(false);
        txtContact1.add(txtAge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 107, 200, 30));

        txtGender1.setEditable(false);
        txtGender1.setBackground(new java.awt.Color(102, 102, 102));
        txtGender1.setForeground(new java.awt.Color(0, 0, 0));
        txtGender1.setBorder(null);
        txtGender1.setEnabled(false);
        txtContact1.add(txtGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 153, 202, 30));

        txtDob1.setBackground(new java.awt.Color(102, 102, 102));
        txtDob1.setForeground(new java.awt.Color(0, 0, 0));
        txtDob1.setBorder(null);
        txtDob1.setEnabled(false);
        txtContact1.add(txtDob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 205, 1, 24));

        txtAddress1.setEditable(false);
        txtAddress1.setBackground(new java.awt.Color(102, 102, 102));
        txtAddress1.setColumns(20);
        txtAddress1.setForeground(new java.awt.Color(0, 0, 0));
        txtAddress1.setRows(5);
        txtAddress1.setBorder(null);
        jScrollPane5.setViewportView(txtAddress1);

        txtContact1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 210, 65));

        jLabel31.setBackground(new java.awt.Color(102, 102, 102));
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Discharge time");
        txtContact1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 828, 90, 24));

        txtNIC1.setEditable(false);
        txtNIC1.setBackground(new java.awt.Color(102, 102, 102));
        txtNIC1.setForeground(new java.awt.Color(0, 0, 0));
        txtNIC1.setBorder(null);
        txtNIC1.setEnabled(false);
        txtContact1.add(txtNIC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 324, 210, 24));

        txtcontact1.setEditable(false);
        txtcontact1.setBackground(new java.awt.Color(102, 102, 102));
        txtcontact1.setForeground(new java.awt.Color(0, 0, 0));
        txtcontact1.setBorder(null);
        txtcontact1.setEnabled(false);
        txtContact1.add(txtcontact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 367, 210, 30));

        txtBlood1.setEditable(false);
        txtBlood1.setBackground(new java.awt.Color(102, 102, 102));
        txtBlood1.setForeground(new java.awt.Color(0, 0, 0));
        txtBlood1.setBorder(null);
        txtBlood1.setEnabled(false);
        txtContact1.add(txtBlood1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 414, 210, 24));

        txtSickness1.setEditable(false);
        txtSickness1.setBackground(new java.awt.Color(102, 102, 102));
        txtSickness1.setColumns(20);
        txtSickness1.setForeground(new java.awt.Color(0, 0, 0));
        txtSickness1.setRows(5);
        txtSickness1.setBorder(null);
        jScrollPane6.setViewportView(txtSickness1);

        txtContact1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 504, 210, -1));

        txtward1.setBackground(new java.awt.Color(102, 102, 102));
        txtward1.setForeground(new java.awt.Color(0, 0, 0));
        txtward1.setBorder(null);
        txtward1.setEnabled(false);
        txtContact1.add(txtward1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 589, 210, 24));

        txtdoc1.setEditable(false);
        txtdoc1.setBackground(new java.awt.Color(102, 102, 102));
        txtdoc1.setForeground(new java.awt.Color(0, 0, 0));
        txtdoc1.setBorder(null);
        txtdoc1.setEnabled(false);
        txtContact1.add(txtdoc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 633, 210, 30));

        txtadmtDate1.setEditable(false);
        txtadmtDate1.setBackground(new java.awt.Color(102, 102, 102));
        txtadmtDate1.setForeground(new java.awt.Color(0, 0, 0));
        txtadmtDate1.setBorder(null);
        txtadmtDate1.setEnabled(false);
        txtContact1.add(txtadmtDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 685, 210, 24));

        txtAdmitTime1.setEditable(false);
        txtAdmitTime1.setBackground(new java.awt.Color(102, 102, 102));
        txtAdmitTime1.setForeground(new java.awt.Color(0, 0, 0));
        txtAdmitTime1.setBorder(null);
        txtAdmitTime1.setEnabled(false);
        txtContact1.add(txtAdmitTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 736, 210, 24));

        txtDischargedate1.setEditable(false);
        txtDischargedate1.setBackground(new java.awt.Color(102, 102, 102));
        txtDischargedate1.setForeground(new java.awt.Color(0, 0, 0));
        txtDischargedate1.setBorder(null);
        txtDischargedate1.setEnabled(false);
        txtContact1.add(txtDischargedate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 779, 210, 24));

        txtdischargetime1.setEditable(false);
        txtdischargetime1.setBackground(new java.awt.Color(102, 102, 102));
        txtdischargetime1.setForeground(new java.awt.Color(0, 0, 0));
        txtdischargetime1.setBorder(null);
        txtdischargetime1.setEnabled(false);
        txtContact1.add(txtdischargetime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 828, 210, 22));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 51, 200, 10));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 97, 200, 4));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 143, 202, 10));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 191, 202, -1));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 210, 10));

        jSeparator17.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 354, 210, 10));

        jSeparator18.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 403, 210, -1));

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 441, 210, 10));

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 619, 210, -1));

        jSeparator21.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 669, 210, 10));

        jSeparator22.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 716, 210, 10));

        jSeparator23.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 763, 210, 10));

        jSeparator24.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 809, 210, 10));

        jSeparator25.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 858, 210, 10));

        txtRecommend1.setEditable(false);
        txtRecommend1.setBackground(new java.awt.Color(102, 102, 102));
        txtRecommend1.setForeground(new java.awt.Color(0, 0, 0));
        txtRecommend1.setBorder(null);
        txtRecommend1.setEnabled(false);
        txtContact1.add(txtRecommend1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 458, 210, 24));

        jSeparator26.setBackground(new java.awt.Color(0, 0, 0));
        txtContact1.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 488, 210, 10));

        txtdob1.setEditable(false);
        txtdob1.setBackground(new java.awt.Color(102, 102, 102));
        txtdob1.setForeground(new java.awt.Color(0, 0, 0));
        txtdob1.setBorder(null);
        txtdob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdob1ActionPerformed(evt);
            }
        });
        txtContact1.add(txtdob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 205, 210, 28));

        jScrollPane4.setViewportView(txtContact1);

        tblpatientsDetails.setBackground(new java.awt.Color(102, 102, 102));
        tblpatientsDetails.setForeground(new java.awt.Color(0, 0, 0));
        tblpatientsDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "First name", "Last name", "Age", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblpatientsDetails);

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        txtsearchid.setBackground(new java.awt.Color(0, 0, 0));
        txtsearchid.setForeground(new java.awt.Color(255, 255, 255));
        txtsearchid.setText("Patient Nic number");
        txtsearchid.setBorder(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator11.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator11)
                    .addComponent(txtsearchid, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearchid, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel58.setBackground(new java.awt.Color(102, 102, 102));
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image13.png"))); // NOI18N

        jButton9.setBackground(new java.awt.Color(102, 102, 102));
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.png"))); // NOI18N
        jButton9.setText("Refresh");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addGap(30, 30, 30)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("View patients", jPanel11);

        jPanel15.setBackground(new java.awt.Color(102, 102, 102));
        jPanel15.setForeground(new java.awt.Color(0, 0, 0));

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));

        txtnic.setBackground(new java.awt.Color(0, 0, 0));
        txtnic.setForeground(new java.awt.Color(255, 255, 255));
        txtnic.setText("Patient NIC number");
        txtnic.setBorder(null);
        txtnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnicActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jSeparator27.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnic, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(jSeparator27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(49, 49, 49))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(txtnic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel19.setBackground(new java.awt.Color(102, 102, 102));

        jLabel41.setBackground(new java.awt.Color(102, 102, 102));
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("First name");

        txt2.setEditable(false);
        txt2.setBackground(new java.awt.Color(102, 102, 102));
        txt2.setForeground(new java.awt.Color(0, 0, 0));
        txt2.setBorder(null);
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        jSeparator35.setBackground(new java.awt.Color(0, 0, 0));

        jLabel42.setBackground(new java.awt.Color(102, 102, 102));
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Reg Id");

        txt1.setEditable(false);
        txt1.setBackground(new java.awt.Color(102, 102, 102));
        txt1.setForeground(new java.awt.Color(0, 0, 0));
        txt1.setBorder(null);

        jSeparator36.setBackground(new java.awt.Color(0, 0, 0));

        jLabel43.setBackground(new java.awt.Color(102, 102, 102));
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Last name");

        txt3.setEditable(false);
        txt3.setBackground(new java.awt.Color(102, 102, 102));
        txt3.setForeground(new java.awt.Color(0, 0, 0));
        txt3.setBorder(null);

        jSeparator37.setBackground(new java.awt.Color(0, 0, 0));

        jLabel44.setBackground(new java.awt.Color(102, 102, 102));
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Age");

        txt4.setEditable(false);
        txt4.setBackground(new java.awt.Color(102, 102, 102));
        txt4.setForeground(new java.awt.Color(0, 0, 0));
        txt4.setBorder(null);

        jSeparator38.setBackground(new java.awt.Color(0, 0, 0));

        jLabel45.setBackground(new java.awt.Color(102, 102, 102));
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Gender");

        txt5.setEditable(false);
        txt5.setBackground(new java.awt.Color(102, 102, 102));
        txt5.setForeground(new java.awt.Color(0, 0, 0));
        txt5.setBorder(null);

        jSeparator39.setBackground(new java.awt.Color(0, 0, 0));

        jLabel46.setBackground(new java.awt.Color(102, 102, 102));
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("Adderss");

        txt7.setEditable(false);
        txt7.setBackground(new java.awt.Color(102, 102, 102));
        txt7.setColumns(20);
        txt7.setForeground(new java.awt.Color(0, 0, 0));
        txt7.setRows(5);
        txt7.setBorder(null);
        jScrollPane8.setViewportView(txt7);

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Nic number");

        txt8.setEditable(false);
        txt8.setBackground(new java.awt.Color(102, 102, 102));
        txt8.setForeground(new java.awt.Color(0, 0, 0));
        txt8.setBorder(null);

        jSeparator40.setBackground(new java.awt.Color(0, 0, 0));

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("Contact number");

        txt9.setEditable(false);
        txt9.setBackground(new java.awt.Color(102, 102, 102));
        txt9.setForeground(new java.awt.Color(0, 0, 0));
        txt9.setBorder(null);

        jSeparator41.setBackground(new java.awt.Color(0, 0, 0));

        jLabel49.setBackground(new java.awt.Color(102, 102, 102));
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Blood group");

        txt10.setEditable(false);
        txt10.setBackground(new java.awt.Color(102, 102, 102));
        txt10.setForeground(new java.awt.Color(0, 0, 0));
        txt10.setBorder(null);

        jSeparator42.setBackground(new java.awt.Color(0, 0, 0));

        jLabel50.setBackground(new java.awt.Color(102, 102, 102));
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Recommendation");

        txt11.setEditable(false);
        txt11.setBackground(new java.awt.Color(102, 102, 102));
        txt11.setForeground(new java.awt.Color(0, 0, 0));
        txt11.setBorder(null);

        jSeparator43.setBackground(new java.awt.Color(0, 0, 0));

        jLabel51.setBackground(new java.awt.Color(102, 102, 102));
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Sickness");

        txt12.setEditable(false);
        txt12.setBackground(new java.awt.Color(102, 102, 102));
        txt12.setForeground(new java.awt.Color(0, 0, 0));
        txt12.setBorder(null);

        jSeparator44.setBackground(new java.awt.Color(0, 0, 0));

        jLabel52.setBackground(new java.awt.Color(102, 102, 102));
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Ward id");

        txt13.setEditable(false);
        txt13.setBackground(new java.awt.Color(102, 102, 102));
        txt13.setForeground(new java.awt.Color(0, 0, 0));
        txt13.setBorder(null);

        jSeparator45.setBackground(new java.awt.Color(0, 0, 0));

        jLabel53.setBackground(new java.awt.Color(102, 102, 102));
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Doctor First name");

        txt14.setEditable(false);
        txt14.setBackground(new java.awt.Color(102, 102, 102));
        txt14.setForeground(new java.awt.Color(0, 0, 0));
        txt14.setBorder(null);

        jSeparator46.setBackground(new java.awt.Color(0, 0, 0));

        jLabel54.setBackground(new java.awt.Color(102, 102, 102));
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("Admit Date");

        txt15.setEditable(false);
        txt15.setBackground(new java.awt.Color(102, 102, 102));
        txt15.setForeground(new java.awt.Color(0, 0, 0));
        txt15.setBorder(null);

        jSeparator47.setBackground(new java.awt.Color(0, 0, 0));

        jLabel55.setBackground(new java.awt.Color(102, 102, 102));
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Admit time");

        txt16.setEditable(false);
        txt16.setBackground(new java.awt.Color(102, 102, 102));
        txt16.setForeground(new java.awt.Color(0, 0, 0));
        txt16.setBorder(null);

        jSeparator48.setBackground(new java.awt.Color(0, 0, 0));

        jLabel56.setBackground(new java.awt.Color(102, 102, 102));
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("Discharge date");

        txt17.setEditable(false);
        txt17.setBackground(new java.awt.Color(102, 102, 102));
        txt17.setForeground(new java.awt.Color(0, 0, 0));
        txt17.setBorder(null);

        jSeparator49.setBackground(new java.awt.Color(0, 0, 0));

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("Discharge time");

        txt18.setEditable(false);
        txt18.setBackground(new java.awt.Color(102, 102, 102));
        txt18.setForeground(new java.awt.Color(0, 0, 0));
        txt18.setBorder(null);

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jSeparator32.setBackground(new java.awt.Color(0, 0, 0));

        jLabel32.setBackground(new java.awt.Color(102, 102, 102));
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Date of birth");

        txt6.setEditable(false);
        txt6.setBackground(new java.awt.Color(102, 102, 102));
        txt6.setForeground(new java.awt.Color(0, 0, 0));
        txt6.setBorder(null);
        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });

        jSeparator28.setBackground(new java.awt.Color(0, 0, 0));

        jButton10.setBackground(new java.awt.Color(102, 102, 102));
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setText("Cancel");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator36, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(txt1)
                                    .addComponent(txt2)))))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator38, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel19Layout.createSequentialGroup()
                                    .addComponent(jSeparator37)
                                    .addGap(1, 1, 1)))))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt5))
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator41)
                                .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt8))
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane8)))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator39, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator28)
                                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(txt18)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4))
                                    .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt10))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator42, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator45)
                                    .addComponent(jSeparator43)
                                    .addComponent(txt11, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(txt12)
                                    .addComponent(jSeparator44)
                                    .addComponent(txt13)
                                    .addComponent(txt14)
                                    .addComponent(jSeparator46)
                                    .addComponent(txt15)
                                    .addComponent(jSeparator47)
                                    .addComponent(txt16)
                                    .addComponent(jSeparator48)
                                    .addComponent(txt17)
                                    .addComponent(jSeparator49)))))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator36, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator42, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt11, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator43, javax.swing.GroupLayout.DEFAULT_SIZE, 4, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator44, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator47, javax.swing.GroupLayout.DEFAULT_SIZE, 4, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4)
                                    .addComponent(jButton10)))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator39, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator40, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jScrollPane9.setViewportView(jPanel19);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane9)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Patients discharge", jPanel15);

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setForeground(new java.awt.Color(0, 0, 0));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        jLabel33.setBackground(new java.awt.Color(102, 102, 102));
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Amount");

        txtamount.setBackground(new java.awt.Color(102, 102, 102));
        txtamount.setForeground(new java.awt.Color(0, 0, 0));
        txtamount.setBorder(null);

        jSeparator30.setBackground(new java.awt.Color(0, 0, 0));

        jLabel35.setBackground(new java.awt.Color(102, 102, 102));
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Patient NIC number");

        txtpayNic.setBackground(new java.awt.Color(102, 102, 102));
        txtpayNic.setForeground(new java.awt.Color(0, 0, 0));
        txtpayNic.setBorder(null);

        jSeparator33.setBackground(new java.awt.Color(0, 0, 0));

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Submit");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpayNic, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtamount, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtpayNic)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        txtpaynic.setBackground(new java.awt.Color(0, 0, 0));
        txtpaynic.setForeground(new java.awt.Color(255, 255, 255));
        txtpaynic.setText("Patirnt NIC number");
        txtpaynic.setBorder(null);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jSeparator29.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator29)
                    .addComponent(txtpaynic, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(20, 20, 20))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpaynic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblpayment.setBackground(new java.awt.Color(102, 102, 102));
        tblpayment.setForeground(new java.awt.Color(0, 0, 0));
        tblpayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tblpayment);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Payment", jPanel6);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 800, 420));

        jTabbedPane1.addTab("Patients", jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jTabbedPane3.setBackground(new java.awt.Color(102, 102, 102));
        jTabbedPane3.setForeground(new java.awt.Color(0, 0, 0));

        jPanel23.setBackground(new java.awt.Color(0, 0, 0));

        jButton15.setText("Doctors");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Nurses");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Maintenance");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Receptionist");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jButton18)
                .addGap(62, 62, 62))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tblView.setBackground(new java.awt.Color(102, 102, 102));
        tblView.setForeground(new java.awt.Color(0, 0, 0));
        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane14.setViewportView(tblView);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane14)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("View Employee", jPanel17);

        jPanel18.setBackground(new java.awt.Color(102, 102, 102));

        jPanel20.setBackground(new java.awt.Color(102, 102, 102));

        jLabel34.setBackground(new java.awt.Color(102, 102, 102));
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Employee NIC number");

        txtatendNIC.setBackground(new java.awt.Color(102, 102, 102));
        txtatendNIC.setForeground(new java.awt.Color(0, 0, 0));
        txtatendNIC.setBorder(null);

        jSeparator31.setBackground(new java.awt.Color(0, 0, 0));

        jLabel36.setBackground(new java.awt.Color(102, 102, 102));
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Date");

        txtatendDate.setEditable(false);
        txtatendDate.setBackground(new java.awt.Color(102, 102, 102));
        txtatendDate.setForeground(new java.awt.Color(0, 0, 0));
        txtatendDate.setBorder(null);

        jSeparator34.setBackground(new java.awt.Color(0, 0, 0));

        jLabel37.setBackground(new java.awt.Color(102, 102, 102));
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("In time");

        txtAtendintime.setEditable(false);
        txtAtendintime.setBackground(new java.awt.Color(102, 102, 102));
        txtAtendintime.setForeground(new java.awt.Color(0, 0, 0));
        txtAtendintime.setBorder(null);

        jSeparator50.setBackground(new java.awt.Color(0, 0, 0));

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Submit");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator50, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(txtatendNIC)
                            .addComponent(txtatendDate)
                            .addComponent(jSeparator31)
                            .addComponent(txtAtendintime)
                            .addComponent(jSeparator34))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtatendNIC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtatendDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAtendintime, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(102, 102, 102));

        jLabel38.setBackground(new java.awt.Color(102, 102, 102));
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Employee NIC number");

        jLabel39.setBackground(new java.awt.Color(102, 102, 102));
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Date");

        jLabel40.setBackground(new java.awt.Color(102, 102, 102));
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Out time");

        jSeparator51.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator52.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator53.setBackground(new java.awt.Color(0, 0, 0));

        txtAtendintime1.setEditable(false);
        txtAtendintime1.setBackground(new java.awt.Color(102, 102, 102));
        txtAtendintime1.setForeground(new java.awt.Color(0, 0, 0));
        txtAtendintime1.setBorder(null);

        txtatendDate1.setEditable(false);
        txtatendDate1.setBackground(new java.awt.Color(102, 102, 102));
        txtatendDate1.setForeground(new java.awt.Color(0, 0, 0));
        txtatendDate1.setBorder(null);

        txtatendNIC1.setBackground(new java.awt.Color(102, 102, 102));
        txtatendNIC1.setForeground(new java.awt.Color(0, 0, 0));
        txtatendNIC1.setBorder(null);

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Submit");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator52, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator53, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator51)
                                .addComponent(txtatendNIC1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtatendDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAtendintime1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtatendNIC1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtatendDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(txtAtendintime1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Employee Attendence", jPanel18);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane1.addTab("Employee", jPanel2);

        jPanel5.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 5, 820, 440));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Log Out");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblDate.setForeground(new java.awt.Color(255, 255, 255));

        lblTime.setForeground(new java.awt.Color(255, 255, 255));

        lblusername.setBackground(new java.awt.Color(0, 0, 0));
        lblusername.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 629, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(lblusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LogIn logn = new LogIn();
        logd.setLogOuttime(lblTime.getText());
        this.dispose();
        logn.setVisible(dbops.updateLogindetails(logd));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        atd.setDate(txtatendDate1.getText());
        atd.setemployeeNICnumber(txtatendNIC1.getText());
        atd.setOutTime(txtAtendintime1.getText());

        if (dbops.addAttendenceOut(atd)) {  
            JOptionPane.showMessageDialog(this, "Sucsessfully insert !!!");
        } else {
            JOptionPane.showMessageDialog(this, "Error !!!");
        }
        txtatendNIC1.setText("");
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        atd.setDate(txtatendDate.getText());
        atd.setemployeeNICnumber(txtatendNIC.getText());
        atd.setInTime(txtAtendintime.getText());
        atd.setOutTime("");

        if (dbops.addAttendenceIn(atd)) {
            JOptionPane.showMessageDialog(this, "Sucsessfully insert !!!");
        } else {
            JOptionPane.showMessageDialog(this, "Error !!!");
        }

        txtatendNIC.setText("");
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        loadEmpReceptionist();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        loadEmpMaintenance();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        loadEmpNurses();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        loadEmpDoctors();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        loadPayments(txtpaynic.getText());
        txtpaynic.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Payment pay = new Payment();
        pay.setPaymentId(0);
        pay.setPayment(Double.parseDouble(txtamount.getText()));
        pay.setDate(lblDate.getText());
        pay.setTime(lblTime.getText());
        pay.setPatientId(dbops.checkPatientId(txtpayNic.getText()));
        pay.setPatientNICnumber(txtpayNic.getText());

        if (dbops.addPayment(pay)) {
            JOptionPane.showMessageDialog(this, "Successfully insert !!!");
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Error !!!");
            clearFields();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Patients pa = new Patients();
        pa.setRegId(Integer.parseInt(txt1.getText()));
        pa.setNicNumber(txt8.getText());
        pa.setDischargeDate(txt17.getText());
        pa.setDischargeTime(txt18.getText());

        if (dbops.dischargePatients(pa)) {
            JOptionPane.showMessageDialog(this, "Successfully insert !!!");
            clearFieldss();
        } else {
            JOptionPane.showMessageDialog(this, "Error !!!");
            clearFieldss();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clearFieldss();
        Patients pa = dbops.checkPatient(txtnic.getText());
        if (pa != null) {
            txt1.setText(Integer.toString(pa.getRegId()));
            txt2.setText(pa.getFirstName());
            txt3.setText(pa.getLastName());
            txt4.setText(Integer.toString(pa.getAge()));
            txt5.setText(pa.getGender());
            txt6.setText(pa.getDateOfBirth());
            txt7.setText(pa.getAddress());
            txt8.setText(pa.getNicNumber());
            txt9.setText(Integer.toString(pa.getContactNumber()));
            txt10.setText(pa.getBloodGroup());
            txt11.setText(pa.getRecommendation());
            txt12.setText(pa.getSickness());
            txt13.setText(Integer.toString(pa.getWardId()));
            txt14.setText(dbops.checkDoctorFirstname(pa.getDoctorNIC()));
            txt15.setText(pa.getAdmitDate());
            txt16.setText(pa.getAdmitTime());
            txt17.setText(lblDate.getText());
            txt18.setText(lblTime.getText());
            txtnic.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "This patient currently not admit in this hospital");
            txtnic.setText("");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnicActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clearField();
        Patients pa = dbops.checkPatient(txtsearchid.getText());
        if (pa != null) {
            txtName1.setText(pa.getFirstName());
            txtName2.setText(pa.getLastName());
            txtAge1.setText(Integer.toString(pa.getAge()));
            txtGender1.setText(pa.getGender());
            txtdob1.setText(pa.getDateOfBirth());
            txtAddress1.setText(pa.getAddress());
            txtNIC1.setText(pa.getNicNumber());
            txtcontact1.setText(Integer.toString(pa.getContactNumber()));
            txtBlood1.setText(pa.getBloodGroup());
            txtRecommend1.setText(pa.getRecommendation());
            txtSickness1.setText(pa.getSickness());
            txtward1.setText(Integer.toString(pa.getWardId()));
            txtdoc1.setText(dbops.checkDoctorFirstname(pa.getDoctorNIC()));
            txtadmtDate1.setText(pa.getAdmitDate());
            txtAdmitTime1.setText(pa.getAdmitTime());
            txtDischargedate1.setText(pa.getDischargeDate());
            txtdischargetime1.setText(pa.getDischargeTime());
            txtsearchid.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "This patient currently not admit in this hospital");
            txtsearchid.setText("");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtdob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdob1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdob1ActionPerformed

    private void txtName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName2ActionPerformed

    private void ddWardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddWardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddWardActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Patients pa = new Patients();

        pa.setRegId(0);
        pa.setFirstName(txtfirstName.getText());
        pa.setLastName(txtlastName.getText());
        pa.setAge(Integer.parseInt(txtAge.getText()));
        pa.setGender(ddGender.getSelectedItem().toString());
        pa.setDateOfBirth(txtdateOfbirth.getText());
        pa.setAddress(txtAddress.getText());
        pa.setNicNumber(txtnicNumber.getText());
        pa.setContactNumber(Integer.parseInt(txtcontactNumber.getText()));
        pa.setBloodGroup(ddbloodGroup.getSelectedItem().toString());
        pa.setRecommendation(txtRecommendation.getText());
        pa.setSickness(txtSickness.getText());
        pa.setWardId(dbops.checkWardnumber(ddWard.getSelectedItem().toString()));
        pa.setDoctorNIC(dbops.checkDoctorNicNumber(txtdoctorFirstname.getText(), txtdoctorLastname.getText()));
        pa.setAdmitDate(lblDate.getText());
        pa.setAdmitTime(lblTime.getText());
        pa.setDischargeDate("");
        pa.setDischargeTime("");

        if (dbops.addPatients(pa)) {
            JOptionPane.showMessageDialog(this, "Successfully insert !!!");
            clear();
        } else {
            JOptionPane.showMessageDialog(this, "Error !!!");
            clear();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtSicknessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSicknessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSicknessActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        loadPatient();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        clearFieldss();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receptionist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> ddGender;
    private javax.swing.JComboBox<String> ddWard;
    private javax.swing.JComboBox<String> ddbloodGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JSeparator jSeparator51;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTable tblView;
    private javax.swing.JTable tblpatientsDetails;
    private javax.swing.JTable tblpayment;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextArea txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextArea txtAddress1;
    private javax.swing.JTextField txtAdmitTime1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAge1;
    private javax.swing.JTextField txtAtendintime;
    private javax.swing.JTextField txtAtendintime1;
    private javax.swing.JTextField txtBlood1;
    private javax.swing.JPanel txtContact1;
    private javax.swing.JTextField txtDischargedate1;
    private javax.swing.JTextField txtDob1;
    private javax.swing.JTextField txtGender1;
    private javax.swing.JTextField txtNIC1;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtRecommend1;
    private javax.swing.JTextField txtRecommendation;
    private javax.swing.JTextField txtSickness;
    private javax.swing.JTextArea txtSickness1;
    private javax.swing.JTextField txtadmtDate1;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtatendDate;
    private javax.swing.JTextField txtatendDate1;
    private javax.swing.JTextField txtatendNIC;
    private javax.swing.JTextField txtatendNIC1;
    private javax.swing.JTextField txtcontact1;
    private javax.swing.JTextField txtcontactNumber;
    private javax.swing.JTextField txtdateOfbirth;
    private javax.swing.JTextField txtdischargetime1;
    private javax.swing.JTextField txtdob1;
    private javax.swing.JTextField txtdoc1;
    private javax.swing.JTextField txtdoctorFirstname;
    private javax.swing.JTextField txtdoctorLastname;
    private javax.swing.JTextField txtfirstName;
    private javax.swing.JTextField txtlastName;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtnicNumber;
    private javax.swing.JTextField txtpayNic;
    private javax.swing.JTextField txtpaynic;
    private javax.swing.JTextField txtsearchid;
    private javax.swing.JTextField txtward1;
    // End of variables declaration//GEN-END:variables
}
