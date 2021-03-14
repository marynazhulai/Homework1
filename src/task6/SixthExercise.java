package task6;

public class SixthExercise {
    public static void main(String[] args) {

        final int FIN_I =  135;
        final double FIN_D = 1.68;
        final char FIN_C = 'C';
        System.out.println(FIN_I);
        /*FIN_I = 200;*/

	//Error:(10, 9) java: cannot assign a value to final variable FIN_I
	//A constant is a variable whose value cannot be changed once it has been assigned. So if we try to reassign a value for constant, we get error.
  }
}