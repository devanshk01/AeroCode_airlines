package AeroCode_airlines;// package AeroCode_Airlines;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import AeroCode_airlines.Colours;

class Flight {
    private String flightNumber;
    private String date;
    private String from;
    private String to;
    private String departure;
    private String arrival;
    private String aircraft;
    private String type;
    private double distance;
    private String flightDuration;

    public Flight(String flightNumber, String date, String from, String to, String departure, String arrival, String aircraft, String type, double distance, String flightDuration) {
        this.flightNumber = flightNumber;
        this.date = date;
        this.from = from;
        this.to = to;
        this.departure = departure;
        this.arrival = arrival;
        this.aircraft = aircraft;
        this.type = type;
        this.distance = distance;
        this.flightDuration = flightDuration;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(String flightDuration) {
        this.flightDuration = flightDuration;
    }

    @Override
    public String toString() {
        return  "    Flight Number   : " + flightNumber + '\n' +
                "    Date            : " + date + '\n' +
                "    From            : " + from + '\n' +
                "    To              : " + to + '\n' +
                "    Departure Time  : " + departure + '\n' +
                "    Arrival Time    : " + arrival + '\n' +
                "    Aircraft        : " + aircraft + '\n' +
                "    Flight Type     : " + type + "\n" +
                "    Distance        : " + distance + " kms" + '\n' +
                "    Flight Duration : " + flightDuration + "\n";
    }
}


class Aircraft {
    private String name;
    private int passengerCapacity;
    private int crewCapacity;
    private double totalMaxWeightCapacity;
    private double fuelConsumption;

    public Aircraft(String name, int passengerCapacity, int crewCapacity, double totalMaxWeightCapacity, double fuelConsumption) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.crewCapacity = crewCapacity;
        this.totalMaxWeightCapacity = totalMaxWeightCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public void aircraftDetails () {
        System.out.println("    Aircraft model name            : " + name);
        System.out.println("    Total passenger capacity       : " + passengerCapacity);
        System.out.println("    Total crew capacity            : " + crewCapacity);
        System.out.printf("    Total Maximum weight capacity  : %.2f kgs\n", totalMaxWeightCapacity);
        System.out.printf("    Fuel consumption               : %.2f Litres per km\n", fuelConsumption);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }

    public void setCrewCapacity(int crewCapacity) {
        this.crewCapacity = crewCapacity;
    }

    public double getTotalMaxWeightCapacity() {
        return totalMaxWeightCapacity;
    }

    public void setTotalMaxWeightCapacity(double totalMaxWeightCapacity) {
        this.totalMaxWeightCapacity = totalMaxWeightCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}

class Passenger {
    private String name;
    private int age;
    private long mobileNum;
    private String email;
    private String gender;
    private int passportNum;
    private String flightNum;

