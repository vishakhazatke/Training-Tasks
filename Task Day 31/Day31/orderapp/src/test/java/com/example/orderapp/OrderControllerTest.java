package com.example.orderapp;

import com.example.orderapp.controller.OrderController;
import com.example.orderapp.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(OrderController.class)
class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OrderService orderService;

    @Test
    void shouldReturnTotal() throws Exception {
        when(orderService.calculateTotal(100, 2)).thenReturn(200.0);

        mockMvc.perform(get("/orders/total")
                        .param("price", "100")
                        .param("quantity", "2"))
                .andExpect(status().isOk())
                .andExpect(content().string("200.0"));
    }
}
