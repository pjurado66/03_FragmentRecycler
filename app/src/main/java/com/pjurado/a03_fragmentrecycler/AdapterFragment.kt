import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.pjurado.a03_fragmentrecycler.databinding.ItemBinding

class AdapterFragment(val datos: ArrayList<String>): RecyclerView.Adapter<AdapterFragment.ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder( holder: ItemViewHolder, position: Int) {
        holder.binding.tvNombre.text = datos[position]
    }

    override fun getItemCount(): Int {
        return datos.size
    }

    class ItemViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}