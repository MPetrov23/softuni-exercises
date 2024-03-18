package JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._5_Telephony;

import java.util.List;

public class Smartphone implements Callable,Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {StringBuilder browsed = new StringBuilder();
        for(String url : this.urls){
            if(url.matches(".*[0-9].*")){
                browsed.append("Invalid URL!").append(System.lineSeparator());
            }else{
                browsed.append("Browsing... ").append(url).append(System.lineSeparator());
            }
        }
        return browsed.toString();

    }

    @Override
    public String call() {
        StringBuilder called = new StringBuilder();
        for(String number : this.numbers){
            if(number.matches(".*[0-9].*")){
                called.append("Calling... ").append(number).append(System.lineSeparator());
            }else{
                called.append("Invalid number!").append(System.lineSeparator());
            }
        }
        return called.toString();
    }

    @Override
    public String toString() {
        return call()+browse();
    }
}
