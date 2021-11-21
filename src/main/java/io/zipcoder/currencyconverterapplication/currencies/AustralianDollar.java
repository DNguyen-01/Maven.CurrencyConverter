package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {




    //is a method that is implemented thru the interface
    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.AUSTRALIAN_DOLLAR;
    }
}
