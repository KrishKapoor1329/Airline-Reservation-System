import java.util.*;
class Project
{

    //Flight Details

    Scanner scint=new Scanner(System.in);//scanner class
    Scanner scstring=new Scanner(System.in);
    Scanner scchar=new Scanner(System.in);

    String name_arr1[]=new String[6];
    String gender_arr1[]=new String[6];
    String nationality_arr1[]=new String[6];
    int age_arr1[]=new int[6];
    int passport_no_arr1[]=new int[6];

    String name_arr2[]=new String[6];
    String gender_arr2[]=new String[6];
    String nationality_arr2[]=new String[6];
    int age_arr2[]=new int[6];
    int passport_no_arr2[]=new int[6];

    int booking_reference_no1[]={0,0,0,0,0,0};
    int booking_reference_no2[]={0,0,0,0,0,0};
    int flight_number[]={1,2};

    String flight_name[]={"EK1","EK2"};

    int total_seats[]={6,6};

    int no_of_seats_reserved[]={0,0};

    boolean booking_status1[]={false,false,false,false,false,false};
    boolean booking_status2[]={false,false,false,false,false,false};

    String depature_junction[]={"DXB","DEL"};

    String arrival_junction[]={"LAX","SEA"};

    String flight_date[]={"29th August 2021","2nd September 2021"};

    int flight_fare[]={750,1000};

    int count1=0;
    int count2=0;
    char c2;
    char c1;
    int i=0;
    int countt=0;
    String username[]={"Krish", "Kapoor", "1329"};
    String password[]={"2113", "1329", "a2"};

    String name="";
    int age=0;
    String gender="";
    int passport_no=0;
    String nationality="";
    void bookTicket()
    {

        System.out.print("\fEnter your name : ");
        name=scstring.nextLine();
        System.out.print("Enter your age : ");
        age=scint.nextInt();
        System.out.print("Enter your gender : ");
        gender=scstring.nextLine();
        System.out.print("Enter your passport number : ");
        passport_no=scint.nextInt();
        System.out.print("Enter your nationality : ");
        nationality=scstring.nextLine();

        System.out.print("Enter the name of the flight which you wish to book (EK1 or EK2) : ");
        String aa=scstring.nextLine();
        if(aa.equalsIgnoreCase("EK1")==false && aa.equalsIgnoreCase("EK2")==false)
        {
            System.out.println("Enter valid flight name");
            System.out.println("\n\t\t\t\t\t\tType any key followed by Enter key to continue");
            char ch=scchar.next().charAt(0);
            System.out.println("\f");
            return;
        }
        System.out.print("Enter which seat you wish to book (1 to 6) : ");
        i=scint.nextInt();
        if((i>=1 && i<=6) && aa.equalsIgnoreCase("EK1") && booking_status1[i-1]==false )
        {
            booking_status1[i-1]=true;
            System.out.println("Congratulations! You have booked Seat No " + i +" in the flight EK1");
            booking_reference_no1[i-1]=(int)(10000+(Math.random()*99999));
            System.out.println("Your booking reference no is " + booking_reference_no1[i-1]);
            name_arr1[i-1]=name;
            age_arr1[i-1]=age;
            gender_arr1[i-1]=gender;
            passport_no_arr1[i-1]=passport_no;
            nationality_arr1[i-1]=nationality;
            count1++;
        }
        else if((i>=1 && i<=6) && aa.equalsIgnoreCase("EK2") && booking_status2[i-1]==false && (i>=1 && i<=6))
        {
            booking_status2[i-1]=true;  
            System.out.println("Congratulations! You have booked Seat No " + i +" in the flight EK2");
            booking_reference_no2[i-1]=(int)(10000+(Math.random()*99999));
            System.out.println("Your booking reference no is " + booking_reference_no2[i-1]);
            name_arr2[i-1]=name;
            age_arr2[i-1]=age;
            gender_arr2[i-1]=gender;
            passport_no_arr2[i-1]=passport_no;
            nationality_arr2[i-1]=nationality;
            count2++;
        }
        else
        {

            System.out.println("Enter valid seat number");

        }

        System.out.println("\n\t\t\t\t\t\tType any key followed by Enter key to continue");
        char ch=scchar.next().charAt(0);
        System.out.println("\f");
    }

