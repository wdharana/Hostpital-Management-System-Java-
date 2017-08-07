/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostpitalmanagementsystem;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Nadeeshan Weerawarna
 */
public class DBOperations {

    String url = "jdbc:mysql://localhost:3306/hostpitaldb";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    boolean addEmployee(Employee em) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "insert into employee values (?,?,?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setInt(1, em.getRegId());
            pst.setString(2, em.getFirstName());
            pst.setString(3, em.getLastName());
            pst.setInt(4, em.getAge());
            pst.setString(5, em.getGender());
            pst.setString(6, em.getDateOfbirth());
            pst.setString(7, em.getAddress());
            pst.setInt(8, em.getContactNumber());
            pst.setString(9, em.getNicNumber());
            pst.setString(10, em.getTypeOfEmployee());
            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }    //Add new employee to the employee table

    boolean deleteEmployee(Employee em) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "delete from employee where emp_nicnumber = ?";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setString(1, em.getNicNumber());

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // delete current employee from employee table

    boolean addWard(Ward wad) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "insert into ward values (?,?)";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setInt(1, wad.getWardId());
            pst.setString(2, wad.getWardName());

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  //add new ward to the ward table

    boolean addTest(Test ta) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "insert into test values (?,?)";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setInt(1, ta.getTestId());
            pst.setString(2, ta.getTestName());

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  //add new test to the test table

    boolean addUser(User us) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "insert into user values (?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setInt(1, us.getUserId());
            pst.setString(2, us.getUserNICnumber());
            pst.setString(3, us.getUserName());
            pst.setString(4, us.getPassWord());
            pst.setString(5, us.getPrivilage());

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  //add new user to the user table

    boolean updateUser(User us) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "update user set username = ?, password = ?, privilege = ? where user_nicnumber = ?";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setString(1, us.getUserName());
            pst.setString(2, us.getPassWord());
            pst.setString(3, us.getPrivilage());
            pst.setString(4, us.getUserNICnumber());

            pst.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // update current user in user table

    boolean deleteUser(User us) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "delete from user where user_nicnumber = ?";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setString(1, us.getUserNICnumber());

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // delete current user from user table

    boolean addPatients(Patients pa) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "insert into patient values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setInt(1, pa.getRegId());
            pst.setString(2, pa.getFirstName());
            pst.setString(3, pa.getLastName());
            pst.setInt(4, pa.getAge());
            pst.setString(5, pa.getGender());
            pst.setString(6, pa.getDateOfBirth());
            pst.setString(7, pa.getAddress());
            pst.setString(8, pa.getNicNumber());
            pst.setInt(9, pa.getContactNumber());
            pst.setString(10, pa.getBloodGroup());
            pst.setString(11, pa.getRecommendation());
            pst.setString(12, pa.getSickness());
            pst.setInt(13, pa.getWardId());
            pst.setString(14, pa.getDoctorNIC());
            pst.setString(15, pa.getAdmitDate());
            pst.setString(16, pa.getAdmitTime());
            pst.setString(17, pa.getDischargeDate());
            pst.setString(18, pa.getDischargeTime());

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }     // Add new patient to the patient table

    boolean addDoctorExamitPatient(DoctorExamitPatient dep) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "insert into doctor_examined_patient values (?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setInt(1, dep.getRegId());
            pst.setString(2, dep.getDoctorNICnumber());
            pst.setInt(3, dep.getPatientId());
            pst.setString(4, dep.getPatientNICnumber());
            pst.setString(5, dep.getResult());
            pst.setString(6, dep.getExamitDate());
            pst.setString(7, dep.getExamitTime());
            pst.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    } // add new examitPatient to the doctorExamitPatient table

    boolean dischargePatients(Patients pa) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "update patient set discharge_date = ? , discharge_time = ? where patient_id = ?";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setString(1, pa.getDischargeDate());
            pst.setString(2, pa.getDischargeTime());
            pst.setInt(3, pa.getRegId());

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }     // update current patient details (discharge data & time) from patient table

    boolean employeeUpdate(Employee emp) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "update employee set first_name = ? , last_name = ?, age = ?, gender = ?, dob = ?, address = ?, contact_number = ?, type_of_employee = ? where emp_nicnumber = ?";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setString(1, emp.getFirstName());
            pst.setString(2, emp.getLastName());
            pst.setInt(3, emp.getAge());
            pst.setString(4, emp.getGender());
            pst.setString(5, emp.getDateOfbirth());
            pst.setString(6, emp.getAddress());
            pst.setInt(7, emp.getContactNumber());
            pst.setString(8, emp.getTypeOfEmployee());
            pst.setString(9, emp.getNicNumber());

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }     //  update current employee details from employee table

    boolean addLoginDetails(LoginDetails logd) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "insert into login_detail values (?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setInt(1, logd.getLogId());
            pst.setString(2, logd.getDate());
            pst.setString(3, logd.getLogIntime());
            pst.setString(4, logd.getLogOuttime());
            pst.setString(5, logd.getUserNicNumber());
            pst.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    } // add new loginDetalis to the logindetails table

    boolean updateLogindetails(LoginDetails logd) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "update login_detail set logout_time= ?  where user_user_nicnumber = ? and login_time = ?";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setString(1, logd.getLogOuttime());
            pst.setString(2, logd.getUserNicNumber());
            pst.setString(3, logd.getLogIntime());

            pst.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // update current logindetails in logindetails table

    boolean addpatirntTesting(PatientsTest pat) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "insert into testresult values (?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setInt(1, pat.getPatientId());
            pst.setString(2, pat.getPatientNICnumber());
            pst.setInt(3, pat.getTestId());
            pst.setString(4, pat.getTestResult());
            pst.setString(5, pat.getDate());
            pst.setString(6, pat.getTime());
            pst.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }   // add new testResult to patienttesting table

    boolean addPayment(Payment pay) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "insert into payment values (?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setInt(1, pay.getPaymentId());
            pst.setString(2, Double.toString(pay.getPayment()));
            pst.setString(3, pay.getDate());
            pst.setString(4, pay.getTime());
            pst.setInt(5, pay.getPatientId());
            pst.setString(6, pay.getPatientNICnumber());
            pst.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }   // add new payment to the payment table
 
    boolean addAttendenceIn(Attendence atd) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "insert into attendence values (?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setString(1, atd.getDate());
            pst.setString(2, atd.getInTime());
            pst.setString(3, atd.getOutTime());
            pst.setString(4, atd.getemployeeNICnumber());

            pst.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // add new attendence to the attendence table

    boolean addAttendenceOut(Attendence atd) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "update attendence set out_time = ? where date = ? and employee_emp_nicnumber = ?";
            pst = (PreparedStatement) con.prepareStatement(quary);
            pst.setString(1, atd.getOutTime());
            pst.setString(2, atd.getDate());
            pst.setString(3, atd.getemployeeNICnumber());

            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }     // update current attendence (out time) to the attendence table

    int checkUsername(String userName) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "Select username from employeedatails";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {
                if (userName.equals(rs.getString(1))) {
                    return 1;
                }

            }
            return 0;

        } catch (Exception e) {
            System.err.println(e);
            return 2;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }    // check user name avalable in the user table

    int checkWardnumber(String wardNname) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "Select ward_id,ward_name from ward";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {
                if (wardNname.equals(rs.getString(2))) {
                    return rs.getInt(1);
                }

            }
            return -1;

        } catch (Exception e) {
            System.err.println(e);
            return -2;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // check current ward number in ward table

    boolean chechUsernamePassword(String userName, String PassWord) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "Select username,password from user";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {
                if (userName.equals(rs.getString(1))) {
                    return PassWord.equals(rs.getString(2));
                }

            }
            return false;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // check current user name and password is match or not from the user table

    String checkTypeofemployee(String employeeNICnumber) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "Select emp_nicnumber,type_of_employee from employee";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {
                if (employeeNICnumber.equals(rs.getString(1))) {
                    return rs.getString(2);
                }

            }
            return null;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // check employee type from employee table
    
    String checkDoctorNicNumber1(String userName){
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "Select username,user_nicnumber from user";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {
                if (userName.equals(rs.getString(1))) {
                    return rs.getString(2);
                }

            }
            return null;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // check current doctor nic number from employee table

    String checkUserNICnumber(String userName) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "Select username,user_nicnumber from user";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {
                if (userName.equals(rs.getString(1))) {
                    return rs.getString(2);
                }

            }
            return null;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // check current user nicnumber from user table

    int checkTestId(String testName) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "Select test_id, test_name from test";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {
                if (testName.equals(rs.getString(2))) {
                    return rs.getInt(1);
                }

            }
            return -1;

        } catch (Exception e) {
            System.err.println(e);
            return -1;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // check current test id from test table

    int checkPatientId(String patientNic) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "Select patient_id, patient_nicnumber,discharge_date from patient";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {
                if ((patientNic.equalsIgnoreCase(rs.getString(2))) && ("".equalsIgnoreCase(rs.getString(3)))) {
                    return rs.getInt(1);
                }

            }
            return -1;

        } catch (Exception e) {
            System.err.println(e);
            return -1;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // check current patient regid from patient table

    String checkPrivilege(String userName) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "Select username,privilege from user";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {
                if (userName.equals(rs.getString(1))) {
                    return rs.getString(2);
                }

            }
            return null;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // check current privilage from user table

    String checkDoctorNicNumber(String doctorFirstName, String doctorLastName) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "Select first_name,last_name,type_of_employee,emp_nicnumber from employee";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {
                if ((doctorFirstName.equalsIgnoreCase(rs.getString(1)) && (doctorLastName.equalsIgnoreCase(rs.getString(2))) && ("Doctor".equalsIgnoreCase(rs.getString(3))))) {
                    return rs.getString(4);
                }

            }
            return null;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // check current doctor nic number from employee table

    String checkDoctorFirstname(String doctorNICnumber) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "Select first_name,emp_nicnumber from employee";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {
                if (doctorNICnumber.equalsIgnoreCase(rs.getString(2))) {
                    return rs.getString(1);
                }

            }
            return null;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  //  check current doctor first name from employee table

    Patients checkPatient(String nicNumber) {
        Patients pa = new Patients();
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "Select * from patient";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {
                if (nicNumber.equalsIgnoreCase(rs.getString(8)) && ("".equalsIgnoreCase(rs.getString(17)))) {
                    pa.setRegId(rs.getInt(1));
                    pa.setFirstName(rs.getString(2));
                    pa.setLastName(rs.getString(3));
                    pa.setAge(rs.getInt(4));
                    pa.setGender(rs.getString(5));
                    pa.setDateOfBirth(rs.getString(6));
                    pa.setAddress(rs.getString(7));
                    pa.setNicNumber(rs.getString(8));
                    pa.setContactNumber(rs.getInt(9));
                    pa.setBloodGroup(rs.getString(10));
                    pa.setRecommendation(rs.getString(11));
                    pa.setSickness(rs.getString(12));
                    pa.setWardId(rs.getInt(13));
                    pa.setDoctorNIC(rs.getString(14));
                    pa.setAdmitDate(rs.getString(15));
                    pa.setAdmitTime(rs.getString(16));
                    pa.setDischargeDate(rs.getString(17));
                    pa.setDischargeTime(rs.getString(18));
                }

            }
            return pa;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }  // check current undischarge patientdetails from patient table and add tata to the patient object 

    User getUser(String userNICnumber) {
        User us = new User();
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "Select * from user";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {
                if (userNICnumber.equalsIgnoreCase(rs.getString(2))) {
                    us.setUserNICnumber(rs.getString(2));
                    us.setUserName(rs.getString(3));
                    us.setPassWord(rs.getString(4));
                    us.setPrivilage(rs.getString(5));
                }

            }
            return us;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // check current userdetails from user table and add details to the user object

    Employee checkEmployee(String nicNumber) {
        Employee emp = new Employee();
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "Select * from employee";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {
                if (nicNumber.equalsIgnoreCase(rs.getString(9))) {
                    emp.setRegId(rs.getInt(1));
                    emp.setFirstName(rs.getString(2));
                    emp.setLastName(rs.getString(3));
                    emp.setAge(rs.getInt(4));
                    emp.setGender(rs.getString(5));
                    emp.setDateOfbirth(rs.getString(6));
                    emp.setAddress(rs.getString(7));
                    emp.setContactNumber(rs.getInt(8));
                    emp.setNicNumber(rs.getString(9));
                    emp.setTypeOfEmployee(rs.getString(10));

                    return emp;
                }

            }
            return null;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }  // check current employee from employee table and add details to the employee object

    ArrayList<Patients> getPatients() {
        try {
            ArrayList<Patients> list = new ArrayList<Patients>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "select * from patient";
            pst = (PreparedStatement) con.prepareStatement(quary);

            rs = pst.executeQuery();

            while (rs.next()) {
                if ("".equals(rs.getString(17))) {
                    Patients pa = new Patients();
                    pa.setFirstName(rs.getString(2));
                    pa.setLastName(rs.getString(3));
                    pa.setAge(rs.getInt(4));
                    pa.setGender(rs.getString(5));
                    list.add(pa);
                }
            }

            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // get all undischarge patients detalis from patient table and add to the arraylist

    ArrayList<Payment> getPayment(String patientNIC) {
        try {
            ArrayList<Payment> list = new ArrayList<Payment>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "select * from payment";
            pst = (PreparedStatement) con.prepareStatement(quary);

            rs = pst.executeQuery();

            while (rs.next()) {
                if (patientNIC.equalsIgnoreCase(rs.getString(6))) {
                    Payment pay = new Payment();
                    pay.setPaymentId(rs.getInt(1));
                    pay.setPayment(Double.parseDouble(rs.getString(2)));
                    pay.setDate(rs.getString(3));
                    pay.setTime(rs.getString(4));

                    list.add(pay);
                }

            }

            return list;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // get all payments witch current patient did from payment table and add details to the arraylist

    ArrayList<Employee> getEmpDoctor() {
        try {
            ArrayList<Employee> list = new ArrayList<Employee>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "select * from employee";
            pst = (PreparedStatement) con.prepareStatement(quary);

            rs = pst.executeQuery();

            while (rs.next()) {
                if ("Doctor".equalsIgnoreCase(rs.getString(10))) {
                    Employee em = new Employee();
                    em.setRegId(rs.getInt(1));
                    em.setFirstName(rs.getString(2));
                    em.setLastName(rs.getString(3));
                    em.setAge(rs.getInt(4));
                    em.setGender(rs.getString(5));
                    em.setDateOfbirth(rs.getString(6));
                    em.setAddress(rs.getString(7));
                    em.setContactNumber(Integer.parseInt(rs.getString(8)));

                    list.add(em);
                }
            }

            return list;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // get all doctors details from employee table and add details to the arraylist

    ArrayList<Employee> getEmpNurse() {
        try {
            ArrayList<Employee> list = new ArrayList<Employee>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "select * from employee";
            pst = (PreparedStatement) con.prepareStatement(quary);

            rs = pst.executeQuery();

            while (rs.next()) {
                Employee em = new Employee();
                if ("Nurse".equalsIgnoreCase(rs.getString(10))) {
                    em.setRegId(rs.getInt(1));
                    em.setFirstName(rs.getString(2));
                    em.setLastName(rs.getString(3));
                    em.setAge(rs.getInt(4));
                    em.setGender(rs.getString(5));
                    em.setDateOfbirth(rs.getString(6));
                    em.setAddress(rs.getString(7));
                    em.setContactNumber(Integer.parseInt(rs.getString(8)));

                    list.add(em);
                }
            }

            return list;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // get all nurse details from employee table and add details to the arraylist

    ArrayList<Employee> getEmpMaintenance() {
        try {
            ArrayList<Employee> list = new ArrayList<Employee>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "select * from employee";
            pst = (PreparedStatement) con.prepareStatement(quary);

            rs = pst.executeQuery();

            while (rs.next()) {
                Employee em = new Employee();
                if ("Maintenance".equalsIgnoreCase(rs.getString(10))) {
                    em.setRegId(rs.getInt(1));
                    em.setFirstName(rs.getString(2));
                    em.setLastName(rs.getString(3));
                    em.setAge(rs.getInt(4));
                    em.setGender(rs.getString(5));
                    em.setDateOfbirth(rs.getString(6));
                    em.setAddress(rs.getString(7));
                    em.setContactNumber(Integer.parseInt(rs.getString(8)));

                    list.add(em);
                }
            }

            return list;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // get all maintenance details from employee table and add details to the arraylist 

    ArrayList<Employee> getEmpReceptionist() {
        try {
            ArrayList<Employee> list = new ArrayList<Employee>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "select * from employee";
            pst = (PreparedStatement) con.prepareStatement(quary);

            rs = pst.executeQuery();

            while (rs.next()) {
                Employee em = new Employee();
                if ("Receptionist".equalsIgnoreCase(rs.getString(10))) {
                    em.setRegId(rs.getInt(1));
                    em.setFirstName(rs.getString(2));
                    em.setLastName(rs.getString(3));
                    em.setAge(rs.getInt(4));
                    em.setGender(rs.getString(5));
                    em.setDateOfbirth(rs.getString(6));
                    em.setAddress(rs.getString(7));
                    em.setContactNumber(Integer.parseInt(rs.getString(8)));

                    list.add(em);
                }
            }

            return list;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // get all receptionist details from employee table and add details to the arraylist

    ArrayList<Ward> getWards() {
        try {
            ArrayList<Ward> list = new ArrayList<Ward>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "select * from ward";
            pst = (PreparedStatement) con.prepareStatement(quary);

            rs = pst.executeQuery();

            while (rs.next()) {
                Ward wad = new Ward();
                wad.setWardId(rs.getInt(1));
                wad.setWardName(rs.getString(2));

                list.add(wad);
            }

            return list;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // get all ward details from ward table and add details to the arraylist

    ArrayList<Test> getTests() {
        try {
            ArrayList<Test> list = new ArrayList<Test>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "select * from test";
            pst = (PreparedStatement) con.prepareStatement(quary);

            rs = pst.executeQuery();

            while (rs.next()) {
                Test ta = new Test();
                ta.setTestId(rs.getInt(1));
                ta.setTestName(rs.getString(2));
                list.add(ta);
            }

            return list;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // get all test details from test table and add details to the arraylist

    ArrayList<LoginDetails> getAllLogin() {
        try {
            ArrayList<LoginDetails> list = new ArrayList<LoginDetails>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "select * from login_detail";
            pst = (PreparedStatement) con.prepareStatement(quary);

            rs = pst.executeQuery();

            while (rs.next()) {
                LoginDetails logd = new LoginDetails();
                logd.setLogId(rs.getInt(1));
                logd.setDate(rs.getString(2));
                logd.setLogIntime(rs.getString(3));
                logd.setLogOuttime(rs.getString(4));
                logd.setUserNicNumber(rs.getString(5));
                list.add(logd);
            }

            return list;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // get all logindetails from logindetails table and add details to the arraylist

    ArrayList<LoginDetails> getCurrentLogin(String userNICnumber) {
        try {
            ArrayList<LoginDetails> list = new ArrayList<LoginDetails>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "select * from login_detail";
            pst = (PreparedStatement) con.prepareStatement(quary);

            rs = pst.executeQuery();

            while (rs.next()) {
                if (userNICnumber.equalsIgnoreCase(rs.getString(5))) {
                    LoginDetails logd = new LoginDetails();
                    logd.setLogId(rs.getInt(1));
                    logd.setDate(rs.getString(2));
                    logd.setLogIntime(rs.getString(3));
                    logd.setLogOuttime(rs.getString(4));
                    logd.setUserNicNumber(rs.getString(5));
                    list.add(logd);
                }

            }

            return list;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // get current user's all logindetails from logindetails table and add details to the arraylist

    ArrayList<PatientsTest> getPatientTesting(String patientNICnumber) {
        try {
            ArrayList<PatientsTest> list = new ArrayList<PatientsTest>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "select test.test_name, testresult.patient_patient_nicnumber, testresult.test_result, testresult.test_date, testresult.test_time from test inner join testresult on test.test_id = testresult.test_test_id";
            pst = (PreparedStatement) con.prepareStatement(quary);

            rs = pst.executeQuery();

            while (rs.next()) {
                if (patientNICnumber.equalsIgnoreCase(rs.getString(2))) {
                    PatientsTest pat = new PatientsTest();
                    pat.setNameOftesting(rs.getString(1));
                    pat.setTestResult(rs.getString(3));
                    pat.setDate(rs.getString(4));
                    pat.setTime(rs.getString(5));

                    list.add(pat);
                }

            }

            return list;

        } catch (Exception e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // get currnt patient's all testdetails from testresult and test tables and add details to the arraylist

    ArrayList<DoctorExamitPatient> getExamitDetails(String patientNICnumber) {
        try {
            ArrayList<DoctorExamitPatient> list = new ArrayList<DoctorExamitPatient>();
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "select doctor_examined_patient.report, doctor_examined_patient.examit_date, doctor_examined_patient.examit_time, patient.firstname, patient.patient_nicnumber, patient.discharge_date, employee.first_name from ((doctor_examined_patient inner join patient on doctor_examined_patient.patient_patient_nicnumber = patient.patient_nicnumber) inner join employee on doctor_examined_patient.employee_emp_nicnumber = employee.emp_nicnumber)";
            pst = (PreparedStatement) con.prepareStatement(quary);
            rs = pst.executeQuery();

            while (rs.next()) {

                if (patientNICnumber.equalsIgnoreCase(rs.getString(5)) && "".equalsIgnoreCase(rs.getString(6))) {
                    DoctorExamitPatient dep = new DoctorExamitPatient();
                    dep.setPatientName(rs.getString(4));
                    dep.setDoctorName(rs.getString(7));
                    dep.setResult(rs.getString(1));
                    dep.setExamitDate(rs.getString(2));
                    dep.setExamitTime(rs.getString(3));

                    list.add(dep);
                }

            }

            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  // get currtnt patient's all examitdetails from employee, patient and doctor_examited_patient tables and add details to the arraylist

}
