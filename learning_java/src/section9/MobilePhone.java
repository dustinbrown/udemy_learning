package section9;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by dbrown on 1/23/17.
 */

class NoContactFound extends Exception {
    public NoContactFound(String message)
    {
        super(message);
    }
}

public class MobilePhone {
    private ArrayList<Contact> contactList = new ArrayList<>();

    public void store(String name, String phoneNumber){
        Contact contact = new Contact(name, phoneNumber);
        contactList.add(contact);
    }

    public void modifyPhoneNumber(String name, String newPhoneNumber) throws NoContactFound {
            Contact contact = getExistingContactIfPresent(name);
            contact.setPhoneNumber(newPhoneNumber);
    }

    private Contact getExistingContactIfPresent(String name) throws NoContactFound {
        Optional<Contact> contact = contactList.stream().filter(e -> e.getName().equals(name)).findFirst();
        if (contact.isPresent()) {
            return contact.get();
        } else {
            throw new NoContactFound("section9.Contact by name: " + name + " doesn't exist!");
        }
    }

    private Contact getExistingContactIfPresentByPhoneNumer(String phoneNumber) throws NoContactFound {
        Optional<Contact> contact = contactList.stream().filter(e -> e.getPhoneNumber().equals(phoneNumber)).findFirst();
        if (contact.isPresent()) {
            return contact.get();
        } else {
            throw new NoContactFound("section9.Contact by Phone Number: " + phoneNumber + " doesn't exist!");
        }
    }

    public void removeByName(String name) throws NoContactFound{
        Contact contact = getExistingContactIfPresent(name);
        remove(name, contact.getPhoneNumber());
    }

    public void removeByPhoneNumber(String phoneNumber) throws NoContactFound{
        Contact contact = getExistingContactIfPresent(phoneNumber);
        remove(contact.getName(), phoneNumber);
    }

    private void remove(String name, String phoneNumber) {
        contactList = contactList
                .stream()
                .filter(e -> !e.getName().equals(name) && !e.getPhoneNumber().equals(phoneNumber))
                .collect(Collectors.toCollection(ArrayList<Contact>::new));

    }

    public String getContactNameByPhoneNumber(String phoneNumber) throws NoContactFound {
            Contact contact = getExistingContactIfPresentByPhoneNumer(phoneNumber);
            return contact.getName();

    }
    public String getPhoneNumberByContactName(String name) throws NoContactFound {
            Contact contact = getExistingContactIfPresent(name);
            return contact.getPhoneNumber();
    }

    public void printContacts() {
        contactList.forEach(e -> System.out.println(e.toString()));
    }
}
