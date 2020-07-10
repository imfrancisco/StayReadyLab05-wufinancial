package com.codedifferently.stayready;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void convertUsDollarToEuro(){
        // Given
        Main aMain = new Main();
        double expected = 0.94;

        // When
        double actual = aMain.convertUsDollarToEuro();

        // Then
        Assert.assertEquals(expected, actual,0.0);
    }

//    @Test
//    public void convertEuroToUsDollar(){
//        // Given
//        Main aMain = new Main();
//        double expected = 0.87;
//
//        // When
//        double actual = aMain.convertEuroToBritishPound();
//
//        // Then
//        Assert.assertEquals(expected, actual,0.0);
//    }

    @Test
    public void convertEuroToBritishPound(){
        // Given
        Main aMain = new Main();
        double expected = 0.8723404255319148;

        // When
        double actual = aMain.convertEuroToBritishPound();

        // Then
        Assert.assertEquals(expected, actual,0.0);
    }

    @Test
    public void convertBritishPoundToIndianRupee(){
        // Given
        Main aMain = new Main();
        double expected = 83.3170731707317;

        // When
        double actual = aMain.convertBritishPoundToIndianRupee();

        // Then
        Assert.assertEquals(expected, actual,0.0);
    }

    @Test
    public void convertIndianRupeeToCanadian(){
        // Given
        Main aMain = new Main();
        double expected = 0.019320843091334895;

        // When
        double actual = aMain.convertIndianRupeeToCanadian();

        // Then
        Assert.assertEquals(expected, actual,0.0);
    }

    @Test
    public void convertCanadianToSingapore(){
        // Given
        Main aMain = new Main();
        double expected = 1.0833333333333333;

        // When
        double actual = aMain.convertCanadianToSingapore();

        // Then
        Assert.assertEquals(expected, actual,0.0);
    }

    @Test
    public void convertSingaporeDollarToSwissFranc(){
        // Given
        Main aMain = new Main();
        double expected = 0.7062937062937064;

        // When
        double actual = aMain.convertSingaporeDollarToSwissFranc();

        // Then
        Assert.assertEquals(expected, actual,0.0);
    }

    @Test
    public void convertSwissFrancToMalaysianRinggit(){
        // Given
        Main aMain = new Main();
        double expected = 4.425742574257425;

        // When
        double actual = aMain.convertSwissFrancToMalaysianRinggit();

        // Then
        Assert.assertEquals(expected, actual,0.0);
    }

    @Test
    public void convertMalaysianRinggitToJapaneseYen(){
        // Given
        Main aMain = new Main();
        double expected = 25.914988814317677;

        // When
        double actual = aMain.convertMalaysianRinggitToJapaneseYen();

        // Then
        Assert.assertEquals(expected, actual,0.0);
    }

    @Test
    public void convertJapaneseYenToChineseYuanRenminbi(){
        // Given
        Main aMain = new Main();
        double expected = 0.05973756906077348;

        // When
        double actual = aMain.convertJapaneseYenToChineseYuanRenminbi();

        // Then
        Assert.assertEquals(expected, actual,0.0);
    }





//    @Test
//    public void convertToUsDollarTest(){
//        // Given
//        Main aMain = new Main();
//        double expected = 2.0;
//
//        // When
//        double actual = aMain.convertToUsDollar(2.0);
//
//        // Then
//        Assert.assertEquals(expected, actual, 0.0);
//    }
//
//    @Test
//    public void convertToEuro(){
//        // Given
//        Main aMain = new Main();
//        double expected = 1.88;
//
//        // When
//        double actual = aMain.convertToEuro(2.0);
//
//        // Then
//        Assert.assertEquals(expected, actual, 0.0);
//    }
//
//    @Test
//    public void convertToBritishPound(){
//        // Given
//        Main aMain = new Main();
//        double expected = 1.64;
//
//        // When
//        double actual = aMain.convertToBritishPound(2.0);
//
//        // Then
//        Assert.assertEquals(expected, actual, 0.0);
//    }
//
//    @Test
//    public void convertToIndianRupee(){
//        // Given
//        Main aMain = new Main();
//        double expected = 136.64;
//
//        // When
//        double actual = aMain.convertToIndianRupee(2.0);
//
//        // Then
//        Assert.assertEquals(expected, actual, 0.0);
//    }
//
//    @Test
//    public void convertToAustralianDollar(){
//        // Given
//        Main aMain = new Main();
//        double expected = 2.70;
//
//        // When
//        double actual = aMain.convertToAustralianDollar(2.0);
//
//        // Then
//        Assert.assertEquals(expected, actual, 0.0);
//    }
//
//    @Test
//    public void convertToCanadianDollar(){
//        // Given
//        Main aMain = new Main();
//        double expected = 2.64;
//
//        // When
//        double actual = aMain.convertToCanadianDollar(2.0);
//
//        // Then
//        Assert.assertEquals(expected, actual, 0.0);
//    }
//
//    @Test
//    public void convertToSingaporeDollar(){
//        // Given
//        Main aMain = new Main();
//        double expected = 2.86;
//
//        // When
//        double actual = aMain.convertToSingaporeDollar(2.0);
//
//        // Then
//        Assert.assertEquals(expected, actual, 0.0);
//    }
//
//    @Test
//    public void convertToSwissFranc(){
//        // Given
//        Main aMain = new Main();
//        double expected = 2.02;
//
//        // When
//        double actual = aMain.convertToSwissFranc(2.0);
//
//        // Then
//        Assert.assertEquals(expected, actual, 0.0);
//    }
//
//    @Test
//    public void convertToMalaysianRinggit(){
//        // Given
//        Main aMain = new Main();
//        double expected = 8.94;
//
//        // When
//        double actual = aMain.convertToMalaysianRinggit(2.0);
//
//        // Then
//        Assert.assertEquals(expected, actual, 0.0);
//    }
//
//    @Test
//    public void convertToJapaneseYen(){
//        // Given
//        Main aMain = new Main();
//        double expected = 231.68;
//
//        // When
//        double actual = aMain.convertToJapaneseYen(2.0);
//
//        // Then
//        Assert.assertEquals(expected, actual, 0.0);
//    }
//
//    @Test
//    public void convertToChineseYuanRenminbi(){
//        // Given
//        Main aMain = new Main();
//        double expected = 13.84;
//
//        // When
//        double actual = aMain.convertToChineseYuanRenminbi(2.0);
//
//        // Then
//        Assert.assertEquals(expected, actual, 0.0);
//    }


}
