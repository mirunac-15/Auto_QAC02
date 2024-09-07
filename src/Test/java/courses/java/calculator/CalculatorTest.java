package courses.java.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;
     @Before
     public void setUp() {
         calculator = new Calculator();
         System.out.println( ("Set up before each run"));
     }

    @BeforeClass
    public static void setUpClass () {
        System.out.println("Set up before class");
    }


    @Test
    public void verifyAdditionComputeTest (){
        System.out.println("Verify Addition works accordingly");
        Assert.assertEquals(5, calculator.compute(2,3,"+"), 3);
        Assert.assertEquals(-1, calculator.compute(-4,3,"+"), 3);
        Assert.assertEquals(-7, calculator.compute(-4,-3,"+"), 3);
    }
    //daca dorim sa verificam mesajul
    @Test()
    public void verifyUnsupportedOperator(){
         System.out.println("Verify unsupported operator" );
         try{
             calculator.compute(2,-3,"op1");
             Assert.fail();
         } catch (IllegalArgumentException e){
             System.out.println( "Test return expected IllealArgumentException: " + e.getMessage());
             Assert.assertEquals("Unsuported Operator : op ", e.getMessage());
         }


    }
    //daca vrem sa validam doar ca gaseste  o exceptie- pe Test il parametrizam
    @Test(expected = IllegalArgumentException.class)
    public void verifyUnsupportedOperator2(){
         System.out.println("Verify unsupported operator" );
         calculator.compute(1,4,"op2");
    }

    @After
    public void cleanUp (){
         System.out.println( ("Clean up after each test run"));
    }
    @AfterClass
    public static void cleanAfterClass () {
         System.out.println( ("Clean up after class run"));
    }

}