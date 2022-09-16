package com.example.productapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Product> productList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDataProduct();
        ProductAdapter adapter = new ProductAdapter(this, productList);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 5);
        RecyclerView rvProduct = findViewById(R.id.rvProduct);
        rvProduct.setLayoutManager(layoutManager);
        rvProduct.setAdapter(adapter);
    }

    private void initDataProduct() {
        productList.add(new Product("Iphone 14 Pro Max", "iPhone 14 Pro Max là mẫu flagship nổi bật nhất của Apple", 35990000, R.drawable.ip14));
        productList.add(new Product("Iphone 13 Pro Max", "iPhone 13 Pro Max là mẫu flagship nổi bật nhất của Apple", 28990000, R.drawable.ip13));
        productList.add(new Product("Samsung Galaxy Z Fold4 5G", "Samsung Galaxy Z Fold4 5G 256GB là chiếc điện thoại nối tiếp thế hệ Galaxy Z Fold3", 34090000, R.drawable.samsung_flip));
        productList.add(new Product("Samsung Galaxy S22 Ultra 5G", "Samsung Galaxy S là dòng flagship cao cấp đến từ ông trùm công nghệ Hàn Quốc", 26490000, R.drawable.samsung_s22));
        productList.add(new Product("Apple Watch Series 8 ", "Đồng hồ thông minh đến từ Apple", 17800000, R.drawable.apple_watch));

    }
}