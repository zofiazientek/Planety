package test;

import main.Planety;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlanetyTest {

    Planety temp;
    double delta1;
    double delta2;

    @Before
    public void setUp(){
        temp = new Planety();
        delta1 = 0.000000000000001;
        delta2 = 0.00001;
    }

    @Test
    public void test_ziemia_delta2_method(){
        assertEquals(1.000000063,temp.print("31557602","Ziemia"),delta2);
    }

    @Test
    public void test_merkury_delta2_method(){
        assertEquals(4.152018953,temp.print("31557602","Merkury"),delta2);
    }

    @Test
    public void test_wenus_delta2_method(){
        assertEquals(1.625494988,temp.print("31557602","Wenus"),delta2);
    }

    @Test
    public void test_mars_delta2_method(){
        assertEquals(0.531684210,temp.print("31557602","Mars"),delta2);
    }

    @Test
    public void test_jowisz_delta2_method(){
        assertEquals(0.084298450,temp.print("31557602","Jowisz"),delta2);
    }

    @Test
    public void test_saturn_delta2_method(){
        assertEquals(0.033958744,temp.print("31557602","Saturn"),delta2);
    }

    @Test
    public void test_uran_delta2_method(){
        assertEquals(0.011902375,temp.print("31557602","Uran"),delta2);
    }

    @Test
    public void test_neptun_delta2_method(){
        assertEquals(0.006068281,temp.print("31557602","Neptun"),delta2);
    }

    @After
    public void teardown(){
        temp = null;
    }

}
