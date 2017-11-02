package com.example.jurgen.quiz;

public class QuizBook
{
    public static String[] questions = new String []
            {
                    "Kas Moldova on Euroopa liidus?",
                    "Kas Stockholm on Norra linn?",
                    "Kas Steve Jobs oli varas?",
                    "Kas Android studiot on võimalik kutsuda tarkvaraks?",
                    "Kas Karu on Venemaa rahvusloom?",
                    "Kas Mongoolial on merevägi?",
                    "Kas ASCII on eestlaste suurim takistus?",
                    "Kas Indoneesias on olemas seadused alaealiste suitsetamise vastu?",
                    "Tartu numero uno?",
                    "ENSV lahendas kõiki maailmas olevaid hädasi?"
            };


            public static int[] images = new int[]
                    {
                        R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6,
                            R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10
                    };


            public static boolean[] answers = new boolean[]
                    {
                            false, false, true, false, true, true, true, false, true, true
                    };
}
