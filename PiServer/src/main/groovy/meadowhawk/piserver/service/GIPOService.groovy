package meadowhawk.piserver.service

import com.pi4j.io.gpio.GpioController
import com.pi4j.io.gpio.GpioFactory
import com.pi4j.io.gpio.GpioPinDigitalOutput
import com.pi4j.io.gpio.PinState
import com.pi4j.io.gpio.RaspiPin
import groovy.util.logging.Slf4j
import meadowhawk.piserver.util.GpioControllerStub
import meadowhawk.piserver.util.GpioPinDigitalOutputStub

@Slf4j
class GIPOService {

    final GpioController gpio
    final GpioPinDigitalOutput pin

    GIPOService(){
        try{
            gpio = GpioFactory.getInstance()
            pin = gpio.provisionDigitalOutputPin(RaspiPin.getPinByAddress(4))
            pin.setShutdownOptions(true, PinState.LOW);
        } catch(Throwable e){
            log.warn("Starting server with GIPO disbled! /n Error: ${e}")
            //Insert Stubs so service can run and be tested when not on a R-Pi
            gpio = new GpioControllerStub()
            pin = new GpioPinDigitalOutputStub()
        }

    }

    def toggleLED(boolean state){
        if(state){
            pin.high()
        } else {
            pin.low()
        }
    }
}
