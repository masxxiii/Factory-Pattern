package com.types;

public class BinString extends SymString {


    public BinString(String input) {
        super(input);
    }

    //The following method subtracts binary string t2 from t1
    public String operator(Data input)
    {
        long a,b,diff;
        a = Integer.parseInt(this.getData(),2);
        b = Integer.parseInt(input.getData(),2);

        diff = a+(~b +1);
        this.setData(Long.toBinaryString(diff));

        return Long.toBinaryString(diff);
    }
}
