import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int englevel = 0;
        int ort = 0;
        int select = 0;
        String[] spy = {"AIU","Computer-Engineering", "Artificial-Intelligence", "Psychology", "Journalism", "International-Relations", "Law", "Management", "Medicine"};
        int[] prise = {0,2500,2200,1900,1700,2200,1800,2200,3300};

        print("enter name: " );
        String name = scanner.nextLine();
        print("enter surname: ");
        String surname = scanner.nextLine();
        clear();
        print("have you presence? \n( enter [1] IF you have, IF NOT [0])");
        int pres = scanner.nextInt();
        if(pres==1)
        {
            while(ort==0){
                print("enter your ORT score: ");
                ort = scanner.nextInt();
                if(ort>=110&&ort<=245){
                    while (englevel!=1||englevel!=2||englevel!=3||englevel!=4||englevel!=5){
                        print("your level of english: ");
                        print("'1' = A1\n'2' = A2\n'3' = B1\n'4' = B2\n'5' = C1");
                        englevel = scanner.nextInt();
                        if(englevel==3||englevel==4||englevel==5){                        
                            clear();
                            print("choose one of specialties from here!!");
                            print  ("1-Computer Engineering (2500$)\r\n" + //
                                    "2-Artificial Intelligence (2200$)\r\n" + //
                                    "3-Psychology (1900$)\r\n" + //
                                    "4-Journalism (1700$)\r\n" + //
                                    "5-International Relations (2200$)\r\n" + //
                                    "6-Law (1800$)\r\n" + //
                                    "7-Management (2200$)\r\n" + //
                                    "8-Medicine (3300$)");
                            print("(enter the number of specialty)");
                            select = scanner.nextInt();
                            int cost = prise[select];
                            String gift = "";
                            if (ort>=140&&ort<=155) {
                                cost = cost/20*19;
                                gift = " with 5% discount";
                            }
                            else if(ort>155&&ort<=174){
                                cost = cost/10*9;
                                gift = " with 10% discount";
                            }
                            else if(ort>=175&&ort<=199){
                                cost = cost/4*3;
                                gift = " with 25% discount";
                            }
                            else if(ort>=200&&ort<=209){
                                cost = cost/2;
                                gift = " with 50% discount";
                            }
                            else if(ort>=210&&ort<=218){
                                cost = cost/4;
                                gift = " with 75% discount";
                            }
                            else if(ort>=219){
                                cost = 0;
                            }
                            clear();
                            //continue
                            print(name+" "+surname+" we congratulate you!");
                            print("You have been admitted to the "+spy[select]+" specialty!");
                            print("your contract is "+cost+" $"+gift);
                            
                            //continue
                            break;
                        }
                        else if (englevel==1||englevel==2) {
                            print("you should study a one-year preparatory English language course (Foundation Course AIU)");
                            break;
                        }
                    }
                }
                else if(ort<110){
                    print("you won't accept!! ");
                    break;
                }
            }
        } 
        else if (pres==0){
            print("you won't accept!! ");
        }
        else {
            System.out.println("restart terminal!!");
        }
    }
    static void print(String word){
       System.out.println(word);
    }
    static void print(int num){
       System.out.println(num);
    }
    static void clear(){
        System.out.print("\033[H\033[2J");
    }
}   
/*140-155: 5%
156-174: 10%
175-199: 25%
200-209: 50%
210-218: 75%
219-240: 100% */