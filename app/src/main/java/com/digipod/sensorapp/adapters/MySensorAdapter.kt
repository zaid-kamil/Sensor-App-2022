package com.digipod.sensorapp.adapters

import android.content.Context
import android.hardware.Sensor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digipod.sensorapp.R

class MySensorAdapter(
    private val context: Context,
    private val layout: Int,
    private val sensors: List<Sensor>
) : RecyclerView.Adapter<MySensorAdapter.Holder>() {
    class Holder(v: View) : RecyclerView.ViewHolder(v) {
        val title: TextView = v.findViewById(R.id.title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(layout, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val sensor = sensors[position]
        holder.title.text = sensor.name

    }

    override fun getItemCount() = sensors.size
}