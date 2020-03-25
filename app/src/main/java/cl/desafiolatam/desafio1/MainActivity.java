package cl.desafiolatam.desafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView title;
    @BindView(R.id.imageViewCenter)
    ImageView center;
    @BindView(R.id.imageViewLeft)
    ImageView left;
    @BindView(R.id.imageViewResult)
    ImageView result;
    @BindView(R.id.imageViewRight)
    ImageView right;
    @BindView(R.id.imageViewReplay)
    ImageView replay;

    private static final Random rgenerador = new Random();
    private static final Integer[] imagenesID =
            {R.drawable.ic_boleto, R.drawable.ic_gift_beach, R.drawable.ic_gift_music, R.drawable.ic_gift_pizza, R.drawable.ic_telefono_inteligente, R.drawable.ic_viajes};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        /*List<Integer> iconoList= new ArrayList<>();
        iconoList.add(R.drawable.ic_telefono_inteligente);
        iconoList.add(R.drawable.ic_gift_beach);
        iconoList.add(R.drawable.ic_boleto);
        iconoList.add(R.drawable.ic_gift_music);
        iconoList.add(R.drawable.ic_gift_pizza);
        iconoList.add(R.drawable.ic_viajes);
        Collections.shuffle(iconoList);*/
        //center.setImageIcon(iconoList);



    }



    @OnClick({R.id.imageViewRight,R.id.imageViewCenter,R.id.imageViewLeft})



           public void showMessaje(View v) {
        switch (v.getId()) {
            case R.id.imageViewCenter:
                getCenter().setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this, "Ganaste Premio", Toast.LENGTH_SHORT).show();
                        Integer q = imagenesID[rgenerador.nextInt(imagenesID.length)];
                        final ImageView iv = (ImageView) findViewById(R.id.imageViewCenter);
                        int resource = imagenesID[rgenerador.nextInt(imagenesID.length)];
                        iv.setImageResource(resource);


                        getRight().setClickable(false);
                        getLeft().setClickable(false);
                        getCenter().setClickable(false);


                    }

                });
                break;

            case R.id.imageViewLeft:
                getLeft().setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer q = imagenesID[rgenerador.nextInt(imagenesID.length)];
                        final ImageView iv = (ImageView) findViewById(R.id.imageViewLeft);
                        Toast.makeText(MainActivity.this, "Ganaste Premio", Toast.LENGTH_SHORT).show();
                        int resource = imagenesID[rgenerador.nextInt(imagenesID.length)];
                        iv.setImageResource(resource);
                        getRight().setClickable(false);
                        getLeft().setClickable(false);
                        getCenter().setClickable(false);

                    }
                });
                break;

            case R.id.imageViewRight:
                getLeft().setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer q = imagenesID[rgenerador.nextInt(imagenesID.length)];
                        final ImageView iv = (ImageView) findViewById(R.id.imageViewRight);
                        Toast.makeText(MainActivity.this, "Ganaste Premio", Toast.LENGTH_SHORT).show();
                        int resource = imagenesID[rgenerador.nextInt(imagenesID.length)];
                        iv.setImageResource(resource);
                        getRight().setClickable(false);
                        getLeft().setClickable(false);
                        getCenter().setClickable(false);

                    }
                });
                break;
        }





    }


    public ImageView getRight() {
        return right;
    }

    public ImageView getCenter() {
        return center;
    }

    public ImageView getLeft(){
        return left;
    }


}
