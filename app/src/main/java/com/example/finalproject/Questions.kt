package com.example.finalproject

class Questions {
    var mQuestions = arrayOf(
        "dope有很多的意思請問下列選項中，那個不是它的意思？",
        "下面那個單字是指兄弟通常是只會用在身邊很親近的人?",
        "Chill有很多意思下列那個不是它的意思？",
        "vide有很多意思像是一種獨特的氛圍，那在嘻哈中代表什麼意思？",
        "O.G在西海岸說唱文化中代表什麼意思？",
        "Intro的意思是什麼?",
        "請問下列那個詞彙在Rap中代表的是一行詞?",
        "Verse是由Bar所組成通常一段Verse是由幾個Bar所組成，下列那個選項錯誤？",
        "下列那個詞彙代表的是綽號?",
        "Beef的中文意思是牛肉請問它還有什麼意思？"
    )
    private val mChoices = arrayOf(
        arrayOf("A.迷幻藥", "B.東西很酷炫", "C.很屌"),
        arrayOf("A.Homie", "B.Dope", "C.Chill"),
        arrayOf("A.寒冷", "B.緊張", "C.很有自己的態度"),
        arrayOf("A.對的感覺", "B.寒冷", "C.冷酷"),
        arrayOf("A.Original Gangster", "B.真正的大佬", "C.都是"),
        arrayOf("A.專輯的序曲", "B.寒冷", "C.很屌"),
        arrayOf("A.Bar", "B.intro", "C.verse"),
        arrayOf("A.16", "B.18", "C.4"),
        arrayOf("A.Rhyme", "B.AKA", "C.Cypher"),
        arrayOf("A.2個人之間的愛恨情仇", "B.押韻", "C.炫耀")
    )
    private val mCorrectAnswers = arrayOf(
        "B.東西很酷炫", "A.Homie", "B.緊張", "A.對的感覺",
        "C.都是", "A.專輯的序曲", "A.Bar", "C.4", "B.AKA","A.2個人之間的愛恨情仇"
    )

    fun getQuestion(a: Int): String {
        return mQuestions[a]
    }

    fun getChoice1(a: Int): String {
        return mChoices[a][0]
    }

    fun getChoice2(a: Int): String {
        return mChoices[a][1]
    }

    fun getChoice3(a: Int): String {
        return mChoices[a][2]
    }

    /* fun getChoice4(a: Int): String {
         return mChoices[a][3]
     }*/

    fun getCorrectAnswer(a: Int): String {
        return mCorrectAnswers[a]
    }
}