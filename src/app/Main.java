package app;

public class Main {
    public static void main(String[] args) {
        int[] data = new DataRepository().getData();
        DataHandler handler = new DataHandler();

        for(int num : data){
            System.out.println("Initial value is " + num);
            int newNum = handler.modify(num);
            System.out.println("New value is " + newNum);
        }
    }
}
