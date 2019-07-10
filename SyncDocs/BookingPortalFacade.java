class BookingPortalFacade 
{
    Doctor1 doctor1;
    Doctor2 doctor2;
    Doctor3 doctor3;
    Doctor4 doctor4;
    Doctor5 doctor5;
    Doctor6 doctor6;
    Doctor7 doctor7;
    Doctor8 doctor8;
    Doctor9 doctor9;
    Doctor10 doctor10;
    public void book(int date,int time,String doctorName)
    {
        switch(doctorName)
        {
            case "doctor1": 
                doctor1 = new Doctor1();
                doctor1.book(date, time);
                break;
            case "doctor2": 
                doctor2 = new Doctor2();
                doctor2.book(date, time);
                break;
            case "doctor3": 
                doctor3 = new Doctor3();
                doctor3.book(date, time);
                break;
            case "doctor4": 
                doctor4 = new Doctor4();
                doctor4.book(date, time);
                break;
            case "doctor5": 
                doctor5 = new Doctor5();
                doctor5.book(date, time);
                break;
            case "doctor6": 
                doctor6 = new Doctor6();
                doctor6.book(date, time);
                break;
            case "doctor7": 
                doctor7 = new Doctor7();
                doctor7.book(date, time);
                break;
            case "doctor8": 
                doctor8 = new Doctor8();
                doctor8.book(date, time);
                break;
            case "doctor9": 
                doctor9 = new Doctor9();
                doctor9.book(date, time);
                break;
            case "doctor10": 
                doctor10 = new Doctor10();
                doctor10.book(date, time);
                break;
            
        }
    }
}
