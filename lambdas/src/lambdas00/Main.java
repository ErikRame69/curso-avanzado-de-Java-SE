package lambdas00;

public class Main {

    public static void main(String[] args) {
        OnOneListener oneListener = new OnOneListener() {
            @Override
            public void onOne(String message) {
                System.out.println("TOne" + message);
            }
        };

        OnOneListener oneListener2 = (String message) -> {
            System.out.println("Two Lambda :)" + message);
        };


        oneListener.onOne(" Sin Lambda :(");
        oneListener2.onOne("Con Lambda :)");
    }
}
