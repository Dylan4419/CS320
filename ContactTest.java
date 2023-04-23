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


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class ContactTest {
//Testing if contactID is too long
@Test
void testContactIDLength() {
            Assertions.assertThrows(IllegalArgumentException.class,() ->{
                  new Contact("1234567890000","Bruce","Wayne","1901901909","19 cave street gotham");
            }); 
}
//Testing if contactID is null
@Test
void testIfContactIDIsNull() {
            Assertions.assertThrows(IllegalArgumentException.class,() ->{
                  new Contact(null,"Bruce","Wayne","1901901909","19 cave street gotham");
            });
} 
//Testing if firstName is too long
@Test
void testFirstNameLength() {
            Assertions.assertThrows(IllegalArgumentException.class,() ->{
                  new Contact("9876543210","Bruce Thomas","Wayne","1901901909","19 cave street gotham");
            });
 } 
//Testing if FirstName is null
@Test
void testIfFirstNameIsNull() {
            Assertions.assertThrows(IllegalArgumentException.class,() ->{
            	  new Contact("9876543210",null,"Wayne","1901901909","19 cave street gotham");
            }); 
} 
//Testing if lastName is too long
@Test
void testLastNameLength() {
            Assertions.assertThrows(IllegalArgumentException.class,() ->{
                  new Contact("9876543210", "Bruce","ThomasWayne","1901901909","19 cave street gotham");
            });
 } 
//Testing if lastName is null
@Test
void testIfLastNameIsNull() {
            Assertions.assertThrows(IllegalArgumentException.class,() ->{
                  new Contact("9876543210", "Bruce",null,"1901901909","19 cave street gotham");
            });
} 
//Testing if phoneNumber is too long
@Test
void testPhoneNumberLength() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{
                  new Contact("9876543210", "Bruce","Wayne","1901901909444444","19 cave street gotham");
			}); 
} 
//Testing if phoneNumber is null
@Test
void testIfPhoneNumberIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{
                  new Contact("9876543210", "Bruce","Wayne",null,"19 cave street gotham");
        	                 });
} 
//Testing if address is too long
@Test
void testAddressLength() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{
                  new Contact("9876543210", "Bruce","Wayne","1901901909","19 cave street gotham massachusetts 01901 United States of America");
                              });
} 
//Testing if address is null
@Test
void testIfAddressIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{
		          new Contact("9876543210", "Bruce","Wayne","1901901909",null);
			}); 
	}
}
