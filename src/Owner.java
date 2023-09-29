public class Owner {
    double height;
    int edad=0;
    String name;
    String cedula;
    String phoneNumber;

    char genero;

    public String esMyorEdad(){
        String my="";
        if (edad>=18){
            my= "es myor de edad";
            System.out.println(my);
        }else{
            my= "es mnor de edad";
            System.out.println(my);
        }
        return my;
    }
}
