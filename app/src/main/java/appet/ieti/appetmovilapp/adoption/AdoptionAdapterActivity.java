package appet.ieti.appetmovilapp.adoption;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import appet.ieti.appetmovilapp.R;

public class AdoptionAdapterActivity extends RecyclerView.Adapter<AdoptionAdapterActivity.MyViewHolder> {

    private int[] arr;

    public AdoptionAdapterActivity(int[] arr) {
        this.arr = arr;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_show_adoption,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imagePet.setImageResource(arr[position]);
        holder.textPet.setText("Pet" + position );
    }

    @Override
    public int getItemCount() {
        return arr.length;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }



    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imagePet;
        TextView textPet;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imagePet=itemView.findViewById(R.id.imagePet);
            textPet=itemView.findViewById(R.id.textPet);
        }
    }
}
