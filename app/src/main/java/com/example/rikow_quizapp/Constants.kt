package com.example.rikow_quizapp

object Constants{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(1,
                "Co to za zwierze?",
                R.drawable.ic_delfin,
                "Słoń",
                "Delfin",
                "Orka",
                "Lew",
                2
        )
        questionList.add((que1))

        val que2 = Question(2,
                "Co to za zwierze?",
                R.drawable.ic_kon,
                "Koń",
                "Kot",
                "Krowa",
                "Lampart",
                1
        )
        questionList.add((que2))

        val que3 = Question(3,
                "Co to za zwierze?",
                R.drawable.ic_asd,
                "Jaszczurka",
                "Koza",
                "Krowa",
                "Kameleon",
                3
        )
        questionList.add((que3))

        val que4 = Question(4,
                "Co to za zwierze?",
                R.drawable.ic_lew,
                "Mrówka",
                "Motyl",
                "Gepard",
                "Lew",
                4
        )
        questionList.add((que4))

        val que5 = Question(5,
                "Co to za zwierze?",
                R.drawable.ic_orangutan,
                "Orangutan",
                "Goryl",
                "Surykatka",
                "Szympans",
                1
        )
        questionList.add((que5))

        val que6 = Question(6,
                "Co to za zwierze?",
                R.drawable.ic_slon,
                "Żyrafa",
                "Słoń",
                "Lis",
                "Skunks",
                2
        )
        questionList.add((que6))

        val que7 = Question(7,
                "Co to za zwierze?",
                R.drawable.ic_surykatka,
                "Szympans",
                "Antylopa",
                "Surykatka",
                "Zebra",
                3
        )
        questionList.add((que7))

        val que8 = Question(8,
                "Co to za zwierze?",
                R.drawable.ic_zebra,
                "Kruk",
                "Dzik",
                "Mysz",
                "Zebra",
                4
        )
        questionList.add((que8))

        val que9 = Question(9,
                "Co to za zwierze?",
                R.drawable.ic_zubr,
                "Żubr",
                "Świnia",
                "Wilk",
                "Pies",
                1
        )
        questionList.add((que9))

        val que10 = Question(10,
                "Co to za zwierze?",
                R.drawable.ic_zyrafa,
                "Królik",
                "Żyrafa",
                "Zając",
                "Sarna",
                2
        )
        questionList.add((que10))
        return questionList
    }
}