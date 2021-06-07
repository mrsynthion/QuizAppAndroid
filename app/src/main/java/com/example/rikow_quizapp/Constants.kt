package com.example.rikow_quizapp

object Constants{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS:String = "corredt_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(1,
                "Co to za zwierze?",
                R.drawable.ic_delfin,
                "Koń",
                "Delfin",
                "Krowa",
                "Lew",
                2
        )
        questionList.add((que1))

        val que2 = Question(2,
                "Co to za zwierze?",
                R.drawable.ic_kon,
                "Koń",
                "Delfin",
                "Krowa",
                "Lew",
                1
        )
        questionList.add((que2))

        val que3 = Question(3,
                "Co to za zwierze?",
                R.drawable.ic_asd,
                "Koń",
                "Delfin",
                "Krowa",
                "Lew",
                3
        )
        questionList.add((que3))

        val que4 = Question(4,
                "Co to za zwierze?",
                R.drawable.ic_lew,
                "Koń",
                "Delfin",
                "Krowa",
                "Lew",
                4
        )
        questionList.add((que4))

        val que5 = Question(5,
                "Co to za zwierze?",
                R.drawable.ic_orangutan,
                "Orangutan",
                "Słoń",
                "Surykatka",
                "Zebra",
                1
        )
        questionList.add((que5))

        val que6 = Question(6,
                "Co to za zwierze?",
                R.drawable.ic_slon,
                "Orangutan",
                "Słoń",
                "Surykatka",
                "Zebra",
                2
        )
        questionList.add((que6))

        val que7 = Question(7,
                "Co to za zwierze?",
                R.drawable.ic_surykatka,
                "Orangutan",
                "Słoń",
                "Surykatka",
                "Zebra",
                3
        )
        questionList.add((que7))

        val que8 = Question(8,
                "Co to za zwierze?",
                R.drawable.ic_zebra,
                "Orangutan",
                "Słoń",
                "Surykatka",
                "Zebra",
                4
        )
        questionList.add((que8))

        val que9 = Question(9,
                "Co to za zwierze?",
                R.drawable.ic_zubr,
                "Żubr",
                "Żyrafa",
                "Surykatka",
                "Zebra",
                1
        )
        questionList.add((que9))

        val que10 = Question(10,
                "Co to za zwierze?",
                R.drawable.ic_zyrafa,
                "Żubr",
                "Żyrafa",
                "Surykatka",
                "Zebra",
                2
        )
        questionList.add((que10))
        return questionList
    }
}