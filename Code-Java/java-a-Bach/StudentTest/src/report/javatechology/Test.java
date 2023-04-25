/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report.javatechology;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args){
        //connection -- ok
//        ConnectDB testConn = new ConnectDB();
//        testConn.getConnectDB();
        
        //insertion -- ok
        StudentManage studentManage = new StudentManage();
        Student stdInput = studentManage.addStudent();
        
        InsertData insertData = new InsertData();
        insertData.addData(stdInput);
        //selection -- ok
//        DisplayDB displayDB = new DisplayDB();
//        displayDB.getData();
    }
}
