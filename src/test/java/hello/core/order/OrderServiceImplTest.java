package hello.core.order;

import org.junit.Test;

public class OrderServiceImplTest {

    @Test
    void createOrder(){
        OrderServiceImpl orderService = new OrderServiceImpl();
        orderService.createOrder(1L, "itemA", 10000);
    }

}