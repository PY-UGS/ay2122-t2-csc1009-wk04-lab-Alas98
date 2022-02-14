import java.util.Scanner;

public class BMI {
    private double weight;
    private double height;
    private double bmi;

    public double findBMI(){
        weight = weight * 0.45359237;
        height = height * 0.0254;
        bmi = weight / (height * height);
        return bmi;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String BMIInterpretation(){
        if(bmi<18.5){
            return "Underweight";
        }
        else if(bmi<25){
            return "Normal";
        }
        else if(bmi<30){
            return "Overweight";
        }
        else return "Obese";
    }

    public static void main(String[] args) {
        BMI x = new BMI();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
         x.weight = (input.nextDouble());
        System.out.println("Enter your height in inches: ");
        x.height = (input.nextDouble());
        input.close();

        System.out.printf("BMI is %.15f \n",x.findBMI());
        System.out.println(x.BMIInterpretation());
    }
}
