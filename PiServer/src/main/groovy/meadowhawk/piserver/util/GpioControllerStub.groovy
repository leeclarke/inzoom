package meadowhawk.piserver.util

import com.pi4j.io.gpio.GpioController
import com.pi4j.io.gpio.GpioPin
import com.pi4j.io.gpio.GpioPinAnalog
import com.pi4j.io.gpio.GpioPinAnalogInput
import com.pi4j.io.gpio.GpioPinAnalogOutput
import com.pi4j.io.gpio.GpioPinDigital
import com.pi4j.io.gpio.GpioPinDigitalInput
import com.pi4j.io.gpio.GpioPinDigitalMultipurpose
import com.pi4j.io.gpio.GpioPinDigitalOutput
import com.pi4j.io.gpio.GpioPinInput
import com.pi4j.io.gpio.GpioPinPwmOutput
import com.pi4j.io.gpio.GpioPinShutdown
import com.pi4j.io.gpio.GpioProvider
import com.pi4j.io.gpio.Pin
import com.pi4j.io.gpio.PinMode
import com.pi4j.io.gpio.PinPullResistance
import com.pi4j.io.gpio.PinState
import com.pi4j.io.gpio.event.GpioPinListener
import com.pi4j.io.gpio.trigger.GpioTrigger

class GpioControllerStub implements GpioController {

    @Override
    void export(PinMode mode, PinState defaultState, GpioPin... pin) {

    }

    @Override
    void export(PinMode mode, GpioPin... pin) {

    }

    @Override
    boolean isExported(GpioPin... pin) {
        return false
    }

    @Override
    void unexport(Pin... pin) {

    }

    @Override
    void unexport(GpioPin... pin) {

    }

    @Override
    void unexportAll() {

    }

    @Override
    void setMode(PinMode mode, GpioPin... pin) {

    }

    @Override
    PinMode getMode(GpioPin pin) {
        return null
    }

    @Override
    boolean isMode(PinMode mode, GpioPin... pin) {
        return false
    }

    @Override
    void setPullResistance(PinPullResistance resistance, GpioPin... pin) {

    }

    @Override
    PinPullResistance getPullResistance(GpioPin pin) {
        return null
    }

    @Override
    boolean isPullResistance(PinPullResistance resistance, GpioPin... pin) {
        return false
    }

    @Override
    void high(GpioPinDigitalOutput... pin) {

    }

    @Override
    boolean isHigh(GpioPinDigital... pin) {
        return false
    }

    @Override
    void low(GpioPinDigitalOutput... pin) {

    }

    @Override
    boolean isLow(GpioPinDigital... pin) {
        return false
    }

    @Override
    void setState(PinState state, GpioPinDigitalOutput... pin) {

    }

    @Override
    void setState(boolean state, GpioPinDigitalOutput... pin) {

    }

    @Override
    boolean isState(PinState state, GpioPinDigital... pin) {
        return false
    }

    @Override
    PinState getState(GpioPinDigital pin) {
        return null
    }

    @Override
    void toggle(GpioPinDigitalOutput... pin) {

    }

    @Override
    void pulse(long milliseconds, GpioPinDigitalOutput... pin) {

    }

    @Override
    void setValue(double value, GpioPinAnalogOutput... pin) {

    }

    @Override
    double getValue(GpioPinAnalog pin) {
        return 0
    }

    @Override
    void addListener(GpioPinListener listener, GpioPinInput... pin) {

    }

    @Override
    void addListener(GpioPinListener[] listeners, GpioPinInput... pin) {

    }

    @Override
    void removeListener(GpioPinListener listener, GpioPinInput... pin) {

    }

    @Override
    void removeListener(GpioPinListener[] listeners, GpioPinInput... pin) {

    }

    @Override
    void removeAllListeners() {

    }

    @Override
    void addTrigger(GpioTrigger trigger, GpioPinInput... pin) {

    }

    @Override
    void addTrigger(GpioTrigger[] triggers, GpioPinInput... pin) {

    }

