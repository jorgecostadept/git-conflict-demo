public class DemoService {

    public String getName() {
        return "Feature1";
    }

    public boolean isActive() {
        return false; // logic flipped
    }

    //Duplicate code with random names

    public String getName1() {
        System.out.println("Getting name1");
        return "Feature2";
    }

    public int calculateScore1(int a, int b) {
        int result = a + b;
        System.out.println("Score1: " + result);
        return result;
    }

    //end of duplicate code

    public void logAccess() {
        System.out.println("Accessed");
    }

    public int calculateScore(int a, int b) {
       int result = a + b;
       return result;
    }
}