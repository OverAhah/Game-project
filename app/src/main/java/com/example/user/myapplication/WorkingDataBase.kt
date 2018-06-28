package com.example.user.myapplication

import android.content.Context
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import java.io.FileOutputStream
import java.io.IOException


class WorkingDataBase
/**
 * Конструктор
 * Принимает и сохраняет ссылку на переданный контекст для доступа к ресурсам приложения
 * //@param context
 */
(private val mContext: Context) : SQLiteOpenHelper(mContext, "qqq", null, 1) {
    private var myDataBase: SQLiteDatabase? = null

    // путь к базе данных вашего приложения
    private val dbNAME = "qqq"
    private var dbPATH = mContext.getApplicationInfo().dataDir + "/databases/"
    //(mContext.getFilesDir().getPath()).removeSuffix("files") + "databases/"
    //"/data/data/YOUR_PACKAGE/databases/"
    //mContext.getDatabasePath("qqq").removeSuffix(dbNAME)

    /**
     * Создает пустую базу данных и перезаписывает ее нашей собственной базой
     */
    @Throws(IOException::class)
    private fun createDataBase() {
        val dbExist = checkDataBase()

        if (dbExist) {
            //ничего не делать - база уже есть
        } else {
            //вызывая этот метод создаем пустую базу, позже она будет перезаписана
            this.readableDatabase

            try {
                copyDataBase()
            } catch (e: IOException) {
                throw Error("Error copying database")
            }

        }
    }

    /**
     * Проверяет, существует ли уже эта база, чтобы не копировать каждый раз при запуске приложения
     * //@return true если существует, false если не существует
     */
    private fun checkDataBase(): Boolean {
        var checkDB: SQLiteDatabase? = null

        try {
            val myPath = dbPATH + dbNAME
            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY)
        } catch (e: SQLiteException) {
            //база еще не существует
        }

        if (checkDB != null) {
            checkDB.close()
        }
        return (checkDB != null)
    }

    /**
     * Копирует базу из папки assets заместо созданной локальной БД
     * Выполняется путем копирования потока байтов.
     */
    @Throws(IOException::class)
    private fun copyDataBase() {
        //Открываем локальную БД как входящий поток
        val myInput = mContext.assets.open(dbNAME)

        //Путь ко вновь созданной БД
        val outFileName = dbPATH + dbNAME

        //Открываем пустую базу данных как исходящий поток
        val myOutput = FileOutputStream(outFileName)

        //перемещаем байты из входящего файла в исходящий
        val buffer = ByteArray(1024)
        var length: Int = myInput.read(buffer)
        while ((length) > 0) {
            myOutput.write(buffer, 0, length)
            length = myInput.read(buffer)
        }

        //закрываем потоки
        myOutput.flush()
        myOutput.close()
        myInput.close()
    }

    @Throws(SQLException::class)
    private fun openDataBase() {
        //открываем БД
        val myPath = dbPATH + dbNAME
        myDataBase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READWRITE)
    }

    @Synchronized
    override fun close() {
        if (myDataBase != null)
            myDataBase!!.close()
        super.close()
    }

    override fun onCreate(db: SQLiteDatabase) {}

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {}


    // Здесь можно добавить вспомогательные методы для доступа и получения данных из БД
    // вы можете возвращать курсоры через "return myDataBase.query(....)", это облегчит их использование
    // в создании адаптеров для ваших view


    fun getQuestion(n : Int): Pair<String, Triple<Int, Int, Int>>? {
        val temp = ArrayList<Pair<String, Triple<Int, Int, Int>>>()
        //val db = this.writableDatabase
        //createDataBase()
        checkDataBase()
        openDataBase()
        //println(myDataBase!!.path)
        try {
            if (myDataBase == null)
                println("null database")
            val c = myDataBase!!.rawQuery(/*"SELECT * FROM questions"*/"SELECT name FROM sqlite_master WHERE type='table'", null)
            if (c == null) {
                println("null cursor")
                return null
            } else println("not null cursor")
            c.moveToFirst()
            do {
                println(c.getString(0))
                /*temp.add(Pair(c.getString(c.getColumnIndex("Question")), Triple(
                        c.getInt(c.getColumnIndex("ans1")),
                        c.getInt(c.getColumnIndex("ans2")),
                        c.getInt(c.getColumnIndex("ans3"))
                )))
                if (c.getInt(c.getColumnIndex("_id")) == n){
                    myDataBase!!.close()
                    c.close()
                    return temp.last()
                }*/
            } while (c.moveToNext())
            c.close()
        } catch (e: Exception) {
            println("exception!!!!")
        }

        myDataBase!!.close()
        return null
    }

    fun getAnswer(n : Int): Pair<String, Array<Int>>? {
        val temp = ArrayList<Pair<String, Array<Int>>>()
        //val db = this.writableDatabase
        checkDataBase()
        openDataBase()
        try {
            val c = myDataBase!!.rawQuery("SELECT * FROM \"answers\"", null)
            if (c == null) return null
            c.moveToFirst()
            do {
                val temp2 = emptyArray<Int>()
                temp2.plus(c.getInt(c.getColumnIndex("lib")))
                temp2.plus(c.getInt(c.getColumnIndex("cons")))
                temp2.plus(c.getInt(c.getColumnIndex("guar")))
                temp2.plus(c.getInt(c.getColumnIndex("nat")))
                temp2.plus(c.getInt(c.getColumnIndex("for")))
                temp2.plus(c.getInt(c.getColumnIndex("fam")))
                temp.add(Pair(c.getString(c.getColumnIndex("text")), temp2))
                if (c.getInt(c.getColumnIndex("_id")) == n){
                    myDataBase!!.close()
                    c.close()
                    return temp.last()
                }
            } while (c.moveToNext())
            c.close()
        } catch (e: Exception) {
        }

        myDataBase!!.close()
        return null
    }
}
