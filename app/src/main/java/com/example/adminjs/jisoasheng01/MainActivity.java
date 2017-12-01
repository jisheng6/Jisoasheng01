package com.example.adminjs.jisoasheng01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

   Button add,delete,select;
   TextView tv;
    private List<NewslistBean> newslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.add);
        delete = findViewById(R.id.delete);
        select = findViewById(R.id.select);
        tv = findViewById(R.id.tv);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.tianapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Service service = retrofit.create(Service.class);
        service.getNewsBean().enqueue(new Callback<Bean>() {
            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {
                newslist  = response.body().getNewslist();
                System.out.println("");
            }

            @Override
            public void onFailure(Call<Bean> call, Throwable t) {

            }
        });
    add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            NewslistBean newslistBean = new NewslistBean("111", "111", "111", "111", "111");
            Iappliction.session.getNewslistBeanDao().insert(newslistBean);

        }
    });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Iappliction.session.getNewslistBeanDao().deleteAll();
            }
        });
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<NewslistBean> been = Iappliction.session.getNewslistBeanDao().loadAll();
                tv.setText(""+been.toString());
            }
        });
    }



}
