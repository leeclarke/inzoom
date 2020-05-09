/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package meadowhawk.piserver
import static spark.Spark.*
import meadowhawk.piserver.service.ZoomService

class App {
    static String getGreeting() {
        return 'Welcome to Zoom Status API v1.0'
    }

    static final String JSON_TYPE = "application/json"
    static ZoomService zoomService = new ZoomService()

    static void main(String[] args) {
        println "Starting server...."

        get '/', { req, res -> getGreeting() }
        get '/zoom', { req, res -> getGreeting() }
        get '/zoom/status', { req, res ->
            res.status(200)
            res.type(JSON_TYPE)
            zoomService.getStatusInfo()
        }
        post '/zoom/status/update', { req, res ->
            zoomService.toggleIndicator(req)
            res.type(JSON_TYPE)
            res.status(200)
            ""
        }

    }
}
