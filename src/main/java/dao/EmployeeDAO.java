/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Employee;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author cameron
 */
public class EmployeeDAO {
    
    private static Map<String, Employee> employees = new TreeMap<>();
    
    public EmployeeDAO(){
        //does nothing
    }
    
}
