/**
 * Created by dbrown on 1/23/17.
 */
public class Challenge2 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        System.out.println("Contact list: ");
        mobilePhone.printContacts();

        mobilePhone.store("dustin", "111");
        mobilePhone.store("meaghan", "222");
        System.out.println("Contact list: ");
        mobilePhone.printContacts();

        try {
            String number = mobilePhone.getPhoneNumberByContactName("meaghan");
            System.out.println("Meaghan's number is " + number);

            System.out.println("Changing meaghans number to 333");
            mobilePhone.modifyPhoneNumber("meaghan", "333");

            String newNumber = mobilePhone.getPhoneNumberByContactName("meaghan");
            System.out.println("Meaghan's number is " + newNumber);

            System.out.println("Deleting meaghan");
            mobilePhone.removeByName("meaghan1");
            mobilePhone.printContacts();
        } catch (NoContactFound e) {
            System.out.println("Contact " + "meaghan1" + " was found!");
        }


    }
}
