package domain.company.app.util;

public class GenerateRandomInt {
        public int generate(int min, int max ) {
            // Generate random int value from min to max
            return (int)Math.floor(Math.random() * (max - min + 1) + min);
        }

}
