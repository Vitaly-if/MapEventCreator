package org.saturndev.app.mapeventcreator.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.saturndev.app.databinding.CreateEventActivityBinding


abstract class ViewActivity: AppCompatActivity() {
    private var _viewBinding: CreateEventActivityBinding? = null
    protected val viewBinding: CreateEventActivityBinding get() = checkNotNull(_viewBinding)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _viewBinding = CreateEventActivityBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
    }
}