import java.util.Scanner;
public class App {
    static String [] arrayColores ={"Blanco", "Amarillo",
        "Naranja", "Rosa", "Rojo", "Verde", "Azul", "Negro"};
        static String [] arrayCodigo = new String [5];
        static String [] arrayJugada = new String [5];
        static String [] arrayRespuesta = new String [5];
        static Scanner sc = new Scanner(System.in);
        static boolean ganado=false;
        static int contador = 0;
    public static void main(String[] args) throws Exception {
        generarcodigo();
        for (int a=0;a<12;a++){
            generarjugada();
            generarrespuesta();
            if (a<12){
                System.out.println("Demasiados intentos, has perdido");
            }
            }
            
        
          
        }
    
    
    private static void generarrespuesta() {
       
        
            for (int i = 0; i < arrayCodigo.length; i++) {
            String X=arrayCodigo[i];
            if(arrayJugada[i]==X){
                arrayRespuesta[i]=" * ";
            }else{
                arrayRespuesta[i]=" - ";
            }
            }
            System.out.println("------------------------------------");
        for (int i=0;i<arrayRespuesta.length;i++){
            System.out.println(arrayRespuesta[i]);
            }
            if(arrayRespuesta[0]==" * "&&arrayRespuesta[1]==" * "&&arrayRespuesta[2]==" * "&&arrayRespuesta[3]==" * "&&arrayRespuesta[4]==" * "){
                System.out.println("------------------------------------");
                System.out.println("Codigo correcto, has ganado");
                System. exit(0);
            }else{
                System.out.println("------------------------------------");
                System.out.println("Codigo incorrecto, intente de nuevo (*=acertado -=Fallado)");
            }
    }


    private static void generarjugada() {
        System.out.println("Dame el codigo de colores (0-Blanco, 1-Amarillo, 2-Naranja, 3-Rosa, 4-Rojo, 5-Verde, 6-Azul y 7-Negro)");
        for(int i = 0; i < arrayJugada.length; i++){
            int p = sc.nextInt();
            arrayJugada[i]=arrayColores[p];
        }
    }


    private static void generarcodigo() {
        for(int i = 0; i < arrayCodigo.length; i++){
            int n = (int) (Math.random() * 7 + 0);
            arrayCodigo[i]=arrayColores[n];
    }
}}
