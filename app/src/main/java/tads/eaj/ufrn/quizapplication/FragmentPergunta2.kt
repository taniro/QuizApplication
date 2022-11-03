package tads.eaj.ufrn.quizapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import tads.eaj.ufrn.quizapplication.databinding.FragmentPergunta2Binding


class FragmentPergunta2 : Fragment() {

    lateinit var binding: FragmentPergunta2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pergunta2, container, false)

        binding.buttonAvancar2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentPergunta2_to_fragmentResultado)
        }

        return binding.root
    }
}