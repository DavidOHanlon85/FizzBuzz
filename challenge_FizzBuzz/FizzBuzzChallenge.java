/**
 * 
 */
package challenge_FizzBuzz;

/**
 * 
 */
public class FizzBuzzChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare and initialise variables

		int gameMax = 100;

		buzzFizzStarter(gameMax);

	}

	/**
	 * This method starts and completes the BuzzFizz game
	 * 
	 * @param gameMax - maxNumber to be completed to needed as a parameter
	 */
	public static void buzzFizzStarter(int gameMax) {
		for (int i = 1; i <= gameMax; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Buzz Fizz");
			} else if (i % 3 == 0) {
				System.out.println("Buzz");
			} else if (i % 5 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}

}
