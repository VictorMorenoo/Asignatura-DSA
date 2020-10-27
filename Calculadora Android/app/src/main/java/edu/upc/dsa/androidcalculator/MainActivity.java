package edu.upc.dsa.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    private Button B_0_Main,B_1_Main,B_2_Main, B_3_Main,B_4_Main,B_5_Main,B_6_Main,B_7_Main,B_8_Main,B_9_Main,
            B_COMA_Main,B_SUMA_Main,B_IGUAL_Main,B_REST_Main,B_MULT_Main,B_DIV_Main,B_SEN_Main,B_COS_Main,
            B_TAN_Main,B_BorrarTodo_Main,B_BorrarUlt_Main,B_OFF_Main;

    private TextView TV_DIS_OP_Main, TV_DISP_RE_Main;
    private StringBuffer sbMainUnir = new StringBuffer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Para girar pantalla

        B_0_Main = (Button)findViewById(R.id.B_0);
        B_1_Main = (Button)findViewById(R.id.B_1);
        B_2_Main = (Button)findViewById(R.id.B_2);
        B_3_Main = (Button)findViewById(R.id.B_3);
        B_4_Main = (Button)findViewById(R.id.B_4);
        B_5_Main = (Button)findViewById(R.id.B_5);
        B_6_Main = (Button)findViewById(R.id.B_6);
        B_7_Main = (Button)findViewById(R.id.B_7);
        B_8_Main = (Button)findViewById(R.id.B_8);
        B_9_Main = (Button)findViewById(R.id.B_9);
        B_COMA_Main = (Button)findViewById(R.id.B_COMA);
        B_SUMA_Main = (Button)findViewById(R.id.B_SUMA);
        B_IGUAL_Main = (Button)findViewById(R.id.B_IGUAL);
        B_REST_Main = (Button)findViewById(R.id.B_REST);
        B_MULT_Main = (Button)findViewById(R.id.B_MULT);
        B_DIV_Main = (Button)findViewById(R.id.B_DIV);
        B_SEN_Main = (Button)findViewById(R.id.B_SEN);
        B_COS_Main = (Button)findViewById(R.id.B_COS);
        B_TAN_Main = (Button)findViewById(R.id.B_TAN);
        B_BorrarTodo_Main = (Button)findViewById(R.id.B_BorrarTodo);
        B_BorrarUlt_Main = (Button)findViewById(R.id.B_BorrarUlt);
        B_OFF_Main = (Button)findViewById(R.id.B_OFF);
        TV_DIS_OP_Main = (TextView)findViewById(R.id.TV_DIS_OP);
        TV_DISP_RE_Main = (TextView)findViewById(R.id.TV_DIS_RE);

        B_COMA_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append(",");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_0_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("0");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_1_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("1");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_2_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("2");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_3_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("3");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_4_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("4");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_5_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("5");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_6_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("6");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_7_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("7");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_8_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("8");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_9_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("9");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_SUMA_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("+");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_MULT_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("x");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_DIV_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("/");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_REST_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("-");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_SEN_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("SIN (");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_COS_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("COS (");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_TAN_Main.setOnClickListener((v) ->
        {
            sbMainUnir.append("TAN (");
            TV_DISP_RE_Main.setText(sbMainUnir.toString());
        });

        B_BorrarUlt_Main.setOnClickListener((v) ->
        {
            if(!sbMainUnir.toString().equals(""))
            {
                sbMainUnir.delete(sbMainUnir.length()-1,sbMainUnir.length());
                TV_DISP_RE_Main.setText(sbMainUnir.toString());
            }
        });

       B_BorrarTodo_Main.setOnClickListener((v) ->
        {
            if(!sbMainUnir.toString().equals(""))
            {
                sbMainUnir = new StringBuffer();
                TV_DISP_RE_Main.setText("");
                TV_DIS_OP_Main.setText("");
            }
        });

        B_OFF_Main.setOnClickListener((v) ->
        {
            finish();
        });

        B_IGUAL_Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (!sbMainUnir.toString().equals(""))
                {
                    String Operacion = sbMainUnir.toString();
                    double Num, Resultado = 0;
                    ArrayList<Double> Numeros = new ArrayList<>();
                    StringBuffer sb = new StringBuffer();

                    for (int i = 0; i<Operacion.length(); i++)
                    {
                        char cifra = Operacion.charAt(i);

                        if (Character.isDigit(cifra) || cifra == ',')
                        {
                            sb.append(cifra);
                        }

                        else
                        {
                            String Compuestos = sb.toString();
                            Num = Double.parseDouble(Compuestos);
                            Numeros.add(Num);
                            sb = new StringBuffer();
                        }
                    }
                    Numeros.add(Double.parseDouble(sb.toString()));

                    for (int i = 0; i < Operacion.length(); i++)
                    {
                        char cifra = Operacion.charAt(i);

                        switch (cifra)
                        {
                            case '+':
                                Resultado = Sumar(Numeros);
                                break;
                            case '-':
                                Resultado = Restar(Numeros);
                                break;
                            case 'x':
                                Resultado = Multiplicar(Numeros);
                                break;
                            case '/':
                                Resultado = Dividir(Numeros);
                                break;
                        }
                    }
                    TV_DIS_OP_Main.setText(Operacion);
                    sbMainUnir = new StringBuffer();
                    String Cuenta = Double.toString(Resultado);

                    TV_DISP_RE_Main.setText(Cuenta);
                    Numeros.clear();
                }
            }
        });
    }

    public double Sumar (ArrayList<Double> Lista)
    {
        double Resultado = 0.0;
        Iterator it = Lista.iterator();
        double Num;

        while (it.hasNext())
        {
            Num = (double) it.next();
            Resultado = Resultado + Num;
        }
        return Resultado;
    }

    public double Restar (ArrayList<Double> Lista)
    {
        double Resultado = 0,aux;
        double Num;
        Resultado = Lista.get(0)-Lista.get(1);
        return Resultado;
    }

    public double Multiplicar (ArrayList<Double> Lista)
    {
        double Resultado = 1;
        double Num;
        for (int i = 0; i<Lista.size(); i++)
        {
            Resultado = Resultado * Lista.get(i);
        }
        return Resultado;
    }

    public double Dividir (ArrayList<Double> Lista)
    {
        double Resultado;
        Resultado = Lista.get(0)/Lista.get(1);
        return Resultado;
    }