    void cancelTicket()
    {
        System.out.println("Enter the name of the flight which you wish to cancel (EK1 or EK2)");
        String bb=scstring.nextLine();
        if(bb.equalsIgnoreCase("EK1")==false && bb.equalsIgnoreCase("EK2")==false)
        {
            System.out.println("Enter valid flight name");
            System.out.println("\n\t\t\t\t\t\tType any key followed by Enter key to continue");
            char ch=scchar.next().charAt(0);
            System.out.println("\f");
            return;
        }
        System.out.println("Enter which seat you wish to cancel (1 to 6)");
        i=scint.nextInt();
        if((i>=1 && i<=6) && bb.equalsIgnoreCase("EK1") && booking_status1[i-1]==true)
        {
            booking_status1[i-1]=false;
            System.out.println("You have cancelled Seat No " + i +" in the flight EK1");
            booking_reference_no1[i-1]=0;
            name_arr1[i-1]="";
            age_arr1[i-1]=0;
            gender_arr1[i-1]="";
            passport_no_arr1[i-1]=0;
            nationality_arr1[i-1]="";
            count1--;
        }
        else if((i>=1 && i<=6) && bb.equalsIgnoreCase("EK2") && booking_status2[i-1]==true)
        {
            booking_status1[i-1]=false;  
            System.out.println("You have cancelled Seat No " + i +" in the flight EK2");
            booking_reference_no2[i-1]=0;
            name_arr2[i-1]="";
            age_arr2[i-1]=0;
            gender_arr2[i-1]="";
            passport_no_arr2[i-1]=0;
            nationality_arr2[i-1]="";
            count2--;
        }
        else
        {
            System.out.println("Enter valid seat number");
        }

        System.out.println("\n\t\t\t\t\t\tType any key followed by Enter key to continue");
        char ch=scchar.next().charAt(0);
        System.out.println("\f");
    }

    void displayDetails()
    {
        System.out.println("What is your flight no EK1 or EK2?");
        String flight_no_question_c=scstring.nextLine();
        if(flight_no_question_c.equalsIgnoreCase("EK1"))
        {
            System.out.println("What seat number have you booked?");
            int a=scint.nextInt();
            if((a>=1 && a<=6) && booking_status1[a-1]==false )
            {
                System.out.println("No one has booked this seat");
            }
            else if(a>=1 && a<=6)
            {
                System.out.println("Seat no is " + a);
                System.out.println("Booking reference no is " + booking_reference_no1[a-1]);
                System.out.println("Name is " + name_arr1[a-1]);
                System.out.println("Age is " + age_arr1[a-1]);
                System.out.println("Gender is " + gender_arr1[a-1]);
                System.out.println("Passport no is " + passport_no_arr1[a-1]);
                System.out.println("Nationality is " + nationality_arr1[a-1]);
            }
            else
            {
                System.out.println("Invalid input");
            }
        }
        else if(flight_no_question_c.equalsIgnoreCase("EK2"))
        {
            System.out.println("What seat number have you booked?");
            int a=scint.nextInt();
            if((a>=1 && a<=6) && booking_status2[a-1]==false)
            {
                System.out.println("No one has booked this seat");
            }
            else if(a>=1 && a<=6)
            {
                System.out.println("Seat no is " + a);
                System.out.println("Booking reference no is " + booking_reference_no2[a-1]);
                System.out.println("Name is " + name_arr2[a-1]);
                System.out.println("Age is " + age_arr2[a-1]);
                System.out.println("Gender is " + gender_arr2[a-1]);
                System.out.println("Passport no is " + passport_no_arr2[a-1]);
                System.out.println("Nationality is " + nationality_arr2[a-1]);
            }
            else
            {
                System.out.println("Invalid input");
            }
        }
        else
        {
            System.out.println("Enter valid flight name");
        }
        System.out.println("\n\t\t\t\t\t\tType any key followed by Enter key to continue");
        char ch=scchar.next().charAt(0);
        System.out.println("\f");
    }

