package com.dh.cookbookapp.presentation.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.setFragmentResult
import com.dh.cookbookapp.databinding.FragmentDialogEditTextBinding

class DialogEditTextFragment : DialogFragment() {

    lateinit var binding: FragmentDialogEditTextBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val titleText = arguments?.getString(TITLE_TEXT)
            ?: throw IllegalArgumentException("Ops, enter the title")
        val placeHolderText = arguments?.getString(PLACE_HOLDER)
            ?: throw java.lang.IllegalArgumentException("Ops, enter the place holder")

        return activity?.let {
            binding = FragmentDialogEditTextBinding.inflate(
                requireActivity().layoutInflater
            ).apply {
                etEditText.hint = placeHolderText
                tvTitle.text = titleText
            }
            AlertDialog.Builder(it)
                .setView(binding.root)
                .setPositiveButton("Confirm") { _, _ ->
                    setFragmentResult(
                        FRAGMENT_RESULT, bundleOf(
                            EDIT_TEXT_VALUE to binding.etEditText.text.toString()
                        )
                    )
                }.setNegativeButton("Cancel") { _, _ ->
                    dismiss()
                }.create()
        } ?: throw IllegalStateException("Activity can not be null")
    }

    companion object {
        const val TITLE_TEXT = "TITLE_TEXT"
        const val PLACE_HOLDER = "PLACE_HOLDER"
        const val FRAGMENT_RESULT = "FRAGMENT_RESULT"
        const val EDIT_TEXT_VALUE = "EDIT_TEXT_VALUE"

        fun show(
            title: String,
            placeHolder: String,
            fragmentManager: FragmentManager,
            tag: String = DialogEditTextFragment::class.simpleName.toString()
        ) {
            DialogEditTextFragment().apply {
                arguments = bundleOf(
                    TITLE_TEXT to title,
                    PLACE_HOLDER to placeHolder
                )
            }.show(
                fragmentManager,
                tag
            )
        }
    }
}