import java.util.Scanner;
public class Nokia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

   String menu = """
    ======== MENU FUNCTIONS ===========
    1. Phone Book
    2. Messages
    3. Chat
    4. Call Register
    5. Tones
    6. Settings
    7. Call Divert
    8. Games
    9. Calculator
    10. Reminders
    11. Clock
    12. Profiles
    13. SIM Services
    =================================== """;
    System.out.println(menu);
    System.out.print("Enter Option: ");
    int option = input.nextInt();

    switch (option){
        case 1 ->{  
       menu = """
        ======== PHONE BOOK ===========
        1. Search
        2. Service Nos.
        3. Add name
        4. Erase
        5. Edit
        6. Assign tone
        7. Send b'card
        8. Option
        9. Speed dials
        10. Voice tags
        =================================== """;
        System.out.println(menu);
        System.out.print("Enter option: ");
        option = input.nextInt();
            switch (option){
                case 1 -> {System.out.println("Search");}
                case 2 -> {System.out.println("Service Nos");}
                case 3 -> {System.out.println("Add Names");}
                case 4 -> {System.out.println("Erase");}
                case 5 -> {System.out.println("Edit");}
                case 6 -> {System.out.println("Assign tone");}
                case 7 -> {System.out.println("Send b'card");}
                case 8 -> { 
                        menu = """
        ======== OPTIONS ===========
        1. Type of views
        2. Memory Status
        =============================""";
        System.out.println(menu);
        System.out.print("Enter option: ");
        option = input.nextInt();
                
                    switch(option){
                        case 1 -> {System.out.println("Type of view");}
                        case 2 -> {System.out.println("Type of view");}
                        case 3 -> {System.out.println("Enter valid number");}
                    }
            }
                case 9 -> {System.out.println("Speed dials");}
                case 10 -> {System.out.println("voice tags");}
                default -> {System.out.println("Enter valid Number");}

        
                }     
            }


    case 2 -> {
    menu =""" 
        ======== MESSAGES ===========
        1. Write Message
        2. Inbox
        3. Outbox
        4. Picture Messages
        5. Template
        6. Smileys
        7. Messages settings
        8. Info Service
        9. Voice mailbox number
        10. Service command editor
        =================================== """;
        System.out.println(menu);
        System.out.print("Enter option: ");
        option = input.nextInt();
       switch (option){
            case 1 -> {System.out.println(" Write message");}
            case 2 -> {System.out.println("inboxx");}
            case 3 -> {System.out.println("outbox");}
            case 4 -> {System.out.println("picture message");}
            case 5 -> {System.out.println("Template");}
            case 6 -> {System.out.println("Smileys");}
            case 7 -> {
                                menu =""" 
                ======== MESSAGE SETTINGS ===========
                1. Set 1
                2. Common 3
                =================================== """;
                System.out.println(menu);
                System.out.print("Enter option: ");
                option = input.nextInt();
                    switch(option){
                        case 1 -> {
                                          menu =""" 
                            ======== MESSAGE SETTINGS ===========
                            1. Message centre number
                            2. Message send as
                            3. Message validity
                            =================================== """;
                            System.out.println(menu);
                            System.out.print("Enter option: ");
                            option = input.nextInt();
                                    switch(option){
                                        case 1 -> {System.out.println("Message centre number");}
                                        case 2 -> {System.out.println("Message send as");}
                                        case 3 -> {System.out.println("message validity");}
                                        default ->{System.out.println("Enter valid number");}
                        }
                       
                        }
                        case 2 ->{ 
                                       menu =""" 
                            ======== MESSAGE SETTINGS ===========
                            1. Delivery
                            2. Reply via same centre
                            3. Character support
                            =================================== """;
                            System.out.println(menu);
                            System.out.print("Enter option: ");
                            option = input.nextInt();
                                    switch(option){
                                        case 1 -> {System.out.println("Delivery");}
                                        case 2 -> {System.out.println("Reply via same centre");}
                                        case 3 -> {System.out.println("character support");}
                                        default ->{System.out.println("Enter valid number");}
                                    }

                         }

                    }

                }
                                
                    case 8 -> {System.out.println("Template");}
                    case 9 -> {System.out.println("voice mailbox number");}
                    case 10 -> {System.out.println("Services command editor");}
                }

          }
    case 3 -> {System.out.println("Chat");}
    case 4 ->{ 
                  menu = """
        ======== CALL REGISTER ===========
        1. Missed Calls
        2. Received
        3. Dailled Numbers
        4. Erase recebt call lists
        5. show call duration
        6. show call costs
        7. call cost settings
        8. prepaid credit
        =================================== """;
        System.out.println(menu);
        System.out.print("Enter Option: ");
        option = input.nextInt();
            switch (option){
                case 1 -> {System.out.println("Missed calls");}
                case 2 -> {System.out.println("Received calls");}
                case 3 -> {System.out.println("Dailled numbers");}
                case 4 -> {System.out.println("Erase recent call lists");}
                case 5 -> {
                  menu = """
            ======== SHOW ALL CALL DURATION ===========
            1. Last call duration
            2. All call's duration 
            3. Received calls' duration
            4. Dialled calls' duration
            5. Clear Timers
            =================================== """;
            System.out.println(menu);
            System.out.print("Enter Option: ");
            option = input.nextInt();
                switch (option){
                    case 1 -> {System.out.println("Last call duration");}
                    case 2 -> {System.out.println("All calls duration");}
                    case 3 -> {System.out.println("Recieved calls duration");}
                    case 4 -> {System.out.println("Dialled calls duration");}
                    case 5 -> {System.out.println("Clear timers");}
            } }
                    case 6 -> {
                            menu = """
                    ======== SHOW CALL COST  ===========
                    1. Last call cost
                    2. All calls cost 
                    3. clear counters
                    =================================== """;
                    System.out.println(menu);
                    System.out.print("Enter Option: ");
                    option = input.nextInt();
                        switch (option){
                            case 1 -> {System.out.println("Last call cost");}
                            case 2 -> {System.out.println("All calls cost");}
                            case 3 -> {System.out.println("clear counters");}
                            default -> {System.out.println("Enter valid number");}
                    }}// end of show call cost

                    case 7 ->{
                            menu = """
                        ======== CALL COST SETTINGS  ===========
                        1. Call cost limit
                        2. Show costs in
                        =================================== """;
                        System.out.println(menu);
                        System.out.print("Enter Option: ");
                        option = input.nextInt();
                            switch (option){
                                case 1 -> {System.out.println("call cost limit");}
                                case 2 -> {System.out.println("show costs in");}
                                default -> {System.out.println("Enter valid number");}
                            } 
                    }
        
            case 8 ->{System.out.println("Prepaid credit");
       }
    }      
   }  // end of menu 4 
       case 5 -> {
            menu = """
        ======== TONES ===========
        1. Ringing tone
        2. Ringing volume
        3. incoming call alert
        4. Composer
        5. Message alert tone
        6. Keypad tones
        7. Warning and game tones
        8. Vibrating alert
        9. Screen saver
        =================================== """;
        System.out.println(menu);
        System.out.print("Enter option: ");
        option = input.nextInt();
            switch (option){
                case 1 -> {System.out.println("Ringing tone");}
                case 2 -> {System.out.println("Ringing volume");}
                case 3 -> {System.out.println("Incoming alert");}
                case 4 -> {System.out.println("Composer");}
                case 5 -> {System.out.println("Message alert tone");}
                case 6 -> {System.out.println("Keypad tones");}
                case 7 -> {System.out.println("Warning and game tones");}
                case 8 -> {System.out.println("Vibrating alert");}
                case 9 -> {System.out.println("Screen saver");}
    
        }
    }//end of menu 5
        case 6 -> {
                menu = """
            ======== SETTINGS ===========
            1. Call settings
            2. Phone Settings
            3. Security Settings
            4. Restore Factory Settings
            =================================== """;
            System.out.println(menu);
            System.out.print("Enter option: ");
            option = input.nextInt();
                switch (option){
                case 1 -> {
                                menu = """
                    ======== CALL SETTINGS ===========
                    1. Automatic redial
                    2. Speed dialing
                    3. Call waiting options
                    4. Own number sending
                    5. Phone line in use
                    6. Automatic answer
                    =================================== """;
                    System.out.println(menu);
                    System.out.print("Enter option: ");
                    option = input.nextInt();
                        switch (option){
                            case 1 -> {System.out.println("Automatic redial");}
                            case 2 -> {System.out.println("Speed dialing");}
                            case 3 -> {System.out.println("Call waiting");}
                            case 4 -> {System.out.println("Own number");}
                            case 5 -> {System.out.println("Phone line in use");}
                            case 6 -> {System.out.println("Automatic answer");}
                            default -> {System.out.println("Enter a valid number");}
                    } }
                  case 2 ->{
                        menu = """
                    ======== PHONE SETTINGS ===========
                    1. Language
                    2. Cell info display
                    3. Welcome note
                    4. Network Selection
                    5. Lights
                    6. Confirm SIM service actions
                    =================================== """;
                    System.out.println(menu);
                    System.out.print("Enter option: ");
                    option = input.nextInt();
                        switch (option){
                            case 1 -> {System.out.println("Language");}
                            case 2 -> {System.out.println("cell info display");}
                            case 3 -> {System.out.println("welcome note");}
                            case 4 -> {System.out.println("Network selection");}
                            case 5 -> {System.out.println("Lights");}
                            case 6 -> {System.out.println("Confirm SIM service actions");}
                            default -> {System.out.println("Enter a valid number");}
                      }
                   }

                    case 3 -> {
                       menu = """
                    ======== SECURITY SETTINGS ===========
                    1. PIN code request
                    2. Call barring service
                    3. Fixed dailing
                    4. closed user group
                    5. Phone security
                    6. Change access codes
                    =================================== """;
                    System.out.println(menu);
                    System.out.print("Enter option: ");
                    option = input.nextInt();
                        switch (option){
                            case 1 -> {System.out.println("PIN code request");}
                            case 2 -> {System.out.println("call barring service");}
                            case 3 -> {System.out.println("Fixed dailing");}
                            case 4 -> {System.out.println("Closed user group");}
                            case 5 -> {System.out.println("Phone security");}
                            case 6 -> {System.out.println("Change access code");}
                            default -> {System.out.println("Enter valid number");}
                    }
                }// end settings 
                case 4 -> {System.out.println("Restore factory settings");}
                default -> {System.out.println("Screen saver");}
            
         }// end of menu 6
      }   
        case 7 ->{System.out.println("Call divert");} 
        case 8 ->{System.out.println("Games");} 
        case 9 ->{System.out.println("Calculator");} 
        case 10 ->{System.out.println("Reminders");} 
        case 11 ->{
            menu = """
        ======== CLOCK ===========
        1. Alarm clock
        2. Clock settings
        3. Date settings
        4. StopWatch
        5. Countdown timer
        6. Auto update of date and time
        =================================== """;
        System.out.println(menu);
        System.out.print("Enter option: ");
        option = input.nextInt();
            switch (option){
                case 1 -> {System.out.println("Alarm clock");}
                case 2 -> {System.out.println("Clock settings");}
                case 3 -> {System.out.println("Date settings");}
                case 4 -> {System.out.println("stopwatch");}
                case 5 -> {System.out.println("Countdown timer");}
                case 6 -> {System.out.println("Auto upate of date and time");}
                default -> {System.out.println("Ente a valid number");}
    
            }
         }
        case 12 ->{System.out.println("Profiles");} 
        case 13 ->{System.out.println("SIM Service");} 
           
        
   } 
}
}
