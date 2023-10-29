package jp.yuui.notesapp.ui.home

import androidx.recyclerview.widget.RecyclerView
import jp.yuui.notesapp.data.NoteModel
import jp.yuui.notesapp.databinding.NoteItemHomeLayoutBinding

class NoteViewHolder(
    private val binding: NoteItemHomeLayoutBinding,
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(note: NoteModel) {
        binding.run {
            txtTitle.text = note.title
            txtDate.text = note.date
            txtContent.text = note.content
        }
    }
}