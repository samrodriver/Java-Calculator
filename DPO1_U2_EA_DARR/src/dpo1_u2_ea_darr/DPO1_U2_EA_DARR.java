
package dpo1_u2_ea_darr;
import javax.swing.JOptionPane; //Nos permite importar datos por medio de un cuadro de texto
import java.util.Scanner; //Nos permite ingresar datos por medio de la consola.

public class DPO1_U2_EA_DARR {

    public static void main(String[] args) {
        
        boolean exit = false;
        
        while(!exit){
            
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecciona el cálculo que desees hacer:\n"
                    +"1.Calcular el área de un rectángulo\n2.Calcular el área de un triángulo\n"
                    + "3.Calcular el promedio\n4.Encontrar mayor, menor o igual de dos números\n"
                    +"5.Salir"));
            
            switch(opcion){
                
                case 1: System.out.println("El área del rectángulo es: "+rectangulo()+ "u\u00B2");
                break;
                
                case 2: 
                    
                    int b = Integer.parseInt(JOptionPane.showInputDialog("Digita la medida de la base"));
                    int h = Integer.parseInt(JOptionPane.showInputDialog("Digita la medida de la altura"));
                    
                    System.out.println("El área del triángulo es: "+triangulo(b,h)+"u\u00B2");
                
                break;
                
                case 3: 
                   
                    System.out.println("El promedio de las calificaciones es: "+ promedio());
                
                break;
                
                case 4: 
                    
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer número"));
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo número"));
                    
                    mayorMenorIgual(num1, num2);
                    
                case 5: exit = true;
                
                break;
                
                default: JOptionPane.showMessageDialog(null,"Selecciona una opción válida");
                
                break;
            }
                                                                   
        }
        
    }


public static int rectangulo(){
    int base = Integer.parseInt(JOptionPane.showInputDialog("Digita la medida de la base"));
    int altura = Integer.parseInt(JOptionPane.showInputDialog("\"Digita la medida de la base\""));
    
    return base*altura;
} 

public static float triangulo(int b, int h){
    
    return (float) (b*h)/2;
}

public static double promedio(){
    
    double sumaCalificaciones = 0.0;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Ingrese el número de calificaciones");
    int nalumnos = entrada.nextInt();
    
    double[] calificaciones = new double[nalumnos];
    
    //llenar el array
    for(int i=0; i < nalumnos; i++){
        
        System.out.println("Ingrese la calificación del alumno "+ (i+1));
        calificaciones[i] = entrada.nextDouble();
        
    }
    //suma de calificaciones
    for(int j=0; j < calificaciones.length; j++){
        sumaCalificaciones += calificaciones[j];
    }
    
    return sumaCalificaciones/nalumnos;
    
}

public static void mayorMenorIgual(int num1, int num2){
    
    if(num1>num2){
        System.out.println(num1+" es mayor a "+num2);
       
    }else if(num1<num2){
        
        System.out.println(num1+" es menor a "+num2);
    
    }else{
        
         System.out.println(num1+" es igual a "+num2);
    }
}
    
}
