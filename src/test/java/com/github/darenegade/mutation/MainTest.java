package com.github.darenegade.mutation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Organization: HM FK07.
 * Project: pitestexample, PACKAGE_NAME
 * Author(s): Rene Zarwel
 * Date: 06.07.17
 * OS: MacOS 10.11
 * Java-Version: 1.8
 * System: 2,3 GHz Intel Core i7, 16 GB 1600 MHz DDR3
 */
public class MainTest {

    @Test
    public void doSomeTest(){
        Main main = new Main();

        assertThat(main.doSome(2)).isEqualTo(4);
    }

    @Test
    public void doSome2Test(){
        Main main = new Main();

        assertThat(main.doSome(5)).isEqualTo(25);
    }
}
