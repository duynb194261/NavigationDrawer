package com.example.navigationdrawer.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.databinding.FragmentHomeBinding;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    private Button but1, but2, but3, but4, but5, but6, but7, but8, but9, but0;
    private Button butsum, butsub, butmul, butdiv;
    private Button butC, butCE, butResult;
    private TextView Resultview, Inputview;
    private String input, symbol;
    private ImageButton butdel;
    boolean checkequal=false;
    double num1, num2, answer;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Resultview = binding.textResult;
        Inputview = binding.textOperation;
        butCE = binding.buttCE;
        butC = binding.buttC;
        butdiv = binding.buttDivide;
        but7 = binding.butt7;
        but8 = binding.butt8;
        but9 = binding.butt9;
        butmul = binding.buttMultiply;
        but4 = binding.butt4;
        but5 = binding.butt5;
        but6 = binding.butt6;
        butsum = binding.buttAdd;
        but1 = binding.butt1;
        but2 = binding.butt2;
        but3 = binding.butt3;
        butsub = binding.buttSub;
        but0 = binding.butt0;
        butResult = binding.buttResult;
        butdel= binding.buttDel;

        butC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Inputview.setText("");
                Resultview.setText("");
                input="";
                symbol="";
                checkequal=false;

            }
        });

        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"0");
                }
            }
        });

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"1");
                }
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"2");
                }
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"3");
                }
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"4");
                }
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"5");
                }
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"6");
                }
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"7");
                }
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"8");
                }
            }
        });

        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    input= Resultview.getText().toString();
                    Resultview.setText(input+"9");
                }
            }
        });



        butsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(checkequal||symbol!=""){
                        solve();
                        symbol="+";
                        Inputview.setText(answer+"+");
                        num1= answer;
                        checkequal=false;
                    }
                    else if(Resultview.getText()==""){
                        Inputview.setText("");
                    }
                    else{
                        num1= Double.parseDouble(Resultview.getText()+"");
                        Inputview.setText(Resultview.getText().toString()+"+");
                        Resultview.setText("");
                        input="";
                        symbol="+";
                        checkequal=false;
                    }
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        butsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(checkequal||symbol!=""){
                        solve();
                        symbol="-";
                        Inputview.setText(answer+"-");
                        num1= answer;
                        checkequal=false;
                    }
                    else if(Resultview.getText()==""){
                        Inputview.setText("");

                    }
                    else{
                        num1= Double.parseDouble(Resultview.getText()+"");
                        Inputview.setText(Resultview.getText().toString()+"-");
                        Resultview.setText("");
                        input="";
                        symbol="-";
                        checkequal=false;
                    }
                }catch (Exception ex){

                }
            }
        });

        butmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(checkequal||symbol!=""){
                        solve();
                        symbol="×";
                        Inputview.setText(answer+"×");
                        num1= answer;
                        checkequal=false;
                    }
                    else if(Resultview.getText()==""){
                        Inputview.setText("");
                    }
                    else{
                        num1= Double.parseDouble(Resultview.getText()+"");
                        Inputview.setText(Resultview.getText().toString()+"×");
                        Resultview.setText("");
                        input="";
                        symbol="×";
                        checkequal=false;
                    }
                }catch (Exception ex){

                }
            }
        });

        butdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(checkequal||symbol!=""){
                        solve();
                        symbol="×";
                        Inputview.setText(answer+"×");
                        num1= answer;
                        checkequal=false;
                    }
                    else if(Resultview.getText()==""){
                        Inputview.setText("");
                    }
                    else{
                        num1= Double.parseDouble(Resultview.getText()+"");
                        Inputview.setText(Resultview.getText().toString()+"÷");
                        Resultview.setText("");
                        input="";
                        symbol="÷";
                        checkequal=false;
                    }
                }catch (Exception ex){

                }
            }
        });

        butResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkequal){
                    try{
                        input=Resultview.getText().toString();
                        num2= Double.parseDouble(Resultview.getText()+"");
                        Inputview.setText(Inputview.getText().toString()+Resultview.getText().toString()+"");
                        Resultview.setText("");
                        if(symbol=="+")
                            answer=num1+num2;
                        else if(symbol=="-")
                            answer=num1-num2;
                        else if(symbol=="×")
                            answer=num1*num2;
                        else if(symbol=="÷")
                            answer=num1/num2;
                        checkequal=true;
                        Resultview.setText(answer+"");

                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                }
                symbol="";
            }
        });

        butCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultview .setText("");
            }
        });

        butdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input=Resultview.getText().toString();
                if(input.length()>0){
                    String newtext= input.substring(0, input.length()-1);
                    input = newtext;
                }
                Resultview.setText(input+"");
            }
        });
        return root;
    }

    public void solve(){
        input=Resultview.getText().toString();
        num2= Double.parseDouble(Resultview.getText()+"");
        Resultview.setText("");
        if(symbol=="+")
            answer=num1+num2;
        else if(symbol=="-")
            answer=num1-num2;
        else if(symbol=="×")
            answer=num1*num2;
        else if(symbol=="÷")
            answer=num1/num2;
    }


    public void butdelclick(View view){
        input=Resultview.getText().toString();
        if(input.length()>0){
            String newtext= input.substring(0, input.length()-1);
            input = newtext;
        }
        Resultview.setText(input+"");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}