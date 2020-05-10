import java.io.InputStreamReader


new Timer().schedule({
    checkZoomStatus()
} as TimerTask, 2000, 60000) //wait 2 seconds and then run every minute

def checkZoomStatus(){
    Process p = new ProcessBuilder("tasklist", "/fo", "table","/v", "/fi", 'imagename eq CptHost.exe').redirectErrorStream(true).start()
    Reader isr = new InputStreamReader(p.inputStream)
    String tasklist = ""
    isr.eachLine{ line ->
        tasklist+= line
    }

    zoomIsOn = tasklist.contains("CptHost.exe")
    println("ZOOM: ${zoomIsOn?'ON':'OFF'}")
    callRpiApi(zoomIsOn)
}




def callRpiApi(boolean status){
    try{


    def rpiApi = new URL("http://192.168.1.31:4567/zoom/status/update?callStatus=${(status)?'on':'off'}")
    println "URL="+rpiApi
    def conn = rpiApi.openConnection()
    conn.requestMethod = 'POST'
    assert conn.responseCode == 200
    } catch(Exception e ){
        println "Failed to connect to the Pi. Check connections! Error: ${e}"
    }
}