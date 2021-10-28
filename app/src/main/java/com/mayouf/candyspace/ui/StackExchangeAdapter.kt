package com.mayouf.candyspace.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mayouf.candyspace.R
import com.mayouf.presentation.model.UiItems
import com.mitteloupe.solid.recyclerview.InflatedViewProvider
import com.mitteloupe.solid.recyclerview.SimpleViewBinder
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_launch.view.*
import timber.log.Timber

class LaunchViewProvider(
    layoutInflater: LayoutInflater
) : InflatedViewProvider(layoutInflater, R.layout.item_launch)

class UsersViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
    LayoutContainer {
    val userName: TextView = containerView.userName
}

class LaunchViewBinder(
    private val context: Context,
) : SimpleViewBinder<UsersViewHolder, UiItems>() {
    override fun bindView(viewHolder: UsersViewHolder, data: UiItems) {
        Timber.d("Binding items %s", data.userId)
        viewHolder.userName.text = data.displayName
    }
}