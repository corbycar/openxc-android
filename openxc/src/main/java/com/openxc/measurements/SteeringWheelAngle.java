package com.openxc.measurements;

import com.openxc.units.Degree;
import com.openxc.util.Range;

/**
 * The SteeringWheelAngle is the angle of the steering wheel.
 *
 * The wheel is considered centered with the angle is 0. The wheel is turned to
 * the left when the angle is negative, and to the right when it is positive.
 */
public class SteeringWheelAngle extends Measurement<Degree>
        implements VehicleMeasurement {
    private final static Range<Degree> RANGE =
        new Range<Degree>(new Degree(-400), new Degree(400));
    public final static String ID = "steering_wheel_angle";

    public SteeringWheelAngle() { }

    public SteeringWheelAngle(Double value) {
        super(new Degree(value), RANGE);
    }

    public SteeringWheelAngle(Degree value) {
        super(value, RANGE);
    }
}