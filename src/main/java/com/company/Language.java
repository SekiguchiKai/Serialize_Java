package com.company;

import java.io.Serializable;

/**
 * プログラミング言語を表す
 * Created by sekiguchikai on 2017/08/15.
 */
// Serializableインターフェースを実装する
public class Language implements Serializable {
    /**
     * 言語の名前
     */
    private String name;
    /**
     * 言語のタイプ
     */
    private String type;

    Language(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * 名前
     *
     * @return nam　言語の名前
     */
    public String getName() {
        return name;
    }

    /**
     * typeのゲッター
     *
     * @return type 言語のタイプ
     */
    public String getType() {
        return type;
    }
}