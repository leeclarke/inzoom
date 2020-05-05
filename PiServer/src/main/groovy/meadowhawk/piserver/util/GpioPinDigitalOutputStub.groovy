package meadowhawk.piserver.util

import com.pi4j.io.gpio.GpioPinDigitalOutput
import com.pi4j.io.gpio.GpioPinShutdown
import com.pi4j.io.gpio.GpioProvider
import com.pi4j.io.gpio.Pin
import com.pi4j.io.gpio.PinMode
import com.pi4j.io.gpio.PinPullResistance
import com.pi4j.io.gpio.PinState
import com.pi4j.io.gpio.event.GpioPinListener

import java.util.concurrent.Callable
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

class GpioPinDigitalOutputStub implements GpioPinDigitalOutput{
    @Override
    void high() {

    }

    @Override
    void low() {

    }

    @Override
    void toggle() {

    }

    @Override
    Future<?> blink(long delay) {
        return null
    }

    @Override
    Future<?> blink(long delay, TimeUnit timeUnit) {
        return null
    }

    @Override
    Future<?> blink(long delay, PinState blinkState) {
        return null
    }

    @Override
    Future<?> blink(long delay, PinState blinkState, TimeUnit timeUnit) {
        return null
    }

    @Override
    Future<?> blink(long delay, long duration) {
        return null
    }

    @Override
    Future<?> blink(long delay, long duration, TimeUnit timeUnit) {
        return null
    }

    @Override
    Future<?> blink(long delay, long duration, PinState blinkState) {
        return null
    }

    @Override
    Future<?> blink(long delay, long duration, PinState blinkState, TimeUnit timeUnit) {
        return null
    }

    @Override
    Future<?> pulse(long duration) {
        return null
    }

    @Override
    Future<?> pulse(long duration, TimeUnit timeUnit) {
        return null
    }

    @Override
    Future<?> pulse(long duration, Callable<Void> callback) {
        return null
    }

    @Override
    Future<?> pulse(long duration, Callable<Void> callback, TimeUnit timeUnit) {
        return null
    }

    @Override
    Future<?> pulse(long duration, boolean blocking) {
        return null
    }

    @Override
    Future<?> pulse(long duration, boolean blocking, TimeUnit timeUnit) {
        return null
    }

    @Override
    Future<?> pulse(long duration, boolean blocking, Callable<Void> callback) {
        return null
    }

    @Override
    Future<?> pulse(long duration, boolean blocking, Callable<Void> callback, TimeUnit timeUnit) {
        return null
    }

    @Override
    Future<?> pulse(long duration, PinState pulseState) {
        return null
    }

    @Override
    Future<?> pulse(long duration, PinState pulseState, TimeUnit timeUnit) {
        return null
    }

    @Override
    Future<?> pulse(long duration, PinState pulseState, Callable<Void> callback) {
        return null
    }

    @Override
    Future<?> pulse(long duration, PinState pulseState, Callable<Void> callback, TimeUnit timeUnit) {
        return null
    }

    @Override
    Future<?> pulse(long duration, PinState pulseState, boolean blocking) {
        return null
    }

    @Override
    Future<?> pulse(long duration, PinState pulseState, boolean blocking, TimeUnit timeUnit) {
        return null
    }

    @Override
    Future<?> pulse(long duration, PinState pulseState, boolean blocking, Callable<Void> callback) {
        return null
    }

    @Override
    Future<?> pulse(long duration, PinState pulseState, boolean blocking, Callable<Void> callback, TimeUnit timeUnit) {
        return null
    }

    @Override
    void setState(PinState state) {

    }

    @Override
    void setState(boolean state) {

    }

    @Override
    boolean isHigh() {
        return false
    }

    @Override
    boolean isLow() {
        return false
    }

    @Override
    PinState getState() {
        return null
    }

    @Override
    boolean isState(PinState state) {
        return false
    }

    @Override
    GpioProvider getProvider() {
        return null
    }

    @Override
    Pin getPin() {
        return null
    }

    @Override
    void setName(String name) {

    }

    @Override
    String getName() {
        return null
    }

    @Override
    void setTag(Object tag) {

    }

    @Override
    Object getTag() {
        return null
    }

    @Override
    void setProperty(String key, String value) {

    }

    @Override
    boolean hasProperty(String key) {
        return false
    }

    @Override
    String getProperty(String key, String defaultValue) {
        return null
    }

    String getProperty(String key) {
        return null
    }

    @Override
    Map<String, String> getProperties() {
        return null
    }

    @Override
    void removeProperty(String key) {

    }

    @Override
    void clearProperties() {

    }

    @Override
    void export(PinMode mode) {

    }

    @Override
    void export(PinMode mode, PinState defaultState) {

    }

    @Override
    void unexport() {

    }

    @Override
    boolean isExported() {
        return false
    }

    @Override
    void setMode(PinMode mode) {

    }

    @Override
    PinMode getMode() {
        return null
    }

    @Override
    boolean isMode(PinMode mode) {
        return false
    }

    @Override
    void setPullResistance(PinPullResistance resistance) {

    }

    @Override
    PinPullResistance getPullResistance() {
        return null
    }

    @Override
    boolean isPullResistance(PinPullResistance resistance) {
        return false
    }

    @Override
    Collection<GpioPinListener> getListeners() {
        return null
    }

    @Override
    void addListener(GpioPinListener... listener) {

    }

    @Override
    void addListener(List<? extends GpioPinListener> listeners) {

    }

    @Override
    boolean hasListener(GpioPinListener... listener) {
        return false
    }

    @Override
    void removeListener(GpioPinListener... listener) {

    }

    @Override
    void removeListener(List<? extends GpioPinListener> listeners) {

    }

    @Override
    void removeAllListeners() {

    }

    @Override
    GpioPinShutdown getShutdownOptions() {
        return null
    }

    @Override
    void setShutdownOptions(GpioPinShutdown options) {

    }

    @Override
    void setShutdownOptions(Boolean unexport) {

    }

    @Override
    void setShutdownOptions(Boolean unexport, PinState state) {

    }

    @Override
    void setShutdownOptions(Boolean unexport, PinState state, PinPullResistance resistance) {

    }

    @Override
    void setShutdownOptions(Boolean unexport, PinState state, PinPullResistance resistance, PinMode mode) {

    }
}
