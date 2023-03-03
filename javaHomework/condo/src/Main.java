import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num=0;
        int room=0,floor=0;
        String searchName,name,sellName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t========================");
        System.out.println("\t\t\t\t\t\t|\t  set up condo     |");
        System.out.println("\t\t\t\t\t\t========================");
        for (int c =0;c==c;c++){
            System.out.print("Enter number of  floor(floor>0):");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                System.out.print("Enter number of  floor(floor>0):");
                scanner.next();
            }
            floor = scanner.nextInt();

            if(floor>0){
                break;
            }
            else {
                System.out.println("=======Wrong number======");
                System.out.println("Plaese check number of floor again");
                continue;
            }
        }
        for (int d =0;d==d;d++){
            System.out.println("how many room in one floor(example first floor have 5 rooms,so any floors have 5.):");
            System.out.print("answer:");
            while (!scanner.hasNextInt()) {
                System.out.println("how many room in one floor(example first floor have 5 rooms,so any floors have 5.):");
                System.out.print("answer:");
                scanner.next();
            }
            room = scanner.nextInt();

            if(room>0){
                break;
            }
            else {
                System.out.println("=======Wrong number======");
                System.out.println("Plaese check number of room again");
                continue;
            }
        }
        String[][] array = new String[floor][room];
        System.out.println("================================");
        System.out.println("==>Number of floor :"+floor);
        System.out.println("==>Number of room  :"+room);
        System.out.println("==>total room :"+floor*room);
        System.out.println("================================");
        System.out.println("Starting to create please wait...");
        try {
            Thread.sleep(1000); // wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You have successfully set up Condo");
        System.out.println("\t\t\t\t\t\t===================================");
        System.out.println("\t\t\t\t\t\t|\t  Welcome to One Night Condo   |");
        System.out.println("\t\t\t\t\t\t===================================");
        labelbreak:
        for (int a=0;a==a;a++){
            System.out.println("1.Buy Condo");
            System.out.println("2.Sell Condo");
            System.out.println("3.Search Information.");
            System.out.println("4.Display Information");
            System.out.println("5.Exit");
            System.out.println("----------------------------");
            System.out.print("Chose your option form 1-5:");
            while (!scanner.hasNextInt()) {
                System.out.println("1.Buy Condo");
                System.out.println("2.Sell Condo");
                System.out.println("3.Search Information.");
                System.out.println("4.Display Information");
                System.out.println("5.Exit");
                System.out.println("----------------------------");
                System.out.print("Chose your option again (form 1-5):");
                scanner.next();
            }
            int option = scanner.nextInt();

            switch (option){
                case 1:

                    System.out.println("==>Informantion of rooms");
                    System.out.println("=======================================================");
                    for (int r = 0; r < room; r++) {
                        int numberofroom = r + 1;
                        if (r == 0) {

                            System.out.print("\t  ||room" + numberofroom+"\t\t");
                            continue;
                        }
                        if (r == room - 1) {
                            System.out.print("|room" + numberofroom + "\t\t|");
                            continue;
                        }
                        System.out.print("|room" + numberofroom+"\t\t");
                    }
                    System.out.println("");
                    for (int i = 0; i < floor; i++) {
                        for (int j = 0; j < room; j++) {
                            int numberoffloor = i + 1;
                            if (j == 0) {

                                System.out.print("Floor" + numberoffloor + "|" + "|" + array[i][j] + "\t\t|");
                                continue;
                            }
                            System.out.print("|" + array[i][j] + "\t\t|");
                        }
                        System.out.println("");
                    }
                    System.out.println("=======================================================");
                    int chosefloor=0;
                    for (int b =0;b==b;b++){
                        System.out.println("***********buy condo**********");
                        System.out.print("Enter number of  floor(1->"+floor+"):");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Please enter a valid number!");
                            System.out.print("Enter number of  floor(1->"+floor+"):");
                            scanner.next();
                        }
                        chosefloor = scanner.nextInt()-1;

                        if(chosefloor>=0&&chosefloor<floor){

                            break;
                        }
                        else {
                            System.out.println("=======valid number======");
                            System.out.println("Please check number of floor again");
                            continue;
                        }
                    }

                    int buyroom=0;
                    for (int b =0;b==b;b++){
                        System.out.print("Enter number of  room(room=(1->"+room+"):");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Please enter a valid number!");
                            System.out.print("Enter number of  room(room=(1->"+room+"):");
                            scanner.next();
                        }
                        buyroom = scanner.nextInt()-1;

                        if(buyroom>=0&&buyroom<room){
                            break;
                        }
                        else {
                            System.out.println("=======wrong number======");
                            System.out.println("Please check number of room again");
                            continue;
                        }
                    }
                    scanner.nextLine();
                    if((array[chosefloor][buyroom]==null)){
                        System.out.print("enter your name:");
                        name = scanner.nextLine();
                        array[chosefloor][buyroom]=name;
                        System.out.println("successful!");
                        System.out.println("----------------------------");
                        break;

                    }
                    else {
                        System.out.println("This is have already buy by "+array[chosefloor][buyroom]);
                        break ;
                    }

                case 2:
                    sellbreak:
                    for (int o=1;o>0;o++){
                        System.out.println("***********sell condo**********");
                        System.out.println("1.By Name (Note: Sell all Owner Name)");
                        System.out.println("2.By floor and room");
                        System.out.println("3.Exit");
                        System.out.print("chose one(1->3):");
                        while (!scanner.hasNextInt()) {
                            System.out.println("***********search**********");
                            System.out.println("1.By Name (Note: Sell all Owner Name)");
                            System.out.println("2.By floor and room");
                            System.out.println("3.Exit");
                            System.out.print("chose one(1->3):");
                            scanner.next();
                        }
                        int selloption = scanner.nextInt();
                        switch (selloption){
                            case 1:
                                scanner.nextLine();
                                System.out.println("***********Sell BY Name**********");
                                System.out.print("Enter Your Name:");
                                sellName=scanner.nextLine();
                                for (int z = 0; z < floor; z++) {
                                    for (int j = 0; j < room; j++) {
                                        if (!(array[z][j]==null)){
                                            int showfloor =z+1;
                                            int showroom=j+1;
                                            if (array[z][j].equals(sellName)){
                                                System.out.println("Owner:"+array[z][j]);
                                                System.out.println("Floor:"+showfloor);
                                                System.out.println("Room:"+showroom);
                                                array[z][j]=null;
                                                System.out.println("delete successful!");
//                                                continue sellbreak;
                                            }
                                        }
                                    }
                                }
                                break ;
                            case 2:
                                int chosesellfloor=0;
                                for (int b =0;b==b;b++){
                                    System.out.println("***********sell condo**********");
                                    System.out.print("Enter number of  floor(1->"+floor+"):");
                                    while (!scanner.hasNextInt()) {
                                        System.out.println("Please enter a valid number!");
                                        System.out.print("Enter number of  floor(1->"+floor+"):");
                                        scanner.next();
                                    }
                                    chosesellfloor = scanner.nextInt()-1;

                                    if(chosesellfloor>=0&&chosesellfloor<floor){
                                        break;
                                    }
                                    else {
                                        System.out.println("=======wrong number======");
                                        System.out.println("Pleases check number of floor again");
                                        continue;
                                    }
                                }
                                int sellroom=0;
                                for (int b =0;b==b;b++){
                                    System.out.print("Enter number of  room(room=(1->"+room+"):");
                                    while (!scanner.hasNextInt()) {
                                        System.out.println("Please enter a valid number!");
                                        System.out.print("Enter number of  room(room=(1->"+room+"):");
                                        scanner.next();
                                    }
                                    sellroom = scanner.nextInt()-1;

                                    if(sellroom>=0&&sellroom<room){
                                        break;
                                    }
                                    else {
                                        System.out.println("=======wrong number======");
                                        System.out.println("Please check number of room again");
                                        continue;
                                    }
                                }

                                if(!(array[chosesellfloor][sellroom]==null)){
                                    array[chosesellfloor][sellroom]=null;
                                    System.out.println("delete successful!");
                                }
                                else {
                                    System.out.println("delete not succes");
                                    System.out.println("please check number of floor and room again!");
                                    System.out.println("");
                                    scanner.nextLine();
                                }
                                break ;
                            case    3:
                                break sellbreak;
                        }
                    }
                    continue ;
                case 3:
                    searchlabel:
                    for (int i=0;i==i;i++){
                        System.out.println("***********search**********");
                        System.out.println("1.By Name");
                        System.out.println("2.By floor and room");
                        System.out.println("3.Exit");
                        System.out.print("chose one(1->3):");
                        while (!scanner.hasNextInt()) {
                            System.out.println("***********search**********");
                            System.out.println("1.By Name");
                            System.out.println("2.By floor and room");
                            System.out.println("3.Exit");
                            System.out.print("chose one(1->3):");
                            scanner.next();
                        }
                        int searchoption = scanner.nextInt();
                        switch (searchoption) {
                            case 1:
                                scanner.nextLine();
                                System.out.println("***********Search BY Name**********");
                                System.out.print("Enter Your Name:");
                                searchName=scanner.nextLine();
                                for (int z = 0; z < floor; z++) {
                                    for (int j = 0; j < room; j++) {
                                        if (!(array[z][j]==null)){
                                            int showfloor =z+1;
                                            int showroom=j+1;
                                            if (array[z][j].equals(searchName)){
                                                System.out.println("Owner:"+array[z][j]);
                                                System.out.println("Floor:"+showfloor);
                                                System.out.println("Room:"+showroom);
                                                System.out.println("*****************");
                                            }
                                        }
                                    }
                                }
                                break;
                            case 2:
                            int searchfloor = 0;
                            for (int b = 0; b == b; b++) {
                                System.out.println("***********Search BY Floor and Room**********");
                                System.out.print("Enter number of  floor(1->" + floor + "):");
                                while (!scanner.hasNextInt()) {
                                    System.out.println("Please enter a valid number!");
                                    System.out.print("Enter number of  floor(1->" + floor + "):");
                                    scanner.next();
                                }
                                searchfloor = scanner.nextInt() -1;

                                if (searchfloor >= 0 && searchfloor < floor) {

                                    break;
                                } else {
                                    System.out.println("=======valid number======");
                                    System.out.println("Please check number of floor again");
                                    continue;
                                }
                            }

                            int searchroom = 0;
                            for (int b = 0; b == b; b++) {
                                System.out.print("Enter number of  room(room=(1->" + room + "):");
                                while (!scanner.hasNextInt()) {
                                    System.out.println("Please enter a valid number!");
                                    System.out.print("Enter number of  room(room=(1->" + room + "):");
                                    scanner.next();
                                }
                                searchroom = scanner.nextInt() - 1;

                                if (searchroom >= 0 && searchroom < room) {
                                    break;
                                } else {
                                    System.out.println("=======wrong number======");
                                    System.out.println("Please check number of room again");
                                    continue;
                                }
                            }
                            int showfloor = searchfloor+1;
                            int showroom = searchroom+1;


                            if (!(array[searchfloor][searchroom] == null)) {

                                System.out.println("Floor:"+showfloor);
                                System.out.println("Room:"+showroom);
                                System.out.println("Owner:"+array[searchfloor][searchroom]);
                            } else {
                                System.out.println("Floor:"+showfloor);
                                System.out.println("Room:"+showroom);
                                System.out.println("Owner:"+array[searchfloor][searchroom]);
                            }
                            break ;
                            case 3:
                                continue labelbreak ;
                            default:
                                continue searchlabel ;
                        }
                    }
                    break;
                case 4:
                    System.out.println("display");
                    System.out.println("============================Room("+1+"->"+room+")=======================================");
                    for (int i = 0; i < floor; i++) {
                        for (int j = 0; j < room; j++) {
                            int numberoffloor = i + 1;
                            if (j == 0) {

                                System.out.print("Floor" + numberoffloor + "|" + "|" + array[i][j] + "\t|");
                                continue;
                            }
                            System.out.print("|" + array[i][j] + "\t|");
                        }
                        System.out.println("");
                    }
                    break;
                case 5:
                    System.out.println("exit");
                    break labelbreak;
                default :
                    System.out.println("we have 5 options(chose again)");
                    break ;

            }
        }


        //buy condo


        //output


