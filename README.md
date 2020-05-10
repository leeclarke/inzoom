# inzoom
A quick Zoom IN Meeting Monitor for use with an Raspberry Pi.  There  are already a bunch of there out there I am sure but I like groovy so I threw together a quick version for my own amusement and personal comfort!

I wrote this script to call a Ras-Pi and trigger a little REST endpoint to toggle an on the air light.  I also added a small API to be installed on the Raspberry-pi to trigger the on air lite.  All written in Groovy!

To Run the script
-----------------
Assuming you have Groovy installed: 
```groovy monitor/meetingCheck.groovy```

Need groovy installed? Check out [SDKMan](https://sdkman.io/), it can install and manage things like this without all the usual windows frustration. (You need Java instaleld but that oen is simple, jsut download rom Oracle if you dont walrey have it installed.)

Scheduling the Script
---------------------
The script can be triggered by running the inzoom.bat file located in /monitor. The best way to run the script is to Schedule a task in Windows that runs teh .bat file every night. There are a ton of tutorials on how to do this. I woudl suggest scheduling the script to run every morning and terminate in the evening. Be sure to configure the scheduler to shut down previously running versions.

If you want to tests or figure out any issues , try runnign the script from teh command line and you'll see teh logs as it runs.

Installing the API
------------------

If your cloning and building the api locally then the deployment is pretty simple and can be done from the command line.

1. Run ```./gradlew build fatjar```
2. Load to your R-pi  ```` scp build/libs/PiServer.jar pi@<Pi-ip>>:~/webapps ````
3. SSH to your Pi and run ```` java -jar webapps/PiServer.jar &````


API Notes
--------
If your courious how busy your day has been you can check out your call logs fro the day by calling the API in your browser to display your call logs.  http://<yourPisIP:4567>/zoom/status