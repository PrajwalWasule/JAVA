package fixedstack;

public class Customer {
   private int id;
   private String name;
   private String Address;
   Customer(int id,String name,String Address)
   {
	   this.id=id;
	   this.name=name;
	   this.Address=Address;
	}
   public String toString(int id,String name,String Address)
   {
	   return "id is:-"+id+"name is:-"+name+"address is:-"+Address;
   }
}
