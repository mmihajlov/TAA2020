package com.endava.myshopify;

import com.endava.myshopify.pageObjects.RentBikePage;
import org.junit.jupiter.api.Test;

public class RentBikeTest extends TestBaseClass{

    @Test
    public void shouldSelectDates(){

        //given
        RentBikePage rentBikePage = new RentBikePage(driver);
        rentBikePage.load();

        //when
        rentBikePage.setStartDate("2020-07-21");
        rentBikePage.setEndDate("2020-07-28");
        rentBikePage.bookNow();

        //then

    }

}
