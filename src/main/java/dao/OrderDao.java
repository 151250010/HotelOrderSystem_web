package dao;

import entity.order.Order;
import enums.OrderStateEnum;
import org.apache.ibatis.annotations.Param;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by xihao on 17-3-28.
 */
@Repository
public interface OrderDao {

    void addOrder(Order order);

    void updateOrder(Order order);

    Order getOrder(String orderId);

    List<Order> getClientOrders(@Param("clientId") long clientId,@Param("offset") int offset, @Param("limit") int limit);

    List<Order> getClientOrdersInHotel(@Param("clientId") long clientId, @Param("hotelId") long hotelId);

    List<Order> getHotelOrders(@Param("hotelId") long hotelId, @Param("offset") int offset, @Param("limit") int limit);

    List<Order> getTodayOrder(@Param("hotelId") long hotelId, @Param("today") String today);

    List<Order> getAllOrdersToday(@Param("today") String today,@Param("offset")int offset,@Param("limit")int limit);

    List<Order> getOrderByDate(@Param("concreteDate") String concreteDate);

    List<Order> getOrderByClientId(@Param("clientId") long clientId);

    List<Order> getOrderTodayByState(@Param("today")String today, @Param("state")OrderStateEnum stateEnum);
}

