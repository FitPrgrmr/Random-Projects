import java.util.Scanner;
/*
 * The NOT --> (!) <-- operator is a logical operator. 
 * It's a UNARY operator that takes a boolean value as its operand.
 *  The NOT operator works by INVERTING (or negating) the VALUE of its OPERAND.
 */
public class Unary_Operator_Logical_NOT_Operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int boilingPoint = 100;
		
		System.out.print("Set Temperature: " );
		int setTemp = sc.nextInt();
		
		if(!(setTemp > boilingPoint)) {//the boolean condition has to go within a parenthesis so that the NOT operator
			//can treat it as an OPERAND (the thing that the operator acts up on)
			System.out.println("You set the temperature lower than "+boilingPoint+" degrees Celsius");
			System.out.println(setTemp);
		}else if(setTemp > boilingPoint) {
			System.out.println("You set the temperature above boiling point ");
		}

	}

}
