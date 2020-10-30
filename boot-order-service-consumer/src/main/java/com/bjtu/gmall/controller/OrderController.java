package com.bjtu.gmall.controller;

import com.bjtu.gmall.bean.UserAddress;
import com.bjtu.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/initOrder")
    @ResponseBody
    public List<UserAddress> initOrder(@RequestParam String userId) {
        return orderService.initOrder(userId);
    }
}
