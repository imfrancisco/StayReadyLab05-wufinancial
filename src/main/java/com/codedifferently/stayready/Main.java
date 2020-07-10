package com.codedifferently.stayready;

public class Main {

    double currency;
    private double usDollar = 1.0;
    private double euro = 0.94;
    private double britishPound = 0.82;
    private double indianRupee = 68.32;
    private double australianDollar = 1.35;
    private double canadianDollar = 1.32;
    private double singaporeDollar = 1.43;
    private double swissFranc = 1.01;
    private double malaysianRinggit = 4.47;
    private double japaneseYen = 115.84;
    private double chineseYuanRenminbi = 6.92;
    double RoundTwo;

    public double getUsDollar(){
        return usDollar;
    }

    public double getEuro(){
        return euro;
    }

    public double getBritishPound(){
        return britishPound;
    }

    public double getIndianRupee(){
        return indianRupee;
    }

    public double getAustralianDollar(){
        return australianDollar;
    }

    public double getCanadianDollar(){
        return canadianDollar;
    }

    public double getSingaporeDollar(){
        return singaporeDollar;
    }

    public double getSwissFranc(){
        return swissFranc;
    }

    public double getMalaysianRinggit(){
        return malaysianRinggit;
    }

    public double getJapaneseYen(){
        return japaneseYen;
    }

    public double getChineseYuanRenminbi(){
        return chineseYuanRenminbi;
    }

    public double convertUsDollarToEuro(){
        double convert = (1/usDollar) * euro;
        return convert;
    }

//    public double convertEuroToDollar(){
//        double convert;
//        return convert;
//    }

    public double convertEuroToBritishPound(){
        double convert = (1/euro) * britishPound;

        return convert;
        // round
        //return Math.round(convert*100.0)/100.0;
    }

    public double convertBritishPoundToIndianRupee(){
        double convert = (1/britishPound) * indianRupee;

        return convert;
        // round
        //return Math.round(convert*100.0)/100.0;
    }

    public double convertIndianRupeeToCanadian(){
        double convert = (1/indianRupee) * canadianDollar;

        return convert;
        // round
        //return Math.round(convert*100.0)/100.0;
    }

    public double convertCanadianToSingapore(){
        double convert = (1/canadianDollar) * singaporeDollar;

        return convert;
        // round
        //return Math.round(convert*100.0)/100.0;
    }

    public double convertSingaporeDollarToSwissFranc(){
        double convert = (1/singaporeDollar) * swissFranc;

        return convert;
        // round
        //return Math.round(convert*100.0)/100.0;
    }

    public double convertSwissFrancToMalaysianRinggit(){
        double convert = (1/swissFranc) * malaysianRinggit;

        return convert;
        // round
        //return Math.round(convert*100.0)/100.0;
    }

    public double convertMalaysianRinggitToJapaneseYen(){
        double convert = (1/malaysianRinggit) * japaneseYen;

        return convert;
        // round
        //return Math.round(convert*100.0)/100.0;
    }

    public double convertJapaneseYenToChineseYuanRenminbi(){
        double convert = (1/japaneseYen) * chineseYuanRenminbi;

        return convert;
        // round
        //return Math.round(convert*100.0)/100.0;
    }



//    public double convertToUsDollar(double currency){
//        double conversion = currency * usDollar;
//        return conversion;
//    }
//
//    public double convertToEuro(double currency){
//        double conversion = currency * euro;
//        return conversion;
//    }
//
//    public double convertToBritishPound(double currency){
//        double conversion = currency * britishPound;
//        return conversion;
//    }
//
//    public double convertToIndianRupee(double currency){
//        double conversion = currency * indianRupee;
//        return conversion;
//    }
//
//    public double convertToAustralianDollar(double currency){
//        double conversion = currency * australianDollar;
//        return conversion;
//    }
//
//    public double convertToCanadianDollar(double currency){
//        double conversion = currency * canadianDollar;
//        return conversion;
//    }
//
//    public double convertToSingaporeDollar(double currency){
//        double conversion = currency * singaporeDollar;
//        return conversion;
//    }
//
//    public double convertToSwissFranc(double currency){
//        double conversion = currency * swissFranc;
//        return conversion;
//    }
//
//    public double convertToMalaysianRinggit(double currency){
//        double conversion = currency * malaysianRinggit;
//        return conversion;
//    }
//
//    public double convertToJapaneseYen(double currency){
//        double conversion = currency * japaneseYen;
//        return conversion;
//    }
//
//    public double convertToChineseYuanRenminbi(double currency){
//        double conversion = currency * chineseYuanRenminbi;
//        return conversion;
//    }

}
