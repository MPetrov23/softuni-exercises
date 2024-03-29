package JavaAdvanced.OOP.WorkingWithAbstraction.Ex._4_TrafficLights;

public class TrafficLight {
    private Color color;

    public TrafficLight(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void switchColor(){
        if(this.color == Color.RED){
            this.color = Color.GREEN;
        } else if (this.color == Color.GREEN) {
            this.color = Color.YELLOW;
        } else if (this.color == Color.YELLOW) {
            this.color = Color.RED;
        }
        }

    }
