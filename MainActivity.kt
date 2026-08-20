package com.kafa.pos
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
class MainActivity: AppCompatActivity(){ override fun onCreate(b:Bundle?){super.onCreate(b); val r=LinearLayout(this).apply{orientation=LinearLayout.VERTICAL;setPadding(24,40,24,24);setBackgroundColor(Color.WHITE)}; val t=TextView(this).apply{text="KAFA POS V12";textSize=28f;gravity=Gravity.CENTER}; val s=TextView(this).apply{text="KAFA Official Store • Offline POS";textSize=15f;gravity=Gravity.CENTER;setPadding(0,12,0,32)}; val st=TextView(this).apply{text="Dashboard siap digunakan";textSize=18f}; fun btn(x:String)=MaterialButton(this).apply{text=x;setOnClickListener{st.text="$x dibuka"}}; r.addView(t);r.addView(s);r.addView(st);r.addView(btn("TRANSAKSI BARU"));r.addView(btn("PRODUK & STOK"));r.addView(btn("LAPORAN PENJUALAN"));setContentView(r)}}
