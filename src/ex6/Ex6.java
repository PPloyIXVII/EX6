/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.lang.model.SourceVersion;
import utilities.DatabaseDriver;
import utilities.DatabaseHandler;
/**
 *
 * @author Benjawan
 */
public class Ex6 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/student";
        String user = "app";
        String passwd = "app";
        
        DatabaseDriver dbDriver = new DatabaseDriver(driver, url, user, passwd);
        DatabaseHandler dbHandler = new DatabaseHandler(dbDriver);
        Student std1 = new Student(63050154, "Benjawan Srisuk", 4.00);
        Student std2 = new Student(63050639, "Nutjaree Rengthong", 4.00);
        StudentTable.insertStudent(dbHandler, std1);
        StudentTable.insertStudent(dbHandler, std2);
        
        ArrayList<Student> studentList = StudentTable.findAllStudent(dbHandler);
        if (studentList != null) {
            printAllStudent(studentList);
        }
        dbHandler.closeConnection();
    }
    
    public static void printAllStudent(ArrayList<Student> studentList) {
        for(int i = 0; i < studentList.size(); i++) {
            System.out.print(studentList.get(i).getId() + " ");
            System.out.print(studentList.get(i).getName() + " ");
            System.out.println(studentList.get(i).getGPA() + " ");
        }
    }
    
}