    @Override
    void removeTrigger(GpioTrigger trigger, GpioPinInput... pin) {

    }

    @Override
    void removeTrigger(GpioTrigger[] triggers, GpioPinInput... pin) {

    }

    @Override
    void removeAllTriggers() {

    }

    @Override
    GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(GpioProvider provider, Pin pin, String name, PinMode mode, PinPullResistance resistance) {
        return null
    }

    @Override
    GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(GpioProvider provider, Pin pin, PinMode mode, PinPullResistance resistance) {
        return null
    }

    @Override
    GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(GpioProvider provider, Pin pin, String name, PinMode mode) {
        return null
    }

    @Override
    GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(GpioProvider provider, Pin pin, PinMode mode) {
        return null
    }

    @Override
    GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(Pin pin, String name, PinMode mode, PinPullResistance resistance) {
        return null
    }

    @Override
    GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(Pin pin, PinMode mode, PinPullResistance resistance) {
        return null
    }

    @Override
    GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(Pin pin, String name, PinMode mode) {
        return null
    }

    @Override
    GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(Pin pin, PinMode mode) {
        return null
    }

    @Override
    GpioPinDigitalInput provisionDigitalInputPin(GpioProvider provider, Pin pin, String name, PinPullResistance resistance) {
        return null
    }

    @Override
    GpioPinDigitalInput provisionDigitalInputPin(GpioProvider provider, Pin pin, PinPullResistance resistance) {
        return null
    }

    @Override
    GpioPinDigitalInput provisionDigitalInputPin(GpioProvider provider, Pin pin, String name) {
        return null
    }

    @Override
    GpioPinDigitalInput provisionDigitalInputPin(GpioProvider provider, Pin pin) {
        return null
    }

    @Override
    GpioPinDigitalInput provisionDigitalInputPin(Pin pin, String name, PinPullResistance resistance) {
        return null
    }

    @Override
    GpioPinDigitalInput provisionDigitalInputPin(Pin pin, PinPullResistance resistance) {
        return null
    }

    @Override
    GpioPinDigitalInput provisionDigitalInputPin(Pin pin, String name) {
        return null
    }

    @Override
    GpioPinDigitalInput provisionDigitalInputPin(Pin pin) {
        return null
    }

    @Override
    GpioPinDigitalOutput provisionDigitalOutputPin(GpioProvider provider, Pin pin, String name, PinState defaultState) {
        return null
    }

    @Override
    GpioPinDigitalOutput provisionDigitalOutputPin(GpioProvider provider, Pin pin, PinState defaultState) {
        return null
    }

    @Override
    GpioPinDigitalOutput provisionDigitalOutputPin(GpioProvider provider, Pin pin, String name) {
        return null
    }

    @Override
    GpioPinDigitalOutput provisionDigitalOutputPin(GpioProvider provider, Pin pin) {
        return null
    }

    @Override
    GpioPinDigitalOutput provisionDigitalOutputPin(Pin pin, String name, PinState defaultState) {
        return null
    }

    @Override
    GpioPinDigitalOutput provisionDigitalOutputPin(Pin pin, PinState defaultState) {
        return null
    }

    @Override
    GpioPinDigitalOutput provisionDigitalOutputPin(Pin pin, String name) {
        return null
    }

    @Override
    GpioPinDigitalOutput provisionDigitalOutputPin(Pin pin) {
        return null
    }

    @Override
    GpioPinAnalogInput provisionAnalogInputPin(GpioProvider provider, Pin pin, String name) {
        return null
    }

    @Override
    GpioPinAnalogInput provisionAnalogInputPin(GpioProvider provider, Pin pin) {
        return null
    }

    @Override
    GpioPinAnalogInput provisionAnalogInputPin(Pin pin, String name) {
        return null
    }

    @Override
    GpioPinAnalogInput provisionAnalogInputPin(Pin pin) {
        return null
    }

