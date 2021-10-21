package completableFeature;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;

public class ServiceTest {

    public void createEvent() throws ExecutionException, InterruptedException {
        CompletableFuture<AccountInfo> accountInfoFuture = CompletableFuture.supplyAsync(()->{
            AccountInfo response = null;
            response = mockAccountInfoResponse();
            return response;
        });

        CompletableFuture<Network> networkInfoFuture = CompletableFuture.supplyAsync(()->{
            Network response = null;
            response = mockNetworkResponse();
            return response;
        });

        AccountInfo accountResponse = accountInfoFuture.get();
        Network networkResponse = networkInfoFuture.get();
        System.out.println(accountResponse.toString());
        System.out.println(networkResponse.toString());
        assertEquals("john", accountResponse.getFirstName());
    }

    public AccountInfo mockAccountInfoResponse(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AccountInfo accountInfoResponse = new AccountInfo();
        accountInfoResponse.setFirstName("john");
        accountInfoResponse.setLastName("smith");
        accountInfoResponse.setAccountNumber(Integer.MAX_VALUE);
        return accountInfoResponse;
    }

    public Network mockNetworkResponse(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Network networkResponse = new Network("129380192345345");
        return networkResponse;
    }
}
