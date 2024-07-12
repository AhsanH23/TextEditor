package nicknamecreator.nicknamegenerator.nickname_maker.texteditor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emojiView = findViewById<TextView>(R.id.emojiView)
        val inputText = findViewById<EditText>(R.id.inputText)
        val inputEmoji = findViewById<EditText>(R.id.inputEmoji)
        val createBtn = findViewById<Button>(R.id.createBtn)
        val tte = TextToEmojiConverter()
        createBtn.setOnClickListener {
         //  emojiView.text=tte.textToEmoji(inputText.text.toString() , inputEmoji.text.toString())
            emojiView.text=tte.drawTTE(inputText.text.toString(),inputEmoji.text.toString())
        }
    }

}