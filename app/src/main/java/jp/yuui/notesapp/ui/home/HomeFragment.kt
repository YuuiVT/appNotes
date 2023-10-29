package jp.yuui.notesapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import jp.yuui.notesapp.data.NoteModel
import jp.yuui.notesapp.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {
    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding!!

    private val notesAdapter: NotesAdapter = NotesAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = HomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding.run {
            rvNotes.adapter = notesAdapter
            rvNotes.layoutManager = GridLayoutManager(root.context, 2)
        }
        notesAdapter.submitList(notesMockUp())
    }

    private fun notesMockUp(): List<NoteModel> {
        return listOf(
            NoteModel(
                id = 1,
                title = "Nota 1",
                date = "02 05 23",
                content = "SOY LA NOTA 1"
            ),
            NoteModel(
                id = 2,
                title = "Nota 2",
                date = "05 05 23",
                content = "SOY LA NOTA 2"
            ),
            NoteModel(
                id = 3,
                title = "Nota 3",
                date = "02 05 23",
                content = "SOY LA NOTA 3"
            ),
            NoteModel(
                id = 4,
                title = "Nota 4",
                date = "02 05 23",
                content = "SOY LA NOTA 4"
            ),
            NoteModel(
                id = 5,
                title = "Nota 5",
                date = "02 05 23",
                content = "SOY LA NOTA 5"
            ),
            NoteModel(
                id = 6,
                title = "Nota 6",
                date = "02 05 23",
                content = "SOY LA NOTA 6"
            ),
            NoteModel(
                id = 7,
                title = "Nota 7",
                date = "02 05 23",
                content = "SOY LA NOTA 7"
            ),
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}