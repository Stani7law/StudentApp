package Phone;
/**какой-то телефон */
public class SomePhone {

    private int year;
    private String company;
   
public SomePhone(int year, String company) {
        this.year = year;
        this.company = company;
    }
private void openConnection(){
    //findComutator
    //openNewConnection...
}
/**Метод что завтавляет вызывать номер */
public void call() {
    openConnection();
    System.out.println("Вызываю номер");
}
/**Метод что издает рингтон */
public void ring() {
    System.out.println("Дзынь-дзынь");
}

}
