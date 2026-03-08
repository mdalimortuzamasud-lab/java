
package employeeModel;


public class model {
    
    private int id;
    private String name;
    private String Salary;
    private String Email;
    private String Cell;

    public model() {
    }

    public model(int id, String name, String Salary, String Email, String Cell) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
        this.Email = Email;
        this.Cell = Cell;
    }

    public model(String name, String Salary, String Email, String Cell) {
        this.name = name;
        this.Salary = Salary;
        this.Email = Email;
        this.Cell = Cell;
    }

    @Override
    public String toString() {
        return "model{" + "id=" + id + ", name=" + name + ", Salary=" + Salary + ", Email=" + Email + ", Cell=" + Cell + '}';
    }
            
    
    
}
