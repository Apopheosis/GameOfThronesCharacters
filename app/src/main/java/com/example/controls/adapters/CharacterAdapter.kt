package com.example.retrofit.adapters

import com.example.retrofit.models.Character
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.controls.R
import java.io.StringReader

class CharacterAdapter(private val baseContext: Context, private val list: MutableList<Character>)
    : RecyclerView.Adapter<CharacterAdapter.CharacterHolder>()
{
    class CharacterHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
    {
        val name : TextView = itemView.findViewById(R.id.name);
        val culture : TextView = itemView.findViewById(R.id.culture);
        val born : TextView = itemView.findViewById(R.id.born);
        val titles : TextView = itemView.findViewById(R.id.titles);
        val aliases : TextView = itemView.findViewById(R.id.aliases);
        val playedBy : TextView = itemView.findViewById(R.id.playedBy);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterHolder {
        val itemView : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item,parent,false);
        return CharacterHolder(itemView);
    }

    override fun onBindViewHolder(holder: CharacterHolder, position: Int) {


        fun listToString(list: List<String>) : String
        {
            var str = ""
            for (element in list)
            {
                str+="$element\n";
            }
            return str;
        }

        val titlesString : String = listToString(list[position].titles);
        val aliasesString : String = listToString(list[position].aliases)
        val playedByString : String = listToString(list[position].playedBy)

        holder.name.text = list[position].name
        holder.culture.text = list[position].culture
        holder.born.text = list[position].born
        holder.titles.text = titlesString
        holder.aliases.text = aliasesString
        holder.playedBy.text = playedByString

        println(list[position].name)




    }

    override fun getItemCount(): Int {
        return list.size;
    }
}