    public Passenger(String name, int age, long mobileNum, String email, String gender, int passportNum, String flightNum) {
        this.name = name;
        this.age = age;
        this.mobileNum = mobileNum;
        this.email = email;
        this.gender = gender;
        this.passportNum = passportNum;
        this.flightNum = flightNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(long mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(int passportNum) {
        this.passportNum = passportNum;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return  "Name            : " + name + '\n' +
                "Age             : " + age + '\n' +
                "Mobile Number   : " + mobileNum + '\n' +
                "Email Address   : " + email + '\n' +
                "Gender          : " + gender + '\n' +
                "Passport Number : " + passportNum + '\n';
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }
}

class AllAircrafts {
    ArrayList<Aircraft> allAcs = new ArrayList<>(6);

    Aircraft b747 = new Aircraft("Boeing 747", 450, 20, 412000, 12);
    Aircraft b777 = new Aircraft("Boeing 777", 350, 15, 351500, 10);
    Aircraft b737 = new Aircraft("Boeing 737", 180, 10, 79015, 6);
    Aircraft a380 = new Aircraft("Airbus A380", 500, 20, 560000, 15);
    Aircraft a340 = new Aircraft("Airbus A340", 370, 15, 381200, 11);
    Aircraft a320 = new Aircraft("Airbus A320", 150, 10, 79000, 4);

    AllAircrafts () {
        allAcs.add(b747);
        allAcs.add(b777);
        allAcs.add(b737);
        allAcs.add(a380);
        allAcs.add(a340);
        allAcs.add(a320);
    }

    public ArrayList<Aircraft> getAllAcs() {
        return allAcs;
    }
}

class InvalidChoice extends Exception {
    @Override
    public String toString() {
        return "Invalid Choice! Please Enter a valid Choice...";
    }
}

public class AeroCode_Airlines_main {
    public static void viewAircraftDetails () {
        AllAircrafts ac = new AllAircrafts();

        int i = 1;
        for (Aircraft a : ac.getAllAcs()) {
            System.out.println(i + "]");

            a.aircraftDetails();
            i++;
        }
    }

    public static ArrayList<Flight> getAllFlights () {

        // File's pathname may be different in different devices. So make sure that you enter the right file path
        String fileName = "AeroCode_airlines/airline_data.csv";

        BufferedReader reader = null;
        String line = "";
        ArrayList<Flight> allFlights = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(fileName));

            while ((line = reader.readLine()) != null) {
                String[] flightDetails = line.split(",");
                if (flightDetails.length >= 10) {
                    double dis = 0;
                    try {
                        dis = Double.parseDouble(flightDetails[8]);
                    }
                    catch (Exception e) {

                    }

                    Flight f = new Flight(flightDetails[0], flightDetails[1], flightDetails[2], flightDetails[3], flightDetails[4], flightDetails[5], flightDetails[6], flightDetails[7], dis, flightDetails[9]);
                    allFlights.add(f);
                }
            }

            allFlights.removeFirst();
            return allFlights;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exc) {
                exc.printStackTrace();
            }
        }
        return allFlights;
    }

    public static void searchByFNum (String fNum) {
        ArrayList<Flight> allFlights = getAllFlights();

        int count = 0;
        for (Flight f : allFlights) {
            if (fNum.equalsIgnoreCase(f.getFlightNumber())) {
                System.out.println(f);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No Flights with this Flight Number !");
        }
    }

    public static void searchByFDate (String fDate) {
        ArrayList<Flight> allFlights = getAllFlights();

        int count = 0;
        for (Flight f : allFlights) {
            if (fDate.equalsIgnoreCase(f.getDate())) {
                System.out.println(f);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No Flights are available on " + fDate + " !\nTry searching for some other Dates.");
        }
    }

    public static void searchByFTakeoff (String fTakeoff) {
        ArrayList<Flight> allFlights = getAllFlights();

        int count = 0;
        for (Flight f : allFlights) {
            if (fTakeoff.equalsIgnoreCase(f.getFrom())) {
                System.out.println(f);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No Flights are available From " + fTakeoff + " !\nTry searching for some other City.");
        }
    }

    public static void searchByFLand (String fLand) {
        ArrayList<Flight> allFlights = getAllFlights();

        int count = 0;
        for (Flight f : allFlights) {
            if (fLand.equalsIgnoreCase(f.getTo())) {
                System.out.println(f);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No Flights are available To " + fLand + " !\nTry searching for some other City.");
        }
    }

    public static void searchFlights () {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Colours.CYAN + "  A." + Colours.RESET + "Search Flights by Date");
        System.out.println(Colours.CYAN + "  B." + Colours.RESET + "Search Flights by Take-off Destination");
        System.out.println(Colours.CYAN + "  C." + Colours.RESET + "Search Flights by Landing Destination");
        System.out.println();

        char choice = '\0';

        while (true) {
            System.out.print(Colours.GREEN + "  >> ENTER YOUR SEARCH CHOICE : " + Colours.RESET);

            try {
                choice = scanner.next().charAt(0);
                System.out.println();
                break;
            }
            catch (InputMismatchException e) {
                try {
                    throw new InvalidChoice();
                }
                catch (InvalidChoice exc) {
                    System.out.println(Colours.RED + exc + Colours.RESET);
                }
            }
        }

        switch (choice) {
            case 'A', 'a' : {
                System.out.print("  Enter Flight Date (dd-mm-yyyy) : ");
                String fDate = scanner.next();
                System.out.println();
                searchByFDate (fDate);
                break;
            }
            case 'B', 'b' : {
                System.out.print("  Enter Take-off Destination : ");
                String fTakeoff = scanner.next();
                System.out.println();
                searchByFTakeoff (fTakeoff);
                break;
            }
            case 'C', 'c' : {
                System.out.print("  Enter Landing Destination : ");
                String fLand = scanner.next();
                System.out.println();
                searchByFLand (fLand);
                break;
            }
            default : {
                try {
                    throw new InvalidChoice();
                } catch (InvalidChoice e) {
                    System.out.println(Colours.RED + e + Colours.RESET);
                }
            }
        }
    }

    public static double ticketPrice (Flight f) {
        final double PRICE_OF_ONE_LITRE_FUEL = 1120;    // Rs. 1120 per Litre

        AllAircrafts allAircrafts = new AllAircrafts();

        for (Aircraft a : allAircrafts.getAllAcs()) {
            if ((a.getName()).equalsIgnoreCase(f.getAircraft())) {
                double price = (PRICE_OF_ONE_LITRE_FUEL * a.getFuelConsumption() * f.getDistance() / (a.getPassengerCapacity() + a.getCrewCapacity()));
                return price;
            }
        }
        return 0;
    }

    public static ArrayList<Passenger> getAllPassengers () {
        String fileName = "AeroCode_airlines/passenger_data.csv";

        BufferedReader reader = null;
        String line = "";
        ArrayList<Passenger> allPassengers = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(fileName));

            while ((line = reader.readLine()) != null) {
                String[] passengerDetails = line.split(",");

                if (passengerDetails.length >= 7) {

                    long mobNum = 0;
                    try {
                        mobNum = Long.parseLong(passengerDetails[2]);
                    }
                    catch (Exception e) {

                    }

                    int age = 0;
                    try {
                        age = Integer.parseInt(passengerDetails[1]);
                    }
                    catch (Exception e) {

                    }

                    int passNum = 0;
                    try {
                        passNum = Integer.parseInt(passengerDetails[5]);
                    }
                    catch (Exception e) {

                    }

                    Passenger p = new Passenger(passengerDetails[0], age, mobNum, passengerDetails[3], passengerDetails[4], passNum, passengerDetails[6]);
                    allPassengers.add(p);
                }
            }

            allPassengers.removeFirst();
            return allPassengers;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exc) {
                exc.printStackTrace();
            }
        }
        return allPassengers;
    }

