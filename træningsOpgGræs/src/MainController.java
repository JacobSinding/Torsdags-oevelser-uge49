import java.util.Scanner;

public class MainController {
    int choice = 0;
    Scanner sc = new Scanner(System.in);
    ShowMenu showMenu = new ShowMenuGræs();
    Græs græs = new Græs();

    public void runProgram(){
        showMenu.showMenu();
        while (choice!=9){
            choice = sc.nextInt();
            switch (choice) {
                case 1: showLength();break;
                case 2: daysUntill();break;
                case 3: cutGrass();break;
            }
        }
    }
    public void showLength() {
        System.out.println(græs.getCurrentLength());

    }

    public void daysUntill() {
        System.out.println("Der er"+(græs.getMaxLength()-græs.getCurrentLength())/græs.getGrowth()+"dage til græsst skal slås");
        if (græs.getCurrentLength()>græs.maxLength){
            System.out.println("Græsset skal slås nu!");
        }
    }

    public void cutGrass() {
        græs.setCurrentLength(1);
        System.out.println("Græsset er blevet slået!");
    }
}
