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

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
class ContactServiceTest {
//Test if contact service successfully adds contact
@Test 
      void testAdd() {
            ContactService contact_service = new ContactService();
            Contact contactService1 = new
            Contact("9876543210", "Bruce","Wayne","1901901909","19 cave street gotham");
            assertEquals(true, contact_service.addContact(contactService1));
      }
//Test if contact service successfully deletes contact
@Test
      void testDelete() {
            ContactService contact_service = new ContactService();
            Contact contactService1 = new Contact("9876543210", "Bruce","Wayne","1901901909","19 cave street gotham");
            contact_service.addContact(contactService1);
			
            assertEquals(true, contact_service.deleteContact("9876543210"));
            assertEquals(false,contact_service.deleteContact("1945678445"));
            assertEquals(false,contact_service.deleteContact("6677889900"));
            
} 
//Test if contact service successfully updates contact
@Test
      void testUpdate() {
            ContactService contact_service = new ContactService();
            Contact contactService1 = new Contact("9876543210", "Bruce","Wayne","1901901909","19 cave street gotham");
            Contact contactService2 = new Contact("1122334455","Bob","Black","5544332211","181 Parker st Hartford");
            Contact contactService3 = new Contact("6677889900","John","Smith","6655778899","334 Maple Ln Agawam");
            Contact contactService4 = new Contact("9911223344","Nick","Woods","8899007766","99 Cedar Ave Boston");
            Contact contactService5 = new Contact("1122556688","Debra","Marsh","2233445566","134 hastings St Boston");
            contact_service.addContact(contactService1);
            contact_service.addContact(contactService2);
            contact_service.addContact(contactService3);
            contact_service.addContact(contactService4);
            contact_service.addContact(contactService5);
            assertEquals(true,contact_service.updateContact("1212121212", "Jake", "Red", "1010101010", "223 Oak St Boston"));
            assertEquals(false,contact_service.updateContact("3232323232", "Kelly", "Connors", "0123456789", "99 cedar lane Boston "));
	} 
} 
