    public static void viewTicket () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Mobile Number : ");
        long MobNum = scanner.nextLong();

        Flight flight = null;

        for (Passenger p : getAllPassengers()) {

            if (MobNum == p.getMobileNum()) {
                for (Flight f : getAllFlights()) {
                    if (p.getFlightNum().equalsIgnoreCase(f.getFlightNumber())) {
                        flight = f;
                    }
                }

                String[] info1 = new String[10];
                String[] info2 = new String[10];

                if (flight != null) {

                    info2[0] = "Flight Number   : " + flight.getFlightNumber();
                    info2[1] = "Date            : " + flight.getDate();
                    info2[2] = "From            : " + flight.getFrom();
                    info2[3] = "To              : " + flight.getTo();
                    info2[4] = "Departure Time  : " + flight.getDeparture();
                    info2[5] = "Arrival Time    : " + flight.getArrival();
                    info2[6] = "Aircraft        : " + flight.getAircraft();
                    info2[7] = "Flight Type     : " + flight.getType();
                    info2[8] = "Distance        : " + flight.getDistance() + " kms";
                    info2[9] = "Flight Duration : " + flight.getFlightDuration();

                    String str1 = "PERSONAL DETAILS :";
                    String str2 = "FLIGHT DETAILS : ";

                    System.out.println();

                    for (int i = 0; i < 105; i++) {
                        System.out.print("_");
                    }

                    System.out.println();

                    System.out.print("|");

                    for (int i = 0; i < 103; i++) {
                        System.out.print(" ");
                    }

                    System.out.print("|\n");

                    System.out.printf("|  " + Colours.CYAN + "%-50s %-50s" + Colours.RESET + "|\n%-104s|\n" , str1, str2, "|");

                    if ((flight.getType()).equalsIgnoreCase("International")) {

                        String str = String.format("Total Payable Amount : Rs. %.2f", ticketPrice(flight));

                        info1[0] = "Name            : " + p.getName();
                        info1[1] = "Age             : " + p.getAge();
                        info1[2] = "Mobile Number   : " + p.getMobileNum();
                        info1[3] = "Email Address   : " + p.getEmail();
                        info1[4] = "Gender          : " + p.getGender();
                        info1[5] = "Passport Number : " + p.getPassportNum();

                        System.out.printf("|  %-50s %-50s|\n", info1[0], info2[0]);
                        System.out.printf("|  %-50s %-50s|\n", info1[1], info2[1]);
                        System.out.printf("|  %-50s %-50s|\n", info1[2], info2[2]);
                        System.out.printf("|  %-50s %-50s|\n", info1[3], info2[3]);
                        System.out.printf("|  %-50s %-50s|\n", info1[4], info2[4]);
                        System.out.printf("|  %-50s %-50s|\n", info1[5], info2[5]);
                        System.out.printf("|  %-50s %-50s|\n", " ", info2[6]);
                        System.out.printf("|  %-50s %-50s|\n", str, info2[7]);
                        System.out.printf("|  %-59s %-50s|\n", "Payment status : " + Colours.GREEN + "Successful" + Colours.RESET, info2[8]);
                        System.out.printf("|  %-59s %-50s|\n", "Ticket status : " + Colours.GREEN + "Confirmed" + Colours.RESET, info2[9]);
                        System.out.printf("|  %-50s %-50s|\n", " ", " ");

                    } else {
                        String str = String.format("Total Payable Amount : Rs. %.2f", ticketPrice(flight));

                        info1[0] = "Name            : " + p.getName();
                        info1[1] = "Age             : " + p.getAge();
                        info1[2] = "Mobile Number   : " + p.getMobileNum();
                        info1[3] = "Email Address   : " + p.getEmail();
                        info1[4] = "Gender          : " + p.getGender();

                        System.out.printf("|  %-50s %-50s|\n", info1[0], info2[0]);
                        System.out.printf("|  %-50s %-50s|\n", info1[1], info2[1]);
                        System.out.printf("|  %-50s %-50s|\n", info1[2], info2[2]);
                        System.out.printf("|  %-50s %-50s|\n", info1[3], info2[3]);
                        System.out.printf("|  %-50s %-50s|\n", info1[4], info2[4]);
                        System.out.printf("|  %-50s %-50s|\n", " ", info2[5]);
                        System.out.printf("|  %-50s %-50s|\n", str, info2[6]);
                        System.out.printf("|  %-59s %-50s|\n", "Payment status : " + Colours.GREEN + "Successful" + Colours.RESET, info2[7]);
                        System.out.printf("|  %-59s %-50s|\n", "Ticket status : " + Colours.GREEN + "Confirmed" + Colours.RESET, info2[8]);
                        System.out.printf("|  %-50s %-50s|\n", " ", info2[9]);
                    }
                    System.out.print("|");
                    for (int i = 0; i < 103; i++) {
                        System.out.print("_");
                    }
                    System.out.print("|\n\n");
                }
                return;
            }
        }
        System.out.println();
        System.out.println("No passengers found with this Mobile Number !\nMake sure that you've entered correct information..");
    }

