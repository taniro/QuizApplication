package tads.eaj.ufrn.quizapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import tads.eaj.ufrn.quizapplication.databinding.FragmentPergunta2Binding


class FragmentPergunta2 : Fragment() {

    lateinit var binding: FragmentPergunta2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pergunta2, container, false)

        val args: FragmentPergunta2Args by navArgs()
        Toast.makeText(context, args.id.toString(), Toast.LENGTH_SHORT).show()

        binding.buttonAvancar2.setOnClickListener {
            Navigation.findNavController(it).navigate(FragmentPergunta2Directions.actionFragmentPergunta2ToFragmentResultado(6, "Texto"))
        }

        return binding.root
    }
}