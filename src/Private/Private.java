package Private;

public class Private {

    private int data=40;
     public void mgs(){
        System.out.println("Hello Java");
    }

}

 class Simple{
    public static void main(String[] args) {
        Private obj = new Private();
        obj.mgs();
    }
}
