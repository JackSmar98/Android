import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tiendaaccesorios.R // Importa la clase R de tu propio proyecto

class MainActivity : AppCompatActivity() {
    private var editTextEmail: EditText? = null
    private var editTextPassword: EditText? = null
    private var buttonLogin: Button? = null
    private var buttonRegister: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Asegúrate de que aquí estés usando tu clase R

        // Inicializar vistas
        editTextEmail = findViewById(R.id.editTextTextPersonName)
        editTextPassword = findViewById(R.id.editTextTextPersonName2)
        buttonLogin = findViewById(R.id.login)
        buttonRegister = findViewById(R.id.regis)

        // Configurar el clic del botón Iniciar sesión
        buttonLogin?.setOnClickListener(View.OnClickListener {
            // Aquí puedes agregar la lógica para iniciar sesión
            // Por ahora, solo mostraremos un mensaje de éxito
            Toast.makeText(
                this@MainActivity,
                "Iniciar sesión con: " + editTextEmail?.text.toString() + " - " + editTextPassword?.text.toString(),
                Toast.LENGTH_SHORT
            ).show()
        })

        // Configurar el clic del botón Registrar
        buttonRegister?.setOnClickListener(View.OnClickListener {
            // Aquí puedes agregar la lógica para registrar al usuario
            // Por ahora, solo mostraremos un mensaje de éxito
            Toast.makeText(
                this@MainActivity,
                "Registrar con: " + editTextEmail?.text.toString() + " - " + editTextPassword?.text.toString(),
                Toast.LENGTH_SHORT
            ).show()
        })
    }
}
