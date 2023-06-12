package unal.todosalau.busquedaelementosarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResult1;
    private TextView textViewResult2;
    private TextView textViewResult3;
    private TextView textViewResult4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult1 = findViewById(R.id.textViewResult1);
        textViewResult2 = findViewById(R.id.textViewResult2);
        textViewResult3 = findViewById(R.id.textViewResult3);
        textViewResult4 = findViewById(R.id.textViewResult4);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Manzana");
        arrayList.add("Banana");
        arrayList.add("Cereza");

        // Ejemplo1: Buscar elemento en el ArrayList
        String elemento = "Banana";
        boolean existe = arrayList.contains(elemento);

        if (existe) {
            textViewResult1.setText("Ejemplo 1: elemento " + elemento + " existe en el ArrayList");
        } else {
            textViewResult1.setText("Ejemplo 1: elemento " + elemento + " no existe en el ArrayList");
        }

        // Ejemplo 2: Buscar índice del elemento en el ArrayList
        int indice = arrayList.indexOf(elemento);

        if (indice != -1) {
            textViewResult2.setText("Ejemplo 2: elemento " + elemento + " se encuentra en el " +
                    "índice " + indice);
        } else {
            textViewResult2.setText("Ejemplo 2: elemento " + elemento + " no se encuentra en el " +
                    "ArrayList");
        }

        // Ejemplo 3: Verificar la presencia de un elemento en el ArrayList
        String elementoVerificar = "Durazno";
        boolean presente = arrayList.contains(elementoVerificar);

        if (presente) {
            textViewResult3.setText("Ejemplo 3: elemento " + elementoVerificar + " está presente " +
                    "en el ArrayList");
        } else {
            textViewResult3.setText("Ejemplo 3: elemento " + elementoVerificar + " no está " +
                    "presente en el ArrayList");
        }

        // Ejemplo 4: Otro ejemplo de búsqueda por índice
        int indiceOtro = arrayList.indexOf("Manzana");

        if (indiceOtro != -1) {
            textViewResult4.setText("Ejemplo 4: elemento Manzana se encuentra en el índice " + indiceOtro);
        } else {
            textViewResult4.setText("Ejemplo 4: elemento Manzana no se encuentra en el ArrayList");
        }
    }
}
