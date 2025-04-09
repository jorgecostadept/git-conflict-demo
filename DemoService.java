public class DemoService {

    public String getName() {
        System.out.println("Getting name");
        return "Feature1";
    }

    public int calculateScore(int a, int b) {
        int result = a + b;
        System.out.println("Score: " + result);
        return result;
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
    
    public boolean isActive() {
        return true;
    }

    public void reset() {
        System.out.println("Reset done");
    }
}
