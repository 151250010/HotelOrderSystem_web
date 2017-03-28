package dao;

import entity.order.Order;
import enums.OrderStateEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by xihao on 17-3-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class OrderDaoTest {

    @Autowired
    private OrderDao orderDao;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Test
    public void addOrder() throws Exception {
        Order order=  new Order();
        order.setOrderId("1");
        order.setClientId(1);
        order.setHotelId(1);
        order.setOrderCreatedDate(simpleDateFormat.parse(simpleDateFormat.format(new Date())));
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH,2);
        Date date =calendar.getTime();
        order.setPlannedLivedDate(simpleDateFormat.parse(simpleDateFormat.format(date)));
        order.setPrice(100);
        order.setRoomIds("101");
        order.setOrderStateEnum(OrderStateEnum.UNEXECUTED);
        orderDao.addOrder(order);
    }

    @Test
    public void updateOrder() throws Exception {

        Order order = orderDao.getOrder("1");
        order.setRoomIds("101/100");
        order.setEndDate(simpleDateFormat.parse(simpleDateFormat.format(new Date())));
        orderDao.updateOrder(order);
    }

    @Test
    public void getOrder() throws Exception {

        Order order = orderDao.getOrder("1");
        order.setOrderStateEnum(OrderStateEnum.ABNORMAL);
        orderDao.updateOrder(order);
    }

    @Test
    public void getClientOrders() throws Exception {
        System.out.println(orderDao.getClientOrders(1,0,1));
    }

    @Test
    public void getClientOrdersInHotel() throws Exception {
        System.out.println(orderDao.getClientOrdersInHotel(1,1));
    }

    @Test
    public void getHotelOrders() throws Exception {
        System.out.println(orderDao.getHotelOrders(1,0,1));
    }

    @Test
    public void getTodayOrder() throws Exception {
        System.out.println(orderDao.getTodayOrder(1,new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
    }

    @Test
    public void getAllOrdersToday() throws Exception {
        System.out.println(orderDao.getAllOrdersToday(new SimpleDateFormat("yyyy-MM-dd").format(new Date()),0,1));
    }

    @Test
    public void getOrderByDate() throws Exception {
        System.out.println(orderDao.getOrderByDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
    }

    @Test
    public void getOrderByClientId() throws Exception {
        System.out.println(orderDao.getOrderByClientId(1));
    }

    @Test
    public void getOrderTodayByState() throws Exception {
        System.out.println(orderDao.getOrderTodayByState(new SimpleDateFormat("yyyy-MM-dd").format(new Date()),OrderStateEnum.ABNORMAL));
    }

}