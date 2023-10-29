package jp.yuui.notesapp.ui

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import jp.yuui.notesapp.databinding.CreateNoteActivityBinding

class CreateNoteActivity: FragmentActivity() {
    private var _binding: CreateNoteActivityBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = CreateNoteActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}