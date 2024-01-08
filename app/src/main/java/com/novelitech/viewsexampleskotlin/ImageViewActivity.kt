package com.novelitech.viewsexampleskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

        val image: ImageView = findViewById(R.id.ivImage)

        image.setImageResource(R.drawable.sapo)
    }
}