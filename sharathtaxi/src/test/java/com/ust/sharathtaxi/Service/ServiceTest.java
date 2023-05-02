package com.ust.sharathtaxi.Service;

import com.ust.sharathtaxi.Entity.Car;
import com.ust.sharathtaxi.Repository.CarRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {
    @Mock
    private CarRepo mockRepo;
    @InjectMocks
    private CarServiceimpl carServiceimplunderTest;

    @Test

    void testGetall() {
        final List<Car> expectedResult = List.of(new Car(0,"cid","cname",1000,"brand","colour",4,"status"));
        final List<Car> car = List.of(new Car(0, "cid","cname",1000,"brand","colour",4,"status"));
        when(mockRepo.findAll()).thenReturn(car);
        final List<Car> result=carServiceimplunderTest.getall();
        assertThat(result).isEqualTo(expectedResult);

    }



}
