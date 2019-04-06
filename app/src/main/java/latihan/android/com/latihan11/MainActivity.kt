package latihan.android.com.latihan11

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        facebook.setOnClickListener {
            val intent = Intent(android.content.Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.facebook.com/saputra.kmdn")
            startActivity(intent)
        }
        twitter.setOnClickListener {
            val openTw = Intent(android.content.Intent.ACTION_VIEW)
            openTw.data = Uri.parse("https://www.twitter.com/saputra_kmdn")
            startActivity(openTw)
        }
        instagram.setOnClickListener {
            val openIg = Intent(android.content.Intent.ACTION_VIEW)
            openIg.data = Uri.parse("https://www.instagram.com/s.kmdn")
            startActivity(openIg)
        }
        github.setOnClickListener {
            val openGit = Intent(android.content.Intent.ACTION_VIEW)
            openGit.data = Uri.parse("https://www.github.com/saputrakmdn")
            startActivity(openGit)
        }
    }
}
