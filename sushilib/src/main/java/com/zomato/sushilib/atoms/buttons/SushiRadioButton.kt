package com.zomato.sushilib.atoms.buttons

import android.content.Context
import android.support.annotation.ColorInt
import android.support.v7.widget.AppCompatRadioButton
import android.util.AttributeSet
import com.zomato.sushilib.R
import com.zomato.sushilib.utils.widgets.CompoundButtonHelper

open class SushiRadioButton @JvmOverloads constructor(
    ctx: Context, attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.radioButtonStyle
) : AppCompatRadioButton(ctx, attrs, defStyleAttr) {

    private val compoundButtonHelper = CompoundButtonHelper(this)

    init {
        compoundButtonHelper.init(attrs)
    }

    fun setRadioButtonColor(@ColorInt color: Int) {
        compoundButtonHelper.setControlColor(color)
    }
}