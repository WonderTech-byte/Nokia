import java.util.Scanner;
public class AdvanceNokia {
           public static Scanner input = new Scanner(System.in);
           public static int option = 0;
           public static String menu = " ";
     public static void main(String[] args) {
    
 menu();   
 }
static void menu(){
boolean isRunning = true;
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
    14. Exit
    =================================== """;
    System.out.println(menu);
    System.out.print("Enter Option: ");
    int option = input.nextInt();
        switch (option){
            case 1-> phoneBookMenu();
            case 2 ->message();
            case 3 ->{System.out.println("Chat");
                    System.out.print("Enter 1 to nav back or 0 to exit: ");
                       option = input.nextInt(); 
                        if (option == 1){
                           menu();
                        }     
            }
            case 4 -> callRegister();
            case 5 -> tones(); 
            case 6 -> settings();
            case 7 -> {System.out.println("Call divert");
                    System.out.print("Enter 1 to nav back or 0 to exit: ");
                       option = input.nextInt(); 
                        if (option == 1){
                           optionMenu();
                }
            }
            case 8 -> {System.out.println("Games");
                    System.out.print("Enter 1 to nav back or 0 to exit: ");
                       option = input.nextInt(); 
                        if (option == 1){
              }             optionMenu();
            }
            case 9 -> {System.out.println("Calculator");
                    System.out.print("Enter 1 to nav back or 0 to exit: ");
                       option = input.nextInt(); 
                        if (option == 1){
                }           optionMenu();
            }      
            case 10 ->{System.out.println("Reminders");
                    System.out.print("Enter 1 to nav back or 0 to exit: ");
                       option = input.nextInt(); 
                        if (option == 1){
                           optionMenu();
                }
            }
            case 11 -> clock();
            case 12 ->{System.out.println("Profiles");
                    System.out.print("Enter 1 to nav back or 0 to exit: ");
                       option = input.nextInt(); 
                        if (option == 1){
                           optionMenu();
                }
            }
            case 13 ->{System.out.println("SIM Services");
                    System.out.print("Enter 1 to nav back or 0 to exit: ");
                       option = input.nextInt(); 
                        if (option == 1){
                           optionMenu();
            }
           
     }   }
}

static void optionMenu(){
                  menu = """
        ======== OPTIONS ===========
        ---1. Type of views
        ---2. Memory Status
        ---3. back
        =============================""";
        System.out.println(menu);
        System.out.print("Enter option: ");
        option = input.nextInt();
    
        switch(option){
            case 1 -> {System.out.println("Type of view");
                      System.out.print("Enter 1 to nav back or 0 to exit: ");
                       option = input.nextInt(); 
                        if (option == 1){
                           optionMenu();
                        }
            }
            case 2 -> {System.out.println("Type of view");
                       System.out.print("Enter 1 to nav back or 0 to exit: ");
                       option = input.nextInt(); 
                        if (option == 1){
                           optionMenu();
                        }
            }
            case 3 ->{phoneBookMenu();}
            default -> {
                       System.out.println("Enter valid number!!!");
                       System.out.print("Enter 3 to nav back or 0 to exit: ");
                       option = input.nextInt(); 
                        if (option == 1){
                           optionMenu();
                        }
            }
           
            
        }
}

static void phoneBookMenu(){
String menu = """
    ======== PHONE BOOK ===========
    --1. Search
    --2. Service Nos.
    --3. Add name
    --4. Erase
    --5. Edit
    --6. Assign tone
    --7. Send b'card
    --8. Option
    --9. Speed dials
    --10. Voice tags
    --11. back
    =================================== """;
    System.out.println(menu);
    System.out.print("Enter option: ");
    option = input.nextInt();
        switch (option){
            case 1 -> {System.out.println("Search");
                       returnPhoneBook();         
            }
            case 2 -> {System.out.println("Service Nos");
                    returnPhoneBook();
            }
            case 3 -> {System.out.println("Add Names");
                    returnPhoneBook();
            }
            case 4 -> {System.out.println("Erase");
                    returnPhoneBook();
            }
            case 5 -> {System.out.println("Edit");
                        returnPhoneBook();
            }
            case 6 -> {System.out.println("Assign tone");
                       returnPhoneBook();
            }
            case 7 -> {System.out.println("Send b'card");returnPhoneBook();}
            case 8 -> {optionMenu();}
            case 9 -> {System.out.println("Speed dials");returnPhoneBook();}
            case 10 -> {System.out.println("voice tags");returnPhoneBook();}
            case 11 -> menu();
            default -> {System.out.println("Enter valid Number");
                System.out.println("Type of view");
                  System.out.print("Enter 0 to nav back or 12 to exit: ");
                   option = input.nextInt(); 
                    if (option == 0){
                       phoneBookMenu(); if(option == 12);
                    }        
            }
        } 

}
static void returnPhoneBook(){
    System.out.print("Enter 11 to go back: ");
       option = input.nextInt(); 
        if (option == 11){
           phoneBookMenu();
        }              

}

static void message(){
    Scanner input = new Scanner(System.in);
   String menu =""" 
        ======== MESSAGES ===========
        --1. Write Message
        --2. Inbox
        --3. Outbox
        --4. Picture Messages
        --5. Template
        --6. Smileys
        --7. Messages settings
        --8. Info Service
        --9. Voice mailbox number
        --10. Service command editor
        --11. back
        =================================== """;
        System.out.println(menu);
        System.out.print("Enter option: ");
        int option = input.nextInt();
       switch (option){
            case 1 -> {System.out.println(" Write message");
                    System.out.print("Enter 0 to nav back or 12 to exit: ");
                       option = input.nextInt(); 
                        if (option == 0){
                           message();
                        if(option == 12);
                    }
            }
            case 2 -> {System.out.println("inboxx");
                    System.out.print("Enter 0 to nav back or 12 to exit: ");
                       option = input.nextInt(); 
                        if (option == 0){
                           message();
                    }
            }
            case 3 -> {System.out.println("outbox");
                    System.out.print("Enter 0 to nav back or 12 to exit: ");
                       option = input.nextInt(); 
                        if (option == 0){
                           message();
                    }
            }
            case 4 -> {System.out.println("picture message");
                    System.out.print("Enter 0 to nav back or 12 to exit: ");
                       option = input.nextInt(); 
                        if (option == 0){
                           message();
                    }            
            }
            case 5 -> {System.out.println("Template");
                    System.out.print("Enter 0 to nav back or 12 to exit: ");
                       option = input.nextInt(); 
                        if (option == 0){
                           message();
                }
            }
            case 6 -> {System.out.println("Smileys");   
                    System.out.print("Enter 0 to nav back or 12 to exit: ");
                       option = input.nextInt(); 
                        if (option == 0){
                   }     message();            
            }
            case 7 -> messageSetting();
                    case 8 -> {System.out.println("Template");}
                    case 9 -> {System.out.println("voice mailbox number");}
                    case 10 -> {System.out.println("Services command editor");}
                    case 11 -> menu();}

}

static void messageSetting(){
    {
                        menu =""" 
        ======== MESSAGE SETTINGS ===========
        ---1. Set 1
        ---2. Common 3
        ---3. back
        =================================== """;
        System.out.println(menu);
        System.out.print("Enter option: ");
        option = input.nextInt();
        switch(option){
            case 1 ->messageSettingSet();
            case 2 ->messageSettingsCommon();
            case 3 -> message();

}
}
}
static void messageSettingSet(){
    
          menu =""" 
    ======== SET 1 ===========
    ----1. Message centre number
    ----2. Message send as
    ----3. Message validity
    ----4. back
    =================================== """;
    System.out.println(menu);
    System.out.print("Enter option: ");
    option = input.nextInt();
    switch(option){
        case 1 -> {System.out.println("Message centre number");
               System.out.print("Enter 0 to nav back or 12 to exit: ");
                 option = input.nextInt(); 
                if (option == 0){
                   messageSettingSet();
                }
        }
        case 2 -> {System.out.println("Message send as");
                System.out.print("Enter 0 to nav back or 12 to exit: ");
                 option = input.nextInt(); 
                if (option == 0){
                   messageSettingSet();
                }
        }
        case 3 -> {System.out.println("message validity");
                System.out.print("Enter 0 to nav back or 12 to exit: ");
                 option = input.nextInt(); 
                if (option == 0){
                   messageSettingSet();
                }
         }
        case 4 -> messageSetting();
        default ->{System.out.println("Enter valid number");
                System.out.print("Enter 0 to nav back or 12 to exit: ");
                 option = input.nextInt(); 
                if (option == 0){
                   messageSettingSet();
        
                  }
        
        }
 }
}
static void messageSettingsCommon(){

                   menu =""" 
        ======== COMMON ===========
        ----1. Delivery
        ----2. Reply via same centre
        ----3. Character support
        ----4. back
        =================================== """;
        System.out.println(menu);
        System.out.print("Enter option: ");
        option = input.nextInt();
        switch(option){
            case 1 -> {System.out.println("Delivery report");
                System.out.print("Enter 0 to nav back or 12 to exit: ");
                   option = input.nextInt(); 
                    if (option == 0){
               }     messageSettingsCommon();            
            }
            case 2 -> {System.out.println("Reply via same centre");
                System.out.print("Enter 0 to nav back or 12 to exit: ");
                   option = input.nextInt(); 
                    if (option == 0){
               }     messageSettingsCommon();       
            }
            case 3 -> {System.out.println("character support");
                System.out.print("Enter 0 to nav back or 12 to exit: ");
                   option = input.nextInt(); 
                    if (option == 0){
               }     messageSettingsCommon();                   
            }
            case 4 -> message();
            default ->{System.out.println("Enter valid number");
                System.out.print("Enter 0 to nav back or 12 to exit: ");
                   option = input.nextInt(); 
                    if (option == 0){
               }    messageSettingsCommon();       
            }
        
     }
}
static void showCallDuration(){
    
          menu = """
    ======== SHOW ALL CALL DURATION ===========
    ---1. Last call duration
    ---2.- All call's duration 
    ---3. Received calls' duration
    ---4. Dialled calls' duration
    ---5. Clear Timers
    ---6. back
    =================================== """;
    System.out.println(menu);
    System.out.print("Enter Option: ");
    option = input.nextInt();
        switch (option){
            case 1 -> {System.out.println("Last call duration");
                System.out.print("Enter 0 to nav back: ");
                   option = input.nextInt(); 
                    if (option == 0){
               }    showCallDuration();               
            }
            case 2 -> {System.out.println("All calls duration");
                 System.out.print("Enter 0 to nav back: ");
                   option = input.nextInt(); 
                    if (option == 0){
               }    showCallDuration();          
            }
            case 3 -> {System.out.println("Recieved calls duration");
                 System.out.print("Enter 0 to nav back: ");
                   option = input.nextInt(); 
                    if (option == 0){
               }    showCallDuration();          
            }
            case 4 -> {System.out.println("Dialled calls duration");
                 System.out.print("Enter 0 to nav back: ");
                   option = input.nextInt(); 
                    if (option == 0){
               }    showCallDuration();          
            }
            case 5 -> {System.out.println("Clear timers");
                 System.out.print("Enter 0 to nav back: ");
                   option = input.nextInt(); 
                    if (option == 0){
               }    showCallDuration();                  
            }
            case 6 -> callRegister();
         
     }
}
static void showCallCost(){

                menu = """
        ======== SHOW CALL COST  ===========
        ---1. Last call cost
        ---2. All calls cost 
        ---3. clear counters
        ---4. back
        =================================== """;
        System.out.println(menu);
        System.out.print("Enter Option: ");
        option = input.nextInt();
            switch (option){
                case 1 -> {System.out.println("Last call cost");
                    System.out.print("Enter 0 to nav back or 1 to exit: ");
                   option = input.nextInt(); 
                    if (option == 0){
                  } showCallCost();          
                }
                case 2 -> {System.out.println("All calls cost");
                System.out.print("Enter 0 to nav back or 1 to exit: ");
                   option = input.nextInt(); 
                    if (option == 0){
                  } showCallCost();      
                }
                case 3 -> {System.out.println("clear counters");
                    System.out.print("Enter 0 to nav back or 12 to exit: ");
                   option = input.nextInt(); 
                    if (option == 0){
                  } showCallCost();      
                }
                case 4 -> callRegister();
                default -> {System.out.println("Enter valid number");
                    System.out.print("Enter 0 to nav back or 12 to exit: ");
                   option = input.nextInt(); 
                    if (option == 0){
                  } showCallCost();                  
                }
        }// end of show call cost

}
static void callCostSetting(){
    
        menu = """
    ======== CALL COST SETTINGS  ===========
    ---1. Call cost limit
    ---2. Show costs in
    ---3. back
    =================================== """;
    System.out.println(menu);
    System.out.print("Enter Option: ");
    option = input.nextInt();
        switch (option){
            case 1 -> {System.out.println("call cost limit");
                System.out.print("Enter 0 to nav back or 1 to exit: ");
                   option = input.nextInt(); 
                    if (option == 0){
                  } showCallCost();      
            }
            case 2 -> {System.out.println("show costs in");
                System.out.print("Enter 0 to nav back or 1 to exit: ");
                   option = input.nextInt(); 
                    if (option == 0){
                  } showCallCost();      
            }
            case 3 -> callRegister();
            default -> {System.out.println("Enter valid number");
                System.out.print("Enter 0 to nav back or 12 to exit: ");
                   option = input.nextInt(); 
                    if (option == 0){
                  } showCallCost();      
            }
        } 
                    
}
static void callRegister(){
     
                  menu = """
        ======== CALL REGISTER ===========
        ---1. Missed Calls
        ---2. Received
        ---3. Dailled Numbers
        ---4. Erase recebt call lists
        ---5. show call duration
        ---6. show call costs
        ---7. call cost settings
        ---8. prepaid credit
        ---9. back
        =================================== """;
        System.out.println(menu);
        System.out.print("Enter Option: ");
        option = input.nextInt();
            switch (option){
                case 1 -> {System.out.println("Missed calls");
                    System.out.print("Enter 0 to nav back: ");
                   option = input.nextInt(); 
                    if (option == 0){
                    }  callRegister();             
                }
                case 2 -> {System.out.println("Received calls");
                    System.out.print("Enter 0 to nav back: ");
                   option = input.nextInt(); 
                    if (option == 0){
               }     callRegister();           
                }
                case 3 -> {System.out.println("Dailled numbers");
                        System.out.print("Enter 0 to nav back: ");
                   option = input.nextInt(); 
                    if (option == 0){
               }     callRegister();                           
                }
                case 4 -> {System.out.println("Erase recent call lists");
                        System.out.print("Enter 0 to nav back: ");
                   option = input.nextInt(); 
                    if (option == 0){
               }     callRegister();           
                }
                case 5 -> showCallDuration();

                    case 6 -> showCallDuration();
                    case 7 -> callCostSetting();
        
            case 8 ->System.out.println("Prepaid credit");
            case 9 -> phoneBookMenu();
       
    }      
}
static void tones(){
        menu = """
    ======== TONES ===========
    ---1. Ringing tone
    ---2. Ringing volume
    ---3. incoming call alert
    ---4. Composer
    ---5. Message alert tone
    ---6. Keypad tones
    ---7. Warning and game tones
    ---8. Vibrating alert
    ---9. Screen saver
    ---10. back
    =================================== """;
    System.out.println(menu);
    System.out.print("Enter option: ");
    option = input.nextInt();
        switch (option){
            case 1 -> {System.out.println("Ringing tone");
                System.out.print("Enter 0 to nav back: ");
               option = input.nextInt(); 
                if (option == 0){
           }     tones();           
            }
            case 2 -> {System.out.println("Ringing volume");
               System.out.print("Enter 0 to nav back: ");
               option = input.nextInt(); 
                if (option == 0){
                }  tones();     
            }
            case 3 -> {System.out.println("Incoming alert");
                 System.out.print("Enter 0 to nav back: ");
               option = input.nextInt(); 
                if (option == 0){
                }  tones();  
            }
            case 4 -> {System.out.println("Composer");
                 System.out.print("Enter 0 to nav back: ");
               option = input.nextInt(); 
                if (option == 0){
                }  tones();  
            }
            case 5 -> {System.out.println("Message alert tone");    
                 System.out.print("Enter 0 to nav back: ");
               option = input.nextInt(); 
                if (option == 0){
                }  tones();  
            }
            case 6 -> {System.out.println("Keypad tones");
                 System.out.print("Enter 0 to nav back: ");
               option = input.nextInt(); 
                if (option == 0){
                }  tones();  
            }
            case 7 -> {System.out.println("Warning and game tones");
                 System.out.print("Enter 0 to nav back: ");
               option = input.nextInt(); 
                if (option == 0){
                }  tones();              
            }
            case 8 -> {System.out.println("Vibrating alert");
                 System.out.print("Enter 0 to nav back: ");
               option = input.nextInt(); 
                if (option == 0){
                }  tones();  
            }
            case 9 -> {System.out.println("Screen saver");
                 System.out.print("Enter 0 to nav back: ");
               option = input.nextInt(); 
                if (option == 0){
                }  tones();      
            }
            case 10 -> menu();
            default -> {System.out.println("Enter a valid number!!");
                 System.out.print("Enter 0 to nav back: ");
               option = input.nextInt(); 
                if (option == 0){
                }  tones();  
            }
        
    }
}
static void callSettings(){

                    menu = """
        ======== CALL SETTINGS ===========
        ----1. Automatic redial
        ----2. Speed dialing
        ----3. Call waiting options
        ----4. Own number sending
        ----5. Phone line in use
        ----6. Automatic answer
        ----7. back
        =================================== """;
        System.out.println(menu);
        System.out.print("Enter option: ");
        option = input.nextInt();
            switch (option){
                case 1 -> {System.out.println("Automatic redial");
                    System.out.print("Enter 0 to nav back: ");
                     option = input.nextInt(); 
                    if (option == 0){
                   } callSettings();  
                }
                case 2 -> {System.out.println("Speed dialing");
                     System.out.print("Enter 0 to nav back: ");
                     option = input.nextInt(); 
                    if (option == 0){
                   } callSettings();  
                }
                case 3 -> {System.out.println("Call waiting");
                     System.out.print("Enter 0 to nav back: ");
                     option = input.nextInt(); 
                    if (option == 0){
                   } callSettings();  
                }
                case 4 -> {System.out.println("Own number");
                     System.out.print("Enter 0 to nav back: ");
                     option = input.nextInt(); 
                    if (option == 0){
                   } callSettings();          
                }
                case 5 -> {System.out.println("Phone line in use");
                     System.out.print("Enter 0 to nav back: ");
                     option = input.nextInt(); 
                    if (option == 0){
                   } callSettings();  
                }
                case 6 -> {System.out.println("Automatic answer");
                     System.out.print("Enter 0 to nav back: ");
                     option = input.nextInt(); 
                    if (option == 0){
                   } callSettings();  
                }
                case 7 -> settings();
                default -> {System.out.println("Enter a valid number");
                     System.out.print("Enter 0 to nav back: ");
                     option = input.nextInt(); 
                    if (option == 0){
                   } callSettings();  
                }
        } 
}
static void phoneSettings(){
  
        menu = """
    ======== PHONE SETTINGS ===========
    ----1. Language
    ----2. Cell info display
    ----3. Welcome note
    ----4. Network Selection
    ----5. Lights
    ----6. Confirm SIM service actions
    ----7. back
    =================================== """;
    System.out.println(menu);
    System.out.print("Enter option: ");
    option = input.nextInt();
        switch (option){
            case 1 -> {System.out.println("Language");
                     System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } phoneSettings();  
            }
            case 2 -> {System.out.println("cell info display");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } phoneSettings();  
            }
            case 3 -> {System.out.println("welcome note");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } phoneSettings();  
            }
            case 4 -> {System.out.println("Network selection");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } phoneSettings();  
            }
            case 5 -> {System.out.println("Lights");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } phoneSettings();  
            }
            case 6 -> {System.out.println("Confirm SIM service actions");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } phoneSettings();  
            }
            case 7 -> settings();
            default -> {System.out.println("Enter a valid number");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } phoneSettings();  
            }
  }
}
static void securitySettings(){
       menu = """
    ======== SECURITY SETTINGS ===========
    ----1. PIN code request
    ----2. Call barring service
    ----3. Fixed dailing
    ----4. closed user group
    ----5. Phone security
    ----6. Change access codes
    ----7. back
    =================================== """;
    System.out.println(menu);
    System.out.print("Enter option: ");
    option = input.nextInt();
        switch (option){
            case 1 -> {System.out.println("PIN code request");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } securitySettings();  
            }
            case 2 -> {System.out.println("call barring service");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } securitySettings();  
            }
            case 3 -> {System.out.println("Fixed dailing");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } securitySettings();  
            }
            case 4 -> {System.out.println("Closed user group");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } securitySettings();  
            }
            case 5 -> {System.out.println("Phone security");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } securitySettings();  
            }
            case 6 -> {System.out.println("Change access code");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } securitySettings();  
            }
            case 7 ->settings();
            default -> {System.out.println("Enter valid number");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } phoneSettings();  
            }
    }
}

static void settings(){

        menu = """
    ======== SETTINGS ===========
    ---1. Call settings
    ---2. Phone Settings
    ---3. Security Settings
    ---4. Restore Factory Settings
    ---5. back
    =================================== """;
    System.out.println(menu);
    System.out.print("Enter option: ");
    option = input.nextInt();
        switch (option){
        case 1 -> callSettings();
        case 2 -> phoneSettings();
        case 3 -> securitySettings();
        case 4 -> {System.out.println("Restore factory settings");
            System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } phoneSettings();  
        }
        case 5 -> menu();
        default -> {System.out.println("Invalid Input!!");
                System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } phoneSettings();  
        }
  
  }
}
static void clock(){
    menu = """
     =============== CLOCK ===========
    ---1. Alarm clock
    ---2. Clock settings
    ---3. Date settings
    ---4. StopWatch
    ---5. Countdown timer
    ---6. Auto update of date and time
    ---7. back
    =================================== """;
    System.out.println(menu);
    System.out.print("Enter option: ");
    option = input.nextInt();
        switch (option){
            case 1 -> {System.out.println("Alarm clock");
                        System.out.print("Enter 0 to nav back: ");
                         option = input.nextInt(); 
                        if (option == 0){
                     } clock();  
            }
            case 2 -> {System.out.println("Clock settings");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } clock();  
            }
            case 3 -> {System.out.println("Date settings");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } clock();  
            }
            case 4 -> {System.out.println("stopwatch");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } clock();  
            }
            case 5 -> {System.out.println("Countdown timer");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } clock();  
            }
            case 6 -> {System.out.println("Auto upate of date and time");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } clock();  
            }
            case 7 ->{menu();}
            default -> {System.out.println("Ente a valid number");
                    System.out.print("Enter 0 to nav back: ");
                      option = input.nextInt(); 
                    if (option == 0){
                     } clock();  
            }

            }

}






                                


}
