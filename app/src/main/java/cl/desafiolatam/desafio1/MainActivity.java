package cl.desafiolatam.desafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //List<ImageView> lista = Arrays.asList(imagenIzq, imagenCen, imagenDer);

    }


    @OnClick({R.id.imageViewRight,R.id.imageViewCenter,R.id.imageViewLeft})
    public void showMessaje() {
        Toast.makeText(this, "Hola!", Toast.LENGTH_SHORT).show();
        List<ImageView> iconoList= new ArrayList<>();
        iconoList.add(R.drawable.ic_telefono_inteligente);
        iconoList.add(R.drawable.ic_gift_beach);
        iconoList.add(R.drawable.ic_boleto);
        iconoList.add(R.drawable.ic_gift_music);
        iconoList.add(R.drawable.ic_gift_pizza);
        iconoList.add(R.drawable.ic_viajes);
        Collections.shuffle(iconoList);
        center.setImageIcon(iconoList);
    }


}
