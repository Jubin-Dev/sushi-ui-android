package com.zomato.sushilib.atoms.textviews

import android.content.Context
import android.support.annotation.AttrRes
import android.support.annotation.StyleRes
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet
import com.zomato.sushilib.R
import com.zomato.sushilib.utils.theme.ResourceThemeResolver.getThemeWrappedContext

open class SushiIconTextView @JvmOverloads constructor(
    ctx: Context, attrs: AttributeSet? = null,
    @AttrRes defStyleAttr: Int = R.attr.sushiIconAppearance, @StyleRes defStyleRes: Int = 0
) : AppCompatTextView(
    getThemeWrappedContext(ctx, defStyleRes),
    attrs, defStyleAttr
)