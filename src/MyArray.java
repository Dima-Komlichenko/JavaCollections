import entities.Contact;

public class MyArray implements Runnable{
    @Override
    public void run() {
        try {
            simplyArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void simplyArray() throws Exception {
        Contact valentin = new Contact("Valentin", "+389043290234");
        Contact svetlana = new Contact("Svetlana", "+389043290234");

        Contact[] myFriends = new Contact[2];
        myFriends[0] = valentin;
        myFriends[1] = svetlana;

        System.out.println("My friends:");
        for (int i = 0; i < 2; i++) {
            System.out.println(myFriends[i]);
        }

        valentin.setName("Valek");

        System.out.println("My friends:");
        for (int i = 0; i < 2; i++) {
            System.out.println(myFriends[i]);
        }
    }
}
