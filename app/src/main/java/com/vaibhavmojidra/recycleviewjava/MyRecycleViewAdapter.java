package com.vaibhavmojidra.recycleviewjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecycleViewAdapter.MyViewHolder> {
    private final List<Student> studentList;
    private Context context;

    public MyRecycleViewAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View myView= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        context=parent.getContext();
        return new MyViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyRecycleViewAdapter.MyViewHolder holder, int position) {
            holder.bind(studentList.get(position));
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    class MyViewHolder extends  RecyclerView.ViewHolder{
        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
        }
        private void bind(Student student){
            TextView name =itemView.findViewById(R.id.name_text_view);
            name.setText((student.getName()));
            itemView.setOnClickListener(v -> Toast.makeText(context,"Roll No "+student.getRollNo(), Toast.LENGTH_LONG).show());
        }
    }
}