    @Override
    GpioPinAnalogOutput provisionAnalogOutputPin(GpioProvider provider, Pin pin, String name, double defaultValue) {
        return null
    }

    @Override
    GpioPinAnalogOutput provisionAnalogOutputPin(GpioProvider provider, Pin pin, double defaultValue) {
        return null
    }

    @Override
    GpioPinAnalogOutput provisionAnalogOutputPin(GpioProvider provider, Pin pin, String name) {
        return null
    }

    @Override
    GpioPinAnalogOutput provisionAnalogOutputPin(GpioProvider provider, Pin pin) {
        return null
    }

    @Override
    GpioPinAnalogOutput provisionAnalogOutputPin(Pin pin, String name, double defaultValue) {
        return null
    }

    @Override
    GpioPinAnalogOutput provisionAnalogOutputPin(Pin pin, double defaultValue) {
        return null
    }

    @Override
    GpioPinAnalogOutput provisionAnalogOutputPin(Pin pin, String name) {
        return null
    }

    @Override
    GpioPinAnalogOutput provisionAnalogOutputPin(Pin pin) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionPwmOutputPin(GpioProvider provider, Pin pin, String name, int defaultValue) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionPwmOutputPin(GpioProvider provider, Pin pin, int defaultValue) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionPwmOutputPin(GpioProvider provider, Pin pin, String name) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionPwmOutputPin(GpioProvider provider, Pin pin) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionPwmOutputPin(Pin pin, String name, int defaultValue) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionPwmOutputPin(Pin pin, int defaultValue) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionPwmOutputPin(Pin pin, String name) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionPwmOutputPin(Pin pin) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionSoftPwmOutputPin(GpioProvider provider, Pin pin, String name, int defaultValue) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionSoftPwmOutputPin(GpioProvider provider, Pin pin, int defaultValue) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionSoftPwmOutputPin(GpioProvider provider, Pin pin, String name) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionSoftPwmOutputPin(GpioProvider provider, Pin pin) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionSoftPwmOutputPin(Pin pin, String name, int defaultValue) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionSoftPwmOutputPin(Pin pin, int defaultValue) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionSoftPwmOutputPin(Pin pin, String name) {
        return null
    }

    @Override
    GpioPinPwmOutput provisionSoftPwmOutputPin(Pin pin) {
        return null
    }

    @Override
    GpioPin provisionPin(GpioProvider provider, Pin pin, String name, PinMode mode, PinState defaultState) {
        return null
    }

    @Override
    GpioPin provisionPin(GpioProvider provider, Pin pin, String name, PinMode mode) {
        return null
    }

    @Override
    GpioPin provisionPin(GpioProvider provider, Pin pin, PinMode mode) {
        return null
    }

    @Override
    GpioPin provisionPin(Pin pin, String name, PinMode mode) {
        return null
    }

    @Override
    GpioPin provisionPin(Pin pin, PinMode mode) {
        return null
    }

    @Override
    void setShutdownOptions(GpioPinShutdown options, GpioPin... pin) {

    }

    @Override
    void setShutdownOptions(Boolean unexport, GpioPin... pin) {

    }

    @Override
    void setShutdownOptions(Boolean unexport, PinState state, GpioPin... pin) {

    }

    @Override
    void setShutdownOptions(Boolean unexport, PinState state, PinPullResistance resistance, GpioPin... pin) {

    }

    @Override
    void setShutdownOptions(Boolean unexport, PinState state, PinPullResistance resistance, PinMode mode, GpioPin... pin) {

    }

    @Override
    Collection<GpioPin> getProvisionedPins() {
        return null
    }

    @Override
    GpioPin getProvisionedPin(Pin pin) {
        return null
    }

    @Override
    GpioPin getProvisionedPin(String name) {
        return null
    }

    @Override
    void unprovisionPin(GpioPin... pin) {

    }

    @Override
    boolean isShutdown() {
        return false
    }

    @Override
    void shutdown() {

    }
}
