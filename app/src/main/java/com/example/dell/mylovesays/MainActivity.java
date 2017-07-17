package com.example.dell.mylovesays;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int value;
    private   String[] AnsList  ={
            "i lvoe you",
            "i lvoe you",
            "i lvoe you",
            "i love you",
            "i love you",
            "i love you",
            "i love you",
            "i love you",
            "i love you",
            "i love you",
            "i Cant live without you",
            "No one will ever put us apart",
            "love between us is internal",
            "You are nothing but a coward",
            "Sorry baby your just wasting your time",
            "You don't even suite in my life",
            "I will always be your partner forever",
            "Your are my angel",
            "Honey you are my one and only",
            "I am in love with another person",
            "you don't deserve me",
            "Thank god for giving me someone like you",
            "You are nothing but garbage to me",
            "I will always be yours for infinity and beyond",
            "My love, you are nothing but a gold digger",
            "Every morning i woke up, i think about you",
            "I cant wait to hold you in my arms again",
            "I will marry you soon my love",
            "For the rest of my life, I will love always",
            "You just keep on lying to me",
            "Your a looser",
            "In love with me? you must be joking",
            "Stop dreaming darling, just move on with life",
            "I will die for you",
            "I love you very much",
            "We have to reveal our love",
            "Your are a prostitute",
            "You are my darling, kisses",
            "I love you as much as you do",
            "I want this to be over",
            "You are my star, my true love",
            "You are a fool",
            "You are just a user",
            "I like the way you look",
            "Love, i do care for you",
            "You don't care",
            "You are my 100%",
            "You are just a toy i play with everyday",
            "You are not the only person am in love with",
            "Iam so glad am yours",
            "The love of my life",
            "Your are my fiance",
            "Am always thinking about you",
            "I kissed another person",
            "You are the worst lover i have ever seen",
            "Iam Sorry my love, I don't love you",
            "for my love, honey you don't qualify",
            "together through this relationship until marriage",
            "I have no time for you",
            "Do not even think of me,just move on",
            "Love is not all about money",
            "You must be out of you mind, still thinking about me?",
            "Go to hell and maybe marry the devil",
            "Our time together is just never enough, i need you more",
            "You are the one i adore ",
            "I want to be close to you always",
            "Loving you was a mistake",
            "You better back off",
            "You are still inside my heart",
            "In my heart, there is always room for you",
            "To me you are just a piece of trash",
            "I am trying so hard to forget you",
            "I feel safe in your arms",
            "My love, i wis i loved you the way you do, but i don't",
            "Honey don't play with me",
            "My stepping stone to my future partner",
            "You make me vomit",
            "I am scared of you",
            "Your love is killing me",
            "You warm my heart and my soul my love",
            "you are too clingy",
            "loving you is the best thing that has ever happened to me",
            "You are my world, my everything",
            "don't you know you are life itself",
            "I was born to make you feel better",
            "being with you is same as being single",
            "Each Day i pray god keeps you safe my love",
            "Your the person i love and respect",
            "Honey You make my world go round",
            "My pumpkin, the one i care for",
            "Till death do us part",
            "In the who world, my eyes sees only you as my lover",
            "You were jus my last option",
            "I can go anytime, i want to ",
            "Your smile is the best thing i can see in this world",
            "loving you is boring"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value = 0;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //main page buttons
            case R.id.QuizButton:
                setContentView(R.layout.one);
                Toast.makeText(getApplicationContext(),  "Hi ...Please Answer These 10 Simple Questions", Toast.LENGTH_SHORT).show();
                break;

            // page one buttons
           case R.id.A:
               setContentView(R.layout.two);
               value = value + 1;
              break;
            case R.id.B:
                setContentView(R.layout.two);
                value = value + 2;
                break;
            case R.id.C:
                setContentView(R.layout.two);
                value = value + 3;
                break;
            case R.id.D:
                setContentView(R.layout.two);
                value = value + 4;
                break;
            case R.id.E:
                setContentView(R.layout.two);
                value = value + 5;
                break;
            case R.id.F:
                setContentView(R.layout.two);
                value = value + 6;
                break;
            case R.id.G:
                setContentView(R.layout.two);
                value = value + 7;
                break;
            case R.id.H:
                setContentView(R.layout.two);
                value = value + 8;
                break;
            case R.id.I:
                setContentView(R.layout.two);
                value = value + 9;
                break;
            case R.id.J:
                setContentView(R.layout.two);
                value = value + 10;
                break;
            case R.id.K:
                setContentView(R.layout.two);
                value = value + 11;
                break;
            case R.id.L:
                setContentView(R.layout.two);
                value = value + 12;
                break;
            case R.id.M:
                setContentView(R.layout.two);
                value = value + 13;
                break;
            case R.id.N:
                setContentView(R.layout.two);
                value = value + 14;
                break;
            case R.id.O:
                setContentView(R.layout.two);
                value = value + 15;
                break;
            case R.id.P:
                setContentView(R.layout.two);
                value = value + 16;
                break;
            case R.id.Q:
                setContentView(R.layout.two);
                value = value + 17;
                break;
            case R.id.R:
                setContentView(R.layout.two);
                value = value + 18;
                break;
            case R.id.S:
                setContentView(R.layout.two);
                value = value + 19;
                break;
            case R.id.T:
                setContentView(R.layout.two);
                value = value + 20;
                break;
            case R.id.U:
                setContentView(R.layout.two);
                value = value + 21;
                break;
            case R.id.V:
                setContentView(R.layout.two);
                value = value + 22;
                break;
            case R.id.W:
                setContentView(R.layout.two);
                value = value + 23;
                break;
            case R.id.X:
                setContentView(R.layout.two);
                value = value + 24;
                break;
            case R.id.Y:
                setContentView(R.layout.two);
                value = value + 25;
                break;
            case R.id.Z:
                setContentView(R.layout.two);
                value = value + 26;
                break;

            //page two buttons
            case R.id.button:
                setContentView(R.layout.three);
                value = value + 1;
                break;
            case R.id.button2:
                setContentView(R.layout.three);
                value = value + 2;
                break;
            case R.id.button3:
                setContentView(R.layout.three);
                value = value + 3;
                break;
            case R.id.button4:
                setContentView(R.layout.three);
                value = value + 4;
                break;
            case R.id.button5:
                setContentView(R.layout.three);
                value = value + 5;
                break;
            case R.id.button6:
                setContentView(R.layout.three);
                value = value + 6;
                break;

            //page 3 buttons

            case R.id.button31:
                setContentView(R.layout.four);
                value = value + 1;
                break;
            case R.id.button32:
                setContentView(R.layout.four);
                value = value + 2;
                break;
            case R.id.button33:
                setContentView(R.layout.four);
                value = value + 3;
                break;
            case R.id.button34:
                setContentView(R.layout.four);
                value = value + 4;
                break;
            case R.id.button35:
                setContentView(R.layout.four);
                value = value + 5;
                break;

            //page 4 buttons
            case R.id.button41:
                setContentView(R.layout.five);
                value = value + 1;
                break;
            case R.id.button42:
                setContentView(R.layout.five);
                value = value + 2;
                break;
            case R.id.button43:
                setContentView(R.layout.five);
                value = value + 3;
                break;
            case R.id.button44:
                setContentView(R.layout.five);
                value = value + 4;
                break;
            case R.id.button45:
                setContentView(R.layout.five);
                value = value + 5;
                break;

            //page 5 buttons
            case R.id.button51:
                setContentView(R.layout.six);
                value = value + 1;
                break;
            case R.id.button52:
                setContentView(R.layout.six);
                value = value + 2;
                break;
            case R.id.button53:
                setContentView(R.layout.six);
                value = value + 3;
                break;
            case R.id.button54:
                setContentView(R.layout.six);
                value = value + 4;
                break;
            case R.id.button55:
                setContentView(R.layout.six);
                value = value + 5;
                break;

            //page 6 buttons
            case R.id.button61:
                setContentView(R.layout.seven);
                value = value + 1;
                break;
            case R.id.button62:
                setContentView(R.layout.seven);
                value = value + 2;
                break;
            case R.id.button63:
                setContentView(R.layout.seven);
                value = value + 3;
                break;
            case R.id.button64:
                setContentView(R.layout.seven);
                value = value + 4;
                break;
            case R.id.button65:
                setContentView(R.layout.seven);
                value = value + 5;

                break;
            //page 7 buttons
            case R.id.button71:
                setContentView(R.layout.eight);
                value = value + 1;
                break;
            case R.id.button72:
                setContentView(R.layout.eight);
                value = value + 2;
                break;
            case R.id.button73:
                setContentView(R.layout.eight);
                value = value + 3;
                break;
            case R.id.button74:
                setContentView(R.layout.eight);
                value = value + 4;
                break;
            case R.id.button75:
                setContentView(R.layout.eight);
                value = value + 5;
                break;

            //page 8 buttons
            case R.id.button81:
                setContentView(R.layout.nine);
                value = value + 1;
                break;
            case R.id.button82:
                setContentView(R.layout.nine);
                value = value + 2;
                break;
            case R.id.button83:
                setContentView(R.layout.nine);
                value = value + 3;
                break;
            case R.id.button84:
                setContentView(R.layout.nine);
                value = value + 4;
                break;
            case R.id.button85:
                setContentView(R.layout.nine);
                value = value + 5;
                break;

            //page 9 buttons
            case R.id.A1:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 1;
                break;
            case R.id.B2:
                setContentView(R.layout.ten);
                value = value + 2;
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                break;
            case R.id.C3:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 3;
                break;
            case R.id.D4:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 4;
                break;
            case R.id.E5:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 5;
                break;
            case R.id.F6:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 6;
                break;
            case R.id.G7:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 7;
                break;
            case R.id.H8:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 8;
                break;
            case R.id.I9:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 9;
                break;
            case R.id.J10:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 10;
                break;
            case R.id.K11:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 11;
                break;
            case R.id.L12:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 12;
                break;
            case R.id.M13:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 13;
                break;
            case R.id.N14:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 14;
                break;
            case R.id.O15:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 15;
                break;
            case R.id.P16:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 16;
                break;
            case R.id.Q17:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 17;
                break;
            case R.id.R18:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 18;
                break;
            case R.id.S19:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 19;
                break;
            case R.id.T20:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 20;
                break;
            case R.id.U21:
                setContentView(R.layout.ten);
                Toast.makeText(getApplicationContext(),  "Oky, Final Question Now", Toast.LENGTH_SHORT).show();
                value = value + 21;
                break;

            //page 10 buttons
            case R.id.button101:
                setContentView(R.layout.answear);
                Toast.makeText(getApplicationContext(), "Well Done..View Answer Now", Toast.LENGTH_SHORT).show();
                value = value + 1;
                break;
            case R.id.button102:
                setContentView(R.layout.answear);
                Toast.makeText(getApplicationContext(),  "Well Done..View Answer Now", Toast.LENGTH_SHORT).show();
                value = value + 2;
                break;
            case R.id.button103:
                setContentView(R.layout.answear);
                Toast.makeText(getApplicationContext(),  "Well Done..View Answer Now", Toast.LENGTH_SHORT).show();
                value = value + 3;
                break;
            case R.id.button104:
                setContentView(R.layout.answear);
                Toast.makeText(getApplicationContext(),  "Well Done..View Answer Now", Toast.LENGTH_SHORT).show();
                value = value + 4;
                break;
            case R.id.button105:
                setContentView(R.layout.answear);
                Toast.makeText(getApplicationContext(),  "Well Done..View Answer Now", Toast.LENGTH_SHORT).show();
                value = value + 5;
                break;

            //page ans buttons
            case R.id.ansButton:
                setContentView(R.layout.answear);


                String loveSays =  AnsList[value];

                //DISPLAYING THE ANS
                Toast.makeText(getApplicationContext(), "Wow!", Toast.LENGTH_SHORT).show();
                final AlertDialog.Builder viewDetail = new AlertDialog.Builder(MainActivity.this);
                viewDetail.setIcon(android.R.drawable.sym_action_chat);
              //  viewDetail.setIcon(android.R.drawable.sym_action_chat);
                viewDetail.setTitle("Your Lover Says");
                viewDetail.setMessage(" ' " + loveSays + " '");
                Toast.makeText(getApplicationContext(), "Wow!", Toast.LENGTH_SHORT).show();
                viewDetail.setNeutralButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                // TODO Auto-generated method stub
                                dialog.dismiss();
                            }
                        });


                viewDetail.show();
                break;



            case R.id.homeButton:
                setContentView(R.layout.activity_main);
                break;
            case R.id.aboutB:
                setContentView(R.layout.about);
                break;
            case R.id.again:
                setContentView(R.layout.one);
                break;

            //page about buttons
            case R.id.abouthome:
                setContentView(R.layout.activity_main);
                break;
        }
    }
}
