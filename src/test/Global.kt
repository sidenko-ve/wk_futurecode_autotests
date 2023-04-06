open class Global {

    //global variables
    //all test classes extends from this class

    private val test = ""



    // Окружение выбирается в зависимости от того, что указано в ОС, в переменной окружения B2G_ENVIRONMENT
    private val env = System.getenv("B2G_ENVIRONMENT")
    public val stage = when (env) {
        "TEST" -> test
        else -> test // Окружение по-умолчанию, если совпадений нет или B2G_ENVIRONMENT == null
    }

}