    void sortRecords()
    {
        System.out.println("Do you want to sort the records of flight EK1 or EK2");
        String flight_no_question_d=scstring.nextLine();
        if(flight_no_question_d.equalsIgnoreCase("EK1") && count1>0)
        {
            String temp1;
            for (int y = 0; y < count1-1; y++) 
            {
                for (int x = 0; x < count1-1-y; x++) { 
                    if (name_arr1[x].compareTo(name_arr1[x+1])>0) 
                    {
                        temp1 = name_arr1[x];
                        name_arr1[x] = name_arr1[x+1];
                        name_arr1[x+1] = temp1;
                    }
                }
            }

            for (int y = 0; y <= count1 - 1; y++) 
            {
                System.out.println(name_arr1[y]);
            }
        }
        else if(flight_no_question_d.equalsIgnoreCase("EK2") && count2>0)
        {
            String temp2;
            for (int y = 0; y < count2-1; y++) 
            {
                for (int x = 0; x < count2-1-y; x++) { 
                    if (name_arr2[x].compareTo(name_arr2[x+1])>0) 
                    {
                        temp2 = name_arr2[x];
                        name_arr2[x] = name_arr2[x+1];
                        name_arr2[x+1] = temp2;
                    }
                }
            }

            for (int y = 0; y <= count2 - 1; y++) 
            {
                System.out.println(name_arr2[y]);
            }
        }
        else
        {
            if(count1<=0 || count2<=0)
            {
                System.out.println("No seat has been booked in the flight");   
            }
            else if((flight_no_question_d.equalsIgnoreCase("EK1")==false) || (flight_no_question_d.equalsIgnoreCase("EK2")==false))
            {
                System.out.println("Invalid flight name");   
            }
        }
        System.out.println("\n\t\t\t\t\t\tType any key followed by Enter key to continue");
        char ch=scchar.next().charAt(0);
        System.out.println("\f");
    }