    public static void setPassenger (Passenger p) {
        String[] data = {p.getName(), Integer.toString(p.getAge()), Long.toString(p.getMobileNum()), p.getEmail(), p.getGender(), Integer.toString(p.getPassportNum()), p.getFlightNum()};

        try (FileWriter writer = new FileWriter("AeroCode_airlines/passenger_data.csv", true)) {
            StringBuilder sb = new StringBuilder();
            for (String value : data) {
                sb.append(value).append(",");
            }
            sb.append("\n");

            writer.append(sb.toString());

        } catch (IOException e) {
            System.err.println("File does not exist!\n");
        }
    }

    public static boolean isFull (Flight f) {
        int count = 0;

        for (Passenger p : getAllPassengers()) {
            if (p.getFlightNum().equalsIgnoreCase(f.getFlightNumber())) {
                count++;
            }
        }

        AllAircrafts allAircrafts = new AllAircrafts();
        Aircraft aircraft = null;

        for (Aircraft a : allAircrafts.getAllAcs()) {
            if (a.getName().equalsIgnoreCase(f.getAircraft())) {
                aircraft = a;
            }
        }

        if (count >= aircraft.getPassengerCapacity()) {
            return true;
        }
        return false;
    }

    public static void bookTicket () {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        String fType = "";
        boolean flag = true;
        Flight flight = null;

        do {
            System.out.print("Enter the Flight Number : ");

            String fNum = scan.next();

            ArrayList<Flight> allFlights = getAllFlights();

            for (Flight f : allFlights) {
                if ((f.getFlightNumber()).equalsIgnoreCase(fNum)) {
                    System.out.println();

                    if (isFull(f)) {
                        System.out.println("We're Sorry! The flight " + f.getFlightNumber() + " is Full :(\nTry to find this flight on some other day.");
                        return;
                    }

                    System.out.println();

                    System.out.print(f);
                    System.out.printf("    Ticket Price    : Rs. %.2f\n", ticketPrice(f));

                    flight = f;
                    fType = f.getType();
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("\nOOPS! No flights found with this Flight Number :(\n");
            }
        } while (flag);


        int choice = 0;
        do {
            System.out.println();
            System.out.print("Press '1' to Book the ticket, '0' to Exit : ");
            
            try {
                choice = scan.nextInt();
            }
            catch (InputMismatchException exc) {
                try {
                    throw new InvalidChoice();
                }
                catch (InvalidChoice exc1) {
                    System.out.println(Colours.RED + exc1 + Colours.RESET);
                }
            }

            System.out.println();

            if ((choice != 0) && (choice != 1)) {
                try {
                    throw new InvalidChoice();
                } catch (Exception e) {
                    System.out.println(e);
                }
                continue;
            }
            break;
        } while (true);

        if (choice == 1) {

                System.out.println(Colours.CYAN + "ENTER PASSENGER DETAILS : " + Colours.RESET);

                String name;
                int age;
                long mobNum;
                String email;
                String gender;
                int passNum;

                scan.nextLine();
                System.out.print("Name : ");
                name = scan.nextLine();

                do {
                    System.out.print("Age : ");
                    age = scan.nextInt();

                    if (age > 0 && age < 18) {
                        System.out.println("\nYou're not eligible for booking a Flight.\n");
                        return;
                    }
                    else if (age < 0 || age > 120) {
                        System.out.println("\nPlease Enter a valid Age!\n");
                        continue;
                    }
                    break;
                } while (true);

                do {
                    System.out.print("Mobile Number : ");
                    mobNum = scan.nextLong();
                    long maxNum = (long) ((999999999.9) * 10);

                    if (mobNum < 1000000000 || mobNum > maxNum) {
                        System.out.println("\nPlease enter a valid Mobile Number.\n");
                        continue;
                    }
                    break;
                } while (true);


                scan.nextLine();
                System.out.print("Email Address : ");
                email = scan.nextLine();

                do {
                    System.out.print("Gender (Male / Female / Other) : ");
                    gender = scan.nextLine();

                    if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female") && !gender.equalsIgnoreCase("other")) {
                        System.out.println("\nPlease enter valid Gender\n");
                        continue;
                    }
                    break;
                } while (true);

                if (fType.equalsIgnoreCase("international")) {
                    do {
                        System.out.print("Passport Number (8-digit Number) : ");
                        passNum = scan.nextInt();

                        if (passNum < 10000000 || passNum > 99999999) {
                            System.out.println("\nPlease enter a valid Passport Number.\n");
                            continue;
                        }
                        break;
                    } while (true);
                }
                else {
                    passNum = 0;
                }

                Passenger passenger = new Passenger(name, age, mobNum, email, gender, passNum, flight.getFlightNumber());

                setPassenger(passenger);

            System.out.println(Colours.GREEN + "\nTICKET BOOKED SUCCESSFULLY..!!" + Colours.RESET);
        }
    }

