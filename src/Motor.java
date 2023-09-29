public class Motor {

    double cilindraje=0;
    String Combustible="";
    double caballoDeFuerza(){
        double cf=0;
        if (Combustible.equals("Diesel")){
            cf=10.5;
        }else{
            cf=5.2;
        }
        return cf;
    }
}
