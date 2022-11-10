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
import tads.eaj.ufrn.quizapplication.databinding.FragmentPergunta1Binding
import tads.eaj.ufrn.quizapplication.databinding.FragmentResultadoBinding


class FragmentResultado : Fragment() {


    lateinit var binding:FragmentResultadoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_resultado, container, false)

        val args: FragmentResultadoArgs by navArgs()

        Toast.makeText(context, args.result.toString() + args.nome, Toast.LENGTH_SHORT).show()

        binding.buttonReiniciar.setOnClickListener {
            Navigation.findNavController(it).navigate(FragmentResultadoDirections.actionFragmentResultadoToFragmentPergunta1())
        }

        return binding.root
    }

}