/*
    public void Cero(View view) {                                                  // findview guarda el valor que devuelve la funcionn en una variable
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP); // Variable para la parte donde se mostrará el texto de operaciones
        TV_DIS_OP.setText(TV_DIS_OP.getText() + "0");
    }

    public void Uno(View view) {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        TV_DIS_OP.setText(TV_DIS_OP.getText() + "1");
    }

    public void Dos(View view) {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        TV_DIS_OP.setText(TV_DIS_OP.getText() + "2");
    }

    public void Tres(View view) {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        TV_DIS_OP.setText(TV_DIS_OP.getText() + "3");
    }

    public void Cuatro(View view) {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        TV_DIS_OP.setText(TV_DIS_OP.getText() + "4");
    }

    public void Cinco(View view) {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        TV_DIS_OP.setText(TV_DIS_OP.getText() + "5");
    }

    public void Seis(View view) {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        TV_DIS_OP.setText(TV_DIS_OP.getText() + "6");
    }

    public void Siete(View view) {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        TV_DIS_OP.setText(TV_DIS_OP.getText() + "7");
    }

    public void Ocho(View view) {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        TV_DIS_OP.setText(TV_DIS_OP.getText() + "8");
    }

    public void Nueve(View view) {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        TV_DIS_OP.setText(TV_DIS_OP.getText() + "9");
    }

    public void COMA(View view) {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        TV_DIS_OP.setText(TV_DIS_OP.getText() + ",");
    }
/*
    public void OnClickValor1(View view)
    {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP); //Guarda el valor que va a devolver la funcion
        Valor1 = Double.parseDouble(TV_DIS_OP.getText().toString());
        TV_DIS_OP.setText("");
    }

    public void Suma (View view) {
        Operador = "+";
        OnClickValor1(view);
    }

    public void Resta (View view) {
        Operador = "-";
        OnClickValor1(view);
    }

    public void Multiplicacion (View view) {
        Operador = "*";
        OnClickValor1(view);
    }

    public void Division (View view) {
        Operador = "/";
        OnClickValor1(view);
    }

    public void IGUALACION(View view)
    {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        Valor2 = Double.parseDouble(TV_DIS_OP.getText().toString());

        try
        {
            if (Operador.equals("+"))
            {
                Resultado = Valor1 + Valor2;
            } else if (Operador.equals("-")) {
                Resultado = Valor1 - Valor2;
            } else if (Operador.equals("*")) {
                Resultado = Valor1 * Valor2;
            } else if (Operador.equals("/")) {
                Resultado = Valor1 / Valor2;
            }
        }
        catch (NumberFormatException nfe) {
            TV_DIS_OP.setText("Intentelo de nuevo");}

        TV_DIS_OP.setText(" " + Resultado);
    }


    public void Sin (View view) {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        try {
            Valor1 = Double.parseDouble(TV_DIS_OP.getText().toString());
            double RD = Math.toRadians(Valor1);
            Resultados = Math.sin(RD);
            TV_DIS_OP.setText(String.valueOf(Resultados));
        } catch (NumberFormatException nfe) {}
    }

    public void Cos (View view) {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        try {
            Valor1 = Double.parseDouble(TV_DIS_OP.getText().toString());
            double RD = Math.toRadians(Valor1);
            Resultados = Math.cos(RD);
            TV_DIS_OP.setText(String.valueOf(Resultados));
        } catch (NumberFormatException nfe) {}
    }

    public void Tan(View view) {
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        try {
            Valor1 = Double.parseDouble(TV_DIS_OP.getText().toString());
            double RD = Math.toRadians(Valor1);
            Resultados = Math.tan(RD);
            TV_DIS_OP.setText(String.valueOf(Resultados));
        } catch (NumberFormatException nfe) {}
    }
/*
    public void BorrarUltimo (View view)
    {
        if (TV_DIS_OP.getText().toString().equals(" "))
        {
            TV_DIS_OP.setText(TV_DIS_OP.getText().subSequence(0, TV_DIS_OP.getText().length()-1) + "");
        }
    }

    public void BorrarTodo (View view)
    {
        Valor1 = 0.0;
        Valor2 = 0.0;
        TV_DIS_OP = (TextView) findViewById(R.id.TV_DIS_OP);
        TV_DIS_OP.setText(" ");
    }

    public void Apagar (View view)
    {
        finish();
    } */
}