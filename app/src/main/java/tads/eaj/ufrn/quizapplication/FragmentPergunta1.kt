package tads.eaj.ufrn.quizapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import tads.eaj.ufrn.quizapplication.databinding.FragmentPergunta1Binding

class FragmentPergunta1 : Fragment() {

    lateinit var binding: FragmentPergunta1Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pergunta1, container, false)

        binding.buttonAvancar.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentPergunta1_to_fragmentPergunta2)
        }

        return binding.root
    }


}