//    public static void  setupcondo (){
//        int room,floor;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("\t\t\t\t\t\t========================");
//        System.out.println("\t\t\t\t\t\t|\t  set up condo     |");
//        System.out.println("\t\t\t\t\t\t========================");
//        System.out.print("Enter number of  floor(floor>0):");
//        floor = scanner.nextInt();
//        System.out.println("how many room in one floor(example first floor have 5 rooms,so any floors have 5.):");
//        room = scanner.nextInt();
//        String [][] array=new String[floor][room];
//        for (int r=0;r<room;r++){
//            int numberofroom =r+1;
//            if (r==0){
//
//                System.out.print("\t  ||room"+numberofroom);
//                continue;
//            }
//            if (r==room-1){
//                System.out.print("|room"+numberofroom+"|");
//                continue;
//            }
//            System.out.print("|room"+numberofroom);
//        }
//        System.out.println("");
//        for(int i =0;i<floor;i++){
//            for(int j=0;j<room;j++){
//                int numberoffloor=i+1;
//                if(j==0){
//
//                    System.out.print("Floor"+numberoffloor+"|"+"|"+array[i][j]+"|");
//                    continue;
//                }
//                System.out.print("|"+array[i][j]+"|");
//            }
//            System.out.println("");
//        }
    }

}
