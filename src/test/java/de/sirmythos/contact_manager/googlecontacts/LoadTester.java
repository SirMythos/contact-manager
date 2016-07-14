package de.sirmythos.contact_manager.googlecontacts;

import java.io.IOException;

import com.google.gdata.client.contacts.ContactsService;
import com.google.gdata.util.ServiceException;

public class LoadTester {

	public static void main(String[] args) {

		ContactsService myService = new ContactsService("YOUR_APPLICATION_NAME");

		try {
			Loader.printAllContacts(myService);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
