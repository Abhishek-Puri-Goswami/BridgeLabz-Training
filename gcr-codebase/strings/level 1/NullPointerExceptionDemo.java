public class NullPointerExceptionDemo {
    //Method to generate NullPointerException without try-catch
    public static void gererateException() {
        String text = null;
        int size = text.length();
    } 
    
    //Method to handle NullPointerException with try-catch
    public static void handleException() {
        String text = null;
	try {
            int size = text.length();
        } catch(NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println(e.getMessage());
        } 
    } 

    public static void main(String[] args) {
        try {
	    gererateException();
        } catch(NullPointerException e) {
            System.out.println("NullPointerException caught!");
            handleException();
        }
        System.out.println("Program still running...");
    }
}