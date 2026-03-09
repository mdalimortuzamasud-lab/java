/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeService;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface Daoservice <E>{
    void Save (E e);
    List<E> findall();
    void update(int id);
    E findByID(int id);
    Void delete(int id);
}
