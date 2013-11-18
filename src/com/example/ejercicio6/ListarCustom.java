package com.example.ejercicio6;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ejercicio6.Noticia;

public class ListarCustom extends  ArrayAdapter<Noticia> {

	private View view;
	private ArrayList<Noticia> noticias;
	
	public ListarCustom(Context context,ArrayList<Noticia> noticias){
		super(context, R.layout.activity_listar,noticias);
		this.noticias = noticias;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		
		// TODO Auto-generated constructor stub
		View view =  convertView;
		
		if (view == null) {
			LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(R.layout.row, null);
		}
		
		TextView t = (TextView)view.findViewById(R.id.titulo); 
		t.setText(noticias.get(position).getTitulo());
		
		TextView f = (TextView)view.findViewById(R.id.contenido);
		f.setText(noticias.get(position).getContenido());
			
		return view;
	}

	
	
}
