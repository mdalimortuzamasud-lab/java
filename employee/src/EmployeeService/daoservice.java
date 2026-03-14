
package EmployeeService;

import java.util.List;


public interface Daoservice <E>{
    void Save (E e);
    List<E> findall();
    void update(int id);
    E findByID(int id);
    Void delete(int id);
}
