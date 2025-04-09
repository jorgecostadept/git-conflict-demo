public class DemoService {

    public String getName() {
        return "Feature1";
    }

    public int calculateScore(int a, int b) {
        return a - b; // changed logic
    }

    public boolean isActive() {
        return false; // logic flipped
    }

    public void logAccess() {
        System.out.println("Accessed");
    }
}
