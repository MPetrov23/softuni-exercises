package JavaAdvanced.OOP.WorkingWithAbstraction.Lab._4_HotelReservation;

import java.util.Arrays;

public class Holiday {
    double pricePerDay;
    int days;
    Season season;
    Discount discount;

    public Holiday(double pricePerDay, int days, Season season, Discount discount) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discount = discount;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public int getDays() {
        return days;
    }

    public Season getSeason() {
        return season;
    }

    public Discount getDiscount() {
        return discount;
    }

    public static void parseData(String input){
        String[] data = input.split("\\s+");

        Holiday holiday = new Holiday(
                Double.parseDouble(data[0]),
                Integer.parseInt(data[1]),
                getSeason(data[2]),
                getDiscount(data[3])
        );

        calculatePrice(holiday);
    }

    public static Season getSeason(String input){
        if("Autumn".equals(input)){
            return Season.Autumn;
        }else if ("Spring".equals(input)){
            return Season.Spring;
        }else if("Winter".equals(input)){
            return Season.Winter;
        }else {
            return Season.Summer;
        }

        }

        public static Discount getDiscount(String input){
            if("VIP".equals(input)){
                return Discount.VIP;
            }else if ("SecondVisit".equals(input)){
                return Discount.SecondVisit;
            }else {
                return Discount.None;
            }
        }

        public static void calculatePrice(Holiday holiday){


        double price = 0;
        price = holiday.getPricePerDay();
        price*=seasonValue(holiday);
        price*=holiday.getDays();
        price-=price*discountValue(holiday)/100;

        printPrice(price);
        }

        public static int seasonValue(Holiday holiday){
            if(holiday.getSeason().equals(Season.Autumn)){
                return 1;
            }else if(holiday.getSeason().equals(Season.Spring)){
                return 2;
            }else if(holiday.getSeason().equals(Season.Winter)){
                return 3;
            }else if(holiday.getSeason().equals(Season.Summer)){
                return 4;
            }
            else{
                return 0;
            }
        }
    public static int discountValue(Holiday holiday){

        if(holiday.getDiscount().equals(Discount.VIP)){
            return 20;
        }else if(holiday.getDiscount().equals(Discount.SecondVisit)){
            return 10;
        }
            return 0;
    }

    public static void printPrice(double price){
        System.out.printf("%.2f", price);
    }

    }


