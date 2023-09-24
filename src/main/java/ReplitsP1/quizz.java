package ReplitsP1;

public class quizz {

        public static void main (String[]args){

            double[] weekTemps = { 75.2, 78.5, 72.8, 80.1, 82.6, 76.9, 74.3 };

            double highestTemp = weekTemps[0];
            double lowestTemp = weekTemps[0];

            for (int i = 1; i < weekTemps.length; i++) {
                if (weekTemps[i] > highestTemp) {
                    highestTemp = weekTemps[i];
                }

                if (weekTemps[i] < lowestTemp) {
                    lowestTemp = weekTemps[i];
                }
            }


            System.out.println("Highest temperature for the week: " + highestTemp + " degrees");
            System.out.println("Lowest temperature for the week: " + lowestTemp + " degrees");
        }
}


