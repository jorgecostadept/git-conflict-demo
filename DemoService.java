public class DemoService {

    public String getName() {
        System.out.println("Getting name");
        return "BaseName";
    }

    public int calculateScore(int a, int b) {
        int result = a + b;
        System.out.println("Score: " + result);
        return result;
    }

    public boolean isActive() {
        return true;
    }

    public void reset() {
        System.out.println("Reset done");
    }
}
