package com.example.vyshalis.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;

import java.util.ArrayList;

class RecyclerView {


    public void setLayoutManager(Adapter.MainActivity.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;


        private class Adapter {

            public class MainActivity extends AppCompatActivity {
                RecyclerView recyclerView;
                Adapter adapter;
                LayoutManager layoutManager;
                String[] name;
                int[] Img_res = {R.drawable.chart
                        , R.drawable.fevicol
                        , R.drawable.glasspaint
                        , R.drawable.glitters
                        , R.drawable.bubbles
                        , R.drawable.acrylic
                        , R.drawable.brushes
                        , R.drawable.lace
                        , R.drawable.moulds
                        , R.drawable.oilpaint
                        , R.drawable.pallet
                        , R.drawable.pastels
                        , R.drawable.phpsheet
                        , R.drawable.ribbons
                        , R.drawable.stickpen
                        , R.drawable.threads
                        , R.drawable.waterpaint};
                ArrayList<Dataprovider> arrayList = new ArrayList<Dataprovider>();


                private class LayoutManager {

                    @Override
                    private class LinearLayoutManager extends LayoutManager {

                        private void onCreate(Bundle savedInstanceState) {
                            super.onCreate(savedInstanceState);

                            setContentView(R.layout.activity_main);

                            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

                            name = getResources().getStringArray(R.array.name);
                            int i = 0;
                            for (String name : name) {
                                Dataprovider dataprovider = new Dataprovider(Img_res[i], name);
                                arrayList.add(dataprovider);
                                i++;
                            }
                        }

                        public void setHasFixedSize(boolean hasFixedSize) {
                            this.hasFixedSize = hasFixedSize;


                            adapter = new RecyclerAdapter(arrayList);
                            recyclerView.setHasFixedSize(true);
                            layoutManager = new LinearLayoutManager(this);
                            recyclerView.setLayoutManager(layoutManager);
                            recyclerView.setAdapter(adapter);
                        }
                    }
                }

            }
        }
    }
}