    public static double cancellationFees (Flight f) {
        // 40% cancellation fees applied

        return ((0.4)*ticketPrice(f));
    }


    public static void cancelTicket () {
        Scanner scanner = new Scanner(System.in);

        long mobNum = 0;

            try {
                System.out.print("Enter your Mobile Number : ");
                mobNum = scanner.nextLong();
            }
            catch (InputMismatchException e) {
                try {
                    throw new InvalidChoice();
                }
                catch (InvalidChoice invalidChoice) {
                    System.out.println(Colours.RED + "\nEnter a valid Mobile Number!" + Colours.RESET);
                    return;
                }
            }

        System.out.println();

        Flight flight = null;

        for (Passenger p : getAllPassengers()) {

            if (mobNum == p.getMobileNum()) {
                for (Flight f : getAllFlights()) {
                    if (p.getFlightNum().equals(f.getFlightNumber())) {
                        flight = f;
                    }
                }
            }
        }

        if (flight == null) {
            System.out.println("\nNo passenger with this Mobile Number !\nMake sure that you entered correct information..\n");
            return;
        }

        System.out.println(Colours.YELLOW + "Cancellation Policy : 40% of the Ticket price will be charged as Cancellation Fees !" + Colours.RESET);
        System.out.println();

        System.out.printf("Your Ticket Price : Rs. %.2f\nAmount to be Refunded : Rs. %.2f\n\n", ticketPrice(flight), ticketPrice(flight)-cancellationFees(flight));

        int choice = 0;

            try {
                System.out.print("Press '1' to confirm Cancel, '0' to exit : ");
                choice = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                try {
                    throw new InvalidChoice();
                }
                catch (InvalidChoice exc) {
                    System.out.println();
                    System.out.println(Colours.RED + exc + Colours.RESET);
                    return;
                }
            }


        if (choice == 1) {

            String mobNumStr = Long.toString(mobNum);

            List<String> updatedLines = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("AeroCode_airlines/passenger_data.csv"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (!parts[2].equals(mobNumStr)) {
                        updatedLines.add(line);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter("AeroCode_airlines/passenger_data.csv"))) {
                for (String updatedLine : updatedLines) {
                    bw.write(updatedLine);
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.printf("\nTicket cancellation successful !\nAmount of Rs. %.2f will be refunded to you.\n", ticketPrice(flight)-cancellationFees(flight));
        } else if (choice == 0) {
            return;
        } else {
            try {
                throw new InvalidChoice();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args) {

        System.out.println();
        System.out.println(Colours.BLUE + "||-------------------- WELCOME TO AeroCode AIRLINES --------------------||\n" + Colours.RESET);

        boolean flag = false;

        do {
            Scanner scanner = new Scanner(System.in);

            if (flag) {
                for (int i = 0; i < 50; i++) {
                    System.out.print("_");
                }

                System.out.println();
            }
            flag = true;

            System.out.println();

            System.out.println(Colours.CYAN + "1." + Colours.RESET + " View all Flights");
            System.out.println(Colours.CYAN + "2." + Colours.RESET + " Search Flights");
            System.out.println(Colours.CYAN + "3." + Colours.RESET + " Book a Flight");
            System.out.println(Colours.CYAN + "4." + Colours.RESET + " View ticket status");
            System.out.println(Colours.CYAN + "5." + Colours.RESET + " Cancel a ticket");
            System.out.println(Colours.CYAN + "6." + Colours.RESET + " View Aircraft details");
            System.out.println(Colours.CYAN + "7." + Colours.RESET + " Exit Menu");
            System.out.println();

            System.out.print(Colours.GREEN + ">> ENTER YOUR CHOICE : " + Colours.RESET);

            int choice = 0;

            try {
                choice = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                try {
                    throw new InvalidChoice();
                }
                catch (InvalidChoice exc) {
                    System.out.println();
                    System.err.println(exc);
                    continue;
                }
            }

            for (int i = 0; i < 50; i++) {
                System.out.print("_");
            }

            System.out.println();

            System.out.println();

            switch (choice) {
                case 1 : {
                    ArrayList<Flight> allFlights = getAllFlights();

                    int i = 1;

                    for (Flight f : allFlights) {
                        System.out.println(i + "]");
                        System.out.println(f);
                        System.out.println();
                        i++;
                    }
                    break;
                }
                case 2 : {
                    searchFlights();
                    break;
                }
                case 3 : {
                    bookTicket();
                    break;
                }
                case 4 : {
                    viewTicket();
                    break;
                }
                case 5 : {
                    cancelTicket();
                    break;
                }
                case 6 : {
                    viewAircraftDetails();
                    break;
                }
                case 7 : {
                    System.out.println(Colours.BLUE + "\n||-------------------- THANK YOU FOR VISITING ! -------------------||\n" + Colours.RESET);
                    return;
                }
                default : {
                    try {
                        throw new InvalidChoice();
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                }
            }
        } while (true);
    }
}
