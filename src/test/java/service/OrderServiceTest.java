package service;



import static org.mockito.Mockito.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

import com.orderEntity.Order;
import com.orderEntity.OrderRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.orderEntity.OrderService;

import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
    @InjectMocks
    private OrderService orderService;

    @Mock
    private OrderRepository orderRepository;

    @Test
    public void testGetOrderById() {
        Order mockOrder = new Order();
        mockOrder.setOrderId(1L);
        when(orderRepository.findById(1L)).thenReturn(Optional.of(mockOrder));

        Order result = orderService.getOrderByIdOrder(1L);
        assertEquals(1L, result.getOrderId());
    }
}
