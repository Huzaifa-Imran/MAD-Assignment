package com.cs191094.mad_assignment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.cs191094.mad_assignment.databinding.FragmentAddRecordBinding
import com.cs191094.mad_assignment.ui.records.Record
import com.cs191094.mad_assignment.ui.records.RecordsModel
import kotlin.random.Random

class AddRecordFragment : Fragment() {
    private var _binding: FragmentAddRecordBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val recordsModel = ViewModelProvider(requireActivity())[RecordsModel::class.java]

        _binding = FragmentAddRecordBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val addRecordButton: Button = binding.addRecordButton
        addRecordButton.setOnClickListener {
            val addImage = binding.addRecordImage
            val addName = binding.addRecordName
            val addDescription = binding.addRecordDescription
            if (addName.text.isNotBlank()) {
                var newUrl = addImage.text?.toString()
                if (newUrl == "") {
                    newUrl = null
                }
                val newRecord = Record(
                    Random.nextInt(0, 10000000),
                    addName.text.toString(),
                    addDescription.text.toString(),
                    newUrl,
                    false,
                )
                recordsModel.addRecord(newRecord, context!!)
                addImage.setText("")
                addName.setText("")
                addDescription.setText("")
            }
        }

        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}