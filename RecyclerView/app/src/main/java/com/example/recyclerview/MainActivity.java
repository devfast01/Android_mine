package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Jeff Bezoss", "Jeff@gmail.com", "https://www.google.com/search?q=jeff+bezos&sxsrf=ALiCzsYPDdmIsGwPOad8ABSSG5sFPpHsdw:1657621082347&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiw-aPej_P4AhXiXfEDHdk0A9cQ_AUoAXoECAIQAw&biw=1066&bih=1003&dpr=0.9#imgrc=AdAXP5_YT1jHbM"));
        contacts.add(new Contact("Messi", "Messi@gmail.com", "https://www.google.com/search?q=messi&sxsrf=ALiCzsbYv7HzQqdXedYO7Qg4YpFB-a3Jog:1657621241968&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiJorKqkPP4AhXWXfEDHVqTB04Q_AUoAXoECAIQAw&biw=1066&bih=956&dpr=0.9#imgrc=JjSt4MJpxBWMqM"));
        contacts.add(new Contact("Neymar", "Neymar_jr@gmail.com", "https://www.google.com/search?q=neymar&sxsrf=ALiCzsZ9fZV64jGRl0-RQy8wFj0E7Buh9g:1657621361021&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiF7ZTjkPP4AhWEQfEDHTJYDy4Q_AUoAXoECAIQAw&biw=1066&bih=956&dpr=0.9#imgrc=SQUFh0K9kTqeBM"));
        contacts.add(new Contact("Jony", "Jony@gmail.com", "https://www.google.com/search?q=jony&sxsrf=ALiCzsYkCsi0MqgRrY4inT-WxuhW-0-h2A:1657621474927&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiWkb2ZkfP4AhVagosKHWO2BO0Q_AUoAnoECAIQBA&biw=1066&bih=956&dpr=0.9#imgrc=_uRdMtjw47KZlM"));
        contacts.add(new Contact("Rauf-Faik", "rauf-faik@gmail.com", "https://www.google.com/search?q=rauf+%26+faik&sxsrf=ALiCzsZgHyFY0BhLQqai09fdyivLQaV1LQ:1657621541702&source=lnms&tbm=isch&sa=X&ved=2ahUKEwinz6i5kfP4AhXmwosKHe98CqYQ_AUoAnoECAIQBA&biw=1066&bih=956&dpr=0.9#imgrc=eu_jtJhUKc0pwM"));
        contacts.add(new Contact("Maria_curie", "Maria_curie@gmail.com", "https://www.google.com/search?q=maria+curie&sxsrf=ALiCzsa-LOMu_tglOVAX_U8Vt_rta6oYCA:1657621659676&source=lnms&tbm=isch&sa=X&ved=2ahUKEwijsMnxkfP4AhXP6CoKHdBADHcQ_AUoAXoECAIQAw&biw=1066&bih=956&dpr=0.9#imgrc=DYMLKV-BioHSqM&imgdii=NAdgUQXkkRnBqM"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
        // uygtetmeli zatlary
        //android:layout_width="wrap_content, android:layout_height="match_parent", android:layout_centerHorizontal="true"
        //contactsRecView.setLayoutManager(new LinearLayoutManager(this));// dikligine 1 serir bolya

        //contactsRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // askdaky gornisde etjek bolsan contacts_list_item daki layout_with: warap_content etmeli
        contactsRecView.setLayoutManager(new GridLayoutManager(this,2));// RecycleView 2 setire bolinya

    }
}