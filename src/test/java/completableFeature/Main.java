package completableFeature;


import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ServiceTest newService = new ServiceTest();
        newService.createEvent();
    }




}
