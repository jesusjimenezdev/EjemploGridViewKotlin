package jesus.net.ejemplogridviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas = ArrayList<Fruta>()
        /*frutas.add("Manzana")
        frutas.add("Pera")
        frutas.add("Naranja")
        frutas.add("Sandia")
        frutas.add("Melocoton")
        frutas.add("Platano")*/
        frutas.add(Fruta("Manzana", R.drawable.manzana))
        frutas.add(Fruta("Platano", R.drawable.platano))
        frutas.add(Fruta("Sandia", R.drawable.sandia))
        frutas.add(Fruta("Durazno", R.drawable.durazno))

        var grid: GridView = findViewById(R.id.grid) as GridView
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        val adaptador = AdaptadorCustom(this, frutas)
        grid.adapter = adaptador
        grid.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this, frutas.get(position).nombre, Toast.LENGTH_LONG).show()
        }
    }
}
