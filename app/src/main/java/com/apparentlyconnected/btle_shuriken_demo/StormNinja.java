package com.apparentlyconnected.btle_shuriken_demo;

/**
 * Created by Nathan Crum on 5/2/2015.
 */
public class StormNinja {

    public StormNinja() {
        orn_led = false;
        red_led = false;
    }

    public StormNinja( boolean red, boolean orn ) {
        orn_led = orn;
        red_led = red;
    }

    public boolean get_led(led_color led_clr) {
        if(led_clr == led_color.led_orn) {
            return orn_led;
        }
        else {
            return red_led;
        }
    }

    public boolean toggle_led(led_color led_clr) {
        if(led_clr == led_color.led_orn) {
            orn_led = !orn_led;
            return orn_led;
        }
        else {
            red_led = !red_led;
            return red_led;
        }
    }

    public void set_led(led_color led_clr, boolean led_onoff) {
        if(led_clr == led_color.led_orn) {
            orn_led = led_onoff;
        }
        else {
            red_led = led_onoff;
        }
    }

    public enum led_color {
        led_orn,
        led_red
    }

    public String sn_buffer;
    private boolean orn_led;
    private boolean red_led;

}