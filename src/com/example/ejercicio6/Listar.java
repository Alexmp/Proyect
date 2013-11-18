package com.example.ejercicio6;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class Listar extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listar);
		
		ArrayList<Noticia> array = new ArrayList<Noticia>();
		
		Noticia[] noticias  = new Noticia[]{ 
			new Noticia("Este es el titulo","este es el contenido"),
			new Noticia("Este es el titulo","este es el contenido"),
			new Noticia("Este es el titulo","este es el contenido"),
		};
		
		for (Noticia noticia : noticias) {
			array.add(noticia);
		}
		
		ArrayAdapter<Noticia> arrayAdp = new ListarCustom(getBaseContext(), array);
	    ((ListView)findViewById(R.id.listViewLista)).setAdapter(arrayAdp);
	    
	    
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.listar, menu);
		return true;
	}

}
