package mockito;

//import static org.mockito.Mockito.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//public class MyServiceTest {
//
//    @Test
//    public void testExternalApi() {
//
//        // Step 1: Create a mock object
//        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
//
//        // Step 2: Stub the method
//        when(mockApi.getData()).thenReturn("Mock Data");
//
//        // Step 3: Pass the mock object to the service
//        MyService service = new MyService(mockApi);
//
//        // Step 4: Call the method under test
//        String result = service.fetchData();
//
//        // Step 5: Verify the result
//        assertEquals("Mock Data", result);
//    }
//}


//exercise-2

 

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // Step 1: Create Mock Object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Inject Mock into Service
        MyService service = new MyService(mockApi);

        // Step 3: Call Service Method
        service.fetchData();

        // Step 4: Verify Interaction
        verify(mockApi).getData();
    }
}