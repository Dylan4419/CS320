//Creator: Dylan Coulter
//Course: CS320
//Assignment: ContactService
//Date:03/19/2023
//Resource:https://www.tabnine.com/code/java/methods/org.junit.Assert/assertEquals
//Resource:https://www.vogella.com/tutorials/JUnit/article.html
//Resource:https://www.youtube.com/watch?v=vZm0lHciFsQ
//Resource:https://stackoverflow.com/questions/60398541/illegal-argument-exception-on-java
//Resource:https://www.youtube.com/watch?v=Geq60OVyBPg
//Resource:https://www.youtube.com/watch?v=U5JOUS34Wuo
package contacts;

public class Contact {
      private String contactID; //length must be less than 10
      private String firstName; //length must be less than 10
      private String lastName; //length must be less than 10
      private String phoneNumber; //length must be less than 10
      private String address; //length must be less than 30
      public Contact(String contact_ID, String first_Name, String last_Name, String phone_Number, String contact_Address) {
//If contact_ID null or exceeds length requirement throw exception
if(contact_ID == null || contact_ID.length() > 10) {
                      throw new IllegalArgumentException("Contact ID is Invalid - The Length exceeds 10 - null");
            }
//If first_Name null or exceeds length requirement throw exception
if(first_Name == null || first_Name.length() > 10)
	throw new IllegalArgumentException("Contact ID is Invalid - The Length exceeds 10 - null");
//If last_Name null or exceeds length requirement throw exception          	
if(last_Name == null || last_Name.length() > 10) {
	throw new IllegalArgumentException("Contact ID is Invalid - The Length exceeds 10 - null");
            }
//If phone_Number null or exceeds length requirement throw exception
if(phone_Number == null || phone_Number.length() > 10) {
	throw new IllegalArgumentException("Contact ID is Invalid - The Length exceeds 10 - null");
            }
//If contact_Address null or exceeds length requirement throw exception
if(contact_Address == null || contact_Address.length() > 30) {
	throw new IllegalArgumentException("Contact ID is Invalid - The Length exceeds 30 - null");
            }
this.contactID = first_Name.substring(0,3) + last_Name.substring(0,2) + phone_Number.substring(2,5) + contact_Address.substring(0,2);
                this.contactID = contact_ID;
                this.firstName = first_Name;
                this.lastName = last_Name;
                this.phoneNumber = phone_Number;
                this.address = contact_Address;

}


          //Getter
          public String getContactID() {
                return this.contactID;
              
}	
        //Getter
          public String getFirstName(){
                return this.firstName;
} 
        //Getter
          public String getLastName() {
                return this.lastName;
} 
        //Getter
          public String getPhoneNumber() {
                return this.phoneNumber;
} 
        //Getter
          public String getAddress() {
            return this.address;
      }
      //Setter
      public void setContactID(String contact_ID) {
            this.contactID = contact_ID;
      }
    //Setter
      public void setFirstName(String first_Name) {
            this.firstName = first_Name;
      }
    //Setter
      public void setLastName(String last_Name) {
            this.lastName = last_Name;
      }
    //Setter
      public void setPhoneNumber(String phone_Number) {
            this.phoneNumber = phone_Number;
      }
    //Setter
      public void setAddress(String contact_Address) {
            this.address = contact_Address;
      }
      //end setters
    
      //System  print out contact information
      public static void main(String args[]) {
            Contact contact = new Contact("9876543210", "Bruce","Wayne","1901901909","19 cave street gotham");
            System.out.println(contact.getContactID());
            System.out.println(contact.getFirstName());
            System.out.println(contact.getLastName());
            System.out.println(contact.getPhoneNumber());
            System.out.println(contact.getAddress());
      } 
} 


