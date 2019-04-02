package com.zomato.sushilib.molecules.listings

import android.support.annotation.LayoutRes
import android.util.AttributeSet
import android.view.ViewGroup
import com.zomato.sushilib.R
import com.zomato.sushilib.atoms.textviews.SushiTextView
import com.zomato.sushilib.utils.inflate

open class DualTextImpl(
    parent: ViewGroup,
    @LayoutRes layoutId: Int,
    attributeSet: AttributeSet?,
    defStyleAttr: Int,
    defStyleRes: Int
) {
    private val title: SushiTextView?
    private val subtitle: SushiTextView?

    init {
        val v = parent.inflate(layoutId, true)
        title = v.findViewById(R.id.title)
        subtitle = v.findViewById(R.id.subtitle)
        parent.context?.theme?.obtainStyledAttributes(
            attributeSet,
            R.styleable.SushiListing,
            defStyleAttr,
            defStyleRes
        )?.apply {
            title.text = getString(R.styleable.SushiListing_title)
            subtitle.text = getString(R.styleable.SushiListing_subtitle)
            recycle()
        }
    }
}