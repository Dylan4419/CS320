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

    
    import java.util.*;
    public class ContactService{
                private ArrayList<Contact> ContactList;
                public ContactService() {
                      ContactList = new ArrayList<>();
}
          //Adding a contact to list 
                public boolean addContact(Contact contact) {
                      boolean existingContact = false;
                      //This will check if contact already exists
                      for(Contact list:ContactList) {
                            if(list.equals(contact)) {
                                  existingContact = true;
                            }
 }
                      if(!existingContact) {
                            ContactList.add(contact);
                            return true;
                      }
                      else {
                            return false;
                      } 
}
          //This will delete contact
                public boolean deleteContact(String contact_ID) {
                      //this will check to see if contact already exists 
                      for(Contact list:ContactList) {
                            if(list.getContactID().equals(contact_ID)) {
                                  ContactList.remove(list);
                                  return true; 
                            }
}
                      return false;
                }
          //This will update the contact list 
                public boolean updateContact(String contact_ID, String first_Name, String last_Name, String phone_Number, String contact_Address) {
                      for(Contact list:ContactList) {
                              if(list.getContactID().equals(contact_ID)) {
                                  //checks first name and updates it
                              if(!first_Name.equals("") && !(first_Name.length() > 10)) {
                                    list.setFirstName(first_Name);
                                  }
                                  //checks last name and updates it
                              if(!last_Name.equals("") && !(last_Name.length() > 10)) {
                                    list.setLastName(last_Name);
                              }
                              //checks phone number and updates it
                              if(!phone_Number.equals("") && !(phone_Number.length() > 10)) {
                                   list.setPhoneNumber(phone_Number);
                              }
                              //checks address and updates it 
                              if(!contact_Address.equals("") && !(contact_Address.length() > 30)) {
                                   list.setAddress(contact_Address);
                              }
                              return true; 
                        } 
                  } 
                  return false;
            } 
} 