package com.cs191094.mad_assignment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.cs191094.mad_assignment.databinding.FragmentAddRecordBinding
import com.cs191094.mad_assignment.databinding.FragmentNotificationBinding
import com.cs191094.mad_assignment.databinding.FragmentSearchBinding
import com.cs191094.mad_assignment.ui.records.Record
import com.cs191094.mad_assignment.ui.records.RecordsModel
import kotlin.random.Random

class NotificationsFragment : Fragment() {
    private var _binding: FragmentNotificationBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotificationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}