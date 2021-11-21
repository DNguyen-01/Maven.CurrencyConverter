package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {


    //default (keyword) allows us to apply this method to all of the implementing clasess
    default Double convert(CurrencyType currencyType) {
        //current currency type, access get rate method / (currency rate) access .getCurrency method
        // to return the rate
        return currencyType.getRate() / this.getCurrencyType().getRate();
    }
    //method stub to be applied to all the currency classes; see @Override
    CurrencyType getCurrencyType();


}
