import java.io.InputStreamReader

boolean zoomIsOn = false
Process p = new ProcessBuilder("tasklist", "/fo", "table","/v", "/fi", 'imagename eq CptHost.exe').redirectErrorStream(true).start()
Reader isr = new InputStreamReader(p.inputStream)
String tasklist = ""
isr.eachLine{ line ->
    tasklist+= line
}
//println tasklist
zoomIsOn = tasklist.contains("CptHost.exe")

println("ZOOM: ${zoomIsOn?'ON':'OFF'}")
callRpiApi(zoomIsOn)


def callRpiApi(boolean status){
    def rpiApi = new URL('https://postman-echo.com/get')
    def conn = rpiApi.openConnection()
    conn.requestMethod = 'GET'
    assert conn.responseCode == 200
}