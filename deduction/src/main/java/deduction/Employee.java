package deduction;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@org.kie.api.definition.type.Label("Employee")
public class Employee implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(generator = "EMPLOYEE_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "EMPLOYEE_ID_GENERATOR", sequenceName = "EMPLOYEE_ID_SEQ")
   private int id;

   @org.kie.api.definition.type.Label("Name")
   private java.lang.String name;

   @org.kie.api.definition.type.Label("Salary")
   private int salary;

   public Employee()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public int getId()
   {
      return this.id;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   public int getSalary()
   {
      return this.salary;
   }

   public void setSalary(int salary)
   {
      this.salary = salary;
   }

   public Employee(int id, java.lang.String name, int salary)
   {
      this.id = id;
      this.name = name;
      this.salary = salary;
   }

}