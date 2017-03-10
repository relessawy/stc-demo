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
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("Name")
   private java.lang.String name;

   public Employee()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public Employee(java.lang.Long id, java.lang.String name)
   {
      this.id = id;
      this.name = name;
   }

}