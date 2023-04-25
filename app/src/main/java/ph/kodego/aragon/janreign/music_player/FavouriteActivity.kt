package ph.kodego.aragon.janreign.music_player

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ph.kodego.aragon.janreign.music_player.databinding.ActivityFavouriteBinding

class FavouriteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavouriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.coolPinkNav) // to get the logo as background
        binding = ActivityFavouriteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}