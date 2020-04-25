/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW_PR3_Ch4;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import homework.pr3.Student;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author yahya
 */
public class UserPaneController implements Initializable {

    @FXML
    private TextField tID;
    @FXML
    private TextField tName;
    @FXML
    private TextField tMajor;
    @FXML
    private TextField tGrade;
    @FXML
    private Button buttonAddStudent;
    @FXML
    private Button buttonEditStudent;
    @FXML
    private Button buttonDeleteStudent;
    @FXML
    private Button buttonAddCourse;
    @FXML
    private TableView<Student> tableview;
    @FXML
    private TableColumn<Student, Integer> tcID;
    @FXML
    private TableColumn<Student, String> tcName;
    @FXML
    private TableColumn<Student, String> tcMajor;
    @FXML
    private TableColumn<Student, Double> tcGrade;
    Statement statement;
    @FXML
    private Button buttonShowStudent;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         try {
        Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =
               (Connection) DriverManager.
                getConnection("jdbc:mysql://127.0.0.1:3306/students?serverTimezone=UTC",
                        "root", "root");
            this.statement = (Statement) connection.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        tcID.setCellValueFactory(new PropertyValueFactory("id"));
        tcName.setCellValueFactory(new PropertyValueFactory("name"));
        tcMajor.setCellValueFactory(new PropertyValueFactory("major"));
        tcGrade.setCellValueFactory(new PropertyValueFactory("grade"));
        tableview.getSelectionModel().selectedItemProperty().addListener(
                event-> showSelectedEmployee() );
    }    
        

    @FXML
    private void buttonAddStudentHandle(ActionEvent event) {
        
    
    }

    @FXML
    private void buttonEditStudentHandle(ActionEvent event) {
    }

    @FXML
    private void buttonDeleteStudentHandle(ActionEvent event) {
    }

    @FXML
    private void buttonAddCourseHandle(ActionEvent event) {
    }
    private void showSelectedEmployee(){
        Student student = tableview.getSelectionModel().getSelectedItem();
        if(student != null){
        tID.setText(String.valueOf(student.getId()));
        tName.setText(student.getName());
        tMajor.setText(student.getMajor());
        tGrade.setText(String.valueOf(student.getGrade()));
        }
    }

    


    @FXML
    private void buttonShowStudentHandle(ActionEvent event) throws SQLException {
        ResultSet rs = this.statement.executeQuery("Select * From student");
        tableview.getItems().clear();
        while(rs.next()){
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setMajor(rs.getString("major"));
            student.setGrade(rs.getDouble("grade"));
            tableview.getItems().add(student);
        }
    }
}
