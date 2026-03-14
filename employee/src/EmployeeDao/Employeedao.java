
package EmployeeDao;

import Util.databaseUtil;
import com.mysql.cj.xdevapi.Result;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import EmployeeService.Daoservice;


public  class Employeedao implements Daoservice<employee e>{
    
    databaseUtil db=new databaseUtil();
    PreparedStatement ps;
    ResultSet rs;
    String Sql;

    public Employeedao() {
    }

    @Override
    public void Save (employee e) {
        try {
            Sql="insert into employee(name,salary,email,cell)values(?,?,?,?,?)";
            ps=db.getcon().prepareStatement(Sql);
            ps.setString(1, e.getn);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Employeedao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Employeedao> findall() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Employeedao findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
