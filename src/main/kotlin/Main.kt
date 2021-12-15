import com.jme3.app.SimpleApplication
import com.jme3.scene.Geometry
import com.jme3.scene.shape.Box

fun main() {
    Application().start()
}

class Application : SimpleApplication() {

    override fun simpleInitApp() {
        val box = Box(1f, 1f, 1f)
        val geometry = Geometry("Box", box)
        rootNode.attachChild(geometry)
    }

}