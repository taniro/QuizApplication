package tads.eaj.ufrn.quizapplication

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import tads.eaj.ufrn.quizapplication.databinding.FragmentPergunta1Binding

class FragmentPergunta1 : Fragment() {

    lateinit var binding: FragmentPergunta1Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pergunta1, container, false)

        binding.buttonAvancar.setOnClickListener {
            Navigation.findNavController(it).navigate(FragmentPergunta1Directions.actionFragmentPergunta1ToFragmentPergunta2(4f))
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, Navigation.findNavController(requireView()))|| super.onOptionsItemSelected(item)
    }

}