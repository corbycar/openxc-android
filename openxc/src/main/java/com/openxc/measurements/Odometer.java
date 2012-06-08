package com.openxc.measurements;

import com.openxc.units.Kilometer;
import com.openxc.util.Range;

/**
 * The Odometer is a persistent odometer recording.
 */
public class Odometer extends BaseMeasurement<Kilometer> {
    private final static Range<Kilometer> RANGE =
        new Range<Kilometer>(new Kilometer(0), new Kilometer(100));
    private final static String ID = "odometer";

    public Odometer(Double value) {
        super(new Kilometer(value), RANGE);
    }

    public Odometer(Kilometer value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
