package com.kafa.pos

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(24, 40, 24, 24)
            setBackgroundColor(Color.WHITE)
        }

        val title = TextView(this).apply {
            text = "KAFA POS V12"
            textSize = 28f
            gravity = Gravity.CENTER
            setTextColor(Color.BLACK)
        }

        val subtitle = TextView(this).apply {
            text = "KAFA Official Store • Offline POS"
            textSize = 15f
            gravity = Gravity.CENTER
            setPadding(0, 12, 0, 32)
        }

        val status = TextView(this).apply {
            text = "Dashboard siap digunakan"
            textSize = 18f
            setPadding(0, 16, 0, 16)
        }

        val transaksi = MaterialButton(this).apply {
            text = "TRANSAKSI BARU"
            setOnClickListener {
                status.text = "Mode transaksi baru dibuka"
            }
        }

        val produk = MaterialButton(this).apply {
            text = "PRODUK & STOK"
            setOnClickListener {
                status.text = "Menu produk & stok dibuka"
            }
        }

        val laporan = MaterialButton(this).apply {
            text = "LAPORAN PENJUALAN"
            setOnClickListener {
                status.text = "Menu laporan dibuka"
            }
        }

        root.addView(title)
        root.addView(subtitle)
        root.addView(status)
        root.addView(transaksi)
        root.addView(produk)
        root.addView(laporan)

        setContentView(root)
    }
}
