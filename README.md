# inzoom
A quick Zoom IN Meeting Monitor for use with an Raspberry Pi.  There  are already a bunch of there out there I am sure but I like groovy so I threw together a quick version for my own amusement and personal comfort!

I wrote this script to call a Ras-Pi and trigger a little REST endpoint to toggle an on the air light.  I also added a small API to be installed on the Raspberry-pi to trigger the on air lite.  All written in Java

To Run the script
-----------------
Assuming you have Groovy installed: 
```groovy monitor/meetingCheck.groovy```

Need groovy installed? Check out [SDKMan](https://sdkman.io/), it can install and manage things like this without all the usual windows frustration.

Scheduling the Script
---------------------

tbd

Installing the API
------------------

If your cloning and building the api locally then the deployment is pretty simple and can be done from the command line.

1. Run ```./gradlew build fatjar```
2. Load to your R-pi  ```` scp build/libs/PiServer.jar pi@<Pi-ip>>:~/webapps ````
3. SSH to your Pi and run ```` java -jar webapps/PiServer.jar &````