    void printAirTicket()
    {
        boolean flag=false;
        System.out.println("What is your flight no EK1 or EK2?");
        String flight_no_question_e=scstring.nextLine();
        if(flight_no_question_e.equalsIgnoreCase("EK1"))
        {
            if(count1>0)
            {
                System.out.println("Enter your booking reference number");
                int booking_reference_number_ask1=scint.nextInt();
                for(int z=0;z<6;z++)
                {
                    if(booking_reference_number_ask1==booking_reference_no1[z])
                    {
                        flag=true;
                        System.out.println("------------------------------------------------------");
                        System.out.println("Seat no is " + (z+1));
                        System.out.println("------------------------------------------------------");
                        System.out.println("Booking reference no is " + booking_reference_no1[z]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Name is " + name_arr1[z]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Age is " + age_arr1[z]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Gender is " + gender_arr1[z]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Passport no is " + passport_no_arr1[z]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Nationality is " + nationality_arr1[z]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Flight Date is " + flight_date[0]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Depature Junction is " + depature_junction[0]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Arrival Junction is " + arrival_junction[0]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Flight Fare is " + flight_fare[0]);
                        System.out.println("------------------------------------------------------");
                    }
                }
                if(flag==false)
                {
                    System.out.println("Invalid booking reference number");
                }
            }
            else
            {
                System.out.println("No seat has been booked for this flight");  
            }
        }
        else if(flight_no_question_e.equalsIgnoreCase("EK2"))
        {
            if(count2>0)
            {
                System.out.println("Enter your booking reference number");
                int booking_reference_number_ask2=scint.nextInt();
                for(int z=0;z<6;z++)
                {
                    if(booking_reference_number_ask2==booking_reference_no2[z])
                    {
                        flag=true;
                        System.out.println("------------------------------------------------------");
                        System.out.println("Seat no is " + (z+1));
                        System.out.println("------------------------------------------------------");
                        System.out.println("Booking reference no is " + booking_reference_no2[z]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Name is " + name_arr2[z]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Age is " + age_arr2[z]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Gender is " + gender_arr2[z]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Passport no is " + passport_no_arr2[z]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Nationality is " + nationality_arr2[z]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Flight Date is " + flight_date[1]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Depature Junction is " + depature_junction[1]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Arrival Junction is " + arrival_junction[1]);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Flight Fare is " + flight_fare[1]);
                        System.out.println("------------------------------------------------------");
                    }
                }
                if(flag==false)
                {
                    System.out.println("Invalid booking reference number");
                }
            }
            else
            {
                System.out.println("No seat has been booked for this flight");
            }
        }
        else
        {
            System.out.println("Enter valid flight name");
        }
        System.out.println("\n\t\t\t\t\t\tType any key followed by Enter key to continue");
        char ch=scchar.next().charAt(0);
        System.out.println("\f");
    }

    void statusFlight()
    {
        System.out.println("What is your flight no EK1 or EK2?");
        String flight_no_question_f=scstring.nextLine();
        if(flight_no_question_f.equalsIgnoreCase("EK1"))
        {
            int count1_6=6-count1;
            System.out.println(count1 + " seats have been booked so there are " + count1_6 + " seats available");
            if(count1>0 && count1<=6)
            {
                System.out.println("Enter the seat number of which you want to check the status of");
                int seat_number_ask1=scint.nextInt();

                if(booking_status1[seat_number_ask1-1]==true)
                {
                    System.out.println("Seat is NOT AVAILABLE");  
                }
                else if(booking_status1[seat_number_ask1-1]==false)
                {
                    System.out.println("Seat is AVAILABLE");  
                }
            }
        }
        else if(flight_no_question_f.equalsIgnoreCase("EK2"))
        {
            int count2_6=6-count2;
            System.out.println(count2 + " seats have been booked so there are " + count2_6 + " seats available");
            if(count2>0 && count2<=6)
            {
                System.out.println("Enter the seat number of which you want to check the status of");
                int seat_number_ask2=scint.nextInt();

                if(booking_status2[seat_number_ask2-1]==true)
                {
                    System.out.println("Seat is NOT AVAILABLE");  
                }
                else if(booking_status2[seat_number_ask2-1]==false)
                {
                    System.out.println("Seat is AVAILABLE");  
                }
            }
        }
        else
        {
            System.out.println("Enter valid flight name");
        }

        System.out.println("\n\t\t\t\t\t\tType any key followed by Enter key to continue");
        char ch=scchar.next().charAt(0);
        System.out.println("\f");
    }

    void welcome()
    {
        System.out.println("\n\n\n");
        System.out.println("\n\t\t\t\t\t\tSchool : Gems Modern Academy");
        System.out.println("\n\t\t\t\t\t\tProject Topic : Flight Reservation System");
        System.out.println("\n\t\t\t\t\t\tPlatform Used : Java (BlueJ)");
        System.out.println("\n\t\t\t\t\t\tName : Krish Kapoor");
        System.out.println("\n\t\t\t\t\t\tNationality : Indian");
        System.out.println("\n\t\t\t\t\t\tType any key followed by Enter key to continue");
        char ch=scchar.next().charAt(0);
        System.out.println("\f");
    }

    void username()
    {
        System.out.print("\n\tEnter the Username : ");
        String enteru=scstring.nextLine();
        System.out.print("\n\tEnter the Password : ");
        String enterp=scstring.nextLine();  
        if(!(enteru.equals(username[0]) && enterp.equals(password[0])) || (enteru.equals(username[1]) && enterp.equals(password[1])) || (enteru.equals(username[2]) && enterp.equals(password[2])))
        {
            System.out.println("Enter correct credentials");
            System.exit(0);
        }
        else
        {
            System.out.println("\f");
            welcome();

        }
    }

    void main()
    {
        username(); //calling username function
        do
        {

            System.out.println("\n Welcome, choose any of the options");
            System.out.println("\ta) Book a Ticket \n\tb) Cancel a ticket \n\tc) Display the details of passengers for the given flight \n\td) Sort the records in the ascending order of passenger name and display \n\te) Print the air ticket for a given Booking reference number \n\tf) Display the seat availability status of the given flight for a specific date \n\tg) Exit the program");
            System.out.print("\n\tEnter any of the options : ");
            c2=scchar.next().charAt(0);
            //asking user for input
            switch(c2)
            {
                case'a':
                bookTicket();
                break;

                case'b':
                cancelTicket();
                break;

                case'c':
                displayDetails();
                break;

                case'd':
                sortRecords();
                break;

                case'e':
                printAirTicket();
                break;
                case'f':
                statusFlight();
                break;

            }

        }while(c2!='g');
    }

}

