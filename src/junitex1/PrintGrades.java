/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package junitex1;

/**
 *
 * @author nadunw
 */
public class PrintGrades {
    
    public String print(int grade) {
       
        String gradeStr = "";
        if (grade > 90) {
            gradeStr = "A";
        }
        else if (grade > 75) {
            gradeStr = "B";
        }
        else if (grade > 45) {
            gradeStr = "C";
        }
        else {
            gradeStr = "Failed";
        }            
        
        return gradeStr;
    }
}
